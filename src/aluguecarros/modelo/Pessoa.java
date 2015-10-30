package aluguecarros.modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Pedro Marques
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private Integer cpf;
    private String sexo;
    private String cidade;
    private String uf;
    private List<Pessoa> lista = new ArrayList<>();

    public Pessoa() {
    }
   
    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String sobrenome, Integer idade, Integer cpf, String sexo, String cidade, String uf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }
    public String toString(){
    return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    public void salvar(Pessoa p){
    lista.add(p);
    }
    public List<Pessoa> getLista(){
    return lista;
    }
}
