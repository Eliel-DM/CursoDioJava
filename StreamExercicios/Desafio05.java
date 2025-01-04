package StreamApi;

public class Desafio05 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();

        double media = t.numero.stream()
                .filter(n -> n > 5) // Filtra os números maiores que 5
                .mapToInt(Integer::intValue) // Converte para int para calcular a média
                .average() // Calcula a média
                .orElse(0.0); // Caso não haja números maiores que 5, retorna 0.0

        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
