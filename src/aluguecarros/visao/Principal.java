package aluguecarros.visao;

import aluguecarros.visao.FrotaVeiculos;
import aluguecarros.visao.Cadastrar;
import aluguecarros.visao.Locar;
import aluguecarros.visao.Devolucao;
import aluguecarros.modelo.Pessoa;

/**
 *
 * @author Diego Pedro Marques
 */
public class Principal extends javax.swing.JFrame {

    private Pessoa objPessoa;
    private Locar objLocacao;
    Reserva reserva = new Reserva();
    Cadastrar cadastrar = new Cadastrar();
    FrotaVeiculos frota = new FrotaVeiculos();
    Devolucao devolucao = new Devolucao();
    Locar locar = new Locar();

    public Principal() {

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        this.objPessoa = new Pessoa();
        this.objLocacao = new Locar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuMovimentacao = new javax.swing.JMenu();
        jMenuItemLocacao = new javax.swing.JMenuItem();
        jMenuItemReserva = new javax.swing.JMenuItem();
        jMenuItemDevolucao = new javax.swing.JMenuItem();
        jMenuLista = new javax.swing.JMenu();
        jMenuItemFrota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AluCarros");

        jDesktopPanePrincipal.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuCadastrar.setText("Cadastrar");
        jMenuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarActionPerformed(evt);
            }
        });

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCliente);

        jMenuBarPrincipal.add(jMenuCadastrar);

        jMenuMovimentacao.setText("Movimentação");

        jMenuItemLocacao.setText("Locação");
        jMenuItemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocacaoActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jMenuItemLocacao);

        jMenuItemReserva.setText("Reserva");
        jMenuItemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservaActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jMenuItemReserva);

        jMenuItemDevolucao.setText("Devolução");
        jMenuItemDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolucaoActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jMenuItemDevolucao);

        jMenuBarPrincipal.add(jMenuMovimentacao);

        jMenuLista.setText("Lista");

        jMenuItemFrota.setText("Frota");
        jMenuItemFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFrotaActionPerformed(evt);
            }
        });
        jMenuLista.add(jMenuItemFrota);

        jMenuBarPrincipal.add(jMenuLista);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        setBounds(0, 0, 816, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservaActionPerformed
        reserva.dispose();
        if (reserva != null) {
            this.jDesktopPanePrincipal.removeAll();

            this.jDesktopPanePrincipal.add(reserva);
            reserva.show();

        }

    }//GEN-LAST:event_jMenuItemReservaActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        //jInternalFrameCliente.setVisible(true);
        cadastrar.dispose();
        if (cadastrar != null) {

            this.jDesktopPanePrincipal.removeAll();
            this.jDesktopPanePrincipal.add(cadastrar);
            cadastrar.show();
        }
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFrotaActionPerformed

        frota.dispose();
        if (frota != null) {
            this.jDesktopPanePrincipal.removeAll();
            this.jDesktopPanePrincipal.add(frota);
            frota.show();
        }
    }//GEN-LAST:event_jMenuItemFrotaActionPerformed

    private void jMenuItemDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolucaoActionPerformed
        devolucao.dispose();
        if (devolucao != null) {
            this.jDesktopPanePrincipal.removeAll();

            this.jDesktopPanePrincipal.add(devolucao);
            devolucao.show();
        }
    }//GEN-LAST:event_jMenuItemDevolucaoActionPerformed

    private void jMenuItemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocacaoActionPerformed
        objLocacao.setVisible(true); //OBS: TROCAR IMPLENTAÇÃO!
        frota.dispose();
        if (frota != null) {
            this.jDesktopPanePrincipal.removeAll();
            this.jDesktopPanePrincipal.add(locar);
            locar.show();
        }
    }//GEN-LAST:event_jMenuItemLocacaoActionPerformed

    private void jMenuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemDevolucao;
    private javax.swing.JMenuItem jMenuItemFrota;
    private javax.swing.JMenuItem jMenuItemLocacao;
    private javax.swing.JMenuItem jMenuItemReserva;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenu jMenuMovimentacao;
    // End of variables declaration//GEN-END:variables

    public Pessoa getPessoa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
