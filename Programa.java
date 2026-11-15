
public class Programa {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "12345", 1899, 3);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", "67890", 1937, 2);

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        Aluno aluno = new Aluno("Tiago", "12345678900", "tiago@email.com", "2026001", "Ciencia da Computacao");

        Professor professor = new Professor("Daniel", "98765432100", "daniel@email.com", "Tecnologia", "123456");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        Emprestimo emprestimo1 = biblioteca.realizarEmprestimo(livro1, aluno);

        Emprestimo emprestimo2 = biblioteca.realizarEmprestimo(livro2, professor);

        if (emprestimo1 != null) {

            Multa multa = new Multa(emprestimo1, 3);

            emprestimo1.devolver();

            System.out.println("\n--- MULTA GERADA ---");
            System.out.println(multa);
        }

        biblioteca.listarUsuarios();

        biblioteca.listarLivros();

        biblioteca.listarEmprestimosAtivos();

    }
}
