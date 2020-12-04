package br.com.view;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.connection.BDLogin;
import br.com.domain.model.LoginModel;

public class TelaLogin extends JFrame implements ActionListener {

	public static TelaLogin instance = null;

	// create the panel
	static JPanel painelLogin = new JPanel();

	// Create the buttons
	JButton btnEntrar = new JButton();
	JButton btnCadastrar = new JButton();

	// create the textFields

	static JTextField txtUsuario = new JTextField("");
	static JPasswordField txtSenha = new JPasswordField();

	// create the labels

	static JLabel lblUsuario = new JLabel();
	static JLabel lblSenha = new JLabel();
	static JLabel lblPegandoImage = new JLabel();
	
	static JOptionPane caixaTexto = new JOptionPane();

	// this method is response of the calls for open the Frame
	public void TelaLogin() {

		instance = this;

		configuracaoJanela();
		configuracaoComponentes();
		eventosJanela();

	}

	// this method is response of the setters of the components
	private void configuracaoComponentes() {

		// setter parameter of the layout

		painelLogin.setLayout(null);

		// setter Size, position and texts of the label and texts

		lblUsuario.setBounds(80, 10, 100, 100);
		lblUsuario.setText("Usuario:");

		lblSenha.setBounds(80, 60, 100, 100);
		lblSenha.setText("Senha:");

		txtUsuario.setBounds(160, 52, 150, 25);
		txtSenha.setBounds(160, 100, 150, 25);

		// setter the parameter's button Entrar

		btnEntrar.addActionListener(this);
		btnEntrar.setActionCommand("Entrar");
		btnEntrar.setBounds(85, 160, 120, 20);
		btnEntrar.setText("Entrar");

		// setter the parameter's button Cadastrar

		btnCadastrar.addActionListener(this);
		btnCadastrar.setActionCommand("Cadastrar");
		btnCadastrar.setBounds(210, 160, 120, 20);
		btnCadastrar.setText("Cadastrar");

		// Add panel in the frame

		add(painelLogin);

		// Add components in the panel

		painelLogin.add(btnEntrar);
		painelLogin.add(btnCadastrar);
		painelLogin.add(lblUsuario);
		painelLogin.add(lblSenha);
		painelLogin.add(txtUsuario);
		painelLogin.add(txtSenha);

	}

	// This method is response for configuration of the Frame
	private void configuracaoJanela() {
		setTitle("Apontamento de Erros");
		setBounds(550, 400, 420, 280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 5));

	}

	// This method will
	public void eventosJanela() {

		this.btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "Entrar":

					// create the objects

					LoginModel lGM = new LoginModel();
					BDLogin bDl = new BDLogin();

					// setter the attributes for management the dates

					lGM.setUsuario(txtUsuario.getText());
					lGM.setSenha(txtSenha.getText());

					// condition for verification if method will go true

					if (bDl.metodoVerificarNome(lGM.getUsuario(),
							lGM.getSenha())) {

						// method for setter attribute the ID

						bDl.VerificandoDados();

						
					}

					else {
						System.out.println("Sem chance");
					}

				}
			}
		});

		// references of the button for execute commands at click
		this.btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "Cadastrar":
					System.out.println("Testando Cadastrar");
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
