package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textNascimentoDia,textNascimentoMes, textNascimentoAno;
	public JTextField textCPF;
	public JTextField textDDI, textDDD, textNum;
	public JTextField textEmail;
	public JTextField textAdr1;
	public JTextField textCompl;
	public JTextField textCEP, textCEP2;
	public JTextField textCity, textState, textCountry;
	
	public static boolean isNumeric(String str)  
	{  
		 return str.matches("\\d+"); //Regex para detectar se datas e telefones são números
	}
	
	public static boolean isValidEmail(String str){
		return str.matches(".+@{1}.+");
	}

	public static boolean isValidCPF(String str){
		return str.matches("\\d{2,3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}"); //verifica strings com '-' e '.' opcionais
	}
	
	public int camposObrigatorios(){ 
//verifica se algum campo obrigatório está fantando (retorna o primeiro que achar)
		if(textfirstName.getText().equals(""))
			return 1; //primeiro nome
		else if(textlastName.getText().equals(""))
			return 2; //ultimo nome
		else if(textNascimentoDia.getText().equals(""))
			return 3; //dia de nascimento
		else if(textNascimentoDia.getText().length() == 2 &&
				textNascimentoDia.getText().compareTo("31") > 0) //verifica se há mais que 31 dias na entrada 
			return 27;
		else if(textNascimentoMes.getText().equals(""))
			return 4; //mes de nascimento
		else if(textNascimentoMes.getText().length() == 2 &&
				textNascimentoMes.getText().compareTo("12") > 0) //verifica se há mais que 12 meses na entrada 
			return 28;
		else if(textNascimentoAno.getText().equals(""))
			return 5; //ano de nascimento
		else if(textCPF.getText().equals(""))
			return 6; //CPF
		else if(textDDI.getText().equals(""))
			return 7; //DDI do telefone
		else if(textDDD.getText().equals(""))
			return 8; //DDD do telefone
		else if(textNum.getText().equals(""))
			return 9; //Numero do telefone
		else if(textEmail.getText().equals(""))
			return 10; //Email
		else if(textNascimentoDia.getText().length() > 2)
			return 11; //dia de nascimento com mais dígitos que o permitido
		else if(textNascimentoMes.getText().length() > 2)
			return 12; //mes de nascimento com mais dígitos que o permitido
		else if(textNascimentoAno.getText().length() > 4)
			return 13; //ano de nascimento com mais dígitos que o permitido
		else if(!isNumeric(textNascimentoDia.getText()))
			return 14; //dia deve ser número
		else if(!isNumeric(textNascimentoMes.getText()))
			return 15;
		else if(!isNumeric(textNascimentoAno.getText()))
			return 16;
		else if(!isNumeric(textDDI.getText()))
			return 17;
		else if(textDDI.getText().length() > 2)
			return 18;
		else if(textDDD.getText().length() > 2)
			return 19;
		else if(textNum.getText().length() > 9)
			return 20;
		else if(textNum.getText().length() < 7)
			return 21;
		else if(!isNumeric(textDDD.getText()))
			return 22;
		else if(!isNumeric(textNum.getText()))
			return 23;
		else if( (!textCEP.getText().equals("") && !isNumeric(textCEP.getText()) && textCEP.getText().length() != 5) || 
				(!textCEP.getText().equals("") && !isNumeric(textCEP2.getText()) && textCEP2.getText().length() != 3)
				)
			return 24;
		else if(!isValidEmail(textEmail.getText()))
			return 25;
		else if(!isValidCPF(textCPF.getText()))
			return 26;
		else if(!textCompl.getText().equals("") && textAdr1.getText().equals(""))
			return 29; //complemento preenchido mas endereço em branco
		// caso em que esta tudo ok
			return 0; 
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		})
			;
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//DROP DOWN MENU
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
//PRIMEIRO NOME
		JLabel lblFirstName = new JLabel("First Name*");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(12, 80, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
//ULTIMO NOME
		JLabel lblLastName = new JLabel("Last Name*");
		lblLastName.setBounds(150, 60, 90, 15);
		contentPane.add(lblLastName);
		
		textlastName = new JTextField();
		textlastName.setBounds(150, 80, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
//DIA MES E ANO DE NASCIMENTO
		JLabel lblDataNiver = new JLabel("Birth Date*");
		lblDataNiver.setBounds(290, 60, 150, 15);
		contentPane.add(lblDataNiver);

		JLabel lblDiaNiver = new JLabel("Day");
		lblDiaNiver.setBounds(310, 83, 60, 15);
		contentPane.add(lblDiaNiver);
		textNascimentoDia = new JTextField();
		textNascimentoDia.setBounds(370, 80, 25, 19);
		contentPane.add(textNascimentoDia);
		textNascimentoDia.setColumns(10);
		
		JLabel lblMesNiver = new JLabel("Month");
		lblMesNiver.setBounds(310, 105, 60, 15);
		contentPane.add(lblMesNiver);
		textNascimentoMes = new JTextField();
		textNascimentoMes.setBounds(370, 102, 25, 19);
		contentPane.add(textNascimentoMes);
		textNascimentoMes.setColumns(10);
		
		JLabel lblAnoNiver = new JLabel("Year");
		lblAnoNiver.setBounds(310, 127, 60, 15);
		contentPane.add(lblAnoNiver);		
		textNascimentoAno = new JTextField();
		textNascimentoAno.setBounds(370, 124, 50, 19);
		contentPane.add(textNascimentoAno);
		textNascimentoAno.setColumns(10);
		
//EMAIL
		JLabel lblEmail = new JLabel("E-mail*");
		lblEmail.setBounds(12, 137, 90, 15);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(70, 134, 195, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);		
		
//CPF
		JLabel lblCPF = new JLabel("CPF*");
		lblCPF.setBounds(12, 174, 90, 15);
		contentPane.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(70, 171, 130, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
//PHONE
		JLabel lblPhone = new JLabel("Phone*");
		lblPhone.setBounds(240, 185, 90, 15);
		contentPane.add(lblPhone);
		
		JLabel lblPhoneDDD = new JLabel("DDI          +");
		lblPhoneDDD.setBounds(310, 173, 90, 15);
		contentPane.add(lblPhoneDDD);
		textDDI = new JTextField();
		textDDI.setBounds(386, 171, 30, 19);
		contentPane.add(textDDI);
		textDDI.setColumns(10);	
		
		JLabel lblPhoneDDI = new JLabel("DDD");
		lblPhoneDDI.setBounds(310, 195, 90, 15);
		contentPane.add(lblPhoneDDI);
		textDDD = new JTextField();
		textDDD.setBounds(376, 193, 30, 19);
		contentPane.add(textDDD);
		textDDD.setColumns(10);	
		
		JLabel lblPhoneNumero = new JLabel("Number");
		lblPhoneNumero.setBounds(310, 217, 90, 15);
		contentPane.add(lblPhoneNumero);
		textNum = new JTextField();
		textNum.setBounds(376, 215, 80, 19);
		contentPane.add(textNum);
		textNum.setColumns(10);	
		
//ADRESS
		JLabel lblAdress1 = new JLabel("Adress");
		lblAdress1.setBounds(12, 230, 90, 15);
		contentPane.add(lblAdress1);

		textAdr1 = new JTextField();
		textAdr1.setBounds(12, 250, 418, 19);
		contentPane.add(textAdr1);
		textAdr1.setColumns(10);	
		
		JLabel lblCompl = new JLabel("Apt, floor, suite, etc");
		lblCompl.setBounds(12, 282, 240, 15);
		contentPane.add(lblCompl);
		
		textCompl = new JTextField();
		textCompl.setBounds(170, 280, 260, 19);
		contentPane.add(textCompl);
		textCompl.setColumns(10);
			
		
//CEP
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(12, 322, 90, 15);
		contentPane.add(lblCEP);

		textCEP = new JTextField();
		textCEP.setBounds(50, 320, 50, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		JLabel lblCEP2 = new JLabel("-");
		lblCEP2.setBounds(103, 320, 10, 15);
		contentPane.add(lblCEP2);
		
		textCEP2 = new JTextField();
		textCEP2.setBounds(113, 320, 30, 19);
		contentPane.add(textCEP2);
		textCEP2.setColumns(10);
		
//CIDADE, ESTADO, PAIS		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 352, 100, 15);
		contentPane.add(lblCity);
		
		textCity = new JTextField();
		textCity.setBounds(50, 350, 150, 19);
		contentPane.add(textCity);
		textCity.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(220, 322, 100, 15);
		contentPane.add(lblState);
		
		textState = new JTextField();
		textState.setBounds(280, 320, 150, 19);
		contentPane.add(textState);
		textState.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(220, 352, 100, 15);
		contentPane.add(lblCountry);
		
		textCountry = new JTextField();
		textCountry.setBounds(280, 350, 150, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(10);
		
//BOTÃO DE PRINT
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				contentPane.setVisible(false);
				int obrig = camposObrigatorios();
				if(obrig != 0){
					printErro printForm = new printErro(obrig);
					printForm.show();
				}else{
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.DiaNiverLabel.setText(textNascimentoDia.getText());
					printForm.MesNiverLabel.setText(textNascimentoMes.getText());
					printForm.AnoNiverLabel.setText(textNascimentoAno.getText());
					printForm.EmailLabel.setText(textEmail.getText());
					printForm.CPFLabel.setText(textCPF.getText());
					printForm.AdressLabel.setText(textAdr1.getText());
					printForm.ComplLabel.setText(textCompl.getText());
					printForm.DDILabel.setText(textDDI.getText());
					printForm.DDDLabel.setText(textDDD.getText());
					printForm.NumeroLabel.setText(textNum.getText());
					printForm.CEP1Label.setText(textCEP.getText());
					printForm.CEP2Label.setText(textCEP2.getText());
					printForm.CidadeLabel.setText(textCity.getText());
					printForm.EstadoLabel.setText(textState.getText());
					printForm.PaisLabel.setText(textCountry.getText());
						
					printForm.contentPane.setVisible(true);
					printForm.show();	
				}
			}
		});
		btnPrint.setBounds(180, 400, 74, 25);
		contentPane.add(btnPrint);
	}
}
