package Phanmemquanlybanhang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 847, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sản phẩm");
		menuBar.add(mnNewMenu);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ THÔNG TIN SẢN PHẨM");
		lblNewLabel.setBounds(267, 32, 190, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sp");
		lblNewLabel_1.setBounds(58, 85, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Đơn giá");
		lblNewLabel_2.setBounds(58, 134, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tên sp");
		lblNewLabel_3.setBounds(400, 85, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Xuất xứ");
		lblNewLabel_3_1.setBounds(400, 134, 45, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Loại sp");
		lblNewLabel_3_2.setBounds(400, 177, 45, 13);
		contentPane.add(lblNewLabel_3_2);
		
		textField = new JTextField();
		textField.setBounds(113, 82, 173, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 131, 173, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(469, 82, 173, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(469, 131, 173, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(469, 174, 173, 19);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Ghi");
		btnNewButton.setBounds(58, 235, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnKhngGhi = new JButton("Không ghi");
		btnKhngGhi.setBounds(222, 235, 85, 21);
		contentPane.add(btnKhngGhi);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setBounds(400, 235, 85, 21);
		contentPane.add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(577, 235, 85, 21);
		contentPane.add(btnXa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 294, 587, 109);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 sp", "T\u00EAn sp", "Gi\u00E1", "Xu\u1EA5t x\u1EE9", "Lo\u1EA1i h\u00E0ng"
			}
		));
		scrollPane.setViewportView(table);
	}
}
