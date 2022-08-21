package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JSeparator;
import java.awt.Toolkit;
public class STD_Resources {

	private JFrame frmStudentsResources;
	private JTextField RBName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STD_Resources window = new STD_Resources();
					window.frmStudentsResources.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public STD_Resources() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel RETURN_BOOK ;
	JPanel ISSUE_BOOK ;
	JPanel AfterIssueBook ;
	JLabel lblReturnedSuccessFully ;
	private JTextField BIName;
	private JTextField biName;
	private JTextField biEmail;
	private JTextField biCms;
	private JTextField biGender;
	private JTextField biContact;
	private JTextField biClass;
	JComboBox biDepts ;
	Connection con ;
	ResultSet rs ;
	int cp ;
	private JTextField msName;
	private JTextField msEmail;
	private JTextField msCms;
	private JTextField msGender;
	private JTextField msContact;
	private JTextField msClass;
	private JTextField msDept;
	private JTextField msDate;
	JLabel msgBook ;
	JPanel msgPanel ;
	JComboBox RBDepts ;
	private JTextField biDate;
	private void initialize() {
		frmStudentsResources = new JFrame();
		frmStudentsResources.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\456.png"));
		frmStudentsResources.setTitle("Students' Resources");
		frmStudentsResources.setBounds(100, 20, 1247, 681);
		frmStudentsResources.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentsResources.getContentPane().setLayout(null);
		frmStudentsResources.setResizable(false);
		JLabel BackgroundImage = new JLabel("");
		BackgroundImage.setBounds(0, 0, 1241, 652);
		BackgroundImage.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\rsz_1syed-bilal-javaid-uc9gjdhj1ya-unsplash.jpg"));
		frmStudentsResources.getContentPane().add(BackgroundImage);
		
		
/*********************Header panel**********************************************/		
		JPanel Header_panel = new JPanel();
		Header_panel.setBorder(null);
		Header_panel.setBackground(new Color(0, 0, 0 , 80));
		Header_panel.setBounds(0, 0, 1247, 94);
		BackgroundImage.add(Header_panel);
		Header_panel.setLayout(null);
		
		JLabel lblSTU = new JLabel("S T U D E N T ' S      R E S O U R C E S ");
		lblSTU.setBounds(337, 29, 619, 39);
		lblSTU.setHorizontalAlignment(SwingConstants.CENTER);
		lblSTU.setForeground(Color.BLACK);
		lblSTU.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 32));
		Header_panel.add(lblSTU);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Modified\\3356.png"));
		label_1.setBounds(28, 24, 48, 44);
		Header_panel.add(label_1);
		
/*********************Menu Panel ******************************************/		
		JPanel MENUE_panel = new JPanel();
		MENUE_panel.setOpaque(false);
		MENUE_panel.setBackground(Color.WHITE);
		MENUE_panel.setBounds(0, 94, 251, 520);
		BackgroundImage.add(MENUE_panel);
		MENUE_panel.setLayout(null);
		
		JLabel lblIssueBook = new JLabel("ISSUE BOOK");
		lblIssueBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblIssueBook.setFont(new Font("Tahoma", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblIssueBook.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				BackgroundImage.add(ISSUE_BOOK);
				ISSUE_BOOK.setBounds(312, 116, 876, 503);
			}
		});
		lblIssueBook.setBackground(new Color(255, 0, 0));
		lblIssueBook.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIssueBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setBounds(35, 41, 186, 69);
		MENUE_panel.add(lblIssueBook);
		
		JLabel lblReturnBook = new JLabel("RETURN BOOK\r\n");
		lblReturnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblReturnBook.setFont(new Font("Tahoma", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblReturnBook.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BackgroundImage.add(RETURN_BOOK);
				RETURN_BOOK.setBounds(350, 150, 750, 430);							
			}
		});
		lblReturnBook.setBackground(new Color(255, 0, 0));
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReturnBook.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblReturnBook.setBounds(35, 158, 186, 69);
		MENUE_panel.add(lblReturnBook);
		
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\11.png"));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				frmStudentsResources.dispose();	
				STD_Resources.main(null);

			}
		});
		btnRefresh.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0)));
		btnRefresh.setBackground(new Color(255, 255, 255));
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRefresh.setBounds(35, 425, 186, 42);
		MENUE_panel.add(btnRefresh);
		
		JButton btnHome = new JButton("  HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				HOMEPAGE_.main(null);
				frmStudentsResources.dispose();	
			}
		});
		btnHome.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\Honeme.png"));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHome.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setBounds(35, 478, 186, 42);
		MENUE_panel.add(btnHome);

		
