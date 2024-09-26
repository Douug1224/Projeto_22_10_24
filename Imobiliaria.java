package testeindividual;

public class Imobiliaria {
    private String imoveis;
    private String clientes;
    private String funcionarios;


    public Imobiliaria() {
    }


    public Imobiliaria(String imoveis, String clientes, String funcionarios) {
        this.imoveis = imoveis;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }


    public String getImoveis() {
        return imoveis;
    }

    public void setImoveis(String imoveis) {
        this.imoveis = imoveis;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }
}

