package aula07_01;

import java.awt.Checkbox;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formulario {

	private JFrame form;
	private JLabel LblSexo;
	private JComboBox cboSexo;  
	private Object sx=null;
	
	public Formulario(){
		iniciaComponente();
	}
	
	private void iniciaComponente(){
		form= new JFrame("Combobox");
		form.setBounds(450,150 , 350, 150);
		form.setLayout(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        LblSexo = new JLabel("Sexo:");
        LblSexo.setBounds(30, 30, 50, 25);
        painel.add(LblSexo);
        
        cboSexo = new JComboBox();
        cboSexo.addItem("<< SELECIONE >>");
        cboSexo.addItem("Masculino");
        cboSexo.addItem("Feminino");

        cboSexo.setBounds(90, 30, 200, 25);
        cboSexo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	
            	if (e.getStateChange()== ItemEvent.SELECTED){
            		if(cboSexo.getSelectedIndex()!=0){	
            			JOptionPane.showMessageDialog(form,"Sexo selecionado foi : "+ cboSexo.getSelectedItem());
            			sx=cboSexo.getSelectedItem();
            		}
            		else{
            			JOptionPane.showMessageDialog(form,"Sexo invalido " );
            			cboSexo.setSelectedItem(sx);
            		}
            	}
                
        	}
        });
        painel.add(cboSexo);
		form.setVisible(true);
		
	}
	
}
