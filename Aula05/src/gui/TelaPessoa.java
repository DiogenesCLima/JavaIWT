package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import depPessoal.Pessoa;

public class TelaPessoa extends JPanel {
	private JTextField textEndereco;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textNome;

	/**
	 * Create the panel.
	 */
	public TelaPessoa() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa p = new Pessoa();
				p.setNome(textNome.getText());
				p.setEndereco(textEndereco.getText());
				p.setEmail(textEmail.getText());
				p.setCelular(textTelefone.getText());
				p.salvar();
			}
		});
		btnNewButton.setBounds(303, 202, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(43, 202, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 35, 46, 14);
		add(lblNome);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(21, 63, 54, 14);
		add(lblEndereco);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(21, 88, 46, 14);
		add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(21, 119, 46, 14);
		add(lblTelefone);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(77, 60, 338, 20);
		add(textEndereco);
		textEndereco.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(77, 88, 338, 20);
		add(textEmail);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(77, 116, 338, 20);
		add(textTelefone);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(77, 32, 338, 20);
		add(textNome);

	}
}
