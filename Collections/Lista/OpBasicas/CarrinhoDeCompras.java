import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    List<Itens> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco, int quantidade){
        Itens item = new Itens(nome, preco, quantidade);
        itensList.add(item);
    }
    public void removerItem(String nome){
        List<Itens> itensRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Itens i : itensList){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Removendo: "+nome);
                    itensRemover.add(i);
                    
                }
            } 
            itensList.removeAll(itensRemover);
        }else{
            System.out.println("O carrinho está vazio!");
        }
        
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itensList.isEmpty()) {
            for(Itens item : itensList){
                double temp = item.getPreco()*item.getQuantidade() ;
                valorTotal += temp;
            }
        } else{
            System.out.println("O carrinho está vazio!");
        }

        return valorTotal;
    }

    public void exibirItens(){
        if (!itensList.isEmpty()) {
            for(Itens i : itensList){
                System.out.println("Nome: "+i.getNome()+" Preço: "+i.getPreco()+" Quantidade: "+i.getQuantidade());
            }
        }else{
            System.out.println("Carrinho vazio!");
        }
       
    }
}