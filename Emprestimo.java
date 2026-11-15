
import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private boolean ativo;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7);
        this.ativo = true;

        livro.emprestar();
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void devolver() {
        if (ativo) {
            ativo = false;
            livro.devolver();
        }
    }

    public String toString() {
        return "Livro: " + livro.getTitulo() +
               "\nUsuario: " + usuario.getNome() +
               "\nData do emprestimo: " + dataEmprestimo +
               "\nDevolucao prevista: " + dataDevolucaoPrevista +
               "\nStatus: " + (ativo ? "Ativo" : "Finalizado");
    }
}
