package br.com.questoes.cursojava.modulo05.questao02;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class ImparPar {
    public static void main (String[] args){

        int x = 7;

        if (x % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("ÍMPAR");
        }
    }
}
