package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        System.out.println("Nota informada:"+ nota);

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida!\nDigite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Encerrando...");
    }

}
