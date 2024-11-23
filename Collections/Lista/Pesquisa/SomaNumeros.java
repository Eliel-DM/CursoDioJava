import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros = new ArrayList<>();


    public void  adicionarNumero (int numero){
        this.listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (int i : this.listaNumeros){
        soma += i;
        }
        return soma;
    }
    public int encontrarMaiorValor (){
        int maiorValor = Integer.MIN_VALUE;
        for (int i : this.listaNumeros){
            if (i>maiorValor) {
              maiorValor = i;
            }
        }
        return maiorValor;
    }
    public int encontrarMenorValor (){
        int menorValor = Integer.MAX_VALUE;
        for (Integer i : this.listaNumeros){
            if (i<menorValor) {
                menorValor = i;
            }
        }
        return menorValor;
    }
    public void exibirNumeros(){
        for (int i : this.listaNumeros){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(2);
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.encontrarMaiorValor());
        System.out.println(somaNumeros.encontrarMenorValor());
        System.out.println(somaNumeros.calcularSoma());

    }



}
