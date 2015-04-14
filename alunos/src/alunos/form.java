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
	public JTextField textAdr1;
	public JTextField textCompl;
	public JTextField textCEP, textCEP2;
	public JTextField textCity, textState, textCountry;
	
	
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
		});
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
		JLabel lblDataNiver = new JLabel("Data de nascimento*");
		lblDataNiver.setBounds(290, 60, 150, 15);
		contentPane.add(lblDataNiver);

		JLabel lblDiaNiver = new JLabel("Dia");
		lblDiaNiver.setBounds(320, 83, 30, 15);
		contentPane.add(lblDiaNiver);
		textNascimentoDia = new JTextField();
		textNascimentoDia.setBounds(355, 80, 25, 19);
		contentPane.add(textNascimentoDia);
		textNascimentoDia.setColumns(10);
		
		JLabel lblMesNiver = new JLabel("Mês");
		lblMesNiver.setBounds(320, 105, 30, 15);
		contentPane.add(lblMesNiver);
		textNascimentoMes = new JTextField();
		textNascimentoMes.setBounds(355, 102, 25, 19);
		contentPane.add(textNascimentoMes);
		textNascimentoMes.setColumns(10);
		
		JLabel lblAnoNiver = new JLabel("Ano");
		lblAnoNiver.setBounds(320, 127, 30, 15);
		contentPane.add(lblAnoNiver);		
		textNascimentoAno = new JTextField();
		textNascimentoAno.setBounds(355, 124, 50, 19);
		contentPane.add(textNascimentoAno);
		textNascimentoAno.setColumns(10);
		
//EMAIL
		JLabel lblEmail = new JLabel("E-mail*");
		lblEmail.setBounds(12, 127, 90, 15);
		contentPane.add(lblEmail);
		
		textlastName = new JTextField();
		textlastName.setBounds(70, 124, 195, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);		
		
//CPF
		JLabel lblCPF = new JLabel("CPF*");
		lblCPF.setBounds(12, 164, 90, 15);
		contentPane.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(70, 161, 130, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
//Phone
		JLabel lblPhone = new JLabel("Phone*");
		lblPhone.setBounds(240, 185, 90, 15);
		contentPane.add(lblPhone);
		
		JLabel lblPhoneDDD = new JLabel("DDI       +");
		lblPhoneDDD.setBounds(310, 163, 90, 15);
		contentPane.add(lblPhoneDDD);
		textDDI = new JTextField();
		textDDI.setBounds(376, 161, 30, 19);
		contentPane.add(textDDI);
		textDDI.setColumns(10);	
		
		JLabel lblPhoneDDI = new JLabel("DDD");
		lblPhoneDDI.setBounds(310, 185, 90, 15);
		contentPane.add(lblPhoneDDI);
		textDDD = new JTextField();
		textDDD.setBounds(376, 183, 30, 19);
		contentPane.add(textDDD);
		textDDD.setColumns(10);	
		
		
		JLabel lblPhoneNumero = new JLabel("Número");
		lblPhoneNumero.setBounds(310, 207, 90, 15);
		contentPane.add(lblPhoneNumero);
		textNum = new JTextField();
		textNum.setBounds(376, 205, 80, 19);
		contentPane.add(textNum);
		textNum.setColumns(10);	
		
//Adress
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
			
		
//Adress
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
				//contentPane.setVisible(false);
				print printForm = new print();
				printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
				printForm.firstNameLabel.setText(textfirstName.getText());
				printForm.lastNameLabel.setText(textlastName.getText());
				//printForm.contentPane.setVisible(true);				
				printForm.show();	
			}
		});
		btnPrint.setBounds(180, 400, 74, 25);
		contentPane.add(btnPrint);
	}
}
