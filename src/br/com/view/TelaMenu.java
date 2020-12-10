package br.com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.BackingStoreException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.connection.BDLogin;
import br.com.domain.model.LoginModel;

public class TelaMenu extends JFrame implements ActionListener {

	public static TelaMenu instance = null;
	
	
	// create the panel
	static JPanel painelLogin = new JPanel();


	// Create the buttons
	JButton btnApontarErrosT = new JButton();
	JButton btnVerificarErros = new JButton();
	JButton btnSair = new JButton();

	// Icon icon1 = new
	// ImageIcon("/root/workspace/WorkspacePrincipal/ApontamentoQualidade/src/br/com/imagens/bytes.jpeg");
	//
	// JLabel lbl1 = new JLabel(icon1);

	public void metodoTelaMenu() {

		instance = this;

		configuracaoJanela();
		configuracaoComponentes();
		eventosJanela();

	}

	// this method is response of the setters of the components
	private void configuracaoComponentes() {

		// setter parameter of the layout

		painelLogin.setLayout(null);

		// setter the parameter's buttons

		btnApontarErrosT.addActionListener(this);
		btnApontarErrosT.setActionCommand("Erros");
		btnApontarErrosT.setBounds(85, 100, 160, 50);
		btnApontarErrosT.setText("Inserir os  Erros");

		btnVerificarErros.addActionListener(this);
		btnVerificarErros.setActionCommand("VerificarErros");
		btnVerificarErros.setBounds(260, 100, 160, 50);
		btnVerificarErros.setText("Verificar Erros");

		btnSair.addActionListener(this);
		btnSair.setActionCommand("Sair");
		btnSair.setBounds(200, 180, 100, 40);
		btnSair.setText("Sair");

		// Add panel in the frame

		add(painelLogin);

		// Add components in the panel

		painelLogin.add(btnApontarErrosT);
		painelLogin.add(btnVerificarErros);
		painelLogin.add(btnSair);

	}

	// This method is response for configuration of the Frame
	private void configuracaoJanela() {
		setTitle("Apontamento de Erros");
		setBounds(550, 400, 520, 340);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 5));

	}

	// This method will
	public void eventosJanela() {

		this.btnApontarErrosT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "Erros":
					
					TelaCadastroErros tCE = new TelaCadastroErros();

					if (TelaCadastroErros.instance != null) {

						TelaCadastroErros.instance.setVisible(true);
						

					}

					else {
						System.out.println("else?");

						TelaCadastroErros tR = new TelaCadastroErros();
						tR.TelaCadastro();

					}
					
					dispose();

				}

			}
		});

		// references of the button for execute commands at click
		this.btnVerificarErros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "VerificarErros":
					System.out.println("Verificar Erros");
				}
			}
		});

		this.btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "Sair":
					
					

					System.out.println("Teste Sair");

				}

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
