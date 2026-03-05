package br.com.questoes.cursojava.modulo04.questao04;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

public class Funcionario {
    public static void main(String[] args) {
        String numero = "91111-1111";
        int horasTrabalhadas = 5;
        double valorHora = 25.50;

        //calculo
        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER: "+numero);
        System.out.println("SALARY: ");
        System.out.printf("%.2f", salario);
    }
}
