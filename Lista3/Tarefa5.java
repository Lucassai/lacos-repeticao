package Lista3;

import java.util.Scanner;

public class Tarefa5 {
    public static void main(String[] args) {
        int numero, soma, numeroPassado=0;
        Scanner leia = new Scanner(System.in);
        do {
            System.out.println("Digite um número diferente de 0");
            numero = leia.nextInt();
           {
                while(numero < 0) {
                    System.out.println("Digite um número diferente de 0");
                    numero = leia.nextInt();
                }
            }
            soma = numero + numeroPassado;
            numeroPassado = soma;
        }
        while (numero != 0);
        System.out.println("A soma dos números foi: "+ soma);
        leia.close();
    }

}
