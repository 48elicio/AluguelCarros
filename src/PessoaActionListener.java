/**
 *
 * @author Diego Pedro Marques
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PessoaActionListener 
                implements ActionListener{
    
    private Principal frame;
    
    public PessoaActionListener(Principal frame){
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("salvar".equals(e.getActionCommand())) {
            Pessoa p = frame.getPessoa();
            
        } else if("listar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frame, "Clicou no listar Listar");
        }
        
    }
    
    
    
}
