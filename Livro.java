
public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }

    public String toString() {
        return "Titulo: " + titulo +
               "\nAutor: " + autor +
               "\nISBN: " + isbn +
               "\nAno: " + anoPublicacao +
               "\nDisponiveis: " + quantidadeDisponivel;
    }
}
