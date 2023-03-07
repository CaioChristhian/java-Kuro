package kuro;

import kuro.dao.ClienteMapDAO;
import kuro.dao.IClienteDAO;
import kuro.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 par consultar, 3 para exclusão, 4 para alteração ou 5 para saida.",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção inválida digite 1 para cadastro, 2 par consultar, 3 para exclusão, 4 para alteração ou 5 para saida.",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados separados por virgula, conforme o exemplo: Nome, CPF, Telefone, Endereço, Numero, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                if (dados.length() < 7) {
                    while (dados.length() < 7) {
                        dados = JOptionPane.showInputDialog(null, "Digite TODOS os dados separados por virgula, conforme o exemplo: Nome, CPF, Telefone, Endereço, Numero, Cidade, Estado",
                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            }

            opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 par consultar, 3 para exclusão, 4 para alteração ou 5 para saida.",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        // Validar se foi passado somente o cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado ", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return  true;
        }

        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        // Validar se todos os campos estão preenchidos
        // Se não tiver, passar null no construtor onde o valor é nulo

        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2],
                dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return  true;
        }

        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return  true;
        }

        return false;
    }

    private static void sair() {
        JOptionPane.showInputDialog(null, "Até logo: ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }

        return false;
    }
}
