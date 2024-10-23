package testeindividual;

public class Pessoa {
    private String nome;
    private String cpf;

    // Construtor sem parâmetros
    public Pessoa() {
    }

    // Construtor com todos os parâmetros
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos get e set
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
}