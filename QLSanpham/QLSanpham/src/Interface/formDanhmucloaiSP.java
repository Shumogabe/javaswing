package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class formDanhmucloaiSP extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField txtMaloai;
	private JTextField txtTenloai;
	private JButton butThem;
	private JButton butSua;
	private JButton butXoa;
	private JButton butLuu;
	private JButton butKLuu;
	private JButton butThoat;
	private JTable table;
	private JTable jTableLoaiSP;
	private final LoaiSP lsp = new LoaiSP();
	private boolean cothem = true;
	private final DefaultTableModel tableModel = new DefaultTableModel();

	// Ham do du lieu vao tableModel
	public void ShowData() throws SQLException {
		ResultSet result = lsp.ShowLoaiSP();
		try {
			while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
				String rows[] = new String[2];
				rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
				rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
				tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
				// mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
			}
		} catch (SQLException e) {
		}
	}

	// Ham xoa du lieu trong tableModel
	public void ClearData() throws SQLException {
		// Lay chi so dong cuoi cung
		int n = tableModel.getRowCount() - 1;
		for (int i = n; i >= 0; i--)
			tableModel.removeRow(i);// Remove tung dong
	}

	// Ham xoa cac TextField
	private void setNull() {
		// Xoa trang cac JtextField
		this.txtMaloai.setText(null);
		this.txtTenloai.setText(null);
		this.txtMaloai.requestFocus();
	}

	// Ham khoa cac TextField
	private void setKhoa(boolean a) {
		// Khoa hoac mo khoa cho Cac JTextField
		this.txtMaloai.setEnabled(!a);
		this.txtTenloai.setEnabled(!a);
	}

	// Ham khoa cac Button
	private void setButton(boolean a) {
		// Vo hieu hoac co hieu luc cho cac JButton
		this.butThem.setEnabled(a);
		this.butXoa.setEnabled(a);
		this.butSua.setEnabled(a);
		this.butLuu.setEnabled(!a);
		this.butKLuu.setEnabled(!a);
		this.butThoat.setEnabled(a);
	}

	public void frmCapnhatLoaiSP() throws SQLException {
		getComponents(); // Khởi tạo các components trên JFrame
		String[] colsName = { "Mã Loai", "Tên loai" };
		// đặt tiêu đề cột cho tableModel
		tableModel.setColumnIdentifiers(colsName);
		// kết nối jtable với tableModel
		jTableLoaiSP.setModel(tableModel);
		// gọi hàm ShowData để đưa dữ liệu vào tableModel
		ShowData();
		// goi Ham xoa trang cac TextField
		setNull();
		// Goi ham Khoa cac TextField
		setKhoa(true);
		// Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao
		setButton(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formDanhmucloaiSP frame = new formDanhmucloaiSP();
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
	public formDanhmucloaiSP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DANH M\u1EE4C LO\u1EA0I S\u1EA2N PH\u1EA8M");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(166, 24, 296, 32);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E3 lo\u1EA1i:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 68, 45, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("T\u00EAn lo\u1EA1i:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 104, 45, 13);
		contentPane.add(lblNewLabel_2);

		txtMaloai = new JTextField();
		txtMaloai.setBounds(101, 66, 96, 19);
		contentPane.add(txtMaloai);
		txtMaloai.setColumns(10);

		txtTenloai = new JTextField();
		txtTenloai.setBounds(101, 102, 213, 19);
		contentPane.add(txtTenloai);
		txtTenloai.setColumns(10);

		JButton butThem = new JButton("Th\u00EAm");
		butThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butThem.setBounds(10, 138, 74, 21);
		contentPane.add(butThem);

		JButton butSua = new JButton("S\u1EEDa");
		butSua.setBounds(94, 138, 59, 21);
		contentPane.add(butSua);

		JButton butXoa = new JButton("X\u00F3a");
		butXoa.setBounds(177, 138, 59, 21);
		contentPane.add(butXoa);

		JButton butLuu = new JButton("L\u01B0u");
		butLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butLuu.setBounds(255, 138, 59, 21);
		contentPane.add(butLuu);

		JButton butKLuu = new JButton("Kh\u00F4ng l\u01B0u");
		butKLuu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		butKLuu.setBounds(324, 138, 102, 21);
		contentPane.add(butKLuu);

		JButton butThoat = new JButton("Tho\u00E1t");
		butThoat.addMouseListener(new MouseAdapter() {

		});
		butThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		butThoat.setBounds(440, 138, 68, 21);
		contentPane.add(butThoat);

		jTableLoaiSP = new JTable();
		jTableLoaiSP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				

			}
		});
		jTableLoaiSP.setBounds(10, 327, 591, -142);
		contentPane.add(jTableLoaiSP);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 591, 150);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "M\u00E3 lo\u1EA1i", "T\u00EAn lo\u1EA1i" }) {
					Class[] columnTypes = new Class[] { String.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		scrollPane.setViewportView(table);
	}
}
