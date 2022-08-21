package Final_Project_LMS;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Window.Type;

public class LoginPage {

	private JFrame frmAdminSignin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmAdminSignin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLabel New1 ;
	private JTextField textField;
	private JPasswordField passwordField;
	void initialize() {
		frmAdminSignin = new JFrame();
		frmAdminSignin.setTitle("Admin signin");
		frmAdminSignin.setType(Type.UTILITY);
		frmAdminSignin.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmAdminSignin.getContentPane().setBackground(new Color(100, 149, 237));
		frmAdminSignin.setBounds(250, 100, 859, 490);
		frmAdminSignin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminSignin.getContentPane().setLayout(null);
		
		try {
			ImageIcon background = new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\5.jpg");
			Image img = background.getImage();
			Image temp = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
			background = new ImageIcon(temp); // Again stored image into background.
			New1 = new JLabel(background); // Adding image to a label.
			New1.setBackground(new Color(100, 149, 237));
			New1.setBounds(0,0,737,466);
			New1.setLayout(null);			
		}
		catch(Exception i)
		{
			JOptionPane.showMessageDialog(null , i.getMessage());
		}
		
		//frame.getContentPane().add(New1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(238, 232, 170), new Color(238, 232, 170), new Color(238, 232, 170), new Color(238, 232, 170)));
		panel.setBackground(new Color(0, 0, 0,80));
		panel.setBounds(121, 39, 624, 357);
		frmAdminSignin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Admin Sign in\r\n");
		lblName.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(238, 232, 170), new Color(238, 232, 170), new Color(238, 232, 170), new Color(238, 232, 170)));
		lblName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setBounds(328, 31, 194, 37);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(363, 120, 194, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(363, 177, 194, 25);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign in\r\n");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 205), new Color(0, 0, 205), new Color(0, 0, 205), new Color(0, 0, 255)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getSource() == btnNewButton)
				{
					if(passwordField.getText().equalsIgnoreCase("shah555") && textField.getText().equalsIgnoreCase("Shahi")){
						MainPage.main(null);		
						frmAdminSignin.dispose();						
					}
					else{
						textField.setBackground(Color.RED);
						passwordField.setBackground(Color.red);
					}
				}
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textField.setBackground(Color.white);
				passwordField.setBackground(Color.white);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton)
				{
					if(passwordField.getText().equalsIgnoreCase("shah555") && textField.getText().equalsIgnoreCase("Shahi"))
					{
						MainPage.main(null);		
						frmAdminSignin.dispose();						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Incorrect password or Email" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
						passwordField.setText("");
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(454, 248, 103, 34);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\1 (2).png"));
		lblNewLabel.setBounds(67, 31, 242, 193);
		panel.add(lblNewLabel);
		
		JLabel lblWelcomeToLms = new JLabel("Welcome to LMS");
		lblWelcomeToLms.setFont(new Font("Palatino Linotype", Font.ITALIC, 28));
		lblWelcomeToLms.setForeground(new Color(255, 255, 255));
		lblWelcomeToLms.setBounds(67, 248, 242, 48);
		panel.add(lblWelcomeToLms);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\5 (2).png"));
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(328, 168, 37, 34);
		panel.add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\jakjfklj;l.png"));
		label_1.setBounds(328, 109, 37, 37);
		panel.add(label_1);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnHome)
				{
					HOMEPAGE_ hp = new HOMEPAGE_();
					hp.main(null);
					frmAdminSignin.dispose();					
				}
			}
		});
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnHome.setBounds(328, 252, 89, 31);
		panel.add(btnHome);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\Webp.net-resizeimage.jpg"));
		label_3.setBounds(0, 0, 843, 451);
		frmAdminSignin.getContentPane().add(label_3);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 58, 47);
		label_3.add(label);
		label.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\3356.png"));
	}
}
