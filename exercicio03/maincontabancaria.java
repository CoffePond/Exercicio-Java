    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123456, "João", 1000.0);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(2000.0);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}