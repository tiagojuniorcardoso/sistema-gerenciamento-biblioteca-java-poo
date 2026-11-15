
public class Multa {

    private double valor;
    private boolean paga;
    private Emprestimo emprestimo;

    public Multa(Emprestimo emprestimo, int diasAtraso) {

        this.emprestimo = emprestimo;
        this.paga = false;

        if (diasAtraso > 0) {
            this.valor = diasAtraso * 2.0;
        } else {
            this.valor = 0;
        }
    }

    public double getValor() {
        return valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void pagar() {
        paga = true;
    }

    public String toString() {
        return "Usuario: " + emprestimo.getUsuario().getNome() +
               "\nLivro: " + emprestimo.getLivro().getTitulo() +
               "\nValor da multa: R$ " + valor +
               "\nSituacao: " + (paga ? "Paga" : "Pendente");
    }
}
