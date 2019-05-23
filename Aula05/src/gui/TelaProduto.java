package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaProduto extends JPanel {
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the panel.
	 */
	public TelaProduto() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(303, 202, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(43, 202, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 35, 46, 14);
		add(lblNome);
		
		JLabel lblEndereco = new JLabel("Preco Compra:");
		lblEndereco.setBounds(77, 62, 91, 14);
		add(lblEndereco);
		
		textField = new JTextField();
		textField.setBounds(158, 59, 55, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(77, 32, 338, 20);
		add(textField_3);
		
		JLabel label = new JLabel("Preco Venda:");
		label.setBounds(223, 62, 91, 14);
		add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(360, 59, 55, 20);
		add(textField_4);
		
		JLabel label_1 = new JLabel("QND Estoque:");
		label_1.setBounds(77, 90, 91, 14);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 87, 55, 20);
		add(textField_1);
		
		JLabel label_2 = new JLabel("QND Estoque Minimo:");
		label_2.setBounds(223, 90, 127, 14);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 87, 55, 20);
		add(textField_2);

	}

}
