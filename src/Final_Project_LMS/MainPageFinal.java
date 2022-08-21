package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.* ;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class MainPageFinal {

	private JFrame frmStudentCenter;
	private JTextField stName;
	private JTextField stEmail;
	private JTextField stDepts;
	private JTextField stCms;
	private JTextField stClass;
	private JTextField stContact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageFinal window = new MainPageFinal();
					window.frmStudentCenter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPageFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel std_Regis_panel_1 ;
	JPanel SEARCH_panel ;
	JPanel AfterSEARCH_panel_1 ;
	JPanel AFTER_DELETE_panel_1 ;
	JPanel DELETE_panel ;
	JPanel AfterUPDATE_panel_1 ;
	JPanel UPDATE_panel ;
	JPanel VIEWRECORD_panel ;
	JPanel INSIDEVIEW_panel ;
	private JTextField STSName;
	private JTextField stsName;
	private JTextField stsEmail;
	private JTextField stsDept;
	private JTextField stsCms;
	private JTextField stsClass;
	private JTextField stsContact;
	private JTextField STDName;
	private JTextField sdName;
	private JTextField sdEmail;
	private JTextField sdDepts;
	private JTextField sdCms;
	private JTextField sdClass;
	private JTextField sdContact;
	private JTextField UPName;
	private JTextField upName;
	private JTextField upEmail;
	private JTextField upDepts;
	private JTextField upCms;
	private JTextField upClass;
	private JTextField upContact;
	private JTextField ssaName;
	private JTextField ssaEmail;
	private JTextField ssaDepts;
	private JTextField ssaCms;
	private JTextField ssaClass;
	private JTextField ssaContact;
	
	Connection con ;
	ResultSet rs ;
	JLabel stImg ;
	JRadioButton female ;
	JRadioButton male ;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField stsGender;
	JComboBox stsDepts ;
	private JTextField sdGender;
	JComboBox STDDepts ;
	JComboBox UPDepts ;
	private JTextField ssaGender;
	private void initialize() {
		frmStudentCenter = new JFrame();
		frmStudentCenter.setResizable(false);
		frmStudentCenter.setTitle("Student Center");
		frmStudentCenter.setBounds(50, 0, 1224, 715);
		frmStudentCenter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentCenter.getContentPane().setLayout(null);
		JLabel BACKIMAGE_lblNewLabel = new JLabel("New label");
		BACKIMAGE_lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		BACKIMAGE_lblNewLabel.setBounds(0, 0, 1224, 715);
		frmStudentCenter.getContentPane().add(BACKIMAGE_lblNewLabel);
		BACKIMAGE_lblNewLabel.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\fkkfl.jpg"));
		
		JPanel MENUE_panel_2 = new JPanel();
		MENUE_panel_2.setOpaque(false);
		MENUE_panel_2.setBounds(0, 86, 262, 590);
		BACKIMAGE_lblNewLabel.add(MENUE_panel_2);
		MENUE_panel_2.setBackground(new Color(0,0,0, 80));
		MENUE_panel_2.setBorder(null);
		MENUE_panel_2.setLayout(null);
		
		
/*******************************MENUE PANEL**************8*************************************************************/		
		JLabel lblRegister = new JLabel("   REGISTER");
		lblRegister.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\554.png"));
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblRegister.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRegister.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				std_Regis_panel_1.setBounds(287, 135, 851, 476);
			}
		});
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setForeground(Color.BLACK);
		lblRegister.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblRegister.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblRegister.setBounds(71, 47, 169, 58);
		MENUE_panel_2.add(lblRegister);
		
		JButton tglbtnLibrary = new JButton("   HOME");
		tglbtnLibrary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tglbtnLibrary.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tglbtnLibrary.setFont(new Font("Tahoma", Font.BOLD, 16));
			}
		});
		tglbtnLibrary.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\Honeme.png"));
		tglbtnLibrary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tglbtnLibrary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
					frmStudentCenter.dispose();
					HOMEPAGE_.main(null);
			}
		});
		tglbtnLibrary.setFont(new Font("Tahoma", Font.BOLD, 16));
		tglbtnLibrary.setBounds(71, 489, 169, 49);
		MENUE_panel_2.add(tglbtnLibrary);
		
		JLabel lblDelRecord = new JLabel("  DEL RECORD");
		lblDelRecord.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\5455.png"));
		lblDelRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDelRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDelRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				BACKIMAGE_lblNewLabel.add(DELETE_panel);
				DELETE_panel.setBounds(333, 139, 800, 500);
			}
		});
		lblDelRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelRecord.setForeground(Color.BLACK);
		lblDelRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblDelRecord.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDelRecord.setBounds(71, 212, 169, 58);
		MENUE_panel_2.add(lblDelRecord);
		
		JLabel lblUpdRecord = new JLabel(" UPD RECORD");
		lblUpdRecord.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\fgsgs.png"));
		lblUpdRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblUpdRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblUpdRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BACKIMAGE_lblNewLabel.add(UPDATE_panel);
				UPDATE_panel.setBounds(307, 136, 800, 500);
			}
		});
		lblUpdRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdRecord.setForeground(Color.BLACK);
		lblUpdRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblUpdRecord.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblUpdRecord.setBounds(71, 291, 169, 58);
		MENUE_panel_2.add(lblUpdRecord);
		
		JLabel lblViewRecord = new JLabel("  VIEW RECORD");
		lblViewRecord.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\456.png"));
		lblViewRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblViewRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {	
				try {
					con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL2.accdb");
					String sql = "select * from stdRecord ";
					
					PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs = ps.executeQuery();
				}catch(Exception i) {i.getStackTrace();}
				
				BACKIMAGE_lblNewLabel.add(VIEWRECORD_panel);
				VIEWRECORD_panel.setBounds(310, 136, 800, 500);
			}
		});
		lblViewRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewRecord.setForeground(Color.BLACK);
		lblViewRecord.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblViewRecord.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblViewRecord.setBounds(71, 376, 169, 58);
		MENUE_panel_2.add(lblViewRecord);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(71, 462, 150, 2);
		MENUE_panel_2.add(separator);
		
		JLabel lblSearch = new JLabel("   SEARCH");
		lblSearch.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\sff.png"));
		lblSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSearch.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSearch.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BACKIMAGE_lblNewLabel.add(SEARCH_panel);
				SEARCH_panel.setBounds(325, 115, 800, 508);				
			}
		});
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setForeground(Color.BLACK);
		lblSearch.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblSearch.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblSearch.setBounds(71, 129, 169, 58);
		MENUE_panel_2.add(lblSearch);
	
