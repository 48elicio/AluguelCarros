/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguecarros.controler;

import aluguecarros.visao.Cadastrar;
import aluguecarros.visao.Devolucao;
import aluguecarros.visao.FrotaVeiculos;
import aluguecarros.visao.Locar;
import aluguecarros.visao.Principal;
import aluguecarros.visao.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp1
 */
public class PrincipalListener implements ActionListener {

    private Principal principal;
    private javax.swing.JFrame frame;
    public Cadastrar cadastrar ;
    private Reserva reserva ;
    private FrotaVeiculos frota ;
    private Devolucao devolucao ;
    private Locar locar ;

    public PrincipalListener(Principal principal) {
        this.principal = principal;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cliente".equals(e.getActionCommand())) {
           // if()
            cadastrar = new Cadastrar();
            principal.jDesktopPanePrincipal.add(cadastrar);
            cadastrar.setVisible(true);
            cadastrar.setPosicao();
        }
    }

}
