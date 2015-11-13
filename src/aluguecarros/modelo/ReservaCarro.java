package aluguecarros.modelo;

import java.util.ArrayList;
import java.util.List;

public class ReservaCarro {
    private String BuscaClienteRc;
    private Integer DataRc;  //Rc = 'R'eserva'C'arro
    private Integer EscolheCarro;
    private List<ReservaCarro> lista = new ArrayList<>();
    
    public ReservaCarro(){
        
    }
    public ReservaCarro(String BuscaClienteRc, Integer DataRc, Integer EscolheCarro){
        this.BuscaClienteRc = BuscaClienteRc;
        this.DataRc = DataRc;
        this.EscolheCarro = EscolheCarro;
    }

    public String getBuscaClienteRc() {
        return BuscaClienteRc;
    }

    public void setBuscaClienteRc(String BuscaClienteRc) {
        this.BuscaClienteRc = BuscaClienteRc;
    }

    public Integer getDataRc() {
        return DataRc;
    }

    public void setDataRc(Integer DataRc) {
        this.DataRc = DataRc;
    }

    public Integer getEscolheCarro() {
        return EscolheCarro;
    }

    public void setEscolheCarro(Integer EscolheCarro) {
        this.EscolheCarro = EscolheCarro;
    }

    public List<ReservaCarro> getLista() {
        return lista;
    }

    public void setLista(List<ReservaCarro> lista) {
        this.lista = lista;
    }
    
}
