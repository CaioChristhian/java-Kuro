/**
 * @author kuro
 */
public class Gym {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Caio");
        client.setPlanType("Mensal");
        client.setMensality(90);
        Personal personal = new Personal();
        personal.setName("Gabriel");
        personal.setCertificate("Educação física");

        System.out.println("Aluno: " + client.getName());
        System.out.println("Plano: " + client.getPlanType());
        System.out.println("Mensalidade: " + client.getMensality());
        System.out.println("Personal: " + personal.getName());
        System.out.println("Certificado: " + personal.getCertificate());

    }
}