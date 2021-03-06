import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DangKy {

	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKy window = new DangKy();
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
	public DangKy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ED2 S\u01A0 NH\u00C2N VI\u00CAN");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 10, 185, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHVTn = new JLabel("H\u1ECD v\u00E0 t\u00EAn: ");
		lblHVTn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHVTn.setBounds(53, 60, 74, 13);
		frame.getContentPane().add(lblHVTn);
		
		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi t\u00EDnh:");
		lblGiiTnh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGiiTnh.setBounds(51, 103, 76, 13);
		frame.getContentPane().add(lblGiiTnh);
		
		JLabel lblNgnhHc = new JLabel("Ng\u00E0nh h\u1ECDc: ");
		lblNgnhHc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNgnhHc.setBounds(51, 146, 76, 13);
		frame.getContentPane().add(lblNgnhHc);
		
		JLabel lblKNng = new JLabel("K\u1EF9 n\u0103ng:");
		lblKNng.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblKNng.setBounds(51, 185, 76, 13);
		frame.getContentPane().add(lblKNng);
		
		txtName = new JTextField();
		txtName.setBounds(151, 55, 135, 26);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JRadioButton rdoMale = new JRadioButton("Nam");
		
		rdoMale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdoMale.setBounds(151, 99, 65, 21);
		frame.getContentPane().add(rdoMale);
		
		JRadioButton rdoFema = new JRadioButton("N\u1EEF");
		rdoFema.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdoMale.setSelected(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				rdoMale.setSelected(false);
			}
		});
		
		rdoMale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdoFema.setSelected(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				rdoFema.setSelected(false);
			}
		});
		
		
		
		
		
		rdoFema.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdoFema.setBounds(225, 99, 103, 21);
		frame.getContentPane().add(rdoFema);
		
		String qual[] = { "--Ng??nh--", "C??ng ngh??? th??ng tin", "K??? to??n", "?????t ??ai" };
		JComboBox cbQual = new JComboBox(qual);
		cbQual.setBounds(151, 138, 172, 26);
		frame.getContentPane().add(cbQual);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(148, 185, 175, 83);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chTeam = new JCheckBox("L\u00E0m vi\u1EC7c nh\u00F3m");
		chTeam.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chTeam.setBounds(6, 6, 152, 21);
		panel.add(chTeam);
		
		JCheckBox chPre = new JCheckBox("Thuy\u1EBFt tr\u00ECnh");
		chPre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chPre.setBounds(6, 29, 127, 21);
		panel.add(chPre);
		
		JCheckBox chTalk = new JCheckBox("Giao ti\u1EBFp");
		chTalk.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chTalk.setBounds(6, 52, 93, 21);
		panel.add(chTalk);
		
		JButton btnRes = new JButton("\u0110\u0103ng k\u00FD");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				if (name.equals("") || cbQual.getSelectedIndex() == 0
						|| (rdoMale.isSelected() == false && rdoFema.isSelected() == false)||(chTeam.isSelected() == false && chPre.isSelected() == false&& chTalk.isSelected()==false)
					) {
					JOptionPane.showMessageDialog(frame, "Ch??a nh???p th??ng tin");
				} else {
					JOptionPane.showMessageDialog(frame, "Validate successfull!");
				}
			}
		});
		btnRes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRes.setBounds(123, 310, 93, 21);
		frame.getContentPane().add(btnRes);
		
		JButton btnSkip = new JButton("B\u1ECF qua");
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				rdoMale.setSelected(false);
				rdoFema.setSelected(false);
				cbQual.setSelectedIndex(0);
				chTeam.setSelected(false);
				chPre.setSelected(false);
				chTalk.setSelected(false);
			}
		});
		btnSkip.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSkip.setBounds(251, 310, 85, 21);
		frame.getContentPane().add(btnSkip);
	}
}
