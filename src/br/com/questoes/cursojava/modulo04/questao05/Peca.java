package br.com.questoes.cursojava.modulo04.questao05;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Peca {
    public static void main (String [] args){

        String codigo1 = "F1486A0";
        int numeroPecas1 = 1;
        double valorUnitario1 = 5.30;

        String codigo2 = "H1958B9";
        int numeroPecas2 = 2;
        double valorUnitario2 = 5.10;

        double total = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.println("VALOR A PAGAR: "+total);
    }
}
