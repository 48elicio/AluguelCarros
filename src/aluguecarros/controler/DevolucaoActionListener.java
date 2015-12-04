package aluguecarros.controler;

import aluguecarros.visao.Devolucao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DevolucaoActionListener implements ActionListener{
    
    private Devolucao devolucao;

    public DevolucaoActionListener(Devolucao a) {
        this.devolucao = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if("Finalizar".equals(e.getActionCommand())) {
          
           JOptionPane.showMessageDialog(devolucao, "Sem conexão no momento!");
           devolucao.dispose();
           
       } else if("Sair".equals(e.getActionCommand())) {
           
           JOptionPane.showMessageDialog(devolucao, "Deseja mesmo sair?");
           devolucao.dispose();
        
        }
    } 
}
