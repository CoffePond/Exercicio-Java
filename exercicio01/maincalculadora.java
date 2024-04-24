    public static void main(String[] args) 
        double resultadoSoma = Calculadora.adicionar(5.5, 2.5);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = Calculadora.subtrair(5.5, 2.5);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = Calculadora.multiplicar(5.5, 2.5);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = Calculadora.dividir(5.5, 2.5);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}