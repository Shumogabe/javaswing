package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class demo1 {

	private JFrame frame;
	private JTextField val_a;
	private JTextField val_b;
	private JTextField resultt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo1 window = new demo1();
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
	public demo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 389, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("CH\u01AF\u01A0NG TR\u00CCNH M\u00D4 PH\u1ECENG");
		title.setFont(new Font("Times New Roman", Font.BOLD, 22));
		title.setBounds(23, 10, 328, 45);
		frame.getContentPane().add(title);
		
		JLabel vala = new JLabel("Nh\u1EADp gi\u00E1 tr\u1ECB th\u1EE9 nh\u1EA5t: ");
		vala.setFont(new Font("Tahoma", Font.PLAIN, 16));
		vala.setBounds(10, 78, 181, 13);
		frame.getContentPane().add(vala);
		
		JLabel valb = new JLabel("Nh\u1EADp gi\u00E1 tr\u1ECB th\u1EE9 hai: ");
		valb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		valb.setBounds(10, 119, 162, 13);
		frame.getContentPane().add(valb);
		
		val_a = new JTextField();
		val_a.setBackground(Color.ORANGE);
		val_a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		val_a.setHorizontalAlignment(SwingConstants.CENTER);
		val_a.setBounds(177, 63, 174, 34);
		frame.getContentPane().add(val_a);
		val_a.setColumns(10);
		
		val_b = new JTextField();
		val_b.setBackground(Color.ORANGE);
		val_b.setFont(new Font("Tahoma", Font.PLAIN, 15));
		val_b.setHorizontalAlignment(SwingConstants.CENTER);
		val_b.setBounds(177, 111, 174, 34);
		frame.getContentPane().add(val_b);
		val_b.setColumns(10);
		
		JLabel result = new JLabel("K\u1EBFt qu\u1EA3");
		result.setFont(new Font("Tahoma", Font.PLAIN, 16));
		result.setBounds(10, 184, 61, 13);
		frame.getContentPane().add(result);
		
		resultt = new JTextField();
		resultt.setBackground(Color.GREEN);
		resultt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		resultt.setHorizontalAlignment(SwingConstants.CENTER);
		resultt.setBounds(177, 168, 174, 34);
		frame.getContentPane().add(resultt);
		resultt.setColumns(10);
		
		JButton btnSum = new JButton("C\u1ED9ng");
		btnSum.setForeground(Color.BLACK);
		btnSum.setBackground(Color.RED);
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lấy giá trị trong ô 
				String a = val_a.getText();
				String b = val_b.getText();
				//Ép chuỗi kí tự qua số thực
				float aa = Float.parseFloat(a);
				float bb = Float.parseFloat(b);
				float result = aa+bb;
				String sum = String.valueOf(result);
				resultt.setText(sum);
			}
		});
		btnSum.setBounds(10, 227, 108, 34);
		frame.getContentPane().add(btnSum);
		
		JButton btnSub = new JButton("Tr\u1EEB");
		btnSub.setBackground(Color.PINK);
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lấy giá trị trong ô 
				String a = val_a.getText();
				String b = val_b.getText();
				//Ép chuỗi kí tự qua số thực
				float aa = Float.parseFloat(a);
				float bb = Float.parseFloat(b);
				float result = aa-bb;
				String sub = String.valueOf(result);
				resultt.setText(sub);
			}
		});
		btnSub.setBounds(147, 227, 109, 34);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("Nh\u00E2n");
		btnMul.setBackground(Color.BLUE);
		btnMul.setForeground(Color.BLACK);
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lấy giá trị trong ô 
				String a = val_a.getText();
				String b = val_b.getText();
				//Ép chuỗi kí tự qua số thực
				float aa = Float.parseFloat(a);
				float bb = Float.parseFloat(b);
				float result = aa*bb;
				String mul = String.valueOf(result);
				resultt.setText(mul);
			}
		});
		btnMul.setBounds(10, 271, 108, 34);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("Chia");
		btnDiv.setBackground(Color.MAGENTA);
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lấy giá trị trong ô 
				String a = val_a.getText();
				String b = val_b.getText();
				//Ép chuỗi kí tự qua số thực
				float aa = Float.parseFloat(a);
				float bb = Float.parseFloat(b);
				float result = aa/bb;
				String div = String.valueOf(result);
				resultt.setText(div);
			}
		});
		btnDiv.setBounds(147, 271, 109, 34);
		frame.getContentPane().add(btnDiv);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.YELLOW);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val_a.setText(null);
				val_b.setText(null);
				resultt.setText(null);
			}
		});
		btnReset.setBounds(266, 234, 99, 60);
		frame.getContentPane().add(btnReset);
	}
}