/*******************===ISSUE BOOKS===****************************************************************************/		
		ISSUE_BOOK = new JPanel();
		ISSUE_BOOK.setOpaque(false);
		ISSUE_BOOK.setBackground(new Color(0, 255, 255));
		ISSUE_BOOK.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		BackgroundImage.add(ISSUE_BOOK);
//		ISSUE_BOOK.setBounds(312, 116, 876, 503);
		ISSUE_BOOK.setLayout(null);
		
		JLabel lblEnterNameOf = new JLabel("Enter Name of theBook : ");
		lblEnterNameOf.setBackground(Color.RED);
		lblEnterNameOf.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEnterNameOf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNameOf.setBounds(101, 24, 219, 27);
		ISSUE_BOOK.add(lblEnterNameOf);
		
		BIName = new JTextField();
		BIName.setFont(new Font("Tahoma", Font.BOLD, 14));
		BIName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BIName.setBounds(330, 24, 150, 29);
		ISSUE_BOOK.add(BIName);
		BIName.setColumns(10);
		
		JLabel lblDepts = new JLabel("Depts : ");
		lblDepts.setBackground(Color.RED);
		lblDepts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepts.setBounds(556, 26, 72, 27);
		ISSUE_BOOK.add(lblDepts);
		
		JComboBox BIDepts = new JComboBox();
		BIDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		BIDepts.setFont(new Font("Tahoma", Font.BOLD, 14));
		BIDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BIDepts.setBounds(638, 26, 107, 27);
		ISSUE_BOOK.add(BIDepts);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String srchName = BIName.getText();
					String srchDept = BIDepts.getSelectedItem().toString();
					
					if(srchName.equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "Enter Name !" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
					}
					else {
						boolean flag = false ;
						try {
							con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
							String sql = "select * from bookRecord ";
							
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							rs = ps.executeQuery();
							while(rs.next()) {							
								String name = rs.getString ("Name") ;
								String dept = rs.getString ("Depts") ;
								int copy = rs.getInt("Copies");
								
								if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept) && !(copy<=0)) {								
									cp = rs.getInt("Copies");
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
							ISSUE_BOOK.add(AfterIssueBook);
							AfterIssueBook.setBounds(36, 62, 802, 380);
						}
						else {JOptionPane.showMessageDialog(null, "Book Not Found ! " , "" , JOptionPane.WARNING_MESSAGE);}
						
					}
	
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOk.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOk.setBounds(498, 454, 89, 27);
		ISSUE_BOOK.add(btnOk);
		
/***************AFTER ISSUE BOOK*****************************************************************/		
		AfterIssueBook = new JPanel();
		AfterIssueBook.setOpaque(false);
		AfterIssueBook.setForeground(Color.WHITE);
		AfterIssueBook.setBackground(new Color(0, 255, 0));
		AfterIssueBook.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
