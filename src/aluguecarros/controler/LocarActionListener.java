package aluguecarros.controler;

import aluguecarros.visao.Locar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LocarActionListener implements ActionListener{
    
    private Locar locar;

    public LocarActionListener(Locar a) {
        this.locar = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if("Locar".equals(e.getActionCommand())) {
          
           JOptionPane.showMessageDialog(locar, "Sem conexão no momento!");
           locar.dispose();
           
       } else if("Cancelar".equals(e.getActionCommand())) {
           
           JOptionPane.showMessageDialog(locar, "Deseja mesmo sair?");
           locar.dispose();
        
        }
    } 
}
