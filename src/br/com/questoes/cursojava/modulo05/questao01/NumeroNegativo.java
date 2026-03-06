package br.com.questoes.cursojava.modulo05.questao01;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class NumeroNegativo {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int x = sc.nextInt();

        sc.close();

        if (x > 0){
            System.out.print("NÃO NEGATIVO");
        } else{
            System.out.println("NEGATIVO");
        }
    }
}
