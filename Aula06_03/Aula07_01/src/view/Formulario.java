
package view;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblSexo;
    private JComboBox cboSexo;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("JComboBox");
        form.setBounds(450, 150, 350, 200);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(30, 30, 50, 25);
        painel.add(lblSexo);
        
        cboSexo = new JComboBox();
        cboSexo.addItem("<< SELECIONE >>");
        cboSexo.addItem("Masculino");
        cboSexo.addItem("Feminino");
        cboSexo.setBounds(90, 30, 200, 25);
        cboSexo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JOptionPane.showMessageDialog(null, "Olá, JComboBox!");
            }
        });
        painel.add(cboSexo);
        
        form.setVisible(true);
    }
    
}
