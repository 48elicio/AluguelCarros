package aluguecarros.controler;

import aluguecarros.modelo.Carros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrotaDao {
    
    
    public void salvar(Carros carros) {
        if (exists(carros.getCod())) {
            update(carros);
        } else {
            insert(carros);
        }
    }
    
    public void deletar(Carros carros){
       if (exists(carros.getCod())) {
            delete(carros);
        } else {
            
        }
    }
    
    public void delete(Carros carros) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from frota where cod = ?";
            ps = conn.prepareStatement(sql);
            /*
            ps.setString(1, carros.getFabricante());
            
            ps.setInt(3, carros.getAno());
            ps.setString(4, carros.getPortas());
            ps.setString(5, carros.getCambio());
            ps.setString(6, carros.getConfiguracao());
            */
            //ps.setString(1, carros.getModelo());
            ps.setInt(1, carros.getCod());
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

    public void insert(Carros carros) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into frota (cod, fabricante, modelo, ano, portas, cambio, configuracao) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, carros.getCod());
            ps.setString(2, carros.getFabricante());
            ps.setString(3, carros.getModelo());
            ps.setInt(4, carros.getAno());
            ps.setString(5, carros.getPortas());
            ps.setString(6, carros.getCambio());
            ps.setString(7, carros.getConfiguracao());
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

    public void update(Carros carros) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update frota set fabricante = ?, modelo = ?, ano = ?,"
                    + "portas = ?, cambio = ?, configuracao = ? where cod = ?";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, carros.getFabricante());
            ps.setString(2, carros.getModelo());
            ps.setInt(3, carros.getAno());
            ps.setString(4, carros.getPortas());
            ps.setString(5, carros.getCambio());
            ps.setString(6, carros.getConfiguracao());
            ps.setInt(7, carros.getCod());
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



    public List<Carros> getAll() {
        List<Carros> lista = new ArrayList<Carros>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select cod, fabricante, modelo, ano, portas, cambio, configuracao from frota";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer cod = rs.getInt(1);
                String fabricante = rs.getString(2);
                String modelo = rs.getString(3);
                Integer ano = rs.getInt(4);
                String portas = rs.getString(5);
                String cambio = rs.getString(6);
                String configuracao = rs.getString(7);
                
                Carros c = new Carros();
                c.setCod(cod);
                c.setFabricante(fabricante);
                c.setModelo(modelo);
                c.setAno(ano);
                c.setPortas(portas);
                c.setCambio(cambio);
                c.setConfiguracao(configuracao);
                
                lista.add(c);
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

    public boolean exists(Integer cod) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select 1 from frota where cod = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cod);
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
