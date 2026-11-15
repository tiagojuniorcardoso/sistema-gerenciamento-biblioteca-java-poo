
public class Biblioteca {

    private Livro[] livros = new Livro[100];
    private Usuario[] usuarios = new Usuario[100];
    private Emprestimo[] emprestimos = new Emprestimo[100];

    private int totalLivros = 0;
    private int totalUsuarios = 0;
    private int totalEmprestimos = 0;

    public void cadastrarLivro(Livro livro) {
        if (totalLivros < livros.length) {
            livros[totalLivros] = livro;
            totalLivros++;
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (totalUsuarios < usuarios.length) {
            usuarios[totalUsuarios] = usuario;
            totalUsuarios++;
        }
    }

    public Emprestimo realizarEmprestimo(Livro livro, Usuario usuario) {

        if (totalEmprestimos < emprestimos.length &&
            livro.getQuantidadeDisponivel() > 0) {

            Emprestimo novoEmprestimo = new Emprestimo(livro, usuario);

            emprestimos[totalEmprestimos] = novoEmprestimo;
            totalEmprestimos++;

            return novoEmprestimo;
        }

        return null;
    }

    public void listarLivros() {
        System.out.println("\n--- LIVROS CADASTRADOS ---");

        for (int i = 0; i < totalLivros; i++) {
            System.out.println(livros[i]);
            System.out.println("--------------------");
        }
    }

    public void listarUsuarios() {
        System.out.println("\n--- USUARIOS CADASTRADOS ---");

        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println(usuarios[i]);
            System.out.println("--------------------");
        }
    }

    public void listarEmprestimosAtivos() {
        System.out.println("\n--- EMPRESTIMOS ATIVOS ---");

        for (int i = 0; i < totalEmprestimos; i++) {

            if (emprestimos[i].isAtivo()) {
                System.out.println(emprestimos[i]);
                System.out.println("--------------------");
            }
        }
    }
}
