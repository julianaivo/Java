package br.com.questoes.cursojava.modulo04.questao01;
import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class Soma {
    public static void main(String[] args) {

        //declaracao de variaveis
        int x;
        int y;

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        x = sc.nextInt();

        System.out.println("Informe o valor de y: ");
        y = sc.nextInt();

        sc.close();

        //somatorio
        int soma = x + y;

        //saida de dados
        System.out.println("\nSOMA = "+soma);
    }
}
