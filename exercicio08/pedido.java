import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private double valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = "";
        this.valorTotal = 0.0;
    }
    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }
public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
    }
    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void exibirPedido() {
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + " - R$" + pizza.getValor());
        }
        System.out.println("Valor total: R$" + valorTotal);
    }