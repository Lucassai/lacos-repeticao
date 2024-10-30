package Lista2;

import java.util.Scanner;

public class Tarefa3 {
    public static void main(String[] args) {
        int idade=1;
        Scanner leia = new Scanner(System.in);

        while(idade>0){
            System.out.println("Escreva a idade de uma pessoa:");
            idade = leia.nextInt();
        }
        leia.close();
    }
}