/******************************Student Register**********************************************************************/		
		std_Regis_panel_1 = new JPanel();
		std_Regis_panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		std_Regis_panel_1.setOpaque(false);
		std_Regis_panel_1.setBackground(Color.CYAN);
//		std_Regis_panel_1.setBounds(287, 135, 851, 476);
		BACKIMAGE_lblNewLabel.add(std_Regis_panel_1);
		std_Regis_panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("REGISTERATION");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_1.setBackground(new Color(0, 206, 209));
		label_1.setBounds(254, 21, 374, 45);
		std_Regis_panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("NAME :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_3.setBounds(130, 95, 110, 32);
		std_Regis_panel_1.add(label_3);
		
		stName = new JTextField();
		stName.setFont(new Font("Tahoma", Font.BOLD, 14));
		stName.setColumns(10);
		stName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stName.setBounds(268, 95, 173, 27);
		std_Regis_panel_1.add(stName);
		
		JLabel lblEmail = new JLabel("EMAIL : ");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail.setBounds(130, 145, 110, 32);
		std_Regis_panel_1.add(lblEmail);
		
		JLabel lblDepts = new JLabel("DEPTS : ");
		lblDepts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts.setBounds(130, 193, 110, 32);
		std_Regis_panel_1.add(lblDepts);
		
		JLabel lblCmsId = new JLabel("CMS ID : ");
		lblCmsId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCmsId.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId.setBounds(130, 239, 110, 32);
		std_Regis_panel_1.add(lblCmsId);
		
		JLabel lblClass = new JLabel("CLASS : ");
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClass.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass.setBounds(130, 285, 110, 32);
		std_Regis_panel_1.add(lblClass);
		
		JLabel lblContanct = new JLabel("CONTANCT : ");
		lblContanct.setHorizontalAlignment(SwingConstants.CENTER);
		lblContanct.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContanct.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContanct.setBounds(130, 332, 110, 32);
		std_Regis_panel_1.add(lblContanct);
		
		stEmail = new JTextField();
		stEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		stEmail.setColumns(10);
		stEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stEmail.setBounds(268, 145, 173, 32);
		std_Regis_panel_1.add(stEmail);
		
		stDepts = new JTextField();
		stDepts.setFont(new Font("Tahoma", Font.BOLD, 14));
		stDepts.setColumns(10);
		stDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stDepts.setBounds(268, 193, 173, 32);
		std_Regis_panel_1.add(stDepts);
		
		stCms = new JTextField();
		stCms.setFont(new Font("Tahoma", Font.BOLD, 14));
		stCms.setColumns(10);
		stCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stCms.setBounds(268, 239, 173, 32);
		std_Regis_panel_1.add(stCms);
		
		stClass = new JTextField();
		stClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		stClass.setColumns(10);
		stClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stClass.setBounds(268, 285, 173, 32);
		std_Regis_panel_1.add(stClass);
		
		stContact = new JTextField();
		stContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		stContact.setColumns(10);
		stContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stContact.setBounds(268, 332, 173, 32);
		std_Regis_panel_1.add(stContact);
		
		stImg = new JLabel("");
		stImg.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stImg.setBounds(505, 142, 294, 175);
		std_Regis_panel_1.add(stImg);
		
		male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setFont(new Font("Tahoma", Font.BOLD, 15));
		male.setBounds(626, 95, 66, 32);
		std_Regis_panel_1.add(male);
		
		female = new JRadioButton("Female ");
		buttonGroup.add(female);
		female.setFont(new Font("Tahoma", Font.BOLD, 15));
		female.setBounds(704, 95, 95, 32);
		std_Regis_panel_1.add(female);
		
		JLabel lblGender = new JLabel("GENDER : ");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender.setBounds(505, 95, 110, 32);
		std_Regis_panel_1.add(lblGender);
		
		JButton button = new JButton("CHOOSE (opt)");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBounds(635, 332, 164, 32);
		std_Regis_panel_1.add(button);
		
		JLabel lblImage = new JLabel("IMAGE : ");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblImage.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage.setBounds(505, 332, 110, 32);
		std_Regis_panel_1.add(lblImage);
		
		JButton button_1 = new JButton("REGISTER");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a , b ,c ,d , f , g ,h ,k="no" ;
				a = stName.getText(); b= stEmail.getText(); c= stDepts.getText() ; d = stCms.getText();
				f = stClass.getText() ; g = stContact.getText() ; 
				boolean m = male.isSelected();
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
					
						std_Regis_panel_1.setVisible(false);
						JOptionPane.showMessageDialog(null,  " ' "+a+ " ' Registered Successfully !" , "Alert" , JOptionPane.INFORMATION_MESSAGE);
						con.close();
						
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
				}
		
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		button_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_1.setBounds(455, 406, 173, 41);
		std_Regis_panel_1.add(button_1);
		
		JButton btnBack = new JButton("Back\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				std_Regis_panel_1.setVisible(false);				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBounds(254, 406, 173, 41);
		std_Regis_panel_1.add(btnBack);
		
		JPanel header_panel = new JPanel();
		header_panel.setBounds(0, 0, 1220, 86);
		BACKIMAGE_lblNewLabel.add(header_panel);
		header_panel.setLayout(null);
		header_panel.setBackground(new Color(0,0,0,80));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\3356.png"));
		label.setBounds(31, 21, 55, 48);
		header_panel.add(label);
		
		JLabel lblSTU = new JLabel("S  T  U  D  E  N  T      C  E  N  T  E  R");
		lblSTU.setHorizontalAlignment(SwingConstants.CENTER);
		lblSTU.setForeground(Color.BLACK);
		lblSTU.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 32));
		lblSTU.setBounds(413, 25, 584, 37);
		header_panel.add(lblSTU);
		
		JLabel label_2 = new JLabel("\r\n");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				frmStudentCenter.dispose();
				MainPageFinal.main(null);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setBorder(null);
			}
		});
		label_2.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\shah.png"));
		label_2.setBounds(1109, 14, 55, 55);
		header_panel.add(label_2);
		
