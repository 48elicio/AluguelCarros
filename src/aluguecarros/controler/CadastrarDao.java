package aluguecarros.controler;

import aluguecarros.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CadastrarDao {

    public void salvar(Pessoa pessoa) {
        if (exists(pessoa.getCpf())) {
            update(pessoa);
        } else {
            insert(pessoa);
        }
    }
    
    /*public void delete(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from nome where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pessoa.getCpf());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }*/

    public void insert(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cadastro (cpf, nome, sobrenome, idade, sexo, cidade, uf) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pessoa.getCpf());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getSobrenome());
            ps.setInt(4, pessoa.getIdade());
            ps.setString(5, pessoa.getSexo());
            ps.setString(6, pessoa.getCidade());
            ps.setString(7, pessoa.getUf());
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update cadastro set nome = ?, sobrenome = ?, idade = ?,"
                    + "sexo = ?, cidade = ?, uf = ? where cpf = ?";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setInt(3, pessoa.getIdade());
            ps.setString(4, pessoa.getSexo());
            ps.setString(5, pessoa.getCidade());
            ps.setString(6, pessoa.getUf());
            ps.setInt(7, pessoa.getCpf());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }



    public List<Pessoa> getAll() {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cpf, nome, sobrenome, idade, sexo, cidade, uf from cadastro";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer cpf = rs.getInt(1);
                String nome = rs.getString(2);
                String sobrenome = rs.getString(3);
                Integer idade = rs.getInt(4);
                String sexo = rs.getString(5);
                String cidade = rs.getString(6);
                String uf = rs.getString(7);
                
                Pessoa p = new Pessoa();
                p.setCpf(cpf);
                p.setNome(nome);
                p.setSobrenome(sobrenome);
                p.setIdade(idade);
                p.setSexo(sexo);
                p.setCidade(cidade);
                p.setUf(uf);
                
                lista.add(p);
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public boolean exists(Integer cpf) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select 1 from cadastro where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cpf);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return false;
    }


}