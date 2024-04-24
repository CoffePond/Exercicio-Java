public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, "ABC1234");
        carro1.acelerar();
        carro1.acelerar();
        carro1.exibirInfo();
        carro1.frear();
        carro1.exibirInfo();

        System.out.println();

        Carro carro2 = new Carro("Honda", "Civic", 2019, "DEF5678");
        carro2.acelerar();
        carro2.frear();
        carro2.exibirInfo();
    }
}
