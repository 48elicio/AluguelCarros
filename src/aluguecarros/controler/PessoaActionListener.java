package aluguecarros.controler;

/**
 *
 * @author Diego Pedro Marques
 */
import aluguecarros.modelo.Pessoa;
import aluguecarros.visao.Cadastrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PessoaActionListener 
                implements ActionListener{
    
    private Cadastrar cadastrar;

    public PessoaActionListener(Cadastrar a) {
       
    
    }
    
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if("salvar".equals(e.getActionCommand())) {
            Pessoa p = cadastrar.getPessoa();
            p.salvar(p);
           // jButton1.addActionListener(listener);
//jButton1.setActionCommand("Cancelar");
        } else if("Cancelar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(cadastrar, "Clicou no cancelar");
        }
        
    }
    
    
    
}
