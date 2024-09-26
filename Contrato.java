package testeindividual;

public class Contrato {
    public String cliente;
    public String imovel;
    public String dataInicio;
    public String dataFim;

        public Contrato() {
        }

        public Contrato(String cliente, String imovel, String dataInicio, String dataFim) {
            this.cliente = cliente;
            this.imovel = imovel;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
        }

        public Contrato(String cliente, String imovel) {
            this.cliente = cliente;
            this.imovel = imovel;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public String getImovel() {
            return imovel;
        }

        public void setImovel(String imovel) {
            this.imovel = imovel;
        }

        public String getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
        }

        public String getDataFim() {
            return dataFim;
        }

        public void setDataFim(String dataFim) {
            this.dataFim = dataFim;
        }
    }

}