package paytm.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Scrollbar;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.JDesktopPane;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import javax.swing.UIManager;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
public class frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtMobileNumber;
	private JTextField txtOperator;
	private JTextField txtAmount;
	private JTextField txtNoItemsIn;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 1227, 898);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel electricity = new Panel();
		electricity.setBounds(30, 180, 461, 243);
		frame.getContentPane().add(electricity);
		electricity.setLayout(null);
		electricity.setVisible(false);
		JLabel lblNewLabel_3 = new JLabel("Pay For Electricity");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 17));
		lblNewLabel_3.setBounds(10, 11, 350, 35);
		electricity.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Electricity Boards");
		rdbtnNewRadioButton.setBackground(SystemColor.window);
		rdbtnNewRadioButton.setForeground(new Color(0, 191, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(31, 53, 148, 23);
		electricity.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnApartments = new JRadioButton("Apartments");
		rdbtnApartments.setSelected(true);
		rdbtnApartments.setForeground(new Color(0, 191, 255));
		rdbtnApartments.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnApartments.setBackground(Color.WHITE);
		rdbtnApartments.setBounds(200, 55, 148, 23);
		electricity.add(rdbtnApartments);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Statename");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_4.setBackground(SystemColor.window);
		lblNewLabel_4.setBounds(31, 94, 176, 23);
		electricity.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(58, 128, 302, 43);
		electricity.add(textField_4);
		textField_4.setColumns(10);
			
		
		JPanel mobile = new JPanel();
		mobile.setLayout(null);
		mobile.setBackground(Color.WHITE);
		mobile.setBounds(30, 180, 1123, 243);
		mobile.setVisible(true);
		frame.getContentPane().add(mobile);
		
		textField = new JTextField();
		textField.setText("Mobile Recharge or Bill Payment");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 11, 339, 29);
		mobile.add(textField);
		
		JRadioButton rdbtnPrepaid = new JRadioButton("Prepaid");
		rdbtnPrepaid.setSelected(true);
		rdbtnPrepaid.setBackground(new Color(255, 255, 255));
		rdbtnPrepaid.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnPrepaid.setForeground(SystemColor.textHighlight);
		rdbtnPrepaid.setBounds(20, 43, 168, 49);
		mobile.add(rdbtnPrepaid);
		
		JRadioButton rdbtnPostpaid = new JRadioButton("Postpaid");
		rdbtnPostpaid.setForeground(SystemColor.textHighlight);
		rdbtnPostpaid.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnPostpaid.setBackground(Color.WHITE);
		rdbtnPostpaid.setBounds(205, 42, 221, 49);
		mobile.add(rdbtnPostpaid);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("MOBILE NUMBER\r\n");
		textField_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setBounds(20, 136, 168, 36);
		mobile.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("OPERATOR\r\n");
		textField_2.setBounds(222, 136, 199, 36);
		mobile.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("AMOUNT");
		textField_3.setColumns(10);
		textField_3.setBounds(459, 140, 191, 29);
		mobile.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\21.png"));
		lblNewLabel_2.setBounds(745, 123, 131, 49);
		mobile.add(lblNewLabel_2);
		
		txtMobileNumber = new JTextField();
		txtMobileNumber.setText("Mobile Number\r\n");
		txtMobileNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtMobileNumber.setForeground(Color.BLACK);
		txtMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMobileNumber.setEditable(false);
		txtMobileNumber.setColumns(10);
		txtMobileNumber.setBackground(Color.WHITE);
		txtMobileNumber.setBounds(10, 99, 116, 29);
		mobile.add(txtMobileNumber);
		
		txtOperator = new JTextField();
		txtOperator.setText("Operator");
		txtOperator.setHorizontalAlignment(SwingConstants.LEFT);
		txtOperator.setForeground(Color.BLACK);
		txtOperator.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtOperator.setEditable(false);
		txtOperator.setColumns(10);
		txtOperator.setBackground(Color.WHITE);
		txtOperator.setBounds(200, 98, 116, 29);
		mobile.add(txtOperator);
		
		txtAmount = new JTextField();
		txtAmount.setText("Amount");
		txtAmount.setHorizontalAlignment(SwingConstants.LEFT);
		txtAmount.setForeground(Color.BLACK);
		txtAmount.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAmount.setEditable(false);
		txtAmount.setColumns(10);
		txtAmount.setBackground(Color.WHITE);
		txtAmount.setBounds(411, 98, 116, 29);
		mobile.add(txtAmount);
		
		JButton rechargebutt = new JButton("New button");
		rechargebutt.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\22.png"));
		rechargebutt.setBounds(886, 99, 191, 47);
		mobile.add(rechargebutt);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Fast Forward");
		chckbxNewCheckBox.setForeground(Color.CYAN);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBackground(SystemColor.textHighlightText);
		chckbxNewCheckBox.setBounds(889, 26, 188, 66);
		mobile.add(chckbxNewCheckBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(1, 43, 114));
		panel.setBounds(0, 97, 1209, 267);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				mobile.setVisible(true);
				electricity.setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\3.png"));
		
		JLabel lblelectri = new JLabel("New label");
		lblelectri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mobile.setVisible(false);
				electricity.setVisible(true);
			}
		});
		lblelectri.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\4.png"));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\5.png"));
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\6.png"));
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\7.png"));
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\8.png"));
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\9.png"));
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\10.png"));
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\11.png"));
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\12.png"));
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\13.png"));
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\14.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(63)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblelectri, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_7)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblelectri, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
			}
		});
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setBackground(SystemColor.textHighlightText);
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\2.png"));
		mntmNewMenuItem.setBounds(0, 29, 41, 38);
		frame.getContentPane().add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\1.png"));
		lblNewLabel.setBounds(40, 23, 137, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\15.png"));
		lblNewLabel_13.setBounds(0, 0, 1197, 26);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\16.png"));
		lblNewLabel_14.setBounds(424, 29, 174, 38);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\17.png"));
		lblNewLabel_15.setBounds(636, 35, 126, 32);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\19.png"));
		lblNewLabel_16.setBounds(813, 29, 28, 38);
		frame.getContentPane().add(lblNewLabel_16);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(734, 832, -737, 16);
		frame.getContentPane().add(scrollPane_1);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\NEW\\Desktop\\images\\20.png"));
		lblNewLabel_17.setBackground(new Color(240, 240, 240));
		lblNewLabel_17.setBounds(1022, 35, 160, 32);
		frame.getContentPane().add(lblNewLabel_17);
		
		txtNoItemsIn = new JTextField();
		txtNoItemsIn.setText("No items\r\nin your\r\ncart");
		txtNoItemsIn.setHorizontalAlignment(SwingConstants.LEFT);
		txtNoItemsIn.setForeground(new Color(0, 191, 255));
		txtNoItemsIn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNoItemsIn.setEditable(false);
		txtNoItemsIn.setColumns(10);
		txtNoItemsIn.setBackground(Color.WHITE);
		txtNoItemsIn.setBounds(853, 29, 116, 29);
		frame.getContentPane().add(txtNoItemsIn);
	}
}
