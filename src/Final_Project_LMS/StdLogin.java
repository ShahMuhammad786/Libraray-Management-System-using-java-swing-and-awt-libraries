package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Window.Type;

public class StdLogin {

	private JFrame frmStudentSignin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StdLogin window = new StdLogin();
					window.frmStudentSignin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StdLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection con ;
	ResultSet rs ;
	private void initialize() {
		frmStudentSignin = new JFrame();
		frmStudentSignin.setTitle("Student signin\r\n");
		frmStudentSignin.setType(Type.UTILITY);
		frmStudentSignin.getContentPane().setBackground(new Color(100, 149, 237));
		frmStudentSignin.setBounds(250, 100, 859, 490);
		frmStudentSignin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentSignin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), new Color(0, 255, 255), new Color(0, 255, 255), new Color(0, 255, 255)));
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 80));
		panel.setBounds(130, 51, 596, 373);
		frmStudentSignin.getContentPane().add(panel);
		
		JLabel lblStudentSignIn = new JLabel("Student Sign in\r\n");
		lblStudentSignIn.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), new Color(0, 255, 255), new Color(0, 255, 255), new Color(0, 255, 255)));
		lblStudentSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSignIn.setForeground(Color.BLACK);
		lblStudentSignIn.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblStudentSignIn.setBounds(309, 30, 194, 42);
		panel.add(lblStudentSignIn);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setColumns(10);
		textField.setBounds(363, 120, 194, 26);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(363, 177, 194, 25);
		panel.add(passwordField);
		
		JButton button = new JButton("Sign in\r\n");
		button.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 205), new Color(0, 0, 255), new Color(0, 0, 205), new Color(0, 0, 205)));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button)
				{
					if(passwordField.getText().equalsIgnoreCase("") || textField.getText().equalsIgnoreCase("")) {
						textField.setBackground(Color.RED);
						passwordField.setBackground(Color.red);						
						JOptionPane.showMessageDialog(null, "Incorrect password or Email" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						
						String srchName = passwordField.getText();
						String srchDept = textField.getText();
						
						if(srchName.equalsIgnoreCase("")) {
							JOptionPane.showMessageDialog(null, "Enter Name !" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
						}
						else {
							boolean flag = false ;
							try {
								con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL2.accdb");
								String sql = "select * from stdRecord ";
								
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								rs = ps.executeQuery();
								while(rs.next()) {							
									String name = rs.getString ("Cms") ;
									String dept = rs.getString ("Name") ;
									
									if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept)) {								
										flag = true ;
										break ;	
									}
								}
								con.close();
							}
							catch(Exception i) {
								JOptionPane.showMessageDialog(null, i.getMessage());
							}
							if(flag == true) {
								STD_Resources.main(null);			
								frmStudentSignin.dispose();	
							}
							else {JOptionPane.showMessageDialog(null, "Student Not Registered ! \nRegister First.\n________________________\n  OR wrong Pass or Name" , "" , JOptionPane.WARNING_MESSAGE);
									passwordField.setText("");									
							}

						}
					}
				}
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textField.setBackground(Color.white);
				passwordField.setBackground(Color.white);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(454, 248, 103, 34);
		panel.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\1 (2).png"));
		label_1.setBounds(67, 30, 242, 193);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Welcome to LMS");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Palatino Linotype", Font.ITALIC, 28));
		label_2.setBounds(67, 248, 242, 48);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Modified\\Webp.net-resizeimage.png"));
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(328, 177, 34, 25);
		panel.add(label_3);
		
		JButton button_1 = new JButton("Home");
		button_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button_1)
				{
					try {con.close();}catch(Exception i){i.getStackTrace();}
					HOMEPAGE_ .main(null);					
					frmStudentSignin.dispose();					
				}
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setBounds(328, 252, 89, 31);
		panel.add(button_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Modified\\9.png"));
		label_4.setBounds(328, 109, 48, 42);
		panel.add(label_4);
		
		JLabel lblNoAccount = new JLabel(">>No Account? Creat One !");
		lblNoAccount.setBackground(Color.BLACK);
		lblNoAccount.setOpaque(true);
		lblNoAccount.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNoAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == lblNoAccount) {
					StdRegister stdr = new StdRegister();
					stdr.main(null);
					frmStudentSignin.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNoAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNoAccount.setFont(new Font("Tahoma", Font.BOLD, 13));
			}
		});
		lblNoAccount.setForeground(Color.WHITE);
		lblNoAccount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoAccount.setBounds(328, 310, 229, 25);
		panel.add(lblNoAccount);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\6555.jpg"));
		label.setBounds(-201, -196, 1044, 647);
		frmStudentSignin.getContentPane().add(label);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(220, 210, 58, 47);
		label.add(label_5);
		label_5.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\3356.png"));
		
	}
}