//		AfterIssueBook.setBounds(60, 62, 746, 380);
//		ISSUE_BOOK.add(AfterIssueBook);
		AfterIssueBook.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.CYAN);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(93, 42, 79, 35);
		AfterIssueBook.add(lblName);
		
		JLabel lblEmail = new JLabel("Email\r\n");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.GREEN);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(92, 109, 80, 35);
		AfterIssueBook.add(lblEmail);
		
		JLabel lblDept = new JLabel("Dept");
		lblDept.setForeground(Color.WHITE);
		lblDept.setBackground(Color.CYAN);
		lblDept.setHorizontalAlignment(SwingConstants.CENTER);
		lblDept.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDept.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDept.setBounds(92, 171, 80, 35);
		AfterIssueBook.add(lblDept);
		
		JLabel lblCmsId = new JLabel("CMS ID");
		lblCmsId.setForeground(Color.WHITE);
		lblCmsId.setBackground(Color.GREEN);
		lblCmsId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCmsId.setBounds(92, 235, 80, 35);
		AfterIssueBook.add(lblCmsId);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setForeground(Color.WHITE);
		lblClass.setBackground(Color.GREEN);
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClass.setBounds(448, 42, 79, 35);
		AfterIssueBook.add(lblClass);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.WHITE);
		lblContact.setBackground(Color.CYAN);
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContact.setBounds(448, 109, 77, 35);
		AfterIssueBook.add(lblContact);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBackground(Color.GREEN);
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(448, 171, 77, 35);
		AfterIssueBook.add(lblGender);
		
		biName = new JTextField();
		biName.setFont(new Font("Tahoma", Font.BOLD, 13));
		biName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biName.setBounds(194, 42, 145, 35);
		AfterIssueBook.add(biName);
		biName.setColumns(10);
		
		biEmail = new JTextField();
		biEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		biEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biEmail.setColumns(10);
		biEmail.setBounds(194, 105, 145, 35);
		AfterIssueBook.add(biEmail);
		
		biCms = new JTextField();
		biCms.setFont(new Font("Tahoma", Font.BOLD, 13));
		biCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biCms.setColumns(10);
		biCms.setBounds(194, 235, 145, 35);
		AfterIssueBook.add(biCms);
		
		biGender = new JTextField();
		biGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		biGender.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biGender.setColumns(10);
		biGender.setBounds(535, 171, 145, 35);
		AfterIssueBook.add(biGender);
		
		JButton btnIssue = new JButton("ISSUE");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UPDName = BIName.getText();
				String UPDDept = BIDepts.getSelectedItem().toString();
				
				if(biName.getText().equalsIgnoreCase("") || biEmail.getText().equalsIgnoreCase("") || biCms.getText().equals("") || biClass.getText().equals("") || biContact.getText().equals("") || biGender.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Fill all the Fields !" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
				}
				else {
					boolean flag = false ;
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
						String sql = "select * from bookRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							if(name.equalsIgnoreCase(UPDName) && dept.equalsIgnoreCase(UPDDept)) {								rs.updateInt("Copies", cp-1);
								rs.updateRow();
								
								msgBook.setText(BIName.getText());
								msName.setText(biName.getText()); msEmail.setText(biEmail.getText());
								msDept.setText(biDepts.getSelectedItem().toString()); msCms.setText(biCms.getText());
								msClass.setText(biClass.getText()); msContact.setText(biContact.getText());
								msGender.setText(biGender.getText()); msDate.setText(biDate.getText());
								
								flag =true ;
								break ;	
							}
						}
						con.close();
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
					if(flag==true) {
						ISSUE_BOOK.setVisible(false);
						BackgroundImage.add(msgPanel);
						msgPanel.setBounds(343, 144, 802, 480);
					}
					else {
						JOptionPane.showMessageDialog(null, "Book not Found ! " , "" , JOptionPane.WARNING_MESSAGE);
					}
					
				}

			}
		});
		btnIssue.setBackground(Color.WHITE);
		btnIssue.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIssue.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIssue.setBounds(321, 334, 153, 35);
		AfterIssueBook.add(btnIssue);
		
		biContact = new JTextField();
		biContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		biContact.setColumns(10);
		biContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biContact.setBounds(535, 109, 145, 35);
		AfterIssueBook.add(biContact);
		
		biClass = new JTextField();
		biClass.setFont(new Font("Tahoma", Font.BOLD, 13));
		biClass.setColumns(10);
		biClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biClass.setBounds(535, 42, 145, 35);
		AfterIssueBook.add(biClass);
		
		JLabel lblDate = new JLabel("Date\r\n");
		lblDate.setForeground(Color.WHITE);
		lblDate.setBackground(Color.CYAN);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDate.setBounds(450, 235, 77, 35);
		AfterIssueBook.add(lblDate);
		
		biDepts = new JComboBox();
		biDepts.setFont(new Font("Tahoma", Font.BOLD, 13));
		biDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		biDepts.setBounds(194, 171, 145, 35);
		AfterIssueBook.add(biDepts);
		
		biDate = new JTextField();
		biDate.setHorizontalAlignment(SwingConstants.CENTER);
		biDate.setEditable(false);
		biDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		biDate.setColumns(10);
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  		
		biDate.setText(date.toString());		
		biDate.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		biDate.setBounds(535, 235, 145, 35);
		AfterIssueBook.add(biDate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(330, 456, 89, 24);
		ISSUE_BOOK.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				ISSUE_BOOK.setVisible(false);				
			}
		});
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		
/******************MSG Panel*******************************************************/		
		msgPanel = new JPanel();
		msgPanel.setForeground(Color.WHITE);
		msgPanel.setLayout(null);
		msgPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		msgPanel.setBackground(new Color(0,0,0,80));
