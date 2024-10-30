package Lista1;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva dois números em que o primeiro seja menor que o segundo");
        System.out.println("Escreva o primeiro número:");
        numero1 = leia.nextInt();
        System.out.println("Escreva o segundo número:");
        numero2 = leia.nextInt();

        for(int i = numero1  ; i <=numero2 ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i+" é múltiplo de 3 e 5");
            }
        }
        leia.close();
    }
}
