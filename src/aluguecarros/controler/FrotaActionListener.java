package aluguecarros.controler;

import aluguecarros.modelo.Carros;
import aluguecarros.visao.FrotaVeiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FrotaActionListener implements ActionListener {

    private FrotaVeiculos frota;
    private FrotaDao dao = new FrotaDao();

    public FrotaActionListener(FrotaVeiculos a) {
        this.frota = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("Salvar".equals(e.getActionCommand())) {

            JOptionPane.showMessageDialog(frota, "Salvo com sucesso!");
            Carros c = frota.getCarros();

            dao.salvar(c);
            //frota.dispose();

        } else if ("Cancelar".equals(e.getActionCommand())) {
            //JOptionPane.showMessageDialog(frota, "CANCELAR");
            frota.dispose();

        } else if ("Deletar".equals(e.getActionCommand())) {
            //JOptionPane.showMessageDialog(frota, "Opção indisponivel no momento!");
            frota.DeletarVeiculo();
            //Carros c = frota.getCarros();
            //dao.deletar(c);
            //frota.dispose();
        } else if ("pesquisar".equals(e.getActionCommand()));
        {
            List<Carros> carros = new ArrayList<Carros>();
            carros = dao.getAll();
            frota.ChamarJlist(carros);
        }
    }
}
