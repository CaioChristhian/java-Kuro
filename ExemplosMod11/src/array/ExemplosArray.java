package array;

public class ExemplosArray {
    
    public static void main(String[] args) {
        arrayBidimensional();
        percorrendoArray1();
        percorrendoArray2();
    }

    private static void arrayBidimensional() {
        System.out.println("**** arrayBidimensional ****");
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }};
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 }};
        
        System.out.println("Valores no array1 passados na linha são");
        outputArray(array1);

        System.out.println("Valores no array2 passados na linha são");
        outputArray(array2);
    }

    private static void outputArray(int[][] array) {
        // FAZ UM LOOP PELAS LINHAS DO ARRAY
        for (int linha = 0; linha < array.length; linha++) {
            // FAZ UM LOOP PELAS COLUNAS DO ARRAY
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println();
        }
    }

    private static void percorrendoArray2() {
        System.out.println("***** percorrendoArray2 *****");
        int[] arrayNum = { 65, 75, 32, 84, 41, 57, 64, 74 };
        int total = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    private static void percorrendoArray1() {
        System.out.println("***** percorrendoArray1 *****");

        int[] arrayNum = { 65, 75, 32, 84, 41, 57, 64, 74 };
        int total = 0;

        for (int i : arrayNum) {
            total += i;
        }

        System.out.println("total: " + total);
    }

    private static void declaracaoArray() {
        System.out.println("***** declaracaoArray *****");
        //[] - são inseridos em uma variável que referencia um array
        int [] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        // DECLARANDO VÁRIOS ARRAUS
        int[] r = new int[44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = { 12, 32, 54, 6, 8, 89, 64, 64, 6 };

        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 90;
        meuArray [2] = 80;
        meuArray [3] = 70;
        meuArray [4] = 60;
        meuArray [5] = 50;
        meuArray [6] = 40;
        meuArray [7] = 30;
        meuArray [8] = 20;
        meuArray [9] = 10;

        System.out.println(meuArray[9]);
        System.out.println(meuArray[5]);
    }
}
