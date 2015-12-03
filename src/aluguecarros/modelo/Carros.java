package aluguecarros.modelo;

/**
 *
 * @author dpmarques
 */
public class Carros {
   
   private Integer cod;
   private String fabricante;
   private String modelo;
   private Integer ano;
   private String portas;
   private String cambio;
   private String configuracao;
   
   public Carros(){
       
   }
   
   public Carros(Integer cod, String fabricante, String modelo, Integer ano, String portas, String cambio, String configuracao){
       
       this.cod = cod;
       this.fabricante = fabricante;
       this.modelo = modelo;
       this.ano = ano;
       this.portas = portas;
       this.cambio = cambio;
       this.configuracao = configuracao;
       
   }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
