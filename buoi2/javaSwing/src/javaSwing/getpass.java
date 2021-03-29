package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class getpass {

	private JFrame frame;
	private JPasswordField passin;
	private JLabel noti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getpass window = new getpass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public getpass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u01B0\u01A1ng tr\u00ECnh m\u00F4 ph\u1ECFng l\u1EA5y m\u1EADt kh\u1EA9u");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 20, 416, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp m\u1EADt kh\u1EA9u\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 81, 104, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		passin = new JPasswordField();
		passin.setBounds(158, 72, 217, 30);
		frame.getContentPane().add(passin);
		
		JButton btnGetPass = new JButton("L\u1EA5y m\u1EADt kh\u1EA9u");
		btnGetPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = String.valueOf(passin.getPassword());
				noti.setText(pass);
			}
		});
		btnGetPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGetPass.setBounds(158, 127, 133, 21);
		frame.getContentPane().add(btnGetPass);
		
		noti = new JLabel("");
		noti.setEnabled(false);
		noti.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		noti.setFont(new Font("Tahoma", Font.PLAIN, 15));
		noti.setBounds(158, 184, 217, 30);
		frame.getContentPane().add(noti);
	}
}
