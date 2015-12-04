package aluguecarros.controler;
 
import aluguecarros.visao.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ReservaActionListener implements ActionListener {
    
    private Reserva reserva;

    public ReservaActionListener(Reserva a) {
        this.reserva = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if("Reservar".equals(e.getActionCommand())) {
          
           JOptionPane.showMessageDialog(reserva, "Sem conexão no momento!");
           reserva.dispose();
           
       } else if("Cancelar".equals(e.getActionCommand())) {
           
           JOptionPane.showMessageDialog(reserva, "Deseja mesmo sair?");
           reserva.dispose();
        
        }
    } 
}