/********************************VIEW STUDENTS RECORDS************************************************************/		
		VIEWRECORD_panel = new JPanel();
		VIEWRECORD_panel.setLayout(null);
		VIEWRECORD_panel.setOpaque(false);
		VIEWRECORD_panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		VIEWRECORD_panel.setBackground(new Color(100, 149, 237));
//		VIEWRECORD_panel.setBounds(310, 136, 800, 500);
//		BACKIMAGE_lblNewLabel.add(VIEWRECORD_panel);
	
		
		JButton button_9 = new JButton("Go Back");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				VIEWRECORD_panel.setVisible(false);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		button_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		button_9.setBounds(46, 461, 87, 29);
		VIEWRECORD_panel.add(button_9);
		
		
/***************************Inside View Records****************************************************************/		
		INSIDEVIEW_panel = new JPanel();
		INSIDEVIEW_panel.setLayout(null);
		INSIDEVIEW_panel.setOpaque(false);
		INSIDEVIEW_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		INSIDEVIEW_panel.setBackground(Color.BLUE);
		INSIDEVIEW_panel.setBounds(29, 31, 742, 387);
		VIEWRECORD_panel.add(INSIDEVIEW_panel);
		
		JLabel label_39 = new JLabel("Name :");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Dialog", Font.BOLD, 14));
		label_39.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_39.setBounds(44, 94, 98, 28);
		INSIDEVIEW_panel.add(label_39);
		
		ssaName = new JTextField();
		ssaName.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaName.setColumns(10);
		ssaName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaName.setBounds(152, 94, 136, 28);
		INSIDEVIEW_panel.add(ssaName);
		
		JLabel lblEmail_1 = new JLabel("Email :\r\n");
		lblEmail_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail_1.setBounds(44, 133, 98, 28);
		INSIDEVIEW_panel.add(lblEmail_1);
		
		JLabel lblDepts_1 = new JLabel("Depts : ");
		lblDepts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDepts_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_1.setBounds(44, 188, 98, 28);
		INSIDEVIEW_panel.add(lblDepts_1);
		
		JLabel lblGender_1 = new JLabel("Gender : ");
		lblGender_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGender_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender_1.setBounds(409, 94, 94, 28);
		INSIDEVIEW_panel.add(lblGender_1);
		
		JLabel lblCmsId_1 = new JLabel("CMS ID : ");
		lblCmsId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCmsId_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId_1.setBounds(44, 235, 98, 28);
		INSIDEVIEW_panel.add(lblCmsId_1);
		
		ssaEmail = new JTextField();
		ssaEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaEmail.setColumns(10);
		ssaEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaEmail.setBounds(152, 133, 136, 28);
		INSIDEVIEW_panel.add(ssaEmail);
		
		ssaDepts = new JTextField();
		ssaDepts.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaDepts.setColumns(10);
		ssaDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaDepts.setBounds(152, 188, 136, 28);
		INSIDEVIEW_panel.add(ssaDepts);
		
		JLabel lblClass_1 = new JLabel("Class : ");
		lblClass_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblClass_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass_1.setBounds(44, 280, 98, 28);
		INSIDEVIEW_panel.add(lblClass_1);
		
		JLabel lblContact = new JLabel("Contact : ");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Dialog", Font.BOLD, 14));
		lblContact.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContact.setBounds(44, 326, 98, 28);
		INSIDEVIEW_panel.add(lblContact);
		
		ssaCms = new JTextField();
		ssaCms.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaCms.setColumns(10);
		ssaCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaCms.setBounds(152, 235, 136, 28);
		INSIDEVIEW_panel.add(ssaCms);
		
		ssaClass = new JTextField();
		ssaClass.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaClass.setColumns(10);
		ssaClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaClass.setBounds(152, 280, 136, 28);
		INSIDEVIEW_panel.add(ssaClass);
		
		ssaContact = new JTextField();
		ssaContact.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaContact.setColumns(10);
		ssaContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaContact.setBounds(152, 326, 136, 28);
		INSIDEVIEW_panel.add(ssaContact);
		
		JLabel label_46 = new JLabel("");
		label_46.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_46.setBounds(409, 133, 294, 175);
		INSIDEVIEW_panel.add(label_46);
		
		JLabel lblImage_1 = new JLabel("IMAGE");
		lblImage_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImage_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage_1.setBounds(409, 326, 294, 28);
		INSIDEVIEW_panel.add(lblImage_1);
		
		ssaGender = new JTextField();
		ssaGender.setFont(new Font("Dialog", Font.BOLD, 14));
		ssaGender.setColumns(10);
		ssaGender.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ssaGender.setBounds(513, 94, 190, 28);
		INSIDEVIEW_panel.add(ssaGender);
		
		JLabel lblNewLabel = new JLabel("ALL REGISTERED STUDENTS IN LIBRARY");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(44, 21, 659, 47);
		INSIDEVIEW_panel.add(lblNewLabel);
		
		JButton btnFirst = new JButton("FIRST");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.first()) {						
						ssaName.setText(rs.getString("Name"));
						ssaEmail.setText(rs.getString("Email"));
						ssaDepts.setText(rs.getString("Depts"));
						ssaCms.setText(rs.getString("Cms"));
						ssaClass.setText(rs.getString("Class"));
						ssaContact.setText(rs.getString("Contact"));
						ssaGender.setText(rs.getString("Gender"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnFirst.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnFirst.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFirst.setBounds(155, 460, 89, 29);
		VIEWRECORD_panel.add(btnFirst);
		
		JButton btnPevious = new JButton("Pevious");
		btnPevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.previous()) {						
						ssaName.setText(rs.getString("Name"));
						ssaEmail.setText(rs.getString("Email"));
						ssaDepts.setText(rs.getString("Depts"));
						ssaCms.setText(rs.getString("Cms"));
						ssaClass.setText(rs.getString("Class"));
						ssaContact.setText(rs.getString("Contact"));
						ssaGender.setText(rs.getString("Gender"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnPevious.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPevious.setBounds(294, 460, 103, 29);
		VIEWRECORD_panel.add(btnPevious);
		
		JButton btnForward = new JButton("Forward");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.next()) {						
						ssaName.setText(rs.getString("Name"));
						ssaEmail.setText(rs.getString("Email"));
						ssaDepts.setText(rs.getString("Depts"));
						ssaCms.setText(rs.getString("Cms"));
						ssaClass.setText(rs.getString("Class"));
						ssaContact.setText(rs.getString("Contact"));
						ssaGender.setText(rs.getString("Gender"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnForward.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnForward.setBounds(408, 460, 103, 29);
		VIEWRECORD_panel.add(btnForward);
		
		JButton btnLast = new JButton("LAST");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.last()) {						
						ssaName.setText(rs.getString("Name"));
						ssaEmail.setText(rs.getString("Email"));
						ssaDepts.setText(rs.getString("Depts"));
						ssaCms.setText(rs.getString("Cms"));
						ssaClass.setText(rs.getString("Class"));
						ssaContact.setText(rs.getString("Contact"));
						ssaGender.setText(rs.getString("Gender"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnLast.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLast.setBounds(567, 460, 89, 29);
		VIEWRECORD_panel.add(btnLast);
		
		
/***************************UPDATE PANEL******************************************************************************/		
		UPDATE_panel = new JPanel();
		UPDATE_panel.setLayout(null);
		UPDATE_panel.setOpaque(false);
		UPDATE_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		UPDATE_panel.setBackground(Color.BLUE);
//		UPDATE_panel.setBounds(307, 136, 800, 500);
//		BACKIMAGE_lblNewLabel.add(UPDATE_panel);
		
		JLabel label_27 = new JLabel("Enter  Name : ");
		label_27.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_27.setBounds(114, 20, 136, 31);
		UPDATE_panel.add(label_27);
		
		UPName = new JTextField();
		UPName.setFont(new Font("Tahoma", Font.BOLD, 14));
		UPName.setColumns(10);
		UPName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		UPName.setBounds(261, 18, 136, 33);
		UPDATE_panel.add(UPName);
		
		UPDepts = new JComboBox();
		UPDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		UPDepts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		UPDepts.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		UPDepts.setBounds(580, 19, 108, 33);
		UPDATE_panel.add(UPDepts);
		
		JLabel label_28 = new JLabel("Depts : ");
		label_28.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_28.setBounds(493, 19, 77, 33);
		UPDATE_panel.add(label_28);
		
		JButton button_6 = new JButton("SEARCH\r\n");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				
				String srchName = UPName.getText();
				String srchDept = UPDepts.getSelectedItem().toString();
				
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
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept)) {								
								
								upName.setText(rs.getString("Name"));	upEmail.setText(rs.getString("Email"));	upDepts.setText(rs.getString("Depts"));
								upCms.setText( rs.getString("Cms"));	upClass.setText(rs.getString("Class"));	upContact.setText(rs.getString("Contact"));	
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

						UPDATE_panel.add(AfterUPDATE_panel_1);
						AfterUPDATE_panel_1.setBounds(29, 68, 742, 361);
					}
					else {JOptionPane.showMessageDialog(null, "Record Not Found ! " , "" , JOptionPane.WARNING_MESSAGE);}
					
				}

			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		button_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_6.setBounds(454, 456, 163, 33);
		UPDATE_panel.add(button_6);
		
		JButton btnBack_2 = new JButton("BACK\r\n");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UPDATE_panel.setVisible(false);
			}
		});
		btnBack_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnBack_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack_2.setBounds(234, 456, 163, 33);
		UPDATE_panel.add(btnBack_2);
		
		
/***************************AFTER UPDATE ****************************************************************/		
		AfterUPDATE_panel_1 = new JPanel();
		AfterUPDATE_panel_1.setLayout(null);
		AfterUPDATE_panel_1.setOpaque(false);
		AfterUPDATE_panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		AfterUPDATE_panel_1.setBackground(Color.BLUE);
//		AfterUPDATE_panel_1.setBounds(29, 68, 742, 361);
//		UPDATE_panel.add(AfterUPDATE_panel_1);
		
		JLabel label_29 = new JLabel("Name :");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_29.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_29.setBounds(44, 27, 98, 28);
		AfterUPDATE_panel_1.add(label_29);
		
		upName = new JTextField();
		upName.setFont(new Font("Dialog", Font.BOLD, 14));
		upName.setColumns(10);
		upName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upName.setBounds(152, 27, 136, 28);
		AfterUPDATE_panel_1.add(upName);
		
		JLabel lblEmail_2 = new JLabel("Email :\r\n");
		lblEmail_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail_2.setBounds(44, 66, 98, 28);
		AfterUPDATE_panel_1.add(lblEmail_2);
		
		JLabel lblDepts_2 = new JLabel("Depts : \t\t\t");
		lblDepts_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepts_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_2.setBounds(44, 117, 98, 28);
		AfterUPDATE_panel_1.add(lblDepts_2);
		
		JLabel lblGender_2 = new JLabel("Gender : ");
		lblGender_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGender_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender_2.setBounds(409, 27, 94, 28);
		AfterUPDATE_panel_1.add(lblGender_2);
		
		JLabel lblCmsId_2 = new JLabel("CMS ID :");
		lblCmsId_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCmsId_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId_2.setBounds(44, 164, 98, 28);
		AfterUPDATE_panel_1.add(lblCmsId_2);
		
		upEmail = new JTextField();
		upEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		upEmail.setColumns(10);
		upEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upEmail.setBounds(152, 66, 136, 28);
		AfterUPDATE_panel_1.add(upEmail);
		
		upDepts = new JTextField();
		upDepts.setFont(new Font("Dialog", Font.BOLD, 14));
		upDepts.setColumns(10);
		upDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upDepts.setBounds(152, 117, 136, 28);
		AfterUPDATE_panel_1.add(upDepts);
		
		JLabel lblClass_2 = new JLabel("Class : ");
		lblClass_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClass_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass_2.setBounds(44, 213, 98, 28);
		AfterUPDATE_panel_1.add(lblClass_2);
		
		JLabel lblContact_1 = new JLabel("Contact : ");
		lblContact_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContact_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContact_1.setBounds(44, 252, 98, 28);
		AfterUPDATE_panel_1.add(lblContact_1);
		
		upCms = new JTextField();
		upCms.setFont(new Font("Dialog", Font.BOLD, 14));
		upCms.setColumns(10);
		upCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upCms.setBounds(152, 164, 136, 28);
		AfterUPDATE_panel_1.add(upCms);
		
		upClass = new JTextField();
		upClass.setFont(new Font("Dialog", Font.BOLD, 14));
		upClass.setColumns(10);
		upClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upClass.setBounds(152, 213, 136, 28);
		AfterUPDATE_panel_1.add(upClass);
		
		upContact = new JTextField();
		upContact.setFont(new Font("Dialog", Font.BOLD, 14));
		upContact.setColumns(10);
		upContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upContact.setBounds(152, 252, 136, 28);
		AfterUPDATE_panel_1.add(upContact);
		
		JLabel label_36 = new JLabel("");
		label_36.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_36.setBounds(409, 66, 294, 175);
		AfterUPDATE_panel_1.add(label_36);
		
		JRadioButton upMale = new JRadioButton("Male");
		buttonGroup.add(upMale);
		upMale.setFont(new Font("Tahoma", Font.BOLD, 15));
		upMale.setBounds(518, 27, 66, 29);
		AfterUPDATE_panel_1.add(upMale);
		
		JRadioButton upFemale = new JRadioButton("Female");
		buttonGroup.add(upFemale);
		upFemale.setFont(new Font("Tahoma", Font.BOLD, 15));
		upFemale.setBounds(604, 27, 99, 29);
		AfterUPDATE_panel_1.add(upFemale);
		
		JLabel lblImage_2 = new JLabel("IMAGE : ");
		lblImage_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblImage_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage_2.setBounds(409, 252, 94, 28);
		AfterUPDATE_panel_1.add(lblImage_2);
		
		JButton button_7 = new JButton("CHOOSE (opt)");
		button_7.setFont(new Font("Dialog", Font.BOLD, 14));
		button_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_7.setBounds(518, 252, 185, 29);
		AfterUPDATE_panel_1.add(button_7);
		
		JButton btnUpdate = new JButton("Update \r\n\r\n");
		btnUpdate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String delName = UPName.getText();
				String delDept = UPDepts.getSelectedItem().toString();
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL2.accdb");
						String sql = "select * from stdRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(delName) && dept.equalsIgnoreCase(delDept)) {								
								String a = upName.getText();
								rs.updateString("Name",upName.getText()); 
								rs.updateString("Email", upEmail.getText());
								rs.updateString("Depts", upDepts.getText());
								rs.updateString("Cms", upCms.getText());
								rs.updateString("Class", upClass.getText());
								rs.updateString("Contact", upContact.getText());
								
															
								boolean m = upMale.isSelected();
								if(m==true) {rs.updateString("Gender", "Male");}else {rs.updateString("Gender", "Female");}
								
								rs.updateRow();
								UPDATE_panel.setVisible(false);
								JOptionPane.showMessageDialog(null, " Updated successfully ! " );						
								break ;	
							}
						}
						con.close();
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}

			}
		});
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 14));
		btnUpdate.setBounds(298, 322, 110, 28);
		AfterUPDATE_panel_1.add(btnUpdate);
		
