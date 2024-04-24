public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Alice", 1000, 1);
        jogador1.exibirInfo();

        jogador1.aumentarPontuacao(500);
        jogador1.subirNivel();

        System.out.println();

        Jogador jogador2 = new Jogador("Bob", 1500, 2);
        jogador2.exibirInfo();
    }
}

    