package aluguecarros.controler;

import aluguecarros.modelo.Carros;
import aluguecarros.visao.FrotaVeiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FrotaActionListener implements ActionListener{
    
    
    private FrotaVeiculos frota;
    //private FrotaDao dao = new FrotaDao();
    
    public FrotaActionListener(FrotaVeiculos a) {
        this.frota = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        if("Salvar".equals(e.getActionCommand())) {
            
            JOptionPane.showMessageDialog(frota, "INSERIR");
            //Carros c = frota.getCarros();
            
            //dao.salvar(c);
            //frota.dispose();
            
        } else if("Cancelar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frota, "CANCELAR");
            //frota.dispose();
            
        } 
    
    }
}