/************************DELETE PANEL**********************************************************/		
		DELETE_panel = new JPanel();
		DELETE_panel.setLayout(null);
		DELETE_panel.setOpaque(false);
		DELETE_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DELETE_panel.setBackground(Color.BLUE);
//		DELETE_panel.setBounds(333, 139, 800, 500);
//		BACKIMAGE_lblNewLabel.add(DELETE_panel);
		
		JLabel label_14 = new JLabel("Enter  Name : ");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(114, 20, 136, 31);
		DELETE_panel.add(label_14);
		
		STDName = new JTextField();
		STDName.setColumns(10);
		STDName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		STDName.setBounds(261, 18, 136, 33);
		DELETE_panel.add(STDName);
		
		STDDepts = new JComboBox();
		STDDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBS", "A&F", "B ED", "MATH"}));
		STDDepts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		STDDepts.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		STDDepts.setBounds(580, 12, 108, 33);
		DELETE_panel.add(STDDepts);
		
		JLabel label_17 = new JLabel("Depts : ");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(493, 12, 77, 33);
		DELETE_panel.add(label_17);
		
		JButton button_4 = new JButton("SEARCH\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				String srchName = STDName.getText();
				String srchDept = STDDepts.getSelectedItem().toString();
				
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
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept)) {								
								
								sdName.setText(rs.getString("Name"));	sdEmail.setText(rs.getString("Email"));	sdDepts.setText(rs.getString("Depts"));
								sdCms.setText( rs.getString("Cms"));	sdClass.setText(rs.getString("Class"));	sdContact.setText(rs.getString("Contact"));	
								sdGender.setText(rs.getString("Gender"));
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

						DELETE_panel.add(AFTER_DELETE_panel_1);
						AFTER_DELETE_panel_1.setBounds(29, 68, 742, 361);
					}
					else {JOptionPane.showMessageDialog(null, "Record Not Found ! " , "" , JOptionPane.WARNING_MESSAGE);}
					
				}

			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		button_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_4.setBounds(447, 456, 163, 33);
		DELETE_panel.add(button_4);
		
		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DELETE_panel.setVisible(false);
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnBack_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack_1.setBounds(261, 456, 163, 33);
		DELETE_panel.add(btnBack_1);
		
		
