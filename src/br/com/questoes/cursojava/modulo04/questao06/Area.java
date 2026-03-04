package br.com.questoes.cursojava.modulo04.questao06;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class Area {
    public static void main (String[] args){

        double A = 3.0;
        double B = 4.0;
        double C = 5.2;

        double triangulo =  A * C / 2;
        double circulo = 3.14159 * (C * C);
        double trapezio = (A + B) * C / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIÂNGULO:%.3f%n", triangulo);
        System.out.printf("CÍRCULO:%.3f%n", circulo);
        System.out.printf("TRAPÉZIO:%.3f%n", trapezio);
        System.out.printf("QUADRADO:%.3f%n", quadrado);
        System.out.printf("RETÂNGULO:%.3f%n", retangulo);
    }
}
