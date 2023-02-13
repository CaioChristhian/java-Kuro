package forwhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploFor {

    public static void main(String[] args){
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Linha " + i);
            valores.add(i);
        }

        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }
    }
}
