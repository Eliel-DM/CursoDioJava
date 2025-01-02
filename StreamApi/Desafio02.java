package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Usando o Predicate para filtrar os números positivos
        //Recebe um objeto como entrada e retorna um valor Booleano, indicando se o objeto atende ou não uma condiçãos
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Os números pares são os: "+numerosPares);

        int somaNumerosPares = numeros.stream()
                        .filter(numero -> numero % 2 == 0 )
                        .reduce(0,(total, numero) -> total + numero);

        System.out.println("A soma entre esses números é: "+somaNumerosPares);
    }
}
