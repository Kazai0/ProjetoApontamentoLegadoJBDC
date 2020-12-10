package br.com.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.connection.BDLancarErro;
import br.com.domain.model.LancarErroModel;
import br.com.domain.model.LoginModel;

public class TelaCadastroErros extends JFrame implements ActionListener {

	public static TelaCadastroErros instance = null;

	static JPanel painelLogin = new JPanel();

	// Create the buttons
	JButton btnApontarErro = new JButton();
	JButton btnVoltar = new JButton();

	// create the textFields

	static JTextField txtNameErro = new JTextField("");
	static JTextField txtObsErro = new JTextField();
	static JTextField txtCodigoProduto = new JTextField();

	// create the labels

	static JLabel lblNameErro = new JLabel();
	static JLabel lblObsErro = new JLabel();
	static JLabel lblCodigoProduto = new JLabel();

	// other components

	static JComboBox<LancarErroModel> jBox = new JComboBox<>();
	
	
	static JOptionPane caixaTexto = new JOptionPane();

	// this method is response of the calls for open the Frame
	public void TelaCadastro() {

		instance = this;

		configuracaoJanela();
		configuracaoComponentes();
		eventosJanela();

	}

	// this method is response of the setters of the components
	private void configuracaoComponentes() {

		// setter parameter of the layout Panel

		painelLogin.setLayout(null);

		// setter Size, position and texts of the label and texts

		lblCodigoProduto.setBounds(150, 10, 150, 100);
		lblCodigoProduto.setText("Codigo Produto:");

		lblNameErro.setBounds(150, 80, 100, 100);
		lblNameErro.setText("Nome do Erro:");

		lblObsErro.setBounds(150, 150, 100, 100);
		lblObsErro.setText("Observaçao:");

		txtCodigoProduto.setBounds(160, 70, 150, 25);
		txtNameErro.setBounds(160, 150, 150, 25);

		txtObsErro.setBounds(160, 220, 220, 120);
		
		LancarErroModel l = new LancarErroModel();
		
		

		// setter the parameter's button ApontarErro

		btnApontarErro.addActionListener(this);
		btnApontarErro.setActionCommand("ApontarErro");
		btnApontarErro.setBounds(85, 350, 150, 20);
		btnApontarErro.setText("Apontar Erro");

		// setter the parameter's button Voltar

		btnVoltar.addActionListener(this);
		btnVoltar.setActionCommand("Voltar");
		btnVoltar.setBounds(210, 350, 150, 20);
		btnVoltar.setText("Voltar");

		add(painelLogin);

		// Add components in the panel

		painelLogin.add(btnApontarErro);
		painelLogin.add(btnVoltar);
		painelLogin.add(lblCodigoProduto);
		painelLogin.add(lblNameErro);
		painelLogin.add(lblObsErro);
		painelLogin.add(txtCodigoProduto);
		painelLogin.add(txtNameErro);
		painelLogin.add(txtObsErro);

	}

	// frame's configuration
	private void configuracaoJanela() {
		setTitle("Apontamento de Erros");
		setBounds(550, 400, 620, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// This method will treat events Buttons 
	public void eventosJanela() {

		// references of the btn's object's 
		
		this.btnApontarErro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String action;
				action = e.getActionCommand();

				switch (action) {
				case "ApontarErro":
					
					// create the objects
					LancarErroModel lEM = new LancarErroModel();
					BDLancarErro bDLE = new BDLancarErro();
				
					
					// setter the attributes for management the dates
					
					lEM.setCodigoProduto(txtCodigoProduto.getText());
					lEM.setNameErro(txtNameErro.getText());
					lEM.setObsErro(txtObsErro.getText());
					
					
					//this method will go insert dates in the BD 
					bDLE.inserindoDados();
					
					

				}
			}
		});

		// references of the btn's object's 
		
		this.btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String acation;
				acation = e.getActionCommand();
				
				switch (acation){
				case "Voltar":
					
					
					//Create the menu object 
					
					TelaMenu tCE = new TelaMenu();

					//this condition will verification if that frame it is open
					
					if (TelaMenu.instance != null) {

						TelaMenu.instance.setVisible(true);
						

					}

					else {
						System.out.println("else?");

						TelaMenu tM = new TelaMenu();
						tM.metodoTelaMenu();
					}
					
					dispose();
					
					}

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
