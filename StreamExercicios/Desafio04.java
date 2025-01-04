package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Desafio04 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();

        t.numero.stream()
                .filter(n -> n % 2 != 1)
                .forEach(System.out::println);

    }
}
