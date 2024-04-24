public class Produto {
    private String nome;
    private int codigoProduto;
    private int quantidadeEstoque;
    private double preco;

    public Produto(String nome, int codigoProduto, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }
    public void removerEstoque(int quantidade) {
        if (quantidadeEstoque >= quantidade) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Preço: R$" + preco);
    }