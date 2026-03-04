package br.com.questoes.cursojava.modulo05.questao07;

/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
                                                    Y
                                                    |
                                               Q2   |   Q1
                                                    |
                                            --------+-------- X
                                                    |
                                               Q3   |   Q4
                                                    |
OBS: considerando o valor total da variavel */

public class Coordenadas {
    public static void main(String[] args) {

        //inserir dados
        double x = 7.0;
        double y = -4.0;

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem.");
        }
        else if (x == 0.0){
            System.out.println("Eixo y.");
        }
        else if (y == 0.0){
            System.out.println("Eixo x.");
        }
        else if (x > 0.0 && y > 0.0){
            System.out.println("Quadrante Q1.");
        }
        else if (x < 0.0 && y > 0.0){
            System.out.println("Quadrante Q2.");
        }
        else if (x < 0.0 && y < 0.0){
            System.out.println("Quadrante Q3.");
        }
        else if (x > 0.0 && y < 0.0){
            System.out.println("Quadrante Q4.");
        }
    }
}
