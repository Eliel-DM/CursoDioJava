import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        ContaTerminal continha = new ContaTerminal();
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia ;
        String nomeCliente ;
        double saldo;
        
        System.out.println("Digite o número:  ");
        numero = ler.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = ler.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = ler.next();
        System.out.println("Digite o número da agência: ");
        saldo = ler.nextDouble();
       continha.retornarDados(numero,agencia,nomeCliente,saldo);

    }
    public void retornarDados(int numero,String agencia,String nome,double saldo){
        System.out.println("Olá "+nome+", obrigado por cria uma conta em nosso banco, sua agência é "+
        agencia+", conta "+numero+" e o seu saldo "+saldo+" já está disponível para saque.");
    }  
}
