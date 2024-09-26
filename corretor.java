package testeindividual;

public class Corretor {
    private String nome;
    private String cpf;
    private float salario;
    private String setor;

    public Corretor() {
    }

    public Corretor(String nome, String cpf, float salario, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.setor = setor;
    }

    public Corretor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}

}