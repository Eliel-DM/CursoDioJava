package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio01 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Criação do Consumer
        //Aceita um elemento como entrada e executa uma ação com ele, sem retornar nenhum valor.

        numeros.forEach(numero -> System.out.println(numero));
    }
}
