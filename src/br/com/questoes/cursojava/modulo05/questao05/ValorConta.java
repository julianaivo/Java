package br.com.questoes.cursojava.modulo05.questao05;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
                                | CÓDIGO | ESPECIFICAÇÃO   | PREÇO    |
                                | ------ | --------------- | -------- |
                                | 1      | Cachorro Quente | R$ 4.00 |
                                | 2      | X-Salada        | R$ 4.50 |
                                | 3      | X-Bacon         | R$ 5.00 |
                                | 4      | Torrada simples | R$ 2.00 |
                                | 5      | Refrigerante    | R$ 1.50 |
*/
public class ValorConta {
    public static void main(String[] args) {

        int cod = 4;
        int qtd = 4;

        if (cod == 1){
            double valor = qtd * 4;
            System.out.println("TOTAL: " +valor);
        } else if (cod == 2){
            double valor = qtd * 4.50;
            System.out.println("TOTAL: " +valor);
        } else if (cod == 3){
            double valor = qtd * 5;
        } else if (cod == 4){
            double valor = qtd * 2;
            System.out.println("TOTAL: " +valor);
        } else if (cod == 5){
            double valor = qtd * 1.50;
            System.out.println("TOTAL: " +valor);
        } else{
            System.out.println("Informe código válido.");
        }
    }
}
