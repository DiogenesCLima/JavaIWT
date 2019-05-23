package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class TelaVendas extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public TelaVendas() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(303, 202, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(43, 202, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNome = new JLabel("vendedor:");
		lblNome.setBounds(21, 35, 54, 14);
		add(lblNome);
		
		JLabel lblEndereco = new JLabel("Cliente:");
		lblEndereco.setBounds(21, 63, 54, 14);
		add(lblEndereco);
		
		JLabel lblEmail = new JLabel("Produto:");
		lblEmail.setBounds(21, 88, 46, 14);
		add(lblEmail);
		
		JLabel lblTelefone = new JLabel("QND:");
		lblTelefone.setBounds(21, 119, 46, 14);
		add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(77, 60, 338, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 88, 338, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 116, 112, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(77, 32, 338, 20);
		add(textField_3);
		
		JLabel label = new JLabel("Preco UND:");
		label.setBounds(222, 119, 71, 14);
		add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(303, 116, 112, 20);
		add(textField_4);
		
		JLabel label_1 = new JLabel("Preco Total:");
		label_1.setBounds(222, 147, 71, 14);
		add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(303, 144, 112, 20);
		add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Desconto");
		rdbtnNewRadioButton.setBounds(77, 143, 109, 23);
		add(rdbtnNewRadioButton);

	}
}
