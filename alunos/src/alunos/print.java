package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("");
	JLabel firstNameLabel = new JLabel("");
	JLabel lastNameLabel = new JLabel("");
	JLabel DiaNiverLabel = new JLabel("");
	JLabel MesNiverLabel = new JLabel("");
	JLabel AnoNiverLabel = new JLabel("");
	JLabel EmailLabel = new JLabel("");
	JLabel CPFLabel = new JLabel("");
	JLabel AdressLabel = new JLabel("");
	JLabel ComplLabel = new JLabel("");
	JLabel DDILabel = new JLabel("");
	JLabel DDDLabel = new JLabel("");
	JLabel NumeroLabel = new JLabel("");
	JLabel CEP1Label = new JLabel("");
	JLabel CEP2Label = new JLabel("");
	JLabel CidadeLabel = new JLabel("");
	JLabel EstadoLabel = new JLabel("");
	JLabel PaisLabel = new JLabel("");
	
	/**
	 * Launch the application.
	 */
	public  void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
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
	public print() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//TITULO
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(139, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
//SECOES	
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Birthday:");
		lblNewLabel_4.setBounds(12, 130, 70, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(12, 157, 70, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CPF:");
		lblNewLabel_6.setBounds(12, 184, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone:");
		lblNewLabel_7.setBounds(12, 211, 70, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Adress:");
		lblNewLabel_8.setBounds(12, 238, 70, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("CEP:");
		lblNewLabel_9.setBounds(12, 286, 70, 15);
		contentPane.add(lblNewLabel_9);
		JLabel lblhifen = new JLabel("-");
		lblhifen.setBounds(94, 286, 70, 15);
		contentPane.add(lblhifen);
		JLabel lblNewLabel_10 = new JLabel("Cidade:");
		lblNewLabel_10.setBounds(12, 313, 70, 15);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Estado:");
		lblNewLabel_11.setBounds(12, 340, 70, 15);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Pais:");
		lblNewLabel_12.setBounds(12, 367, 70, 15);
		contentPane.add(lblNewLabel_12);
		
//RESPOSTAS DO FORMS		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(52, 55, 216, 15);
		contentPane.add(titleLabel);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(62, 82, 216, 15);
		contentPane.add(firstNameLabel);	
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(62, 103, 216, 15);
		contentPane.add(lastNameLabel);
		
		DiaNiverLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		DiaNiverLabel.setBounds(85, 130, 216, 15);
		contentPane.add(DiaNiverLabel);	
		JLabel lblBarra = new JLabel("/");
		lblBarra.setBounds(105, 130, 70, 15);
		contentPane.add(lblBarra);
		MesNiverLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		MesNiverLabel.setBounds(117, 130, 216, 15);
		contentPane.add(MesNiverLabel);
		JLabel lblBarra2 = new JLabel("/");
		lblBarra2.setBounds(137, 130, 70, 15);
		contentPane.add(lblBarra2);
		AnoNiverLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		AnoNiverLabel.setBounds(142, 130, 216, 15);
		contentPane.add(AnoNiverLabel);
		
		EmailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		EmailLabel.setBounds(62, 157, 216, 15);
		contentPane.add(EmailLabel);
		
		CPFLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CPFLabel.setBounds(49, 184, 216, 15);
		contentPane.add(CPFLabel);
		
		JLabel lblmais = new JLabel("+");
		lblmais.setBounds(69, 211, 70, 15);
		contentPane.add(lblmais);
		DDILabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		DDILabel.setBounds(78, 211, 216, 15);
		contentPane.add(DDILabel);
		JLabel lblparen1 = new JLabel("(     )");
		lblparen1.setBounds(96, 211, 70, 15);
		contentPane.add(lblparen1);
		DDDLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		DDDLabel.setBounds(103, 211, 216, 15);
		contentPane.add(DDDLabel);
		NumeroLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		NumeroLabel.setBounds(130, 211, 216, 15);
		contentPane.add(NumeroLabel);
		
		AdressLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		AdressLabel.setBounds(69, 238, 216, 15);
		contentPane.add(AdressLabel);
		
		ComplLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		ComplLabel.setBounds(69, 259, 216, 15);
		contentPane.add(ComplLabel);
	
		CEP1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		CEP1Label.setBounds(50, 286, 216, 15);
		contentPane.add(CEP1Label);
		CEP2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		CEP2Label.setBounds(103, 286, 216, 15);
		contentPane.add(CEP2Label);
		
		CidadeLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CidadeLabel.setBounds(69, 313, 216, 15);
		contentPane.add(CidadeLabel);
		
		EstadoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		EstadoLabel.setBounds(69, 340, 216, 15);
		contentPane.add(EstadoLabel);
		
		PaisLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		PaisLabel.setBounds(69, 367, 216, 15);
		contentPane.add(PaisLabel);
		
	
//BOTAO DE SAIDA		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(330, 360, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
