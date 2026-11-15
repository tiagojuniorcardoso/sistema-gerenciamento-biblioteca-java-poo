
public class Professor extends Usuario {

    private String departamento;
    private String siape;

    public Professor(String nome, String cpf, String email, String departamento, String siape) {
        super(nome, cpf, email);
        this.departamento = departamento;
        this.siape = siape;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getSiape() {
        return siape;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nDepartamento: " + departamento +
               "\nSIAPE: " + siape;
    }
}