//		msgPanel.setBounds(343, 144, 802, 480);
		BackgroundImage.add(msgPanel);
		
		JLabel label_3 = new JLabel("Name");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_3.setBackground(Color.RED);
		label_3.setBounds(93, 109, 79, 35);
		msgPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Email\r\n");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_4.setBackground(Color.RED);
		label_4.setBounds(93, 171, 80, 35);
		msgPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Dept");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_5.setBackground(Color.RED);
		label_5.setBounds(93, 235, 80, 35);
		msgPanel.add(label_5);
		
		JLabel label_6 = new JLabel("CMS ID");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_6.setBackground(Color.RED);
		label_6.setBounds(92, 286, 80, 35);
		msgPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Class");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_7.setBackground(Color.RED);
		label_7.setBounds(448, 109, 79, 35);
		msgPanel.add(label_7);
		
		JLabel label_8 = new JLabel("Contact");
		label_8.setForeground(Color.WHITE);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_8.setBackground(Color.RED);
		label_8.setBounds(450, 171, 77, 35);
		msgPanel.add(label_8);
		
		JLabel label_9 = new JLabel("Gender");
		label_9.setForeground(Color.WHITE);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_9.setBackground(Color.RED);
		label_9.setBounds(448, 235, 77, 35);
		msgPanel.add(label_9);
		
		msName = new JTextField();
		msName.setFont(new Font("Tahoma", Font.BOLD, 13));
		msName.setColumns(10);
		msName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msName.setBounds(194, 110, 145, 35);
		msgPanel.add(msName);
		
		msEmail = new JTextField();
		msEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		msEmail.setColumns(10);
		msEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msEmail.setBounds(194, 172, 145, 35);
		msgPanel.add(msEmail);
		
		msCms = new JTextField();
		msCms.setFont(new Font("Tahoma", Font.BOLD, 13));
		msCms.setColumns(10);
		msCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msCms.setBounds(194, 287, 145, 35);
		msgPanel.add(msCms);
		
		msGender = new JTextField();
		msGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		msGender.setColumns(10);
		msGender.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msGender.setBounds(535, 236, 145, 35);
		msgPanel.add(msGender);
		
		msContact = new JTextField();
		msContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		msContact.setColumns(10);
		msContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msContact.setBounds(535, 172, 145, 35);
		msgPanel.add(msContact);
		
		msClass = new JTextField();
		msClass.setFont(new Font("Tahoma", Font.BOLD, 13));
		msClass.setColumns(10);
		msClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msClass.setBounds(535, 110, 145, 35);
		msgPanel.add(msClass);
		
		JLabel label_10 = new JLabel("Date\r\n");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_10.setBackground(Color.RED);
		label_10.setBounds(448, 286, 77, 35);
		msgPanel.add(label_10);
		
		msDept = new JTextField();
		msDept.setFont(new Font("Tahoma", Font.BOLD, 13));
		msDept.setColumns(10);
		msDept.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msDept.setBounds(194, 236, 145, 35);
		msgPanel.add(msDept);
		
		msDate = new JTextField();
		msDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		msDate.setColumns(10);
		msDate.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		msDate.setBounds(535, 287, 145, 35);
		msgPanel.add(msDate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 383, 697, 2);
		msgPanel.add(separator);
		
		JLabel lblYouHaveTo = new JLabel("NOTE :  You have to return it within 15 days");
		lblYouHaveTo.setForeground(Color.RED);
		lblYouHaveTo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblYouHaveTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouHaveTo.setBounds(93, 356, 587, 23);
		msgPanel.add(lblYouHaveTo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(60, 85, 697, 2);
		msgPanel.add(separator_1);
		
		JLabel lblBookName = new JLabel("Book Name : ");
		lblBookName.setBackground(Color.RED);
		lblBookName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBookName.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookName.setBounds(205, 39, 134, 35);
		msgPanel.add(lblBookName);
		
		msgBook = new JLabel("Empty\r\n");
		msgBook.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		msgBook.setHorizontalAlignment(SwingConstants.CENTER);
		msgBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		msgBook.setBackground(Color.RED);
		msgBook.setBounds(348, 39, 239, 35);
		msgPanel.add(msgBook);
		
		JButton btnOk_2 = new JButton("OK");
		btnOk_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgPanel.setVisible(false); 
			}
		});
		btnOk_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk_2.setBounds(335, 411, 119, 29);
		msgPanel.add(btnOk_2);
		
		
