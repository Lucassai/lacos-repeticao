package Lista1;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        int numeros, pares=0, impares=0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva 10 números");

        for (int i =1 ; i <= 10 ; i++){
            numeros = leia.nextInt();
            System.out.printf("posição %d: \n" , i);
            if (numeros%2 ==0){
                pares++;
            }
            else{
                impares++;
            }

        }
        System.out.printf("Números pares %d. Números impares %d \n" ,pares,impares);
    }
}
