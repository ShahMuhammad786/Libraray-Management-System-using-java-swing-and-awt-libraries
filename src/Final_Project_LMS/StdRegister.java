package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
public class StdRegister {

	private JFrame frmStudentRegisteration;
	private JTextField stContact;
	private JTextField stClass;
	private JTextField stName;
	private JTextField stEmail;
	private JTextField stCms;
	JComboBox stDepts ;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton stFemale ;
	JRadioButton stMale ;
	Connection con ;
	ResultSet rs ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StdRegister window = new StdRegister();
					window.frmStudentRegisteration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StdRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentRegisteration = new JFrame();
		frmStudentRegisteration.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\resizedImage.png"));
		frmStudentRegisteration.setResizable(false);
		frmStudentRegisteration.setType(Type.UTILITY);
		frmStudentRegisteration.getContentPane().setBackground(new Color(100, 149, 237));
		frmStudentRegisteration.setTitle("Student Registeration");
		frmStudentRegisteration.setBounds(250, 100, 950, 522);
		frmStudentRegisteration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentRegisteration.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("EMAIL : ");
		lblName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(122, 158, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblName);
		
		JLabel lblUserName = new JLabel("CMS ID : ");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblUserName.setBounds(122, 255, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("CLASS : ");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblPassword.setBounds(122, 308, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblPassword);
		
		JLabel lblDept = new JLabel("DEPT : ");
		lblDept.setHorizontalAlignment(SwingConstants.CENTER);
		lblDept.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDept.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDept.setBounds(122, 205, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblDept);
		
		JLabel lblContactNo = new JLabel("CONTACT : ");
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContactNo.setBounds(122, 347, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblContactNo);
		
		JLabel lblGender = new JLabel("GENDER : ");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender.setBounds(533, 109, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblGender);
		
		JLabel lblImage = new JLabel("IMAGE : ");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblImage.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage.setBounds(533, 347, 110, 25);
		frmStudentRegisteration.getContentPane().add(lblImage);
		
		stContact = new JTextField();
		stContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		stContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stContact.setBounds(269, 349, 174, 25);
		frmStudentRegisteration.getContentPane().add(stContact);
		stContact.setColumns(10);
		
		stClass = new JTextField();
		stClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		stClass.setColumns(10);
		stClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stClass.setBounds(269, 308, 173, 25);
		frmStudentRegisteration.getContentPane().add(stClass);
		
		stName = new JTextField();
		stName.setFont(new Font("Tahoma", Font.BOLD, 14));
		stName.setColumns(10);
		stName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stName.setBounds(269, 109, 173, 27);
		frmStudentRegisteration.getContentPane().add(stName);
		
		stEmail = new JTextField();
		stEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		stEmail.setColumns(10);
		stEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stEmail.setBounds(269, 160, 173, 25);
		frmStudentRegisteration.getContentPane().add(stEmail);
		
		stMale = new JRadioButton("Male");
		buttonGroup.add(stMale);
		stMale.setFont(new Font("Tahoma", Font.BOLD, 15));
		stMale.setBounds(665, 108, 66, 26);
		frmStudentRegisteration.getContentPane().add(stMale);
		
		stFemale = new JRadioButton("Female");
		buttonGroup.add(stFemale);
		stFemale.setFont(new Font("Tahoma", Font.BOLD, 15));
		stFemale.setBounds(735, 108, 94, 26);
		frmStudentRegisteration.getContentPane().add(stFemale);
		
		JButton btnChoose = new JButton("CHOOSE (opt)");
		btnChoose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnChoose.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnChoose.setBounds(665, 346, 164, 26);
		frmStudentRegisteration.getContentPane().add(btnChoose);
		
		JLabel lblRegisteration = new JLabel("REGISTERATION");
		lblRegisteration.setBackground(new Color(255, 255, 255));
		lblRegisteration.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisteration.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegisteration.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblRegisteration.setBounds(269, 11, 374, 45);
		frmStudentRegisteration.getContentPane().add(lblRegisteration);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a , b ,c ,d , f , g ,h ,k="no" ;
				a = stName.getText(); b= stEmail.getText(); c= stDepts.getSelectedItem().toString() ; d = stCms.getText();
				f = stClass.getText() ; g = stContact.getText() ; 
				boolean m = stMale.isSelected();
				if(m==true) {h = "Male" ;}else {h="Female";}
				
				
				if(a.equalsIgnoreCase("")||b.equalsIgnoreCase("")||c.equalsIgnoreCase("")||d.equalsIgnoreCase("")||f.equalsIgnoreCase("")||g.equalsIgnoreCase("")||k.equalsIgnoreCase("")||h.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Fillout all the Fields" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL2.accdb");
						String sql = "select * from stdRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						rs.moveToInsertRow();
						
						rs.updateString("Name",a);
						rs.updateString("Email",b);
						rs.updateString("Depts",c);
						rs.updateString("Cms",d);
						rs.updateString("Class",f);
						rs.updateString("Contact",g);
						rs.updateString("Gender",h);
						rs.updateString("Img",k);
						
						rs.insertRow();
					
						JOptionPane.showMessageDialog(null, "' "+ a +" ' Registered Successfully !" , "Alert" , JOptionPane.INFORMATION_MESSAGE);
						frmStudentRegisteration.dispose();
						StdLogin.main(null);
						
						con.close();
						
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
				}
	
			}
		});
		btnRegister.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnRegister.setBounds(469, 427, 174, 41);
		frmStudentRegisteration.getContentPane().add(btnRegister);
		
		JLabel label = new JLabel("NAME :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label.setBounds(122, 111, 110, 25);
		frmStudentRegisteration.getContentPane().add(label);
		
		stCms = new JTextField();
		stCms.setFont(new Font("Tahoma", Font.BOLD, 14));
		stCms.setColumns(10);
		stCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stCms.setBounds(269, 257, 174, 25);
		frmStudentRegisteration.getContentPane().add(stCms);
		
		JLabel label_1 = new JLabel("");
		label_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_1.setBounds(533, 158, 294, 175);
		frmStudentRegisteration.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\3356.png"));
		label_2.setBounds(22, 11, 48, 45);
		frmStudentRegisteration.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\4114.jpg"));
		label_3.setBounds(0, 0, 944, 493);
		frmStudentRegisteration.getContentPane().add(label_3);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{con.close();}catch(Exception i){i.getStackTrace();}
				frmStudentRegisteration.dispose();
				StdLogin.main(null);
			}
		});
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnGoBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnGoBack.setBounds(269, 427, 174, 41);
		label_3.add(btnGoBack);
		
		stDepts = new JComboBox();
		stDepts.setFont(new Font("Tahoma", Font.BOLD, 14));
		stDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		stDepts.setBounds(269, 208, 174, 22);
		label_3.add(stDepts);
		
		JSeparator separator = new JSeparator();
		label_3.add(separator);
		separator.setBounds(48, 78, 844, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(48, 401, 844, 2);
		label_3.add(separator_1);
	}
}
