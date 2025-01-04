package StreamApi;

public class Desafio06 {
    public static void main(String[] args) {
        //Criada a Lista de inteiros
        ListaNumeros t = new ListaNumeros();

        boolean maiorQueDez = t.numero.stream()
                        .anyMatch(n -> n >10); // Verifica se qualquer valor do stream atende a condição especificada.

        System.out.println("A lista contém um valor maior que 10? "+maiorQueDez);
    }
}
