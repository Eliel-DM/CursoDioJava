package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();
        int somaNumerosPares = t.numero.stream()
                        .filter(numero -> numero % 2 == 0 ) // Faz a verificação dos elementros de um Stream, baseado em uma condição específica
                        .reduce(0,(total, numero) -> total + numero); // Realiza uma operação binária, na qual o a primeira var tem o valor incrementado de acordo com o funcionamento da função passado na segunda var

        System.out.println("A soma é: "+somaNumerosPares);
    }
}
