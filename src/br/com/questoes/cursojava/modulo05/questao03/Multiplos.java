package br.com.questoes.cursojava.modulo05.questao03;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

public class Multiplos {
    public static void main(String[] args) {

        int a = 18;
        int b = 6;

        if (b % a == 0 || a % b == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
