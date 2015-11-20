/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguecarros.controler;


 
import aluguecarros.visao.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp1
 */
public class ReservaListener implements ActionListener {
    
    private Reserva reserva;

    public ReservaListener(Reserva a) {
        this.reserva = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if("Reservar".equals(e.getActionCommand())) {
          
       }  else if("Cancelar".equals(e.getActionCommand())) {
           reserva.dispose();
            }
    } 
}
