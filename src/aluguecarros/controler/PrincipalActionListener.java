/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguecarros.controler;

import aluguecarros.arquivo.WriterLog;
import aluguecarros.visao.Cadastrar;
import aluguecarros.visao.Devolucao;
import aluguecarros.visao.FrotaVeiculos;
import aluguecarros.visao.Locar;
import aluguecarros.visao.Principal;
import aluguecarros.visao.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comp1
 */
public class PrincipalActionListener implements ActionListener {

    private Principal principal;
    private javax.swing.JFrame frame;
    public Cadastrar cadastrar ;
    private Reserva reserva ;
    private FrotaVeiculos frota ;
    private Devolucao devolucao ;
    private Locar locar ;

    public PrincipalActionListener(Principal principal) {
        this.principal = principal;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cliente".equals(e.getActionCommand())) {
            
            cadastrar = new Cadastrar();
            principal.jDesktopPanePrincipal.add(cadastrar);
            cadastrar.setVisible(true);
            cadastrar.setPosicao();
            try {
                WriterLog.escrever("Foi aberto a janela CADASTRO!");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } else if("Frota".equals(e.getActionCommand())) {
            frota = new FrotaVeiculos();
            principal.jDesktopPanePrincipal.add(frota);
            frota.setVisible(true);
            frota.setPosicao();
            try {
                WriterLog.escrever("Foi aberto a janela FROTA!");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if("Locação".equals(e.getActionCommand())) {
            locar = new Locar();
            principal.jDesktopPanePrincipal.add(locar);
            locar.setVisible(true);
            locar.setPosicao();
            try {
                WriterLog.escrever("Foi aberto a janela LOCAÇÃO!");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if("Reserva".equals(e.getActionCommand())) {
            reserva = new Reserva();
            principal.jDesktopPanePrincipal.add(reserva);
            reserva.setVisible(true);
            reserva.setPosicao();
            try {
                WriterLog.escrever("Foi aberto a janela RESERVA!");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if("Devolução".equals(e.getActionCommand())) {
            devolucao = new Devolucao();
            principal.jDesktopPanePrincipal.add(devolucao);
            devolucao.setVisible(true);
            devolucao.setPosicao();
            try {
                WriterLog.escrever("Foi aberto a janela DEVOLUÇÃO!");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