/**********************RETRUN BOOK PANEL *************************************************/	
		RETURN_BOOK = new JPanel();
		RETURN_BOOK.setLayout(null);
		RETURN_BOOK.setOpaque(false);
		RETURN_BOOK.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		RETURN_BOOK.setBackground(Color.RED);
//		RETURN_BOOK.setBounds(350, 150, 750, 430);
//		BackgroundImage.add(RETURN_BOOK);
		
		RBName = new JTextField();
		RBName.setFont(new Font("Tahoma", Font.BOLD, 14));
		RBName.setColumns(10);
		RBName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		RBName.setBounds(265, 32, 144, 33);
		RETURN_BOOK.add(RBName);
		
		JLabel label = new JLabel("Depts : ");
		label.setBackground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label.setBounds(455, 30, 65, 33);
		RETURN_BOOK.add(label);
		
		RBDepts = new JComboBox();
		RBDepts.setFont(new Font("Tahoma", Font.BOLD, 14));
		RBDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		RBDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		RBDepts.setBounds(530, 32, 144, 32);
		RETURN_BOOK.add(RBDepts);
		
		JLabel label_2 = new JLabel("Enter Name of the Book:");
		label_2.setBackground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_2.setBounds(73, 31, 182, 34);
		RETURN_BOOK.add(label_2);
		
		JButton btnReturn = new JButton("RETURN\t\t");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UPDName = RBName.getText();
				String UPDDept = RBDepts.getSelectedItem().toString();
				
				if(UPDName.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Enter Name !" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
				}
				else {
					boolean flag = false ;
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
						String sql = "select * from bookRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							if(name.equalsIgnoreCase(UPDName) && dept.equalsIgnoreCase(UPDDept)) {
								rs.updateInt("Copies", rs.getInt("Copies")+1);
								rs.updateRow();
								
								flag =true ;
								break ;	
							}
							
						
						}
						con.close();
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
					if(flag==true) {
						lblReturnedSuccessFully.setText("Book Return Successfully !");
						lblReturnedSuccessFully.setBackground(Color.ORANGE);
						lblReturnedSuccessFully.setOpaque(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Not such Book was Issued. " , "" , JOptionPane.WARNING_MESSAGE);
					}
					
				}
				
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReturn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReturn.setBounds(422, 367, 105, 33);
		RETURN_BOOK.add(btnReturn);
		
		lblReturnedSuccessFully = new JLabel("");
		lblReturnedSuccessFully.setBackground(Color.RED);
		lblReturnedSuccessFully.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnedSuccessFully.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblReturnedSuccessFully.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblReturnedSuccessFully.setBounds(73, 123, 601, 189);
		RETURN_BOOK.add(lblReturnedSuccessFully);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				RETURN_BOOK.setVisible(false);				
			}
		});
		btnOk_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOk_1.setBounds(272, 367, 105, 33);
		RETURN_BOOK.add(btnOk_1);
	}
}
