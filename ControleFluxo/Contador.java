package ControleFluxo;
import java.util.Scanner;
public class Contador {

        public static void main(String[] args) {
        Contador contador = new Contador();
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Primeiro número: ");
        int temp  = scanner.nextInt();  
        System.out.println("Segundo número: ");
        int temp1 = scanner.nextInt();
        try{
        contador.imprimirNum(temp,temp1);
        } catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

     }
     public void imprimirNum (int num1,int num2) throws ParametrosInvalidosException{
        int quant = 0;
        if (num1>num2){
            throw new ParametrosInvalidosException("O Primeiro número deve ser menor que o Segundo número");
        } else{
            quant = num2-num1;
        }
        for (int i=1;i<=quant;i++){
            System.out.println("Imprimindo número: "+ i);
        }
     }

}
