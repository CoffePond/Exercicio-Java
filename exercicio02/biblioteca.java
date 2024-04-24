public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(int ano, String autor, String titulo) {
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
    }

    public void exibirInfo() {
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
    }


