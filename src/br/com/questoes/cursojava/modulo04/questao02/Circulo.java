package br.com.questoes.cursojava.modulo04.questao02;
import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

public class Circulo {
    public static void main(String[] args) {

        double r;
        double π = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo: ");
        r = sc.nextDouble();

        sc.close();

        double area = π * (r * r);

        System.out.printf("A área do círculo é %.4f%n ", area);
    }
}
