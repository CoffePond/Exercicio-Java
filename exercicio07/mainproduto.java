 public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 1001, 10, 2500.0);
        produto1.exibirInfo();

        System.out.println();
        Produto produto2 = new Produto("Smartphone", 2002, 20, 1500.0);
        produto2.exibirInfo();
        System.out.println();
        produto1.adicionarEstoque(5);
        produto1.exibirInfo();

        produto2.removerEstoque(10);
        produto2.exibirInfo();
    }
}

