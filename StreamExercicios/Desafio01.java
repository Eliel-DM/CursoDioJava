package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio01 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();


        t.numero.forEach(System.out::println); //ForEach permite a iteração sobre os elementos de um Stream

    }
}
