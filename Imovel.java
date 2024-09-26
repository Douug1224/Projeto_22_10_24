package testeindividual;

public class Imovel {
    private String codigo;
    private String endereco;
    private double preco;
    private int numeroDeQuartos;
    private int andar;
    private float area;


    public Imovel() {
    }


    public Imovel(String codigo, String endereco, double preco, int numeroDeQuartos, int andar, float area) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.preco = preco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.andar = andar;
        this.area = area;
    }


    public Imovel(String codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
