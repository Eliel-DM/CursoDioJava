package StreamApi;

import java.util.function.Predicate;

public class Desafio03 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();

        boolean todosPositivos = t.numero.stream()
                .allMatch(n -> n % 2 == 0); //Verifica se todos os elementros do Stream atendem a uma condição, retonando um boolean.
        System.out.println("Todos os números da lista são positivos? "+todosPositivos);
    }

}