/********************************AFTER DELETE PANEL********************************************************************/		
		AFTER_DELETE_panel_1 = new JPanel();
		AFTER_DELETE_panel_1.setLayout(null);
		AFTER_DELETE_panel_1.setOpaque(false);
		AFTER_DELETE_panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		AFTER_DELETE_panel_1.setBackground(Color.BLUE);
//		AFTER_DELETE_panel_1.setBounds(29, 68, 742, 361);
//		DELETE_panel.add(AFTER_DELETE_panel_1);
		
		JLabel label_18 = new JLabel("Name :");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_18.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_18.setBounds(44, 27, 98, 28);
		AFTER_DELETE_panel_1.add(label_18);
		
		sdName = new JTextField();
		sdName.setColumns(10);
		sdName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdName.setBounds(152, 27, 136, 28);
		AFTER_DELETE_panel_1.add(sdName);
		
		JLabel lblEmail_3 = new JLabel("Email :\r\n");
		lblEmail_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail_3.setBounds(44, 66, 98, 28);
		AFTER_DELETE_panel_1.add(lblEmail_3);
		
		JLabel lblDepts_3 = new JLabel("Depts : ");
		lblDepts_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepts_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_3.setBounds(44, 117, 98, 28);
		AFTER_DELETE_panel_1.add(lblDepts_3);
		
		JLabel lblGender_3 = new JLabel("Gender : ");
		lblGender_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGender_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender_3.setBounds(409, 27, 94, 28);
		AFTER_DELETE_panel_1.add(lblGender_3);
		
		JLabel lblCmsId_3 = new JLabel("CMS ID : ");
		lblCmsId_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCmsId_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId_3.setBounds(44, 164, 98, 28);
		AFTER_DELETE_panel_1.add(lblCmsId_3);
		
		sdEmail = new JTextField();
		sdEmail.setColumns(10);
		sdEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdEmail.setBounds(152, 66, 136, 28);
		AFTER_DELETE_panel_1.add(sdEmail);
		
		sdDepts = new JTextField();
		sdDepts.setColumns(10);
		sdDepts.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdDepts.setBounds(152, 117, 136, 28);
		AFTER_DELETE_panel_1.add(sdDepts);
		
		JLabel lblClass_3 = new JLabel("Class : ");
		lblClass_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClass_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass_3.setBounds(44, 213, 98, 28);
		AFTER_DELETE_panel_1.add(lblClass_3);
		
		JLabel lblContact_2 = new JLabel("Contact  : ");
		lblContact_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContact_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContact_2.setBounds(44, 252, 98, 28);
		AFTER_DELETE_panel_1.add(lblContact_2);
		
		sdCms = new JTextField();
		sdCms.setColumns(10);
		sdCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdCms.setBounds(152, 164, 136, 28);
		AFTER_DELETE_panel_1.add(sdCms);
		
		sdClass = new JTextField();
		sdClass.setColumns(10);
		sdClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdClass.setBounds(152, 213, 136, 28);
		AFTER_DELETE_panel_1.add(sdClass);
		
		sdContact = new JTextField();
		sdContact.setColumns(10);
		sdContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdContact.setBounds(152, 252, 136, 28);
		AFTER_DELETE_panel_1.add(sdContact);
		
		JLabel label_25 = new JLabel("");
		label_25.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_25.setBounds(409, 66, 294, 175);
		AFTER_DELETE_panel_1.add(label_25);
		
		JLabel lblImage_3 = new JLabel("IMAGE : ");
		lblImage_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblImage_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage_3.setBounds(409, 252, 294, 28);
		AFTER_DELETE_panel_1.add(lblImage_3);
		
		JButton btnDelete = new JButton("Delete ?");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String delName = STDName.getText();
				String delDept = STDDepts.getSelectedItem().toString();
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL2.accdb");
						String sql = "select * from stdRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(delName) && dept.equalsIgnoreCase(delDept)) {								
								rs.deleteRow();	
								DELETE_panel.setVisible(false);
								JOptionPane.showMessageDialog(null, " Deleted successfully ! " );						
								break ;	
							}
						}
						con.close();
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
					
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(309, 322, 89, 28);
		AFTER_DELETE_panel_1.add(btnDelete);
		
		sdGender = new JTextField();
		sdGender.setColumns(10);
		sdGender.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sdGender.setBounds(518, 27, 185, 28);
		AFTER_DELETE_panel_1.add(sdGender);
		
		
		
