package aluguecarros.modelo;

import java.util.ArrayList;
import java.util.List;

public class LocacaoCarro {
    
    private String BuscaCliente;
    private String ListaCarro;
    private Integer DataLoc; //data de locação
    private Integer DataDev; //data de devolução
    private List<LocacaoCarro> lista = new ArrayList<>();
    
    public LocacaoCarro(){
        
    }
    public LocacaoCarro(String BuscaCliente, String ListaCarro, Integer DataLoc, Integer DataDev){
        this.BuscaCliente = BuscaCliente;
        this.ListaCarro = ListaCarro;
        this.DataLoc = DataLoc;
        this.DataDev = DataDev;
    }

    public String getBuscaCliente() {
        return BuscaCliente;
    }

    public void setBuscaCliente(String BuscaCliente) {
        this.BuscaCliente = BuscaCliente;
    }

    public String getListaCarro() {
        return ListaCarro;
    }

    public void setListaCarro(String ListaCarro) {
        this.ListaCarro = ListaCarro;
    }

    public Integer getDataLoc() {
        return DataLoc;
    }

    public void setDataLoc(Integer DataLoc) {
        this.DataLoc = DataLoc;
    }

    public Integer getDataDev() {
        return DataDev;
    }

    public void setDataDev(Integer DataDev) {
        this.DataDev = DataDev;
    }

    public List<LocacaoCarro> getLista() {
        return lista;
    }

    public void setLista(List<LocacaoCarro> lista) {
        this.lista = lista;
    }
    
}
