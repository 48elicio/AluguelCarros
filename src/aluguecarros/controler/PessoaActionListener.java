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
    private CadastrarDao dao = new CadastrarDao();
            
    public PessoaActionListener(Cadastrar a) {
        this.cadastrar = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        if("Salvar".equals(e.getActionCommand())) {
            
            JOptionPane.showMessageDialog(cadastrar, "Cadastro efetuado com sucesso!");
            Pessoa p = cadastrar.getPessoa();
            
            dao.salvar(p);
            cadastrar.dispose();
            
        } else if("Cancelar".equals(e.getActionCommand())) {
            //JOptionPane.showMessageDialog(cadastrar, "Clicou no cancelar");
            cadastrar.dispose();
        } 
        
    }
    
    
    
}