/*******************SEARCH*******************************************************************************/		
		SEARCH_panel = new JPanel();
		SEARCH_panel.setLayout(null);
		SEARCH_panel.setOpaque(false);
		SEARCH_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		SEARCH_panel.setBackground(Color.BLUE);
//		SEARCH_panel.setBounds(333, 115, 800, 500);
//		BACKIMAGE_lblNewLabel.add(SEARCH_panel);
		
		JLabel label_4 = new JLabel("Enter  Name : ");
		label_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(114, 27, 136, 24);
		SEARCH_panel.add(label_4);
		
		STSName = new JTextField();
		STSName.setFont(new Font("Dialog", Font.BOLD, 14));
		STSName.setColumns(10);
		STSName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		STSName.setBounds(260, 25, 136, 24);
		SEARCH_panel.add(STSName);
		
		stsDepts = new JComboBox();
		stsDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		stsDepts.setFont(new Font("Dialog", Font.BOLD, 14));
		stsDepts.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		stsDepts.setBounds(580, 21, 108, 24);
		SEARCH_panel.add(stsDepts);
		
		JLabel label_5 = new JLabel("Depts : ");
		label_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(493, 20, 77, 25);
		SEARCH_panel.add(label_5);
		
		JButton button_2 = new JButton("SEARCH\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String srchName = STSName.getText();
				String srchDept = stsDepts.getSelectedItem().toString();
				
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
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept)) {								
								
								stsName.setText(rs.getString("Name"));	stsEmail.setText(rs.getString("Email"));	stsDept.setText(rs.getString("Depts"));
								stsCms.setText( rs.getString("Cms"));	stsClass.setText(rs.getString("Class"));	stsContact.setText(rs.getString("Contact"));	
								stsGender.setText(rs.getString("Gender"));
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

						SEARCH_panel.add(AfterSEARCH_panel_1);
						AfterSEARCH_panel_1.setBounds(29, 68, 742, 361);
					}
					else {JOptionPane.showMessageDialog(null, "Student Not Registered ! " , "" , JOptionPane.WARNING_MESSAGE);}
					
				}
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_2.setBounds(444, 456, 163, 33);
		SEARCH_panel.add(button_2);
		
		JButton button_3 = new JButton("BACK\r\n");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEARCH_panel.setVisible(false);
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		button_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_3.setBounds(231, 456, 163, 33);
		SEARCH_panel.add(button_3);
		
		
