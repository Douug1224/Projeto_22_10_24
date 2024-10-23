package testeindividual;

public class imovelVendido {
    public String imovel ;
    public float  valor ;
    public String endereço ;

    public imovelVendido(){

    }
    public imovelVendido(String imovel, float valor, String endereço) {
        this.imovel=imovel;
        this.valor=valor;
        this.endereço=endereço;
    }

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
