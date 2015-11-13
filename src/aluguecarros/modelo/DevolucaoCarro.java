package aluguecarros.modelo;

import java.util.ArrayList;
import java.util.List;


public class DevolucaoCarro {
    
    private String BuscaPessoa;
    private String ListaCarro;
    private List<DevolucaoCarro> lista = new ArrayList<>();

    public DevolucaoCarro() {
    
    }

    public String getBuscaPessoa() {
        return BuscaPessoa;
    }
    
    public DevolucaoCarro(String BuscaPessoa, String ListaCarro){
        this.BuscaPessoa = BuscaPessoa;
        this.ListaCarro = ListaCarro;
    }

    public void setBuscaPessoa(String BuscaPessoa) {
        this.BuscaPessoa = BuscaPessoa;
    }

    public String getListaCarro() {
        return ListaCarro;
    }

    public void setListaCarro(String ListaCarro) {
        this.ListaCarro = ListaCarro;
    }

    public List<DevolucaoCarro> getLista() {
        return lista;
    }

    public void setLista(List<DevolucaoCarro> lista) {
        this.lista = lista;
    }
    public void salvar(DevolucaoCarro dc){
    lista.add(dc);
    } 
}
