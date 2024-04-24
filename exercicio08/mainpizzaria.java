  public static void main(String[] args) {
        Pizza pizzaCalabresa = new Pizza("Calabresa", 30.0, "Calabresa, mussarela, cebola");
        Pizza pizzaMarguerita = new Pizza("Marguerita", 35.0, "Molho de tomate, mussarela, tomate, manjericão");
        Pizza pizzaFrangoCatupiry = new Pizza("Frango com Catupiry", 32.0, "Frango, catupiry, milho");

        Pedido pedido = new Pedido();
        pedido.setEnderecoEntrega("Rua das Pizzas, 123");

        pedido.adicionarPizza(pizzaCalabresa);
        pedido.adicionarPizza(pizzaMarguerita);
        pedido.adicionarPizza(pizzaFrangoCatupiry);

        pedido.exibirPedido();
    }
}