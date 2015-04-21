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



public class printErro extends JFrame {
	public JPanel contentPane;
	
	public printErro(int tipo){
		JLabel TipoErro = new JLabel("");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ERROR");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulo.setBounds(128, 12, 160, 31);
		contentPane.add(lblTitulo);
		
		switch(tipo){
		case 1:
			TipoErro.setText("First Name is a required field");
			break;
		case 2:
			TipoErro.setText("Last Name is a required field");
			break;
		case 3:
			TipoErro.setText("Birth Day is a required field");
			break;
		case 4:
			TipoErro.setText("Month of Birth is a required field");
			break;
		case 5:
			TipoErro.setText("Year of Birth is a required field");
			break;
		case 6:
			TipoErro.setText("CPF is a required field");
			break;
		case 7:
			TipoErro.setText("DDI is a required field");
			break;
		case 8:
			TipoErro.setText("DDD is a required field");
			break;
		case 9:
			TipoErro.setText("Phone Number is a required field");
			break;
		case 10:
			TipoErro.setText("Email is a required field");
			break;
		case 11:
			TipoErro.setText("Day of Birth is no more than 2 digits");
			break;
		case 12:
			TipoErro.setText("Month of Birth is no more than 2 digits");
			break;
		case 13:
			TipoErro.setText("Year of Birth is no more than 2 digits");
			break;
		case 14:
			TipoErro.setText("Day of Birth must be a number");
			break;
		case 15:
			TipoErro.setText("Month of Birth must be a number");
			break;
		case 16:
			TipoErro.setText("Year of Birth must be a number");
			break;
		case 17:
			TipoErro.setText("DDI must be a number");
			break;
		case 18:
			TipoErro.setText("DDI is no more than 2 digits");
			break;
		case 19:
			TipoErro.setText("DDD is no more than 2 digits");
			break;
		case 20:
			TipoErro.setText("Phone Number is no more than 9 digits");
			break;
		case 21:
			TipoErro.setText("Phone Number is at least 7 digits");
			break;
		case 22:
			TipoErro.setText("DDD must be a number");
			break;
		case 23:
			TipoErro.setText("Phone Number must be a number");
			break;
		case 24:
			TipoErro.setText("Not a valid CEP number");
			break;
		case 25:
			TipoErro.setText("Not a valid Email");
			break;
		case 26:
			TipoErro.setText("Not a valid CPF");
			break;
		case 27:
			TipoErro.setText("Day of Birth bigger than 31");
			break;
		case 28:
			TipoErro.setText("Month of Birth bigger than 12");
			break;
		case 29:
			TipoErro.setText("Address is required if Compl is not empty");
			break;
		default:
			TipoErro.setText(null);
		}
		TipoErro.setBounds(12, 75, 300, 15);
		contentPane.add(TipoErro);
			
			
		//BOTAO DE SAIDA		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(108, 125, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
