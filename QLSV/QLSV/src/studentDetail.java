import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class studentDetail {

	private JFrame frmStudentDeital;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDetail window = new studentDetail();
					window.frmStudentDeital.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDeital = new JFrame();
		frmStudentDeital.setTitle("Student Deital");
		frmStudentDeital.setBounds(100, 100, 575, 399);
		frmStudentDeital.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDeital.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setBounds(24, 29, 45, 13);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmStudentDeital.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Qualification: ");
		lblNewLabel_1.setBounds(296, 27, 80, 17);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmStudentDeital.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Address: ");
		lblNewLabel_2.setBounds(24, 71, 54, 17);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmStudentDeital.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Hoppy: ");
		lblNewLabel_3.setBounds(296, 71, 54, 17);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmStudentDeital.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Sex: ");
		lblNewLabel_4.setBounds(24, 194, 45, 13);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmStudentDeital.getContentPane().add(lblNewLabel_4);

		txtName = new JTextField();
		txtName.setBounds(88, 27, 106, 19);
		frmStudentDeital.getContentPane().add(txtName);
		txtName.setColumns(10);

		JTextArea txtAddr = new JTextArea();
		txtAddr.setBounds(88, 68, 198, 97);
		frmStudentDeital.getContentPane().add(txtAddr);

		String city[] = { "--Graduate--", "Bachelor", "Engineer", "College" };
		JComboBox cbQual = new JComboBox(city);
		cbQual.setBounds(410, 26, 106, 21);
		frmStudentDeital.getContentPane().add(cbQual);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setForeground(Color.BLACK);
		panel.setBounds(88, 194, 80, 63);
		frmStudentDeital.getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton rdoMale = new JRadioButton("Male");
		rdoMale.addMouseListener(new MouseAdapter() {

		});
		rdoMale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdoMale.setBounds(7, 6, 59, 21);
		panel.add(rdoMale);

		JRadioButton rdoFema = new JRadioButton("Female");
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

		rdoFema.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdoFema.setBounds(7, 31, 67, 21);
		panel.add(rdoFema);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(410, 71, 106, 94);
		frmStudentDeital.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JCheckBox chRead = new JCheckBox("Reading");
		chRead.setBounds(6, 6, 71, 25);
		chRead.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel_1.add(chRead);

		JCheckBox chSing = new JCheckBox("Singing");
		chSing.setBounds(6, 33, 67, 25);
		chSing.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel_1.add(chSing);

		JCheckBox chDance = new JCheckBox("Dancing");
		chDance.setBounds(6, 63, 73, 25);
		chDance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel_1.add(chDance);

		JButton btnNewButton = new JButton("Validate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String addr = txtAddr.getText();
				if (name.equals("") || addr.equals("") || cbQual.getSelectedIndex() == 0
						|| (rdoMale.isSelected() == false && rdoFema.isSelected() == false)||(chRead.isSelected() == false && chSing.isSelected() == false&&chDance.isSelected()==false)
					) {
					JOptionPane.showMessageDialog(frmStudentDeital, "Chưa nhập thông tin");
				} else {
					JOptionPane.showMessageDialog(frmStudentDeital, "Validate successfull!");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(147, 303, 85, 21);
		frmStudentDeital.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtAddr.setText(null);
				cbQual.setSelectedIndex(0);
				rdoMale.setSelected(false);
				rdoFema.setSelected(false);
				chRead.setSelected(false);
				chSing.setSelected(false);
				chDance.setSelected(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(291, 303, 85, 21);
		frmStudentDeital.getContentPane().add(btnNewButton_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(361, 194, -91, 63);
		frmStudentDeital.getContentPane().add(tabbedPane);

	}
}
