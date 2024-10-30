package Lista2;

import java.util.Scanner;

public class Tarefa3 {
    public static void main(String[] args) {
        int idade=1, menor = 0, maior = 0;
        Scanner leia = new Scanner(System.in);

        while(idade>=0){
            if (idade < 21 ){
                menor ++;
            }
            else if(idade > 50){
                maior ++;
            }
            System.out.println("Escreva a idade de uma pessoa:");
            idade = leia.nextInt();
        }
        System.out.printf("Foram declaras %d pessoas menores de 21 anos e %d pessoas maiores de 50" ,menor, maior);
        leia.close();
    }
}
