package br.com.questoes.cursojava.modulo04.questao03;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).
 */

public class DiferencaProduto {
    public static void main(String[] args) {

        int A = 2;
        int B = 8;
        int C = 4;
        int D = 5;

        int diferenca = (A * B - C * D);

        System.out.println("===DIFERENÇA===\n"+diferenca);
    }
}