/**************************AFTER SEARCH******************************************************************************/		
		AfterSEARCH_panel_1 = new JPanel();
		AfterSEARCH_panel_1.setLayout(null);
		AfterSEARCH_panel_1.setOpaque(false);
		AfterSEARCH_panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		AfterSEARCH_panel_1.setBackground(Color.BLUE);
//		AfterSEARCH_panel_1.setBounds(29, 68, 742, 361);
//		SEARCH_panel.add(AfterSEARCH_panel_1);
		
		JLabel label_6 = new JLabel("Name :");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Dialog", Font.BOLD, 14));
		label_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_6.setBounds(44, 27, 98, 28);
		AfterSEARCH_panel_1.add(label_6);
		
		stsName = new JTextField();
		stsName.setFont(new Font("Dialog", Font.BOLD, 14));
		stsName.setColumns(10);
		stsName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsName.setBounds(152, 27, 136, 28);
		AfterSEARCH_panel_1.add(stsName);
		
		JLabel lblEmail_4 = new JLabel("Email : ");
		lblEmail_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmail_4.setBounds(44, 66, 98, 28);
		AfterSEARCH_panel_1.add(lblEmail_4);
		
		JLabel lblDepts_4 = new JLabel("Depts : ");
		lblDepts_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDepts_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_4.setBounds(44, 117, 98, 28);
		AfterSEARCH_panel_1.add(lblDepts_4);
		
		JLabel lblGender_4 = new JLabel("Gender :\r\n");
		lblGender_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGender_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblGender_4.setBounds(409, 27, 94, 28);
		AfterSEARCH_panel_1.add(lblGender_4);
		
		JLabel lblCmsId_4 = new JLabel("CMS ID : ");
		lblCmsId_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCmsId_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCmsId_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCmsId_4.setBounds(44, 164, 98, 28);
		AfterSEARCH_panel_1.add(lblCmsId_4);
		
		stsEmail = new JTextField();
		stsEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		stsEmail.setColumns(10);
		stsEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsEmail.setBounds(152, 66, 136, 28);
		AfterSEARCH_panel_1.add(stsEmail);
		
		stsDept = new JTextField();
		stsDept.setFont(new Font("Dialog", Font.BOLD, 14));
		stsDept.setColumns(10);
		stsDept.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsDept.setBounds(152, 117, 136, 28);
		AfterSEARCH_panel_1.add(stsDept);
		
		JLabel lblClass_4 = new JLabel("Class : ");
		lblClass_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblClass_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblClass_4.setBounds(44, 213, 98, 28);
		AfterSEARCH_panel_1.add(lblClass_4);
		
		JLabel lblContact_3 = new JLabel("Contact : ");
		lblContact_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblContact_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblContact_3.setBounds(44, 252, 98, 28);
		AfterSEARCH_panel_1.add(lblContact_3);
		
		stsCms = new JTextField();
		stsCms.setFont(new Font("Dialog", Font.BOLD, 14));
		stsCms.setColumns(10);
		stsCms.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsCms.setBounds(152, 164, 136, 28);
		AfterSEARCH_panel_1.add(stsCms);
		
		stsClass = new JTextField();
		stsClass.setFont(new Font("Dialog", Font.BOLD, 14));
		stsClass.setColumns(10);
		stsClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsClass.setBounds(152, 213, 136, 28);
		AfterSEARCH_panel_1.add(stsClass);
		
		stsContact = new JTextField();
		stsContact.setFont(new Font("Dialog", Font.BOLD, 14));
		stsContact.setColumns(10);
		stsContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsContact.setBounds(152, 252, 136, 28);
		AfterSEARCH_panel_1.add(stsContact);
		
		JLabel label_11 = new JLabel("");
		label_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_11.setBounds(409, 66, 294, 175);
		AfterSEARCH_panel_1.add(label_11);
		
		JLabel lblImage_4 = new JLabel("IMAGE");
		lblImage_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblImage_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImage_4.setBounds(409, 252, 294, 28);
		AfterSEARCH_panel_1.add(lblImage_4);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEARCH_panel.setVisible(false);
				
			}
		});
		btnOk.setFont(new Font("Dialog", Font.BOLD, 14));
		btnOk.setBounds(244, 322, 211, 28);
		AfterSEARCH_panel_1.add(btnOk);
		
		stsGender = new JTextField();
		stsGender.setFont(new Font("Dialog", Font.BOLD, 14));
		stsGender.setColumns(10);
		stsGender.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		stsGender.setBounds(525, 27, 178, 28);
		AfterSEARCH_panel_1.add(stsGender);
		
/**************************BACK IMAGE PANEL**************************************************************************/		
		
	}
}
