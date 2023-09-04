package PrimeiraTelaSwing;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class PrimeiraTelaSwing extends JFrame{

	JLabel lblNomeCompleto = new JLabel("Nome Completo:");
	JTextField txtNomeCompleto = new JTextField(50);
	JLabel lblDataDeNascimento = new JLabel("DataDeNascimento:");
	JTextField txtDataDeNascimento = new JTextField(50);
	JLabel lblRg = new JLabel("RG:");
	JTextField txtRg = new JTextField(50);
	JLabel lblEmail = new JLabel("E-mail:");
	JTextField txtEmail = new JTextField(50);
	JLabel lblTelefone = new JLabel("Telfone:");
	JTextField txtTelefone = new JTextField(50);
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField(50);
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(50);
	JLabel lblCpf = new JLabel("Cpf:");
	JTextField txtCpf = new JTextField(35);	
	JLabel lblMunicipio = new JLabel("Município:");
	JTextField txtMunicipio = new JTextField(50);
	JLabel lblUf = new JLabel("UF:");
	JTextField txtUf = new JTextField(50);
	JLabel lblSexo = new JLabel("Sexo:");
	JButton btnGravar = new JButton("Gravar");
	JButton btnConsultar = new JButton("Consultar");
	JButton btnDeletar = new JButton("Deletar");
	JButton btnAlterar = new JButton("Alterar");
	String [] sexos = {"Masculino","Feminino","Gay","Nao quero falar"};
	JComboBox cboSexo =new JComboBox(sexos);
	JLabel lblVazio = new JLabel("-");
	public PrimeiraTelaSwing(){
		
		setLayout(new FlowLayout()); 
		
		Container c = getContentPane();
		setLayout(new GridLayout(0,1));
		setTitle("Cadastro para o Curso");
		
		c.add(lblNomeCompleto);
		c.add(txtNomeCompleto);
		c.add(lblDataDeNascimento);
		c.add(txtDataDeNascimento);
		c.add(lblCpf);
		c.add(txtCpf);
		c.add(lblRg);
		c.add(txtRg);
		c.add(lblEmail);
		c.add(txtEmail);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblMunicipio);
		c.add(txtMunicipio);
		c.add(lblUf);
		c.add(txtUf);
		c.add(lblSexo);
		c.add(cboSexo);
		c.add(btnGravar);
		c.add(btnConsultar);
		c.add(btnDeletar);
		c.add(btnAlterar);
		c.add(lblVazio);

		
	
		setVisible(true);
		pack();
	}
	
}
