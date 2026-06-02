public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

  

    
    public void vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade; // Equivalente a: quantidadeEstoque = quantidadeEstoque - quantidade;
        } else {
            System.out.println("Erro: Quantidade insuficiente em estoque para realizar a venda de " + quantidade + " unidades.");
        }
    }

    // Aumenta a quantidade em estoque
    public void repor(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }

    
    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

   
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }
}