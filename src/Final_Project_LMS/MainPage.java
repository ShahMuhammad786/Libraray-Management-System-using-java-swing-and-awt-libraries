package Final_Project_LMS;

import java.awt.EventQueue;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JProgressBar;

public class MainPage {

	private JFrame frmLibrary;
	private JTextField tfName;
	private JTextField tfAuthor;
	private JTextField tfAddition;
	private JTextField tfIsbn;
	private JTextField tfCopies;
	private JTextField tfPages;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frmLibrary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	/*==========================Main Method=============================================================================================*/	
	/*For After Search*/
	JLabel afName , afI , afA , afD , afAdd , afP , afC , afDp ;
	
	/*For After Delete*/
	JLabel dfN ,dfA ,dfI , dfAdd , dfD , dfDp , dfC , dfP ;
	
	
	JPanel Add ;
	JPanel p_search ;
	JPanel AfterSearch ;
	JPanel Delet_panel ;
	JPanel Update_panel ;
	JPanel AfterUpdate_panel_1 ;
	JPanel ShowAll_panel ;
	JPanel BRecord_panel ;
	JLabel label_3 ;
	JPanel AFTER_DELETE ;
	private JTextField SearchName;
	private JTextField tfDelete;
	private JTextField UpdName;
	private JTextField upName;
	private JTextField upAuthor;
	private JTextField upAddition;
	private JTextField upCopies;
	private JTextField upIsbn;
	private JTextField upPages;
	JDateChooser tfDate ;
	ResultSet rs ;
	JComboBox tfDepts ;
	Connection con ;
	JComboBox searchDept ;
	JComboBox DeleteCombobox ;
	JComboBox upDept ;
	JComboBox UpdDept ;
	String UPDName ;
	String UPDDept ;
	JPanel AfterSA ;
	private JTextField upDateChooser;
	private JTextField saName;
	private JTextField saAuthor;
	private JTextField saAddition;
	private JTextField saCopies;
	private JTextField saIsbn;
	private JTextField saPage;
	private JTextField saDate;
	private JTextField saDept;
	private void initialize() {
		frmLibrary = new JFrame();
		frmLibrary.setResizable(false);
		frmLibrary.setTitle("Library");
		frmLibrary.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\lib.png"));
		frmLibrary.setBounds(50, 10, 1240, 718);
		frmLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrary.getContentPane().setLayout(null);
		
		JPanel MainPanelOnContentArea = new JPanel();
		MainPanelOnContentArea.setBackground(new Color(230, 230, 250));
		MainPanelOnContentArea.setForeground(new Color(0, 0, 0));
		MainPanelOnContentArea.setBounds(0, 0, 1234, 715);
		frmLibrary.getContentPane().add(MainPanelOnContentArea);
		MainPanelOnContentArea.setLayout(null);


/*==============Menu Panel======================================================================================*/				
		JPanel MenuPanel = new JPanel();
		MenuPanel.setOpaque(false);
		MenuPanel.setBorder(null);
		MenuPanel.setBackground(new Color(0,0,0,80));
		MenuPanel.setBounds(0, 100, 283, 579);
		MainPanelOnContentArea.add(MenuPanel);
		MenuPanel.setLayout(null);
		
		Font font = new Font("Rockwell Condensed", Font.BOLD, 20);
		
		JLabel lblHome = new JLabel("   NEW\r\n");		
		lblHome.setBackground(Color.WHITE);
		lblHome.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource()==lblHome) {
					lblHome.setFont(font);	
				}				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==lblHome) {
					lblHome.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));	
				}	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == lblHome) {
					label_3.add(Add);
					Add.setBounds(800, 140, 800, 500);
				}
			}
		});
		lblHome.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\2.png"));
		lblHome.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblHome.setForeground(Color.WHITE);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(70, 52, 174, 57);
		MenuPanel.add(lblHome);
		
		JLabel lblLibrary = new JLabel("SEARCH\r\n");
		lblLibrary.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblLibrary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource()==lblLibrary) {
					lblLibrary.setFont(font);	
				}				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==lblLibrary) {
					lblLibrary.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));	
				}	
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				
				label_3.add(p_search);
				p_search.setBounds(800, 140, 800, 500);
				
			}
		});
		lblLibrary.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\5.png"));
		lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrary.setForeground(Color.WHITE);
		lblLibrary.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblLibrary.setBounds(70, 136, 174, 57);
		MenuPanel.add(lblLibrary);
		
		JLabel lblStudentCenter = new JLabel("  DELETE");
		lblStudentCenter.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblStudentCenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource()==lblStudentCenter) {
					lblStudentCenter.setFont(font);	
				}				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==lblStudentCenter) {
					lblStudentCenter.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));	
				}	
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				label_3.add(Delet_panel);
				Delet_panel.setBounds(800, 140, 800, 500);
				
			}
		});
		lblStudentCenter.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\1.png"));
		lblStudentCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentCenter.setForeground(Color.WHITE);
		lblStudentCenter.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblStudentCenter.setBounds(70, 215, 174, 57);
		MenuPanel.add(lblStudentCenter);
		
		JLabel lblUpdate = new JLabel("  UPDATE");
		lblUpdate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource()==lblUpdate) {
					lblUpdate.setFont(font);	
				}				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==lblUpdate) {
					lblUpdate.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));	
				}	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				label_3.add(Update_panel);
				Update_panel.setBounds(800, 140, 800, 500);
				
			}
		});
		lblUpdate.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\4.png"));
		lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdate.setForeground(Color.WHITE);
		lblUpdate.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblUpdate.setBounds(70, 302, 174, 57);
		MenuPanel.add(lblUpdate);
		
		JLabel lblShowAll = new JLabel(" SHOW ALL");
		lblShowAll.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblShowAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource()==lblShowAll) {
					lblShowAll.setFont(font);	
				}				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==lblShowAll) {
					lblShowAll.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));	
				}	
			}
			@Override
			public void mouseClicked(MouseEvent e) {	
				try {
					con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
					String sql = "select * from bookRecord ";
					
					PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs = ps.executeQuery();
					
				}catch(Exception i) {i.getStackTrace();}
				
				label_3.add(ShowAll_panel);
				ShowAll_panel.setBounds(800, 140, 800, 500);
			}
		});
		lblShowAll.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\8.png"));
		lblShowAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowAll.setForeground(Color.WHITE);
		lblShowAll.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblShowAll.setBounds(70, 386, 174, 57);
		MenuPanel.add(lblShowAll);
		
		JButton tglbtnStudentCenter = new JButton("STD CENTER");
		tglbtnStudentCenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tglbtnStudentCenter.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tglbtnStudentCenter.setFont(new Font("Tahoma", Font.BOLD, 16));
			}
		});
		tglbtnStudentCenter.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\resizedImage.png"));
		tglbtnStudentCenter.setBackground(Color.ORANGE);
		tglbtnStudentCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==tglbtnStudentCenter) {
					try {con.close();}catch(Exception i) {i.getStackTrace();}
					frmLibrary.dispose();
					MainPageFinal.main(null);		
					
				}				
			}
		});
		tglbtnStudentCenter.setFont(new Font("Tahoma", Font.BOLD, 16));
		tglbtnStudentCenter.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		tglbtnStudentCenter.setBounds(70, 519, 174, 49);
		MenuPanel.add(tglbtnStudentCenter);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(70, 499, 174, 2);
		MenuPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 486, 174, 2);
		MenuPanel.add(separator_1);
		
/**************************Back image *****************************************************************************/		
		label_3 = new JLabel("");
		label_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_3.setBackground(new Color(0, 0, 255));
		label_3.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\122.jpg"));
		label_3.setBounds(-506, 0, 1740, 701);
		MainPanelOnContentArea.add(label_3);
				
		
/*==============Header Panel======================================================================================*/		
		//HeaderPanel.setBounds(466, 0, 1224, 100);
		//MenuPanel.setBounds(0, 100, 244, 615);		
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBounds(506, 0, 1230, 100);
		label_3.add(HeaderPanel);
		HeaderPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		HeaderPanel.setBorder(null);
		HeaderPanel.setBackground(new Color(0, 0, 0 , 80));
		HeaderPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(36, 33, 46, 44);
		HeaderPanel.add(label);
		label.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\3356.png"));
		
		JLabel lblLibraryManagementSystem = new JLabel("L  I  B  R  A  R  Y");
		lblLibraryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryManagementSystem.setForeground(new Color(255, 255, 255));
		lblLibraryManagementSystem.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 32));
		lblLibraryManagementSystem.setBounds(340, 22, 584, 37);
		HeaderPanel.add(lblLibraryManagementSystem);
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				try {con.close();}catch(Exception i){i.getStackTrace();}
				frmLibrary.dispose();
				MainPage.main(null);	
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setBorder(null);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\shah.png"));
		lblNewLabel.setBounds(1134, 22, 59, 55);
		HeaderPanel.add(lblNewLabel);
		
/*******************AFTER DELETE CONTENTS******************************************************************/		
		AFTER_DELETE = new JPanel();
		AFTER_DELETE.setLayout(null);
		AFTER_DELETE.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		AFTER_DELETE.setBackground(new Color(0, 255, 0 , 30));
//		label_3.add(AFTER_DELETE);
//		AFTER_DELETE.setBounds(800, 143, 800, 500);
		
		JButton btnDelete_1 = new JButton("DELETE IT\r\n");
		btnDelete_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String delName = tfDelete.getText();
				String delDept = DeleteCombobox.getSelectedItem().toString();
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\\\JavaEclipse\\\\Drag and Drop Designing using JAVA\\\\src\\\\Final_Project_LMS/LMS_FINAL.accdb");
						String sql = "select * from bookRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							
							if(name.equalsIgnoreCase(delName) && dept.equalsIgnoreCase(delDept)) {								
								rs.deleteRow();	
								AFTER_DELETE.setVisible(false);
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
		btnDelete_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete_1.setBounds(469, 416, 125, 28);
		AFTER_DELETE.add(btnDelete_1);
		
		JLabel lblName_2 = new JLabel("NAME : ");
		lblName_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblName_2.setForeground(Color.WHITE);
		lblName_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName_2.setBounds(69, 58, 660, 43);
		AFTER_DELETE.add(lblName_2);
		
		JLabel label_5 = new JLabel("AUTHOR : ");
		label_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(69, 133, 660, 43);
		AFTER_DELETE.add(label_5);
		
		JLabel label_7 = new JLabel("ADDITION : ");
		label_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(69, 203, 660, 43);
		AFTER_DELETE.add(label_7);
		
		JLabel label_9 = new JLabel("ISBN NO : ");
		label_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(411, 58, 318, 43);
		AFTER_DELETE.add(label_9);
		
		JLabel label_11 = new JLabel("DATE : ");
		label_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setBounds(411, 133, 318, 43);
		AFTER_DELETE.add(label_11);
		
		JLabel label_27 = new JLabel("COPIES NO : ");
		label_27.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_27.setForeground(Color.WHITE);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_27.setBounds(69, 287, 660, 43);
		AFTER_DELETE.add(label_27);
		
		JLabel label_28 = new JLabel("PAGES NO : ");
		label_28.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_28.setBounds(411, 202, 318, 44);
		AFTER_DELETE.add(label_28);
		
		JLabel label_29 = new JLabel("DEPTS : ");
		label_29.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_29.setBounds(411, 287, 318, 43);
		AFTER_DELETE.add(label_29);
		
		dfN = new JLabel("??????");
		dfN.setForeground(Color.WHITE);
		dfN.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfN.setBounds(229, 58, 172, 44);
		AFTER_DELETE.add(dfN);
		
		dfI = new JLabel("??????");
		dfI.setForeground(Color.WHITE);
		dfI.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfI.setBounds(544, 58, 185, 44);
		AFTER_DELETE.add(dfI);
		
		dfA = new JLabel("??????");
		dfA.setForeground(Color.WHITE);
		dfA.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfA.setBounds(229, 133, 172, 44);
		AFTER_DELETE.add(dfA);
		
		dfAdd = new JLabel("??????");
		dfAdd.setForeground(Color.WHITE);
		dfAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfAdd.setBounds(229, 203, 172, 45);
		AFTER_DELETE.add(dfAdd);
		
		dfC = new JLabel("??????");
		dfC.setForeground(Color.WHITE);
		dfC.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfC.setBounds(229, 287, 172, 43);
		AFTER_DELETE.add(dfC);
		
		dfD = new JLabel("??????");
		dfD.setForeground(Color.WHITE);
		dfD.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfD.setBounds(542, 133, 187, 44);
		AFTER_DELETE.add(dfD);
		
		dfP = new JLabel("??????");
		dfP.setForeground(Color.WHITE);
		dfP.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfP.setBounds(544, 203, 185, 45);
		AFTER_DELETE.add(dfP);
		
		dfDp = new JLabel("??????");
		dfDp.setForeground(Color.WHITE);
		dfDp.setFont(new Font("Tahoma", Font.BOLD, 16));
		dfDp.setBounds(544, 287, 185, 43);
		AFTER_DELETE.add(dfDp);
		
		JButton btnBack_2 = new JButton("BACK");
		btnBack_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}
				catch(Exception i) {i.getMessage();}
				AFTER_DELETE.setVisible(false);
			}
		});
		btnBack_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack_2.setBounds(284, 416, 125, 28);
		AFTER_DELETE.add(btnBack_2);
		
/*=======================BOOK RECORD =======================================================================*/		
		BRecord_panel = new JPanel();
		BRecord_panel.setBackground(new Color(100, 149, 237));
		BRecord_panel.setOpaque(false);
		BRecord_panel.setLayout(null);
		BRecord_panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
//		label_3.add(BRecord_panel);
//		BRecord_panel.setBounds(800, 140, 800, 500);
		
		JLabel label_1 = new JLabel("Choose Departments :");
		label_1.setForeground(Color.WHITE);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 15));
		label_1.setBounds(232, 33, 210, 29);
		BRecord_panel.add(label_1);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		comboBox_6.setBounds(452, 33, 124, 29);
		BRecord_panel.add(comboBox_6);
		
		JButton button_1 = new JButton("GO");
		button_1.setSelected(true);
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		button_1.setBounds(606, 33, 80, 29);
		BRecord_panel.add(button_1);
		
		JButton button_3 = new JButton("Go Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BRecord_panel.setVisible(false);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		button_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		button_3.setBounds(127, 36, 87, 29);
		BRecord_panel.add(button_3);
		
/*========================SHOW ALL APANEL +=========================================================*/		
		ShowAll_panel = new JPanel();
		ShowAll_panel.setOpaque(false);
		ShowAll_panel.setBackground(new Color(30, 144, 255));
		ShowAll_panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_3.add(ShowAll_panel);
//		ShowAll_panel.setBounds(800, 140, 800, 500);
		ShowAll_panel.setLayout(null);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {con.close();}catch(Exception i) {i.getStackTrace();}
				ShowAll_panel.setVisible(false);				
			}
		});
		btnGoBack.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnGoBack.setBounds(73, 450, 87, 23);
		ShowAll_panel.add(btnGoBack);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.last()) {						
						saName.setText(rs.getString("Name"));
						saIsbn.setText(rs.getString("Isbn"));
						saAuthor.setText(rs.getString("Author"));
						saDate.setText(rs.getString("Date"));
						saAddition.setText(rs.getString("Addition"));
						saPage.setText(rs.getString("Pages"));
						saCopies.setText(rs.getInt("Copies")+"");
						saDept.setText(rs.getString("Depts"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnLast.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLast.setBounds(618, 450, 89, 23);
		ShowAll_panel.add(btnLast);
		
		JButton btnForward = new JButton("Forward\r\n");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rs.next()) {						
						saName.setText(rs.getString("Name"));
						saIsbn.setText(rs.getString("Isbn"));
						saAuthor.setText(rs.getString("Author"));
						saDate.setText(rs.getString("Date"));
						saAddition.setText(rs.getString("Addition"));
						saPage.setText(rs.getString("Pages"));
						saCopies.setText(rs.getInt("Copies")+"");
						saDept.setText(rs.getString("Depts"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
				
			}
		});
		btnForward.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnForward.setBounds(477, 450, 93, 23);
		ShowAll_panel.add(btnForward);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					if(rs.previous()) {						
						saName.setText(rs.getString("Name"));
						saIsbn.setText(rs.getString("Isbn"));
						saAuthor.setText(rs.getString("Author"));
						saDate.setText(rs.getString("Date"));
						saAddition.setText(rs.getString("Addition"));
						saPage.setText(rs.getString("Pages"));
						saCopies.setText(rs.getInt("Copies")+"");
						saDept.setText(rs.getString("Depts"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrevious.setBounds(365, 450, 102, 23);
		ShowAll_panel.add(btnPrevious);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					if(rs.first()) {						
						saName.setText(rs.getString("Name"));
						saIsbn.setText(rs.getString("Isbn"));
						saAuthor.setText(rs.getString("Author"));
						saDate.setText(rs.getString("Date"));
						saAddition.setText(rs.getString("Addition"));
						saPage.setText(rs.getString("Pages"));
						saCopies.setText(rs.getInt("Copies")+"");
						saDept.setText(rs.getString("Depts"));
						
					}
				}
				catch(Exception i) {i.getStackTrace();}
			}
		});
		btnFirst.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFirst.setBounds(219, 450, 89, 23);
		ShowAll_panel.add(btnFirst);
		
/*********************************After Show All************************************************/		
		AfterSA = new JPanel();
		AfterSA.setLayout(null);
		AfterSA.setOpaque(false);
		AfterSA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		AfterSA.setBackground(new Color(0, 255, 255));
		AfterSA.setBounds(73, 52, 634, 359);
		ShowAll_panel.add(AfterSA);
		
		JLabel label_4 = new JLabel("Name :");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_4.setBounds(84, 119, 80, 28);
		AfterSA.add(label_4);
		
		saName = new JTextField();
		saName.setFont(new Font("Tahoma", Font.BOLD, 14));
		saName.setColumns(10);
		saName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saName.setBounds(174, 121, 96, 28);
		AfterSA.add(saName);
		
		JLabel label_17 = new JLabel("Author");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_17.setBounds(84, 173, 80, 28);
		AfterSA.add(label_17);
		
		JLabel label_18 = new JLabel("Addition");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_18.setBounds(84, 226, 80, 28);
		AfterSA.add(label_18);
		
		JLabel label_19 = new JLabel("ISBN No");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_19.setBounds(328, 119, 83, 28);
		AfterSA.add(label_19);
		
		JLabel label_20 = new JLabel("Pub Date");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_20.setBounds(328, 173, 83, 28);
		AfterSA.add(label_20);
		
		JLabel label_21 = new JLabel("Pages No");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_21.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_21.setBounds(328, 226, 82, 28);
		AfterSA.add(label_21);
		
		JLabel label_22 = new JLabel("Copies : ");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_22.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_22.setBounds(84, 279, 80, 28);
		AfterSA.add(label_22);
		
		JLabel label_23 = new JLabel("Depts : ");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_23.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_23.setBounds(328, 281, 82, 28);
		AfterSA.add(label_23);
		
		saAuthor = new JTextField();
		saAuthor.setFont(new Font("Tahoma", Font.BOLD, 14));
		saAuthor.setColumns(10);
		saAuthor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saAuthor.setBounds(174, 175, 96, 28);
		AfterSA.add(saAuthor);
		
		saAddition = new JTextField();
		saAddition.setFont(new Font("Tahoma", Font.BOLD, 14));
		saAddition.setColumns(10);
		saAddition.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saAddition.setBounds(174, 228, 96, 28);
		AfterSA.add(saAddition);
		
		saCopies = new JTextField();
		saCopies.setFont(new Font("Tahoma", Font.BOLD, 14));
		saCopies.setColumns(10);
		saCopies.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saCopies.setBounds(174, 279, 96, 28);
		AfterSA.add(saCopies);
		
		saIsbn = new JTextField();
		saIsbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		saIsbn.setColumns(10);
		saIsbn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saIsbn.setBounds(436, 121, 96, 28);
		AfterSA.add(saIsbn);
		
		saPage = new JTextField();
		saPage.setFont(new Font("Tahoma", Font.BOLD, 14));
		saPage.setColumns(10);
		saPage.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saPage.setBounds(436, 228, 96, 28);
		AfterSA.add(saPage);
		
		saDate = new JTextField();
		saDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		saDate.setColumns(10);
		saDate.setBounds(436, 176, 96, 26);
		AfterSA.add(saDate);
		
		saDept = new JTextField();
		saDept.setFont(new Font("Tahoma", Font.BOLD, 14));
		saDept.setColumns(10);
		saDept.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		saDept.setBounds(436, 281, 96, 28);
		AfterSA.add(saDept);
		
		JLabel lblAllBooks = new JLabel("ALL BOOKS IN THE LABRARY");
		lblAllBooks.setBackground(Color.CYAN);
		lblAllBooks.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblAllBooks.setForeground(Color.WHITE);
		lblAllBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllBooks.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAllBooks.setBounds(60, 31, 503, 51);
		AfterSA.add(lblAllBooks);
		
		
/*============================================UPDATE PANEL==================================================*/
		Update_panel = new JPanel();
		Update_panel.setOpaque(false);
		Update_panel.setBackground(new Color(0, 255, 255 , 80));
		Update_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		label_3.add(Update_panel);
//		Update_panel.setBounds(800, 140, 800, 500);
		Update_panel.setLayout(null);
		
		JLabel lblEnterName = new JLabel("Enter  Name : ");
		lblEnterName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEnterName.setForeground(Color.WHITE);
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterName.setBounds(115, 33, 136, 24);
		Update_panel.add(lblEnterName);
		
		UpdName = new JTextField();
		UpdName.setFont(new Font("Dialog", Font.BOLD, 14));
		UpdName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		UpdName.setBounds(261, 35, 136, 25);
		Update_panel.add(UpdName);
		UpdName.setColumns(10);
		
		JLabel lblDepts_2 = new JLabel("Depts : ");
		lblDepts_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_2.setForeground(Color.WHITE);
		lblDepts_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepts_2.setBounds(484, 33, 77, 25);
		Update_panel.add(lblDepts_2);
		
		
/*============================AFTER UPDATE ====================================================*/		
		AfterUpdate_panel_1 = new JPanel();
		AfterUpdate_panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		AfterUpdate_panel_1.setBounds(86, 89, 634, 311);
//		Update_panel.add(AfterUpdate_panel_1);
		AfterUpdate_panel_1.setLayout(null);
		AfterUpdate_panel_1.setBackground(new Color(0,255,255,80));
		AfterUpdate_panel_1.setOpaque(false);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setForeground(Color.WHITE);
		lblName_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(84, 40, 80, 28);
		AfterUpdate_panel_1.add(lblName_1);
		
		upName = new JTextField();
		upName.setFont(new Font("Dialog", Font.BOLD, 14));
		upName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upName.setBounds(174, 40, 96, 28);
		AfterUpdate_panel_1.add(upName);
		upName.setColumns(10);
		
		JLabel lblAuthor_1 = new JLabel("Author");
		lblAuthor_1.setForeground(Color.WHITE);
		lblAuthor_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthor_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAuthor_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblAuthor_1.setBounds(84, 94, 80, 28);
		AfterUpdate_panel_1.add(lblAuthor_1);
		
		JLabel lblAddition = new JLabel("Addition");
		lblAddition.setForeground(Color.WHITE);
		lblAddition.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddition.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblAddition.setBounds(84, 151, 80, 28);
		AfterUpdate_panel_1.add(lblAddition);
		
		JLabel lblIsbnNo_1 = new JLabel("ISBN No");
		lblIsbnNo_1.setForeground(Color.WHITE);
		lblIsbnNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbnNo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIsbnNo_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIsbnNo_1.setBounds(328, 40, 83, 28);
		AfterUpdate_panel_1.add(lblIsbnNo_1);
		
		JLabel lblPubDate = new JLabel("Pub Date");
		lblPubDate.setForeground(Color.WHITE);
		lblPubDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPubDate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblPubDate.setBounds(328, 94, 83, 28);
		AfterUpdate_panel_1.add(lblPubDate);
		
		JLabel lblPagesNo_1 = new JLabel("Pages No");
		lblPagesNo_1.setForeground(Color.WHITE);
		lblPagesNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagesNo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPagesNo_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblPagesNo_1.setBounds(329, 151, 82, 28);
		AfterUpdate_panel_1.add(lblPagesNo_1);
		
		JLabel lblCopies = new JLabel("Copies : ");
		lblCopies.setForeground(Color.WHITE);
		lblCopies.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopies.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCopies.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCopies.setBounds(84, 208, 80, 28);
		AfterUpdate_panel_1.add(lblCopies);
		
		JLabel lblDepts_3 = new JLabel("Depts : ");
		lblDepts_3.setForeground(Color.WHITE);
		lblDepts_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepts_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts_3.setBounds(329, 208, 82, 28);
		AfterUpdate_panel_1.add(lblDepts_3);
		
		upAuthor = new JTextField();
		upAuthor.setFont(new Font("Dialog", Font.BOLD, 14));
		upAuthor.setColumns(10);
		upAuthor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upAuthor.setBounds(174, 94, 96, 28);
		AfterUpdate_panel_1.add(upAuthor);
		
		upAddition = new JTextField();
		upAddition.setFont(new Font("Dialog", Font.BOLD, 14));
		upAddition.setColumns(10);
		upAddition.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upAddition.setBounds(174, 151, 96, 28);
		AfterUpdate_panel_1.add(upAddition);
		
		upCopies = new JTextField();
		upCopies.setFont(new Font("Dialog", Font.BOLD, 14));
		upCopies.setColumns(10);
		upCopies.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upCopies.setBounds(174, 208, 96, 28);
		AfterUpdate_panel_1.add(upCopies);
		
		upIsbn = new JTextField();
		upIsbn.setFont(new Font("Dialog", Font.BOLD, 14));
		upIsbn.setColumns(10);
		upIsbn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upIsbn.setBounds(436, 40, 96, 28);
		AfterUpdate_panel_1.add(upIsbn);
		
		upPages = new JTextField();
		upPages.setFont(new Font("Dialog", Font.BOLD, 14));
		upPages.setColumns(10);
		upPages.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upPages.setBounds(436, 151, 96, 28);
		AfterUpdate_panel_1.add(upPages);
		
		upDept = new JComboBox();
		upDept.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		upDept.setFont(new Font("Dialog", Font.BOLD, 14));
		upDept.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		upDept.setBounds(436, 208, 96, 28);
		AfterUpdate_panel_1.add(upDept);
		
		upDateChooser = new JTextField();
		upDateChooser.setFont(new Font("Dialog", Font.BOLD, 14));
		upDateChooser.setBounds(436, 94, 96, 26);
		AfterUpdate_panel_1.add(upDateChooser);
		upDateChooser.setColumns(10);
		
		JButton btnSearch_1 = new JButton("SEARCH\r\n");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSearch_1) {
					UPDName = UpdName.getText();
					UPDDept = UpdDept.getSelectedItem().toString();
					
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
									
									upName.setText(rs.getString("Name"));	upIsbn.setText(rs.getString("Isbn"));	upAuthor.setText(rs.getString("Author"));
									upAddition.setText(rs.getString("Addition"));	upPages.setText(rs.getString("Pages"));	
									upCopies.setText(rs.getInt("Copies")+""); upDateChooser.setText(rs.getString("Date"));
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
							Update_panel.add(AfterUpdate_panel_1);
							AfterUpdate_panel_1.setBounds(86, 89, 634, 311);
						}
						else {
							JOptionPane.showMessageDialog(null, "Book not Found ! " , "" , JOptionPane.WARNING_MESSAGE);
						}
						
					}
				}
	
			}
		});
		btnSearch_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnSearch_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSearch_1.setBounds(514, 425, 129, 33);
		Update_panel.add(btnSearch_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(340, 425, 129, 33);
		Update_panel.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AUPDName = UpdName.getText();
				String AUPDDept = UpdDept.getSelectedItem().toString();
				try {
					if(!(AUPDName.equalsIgnoreCase(""))) {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
						String sql = "select * from bookRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						while(rs.next()) {							
							String name = rs.getString ("Name") ;
							String dept = rs.getString ("Depts") ;
							if(name.equalsIgnoreCase(AUPDName)&& dept.equalsIgnoreCase(AUPDDept))
							{
								String a = upName.getText();
								rs.updateString("Name",upName.getText()); 
								rs.updateString("Isbn", upIsbn.getText());
								rs.updateString("Author", upAuthor.getText());
								rs.updateString("Date", upDateChooser.getText());
								rs.updateString("Addition", upAddition.getText());
								rs.updateString("Pages", upPages.getText());
								rs.updateInt("Copies" , Integer.parseInt(upCopies.getText()));
								rs.updateString("Depts" , upDept.getSelectedItem().toString());
								
								rs.updateRow();
								Update_panel.setVisible(false);
								JOptionPane.showMessageDialog(null, "Updated Successfully !");								
							}						
						}
						con.close();
					}else {JOptionPane.showMessageDialog(null, "Nothing to Update ! " , "" , JOptionPane.WARNING_MESSAGE);}
					
				}
				catch(Exception i) {i.getStackTrace();}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnUpdate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		UpdDept = new JComboBox();
		UpdDept.setFont(new Font("Dialog", Font.BOLD, 14));
		UpdDept.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		UpdDept.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		UpdDept.setBounds(571, 33, 136, 25);
		Update_panel.add(UpdDept);
		
		JButton btnBack_3 = new JButton("BACK");
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_panel.setVisible(false);
				
			}
		});
		btnBack_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnBack_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack_3.setBounds(162, 425, 129, 33);
		Update_panel.add(btnBack_3);

/*=======================DELETE PANEL=============================================================*/		
		Delet_panel = new JPanel();
		Delet_panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Delet_panel.setOpaque(false);
		Delet_panel.setLayout(null);
		Delet_panel.setBackground(new Color(30, 144, 255));
//		Delet_panel.setBounds(800, 140, 800, 500);
//		label_3.add(Delet_panel);
		
		JLabel label_25 = new JLabel("Enter Name of the Book : ");
		label_25.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_25.setBounds(82, 43, 222, 26);
		Delet_panel.add(label_25);
		
		tfDelete = new JTextField();
		tfDelete.setColumns(10);
		tfDelete.setBounds(311, 43, 134, 28);
		Delet_panel.add(tfDelete);
		
		JLabel label_26 = new JLabel("Depts : ");
		label_26.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_26.setForeground(Color.WHITE);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_26.setBounds(483, 43, 76, 26);
		Delet_panel.add(label_26);
		
		DeleteCombobox = new JComboBox();
		DeleteCombobox.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		DeleteCombobox.setForeground(Color.BLACK);
		DeleteCombobox.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeleteCombobox.setBounds(572, 43, 125, 26);
		Delet_panel.add(DeleteCombobox);
		
		JButton btnDelete = new JButton("Delete\r\n");
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnDelete) {
					String delName = tfDelete.getText();
					String delDept = DeleteCombobox.getSelectedItem().toString();
					
					if(delName.equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "Enter Name !" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
					}
					else {
						boolean flag = false ;
						try {
							con = DriverManager.getConnection("jdbc:ucanaccess://F:\\\\JavaEclipse\\\\Drag and Drop Designing using JAVA\\\\src\\\\Final_Project_LMS/LMS_FINAL.accdb");
							String sql = "select * from bookRecord ";
							
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							rs = ps.executeQuery();
							while(rs.next()) {							
								String name = rs.getString ("Name") ;
								String dept = rs.getString ("Depts") ;
								
								if(name.equalsIgnoreCase(delName) && dept.equalsIgnoreCase(delDept)) {								
									
									dfN.setText(rs.getString("Name"));	dfI.setText(rs.getString("Isbn"));	dfA.setText(rs.getString("Author"));
									dfD.setText( rs.getString("Date"));	dfAdd.setText(rs.getString("Addition"));	dfP.setText(rs.getString("Pages"));	
									dfC.setText(rs.getInt("Copies")+"");	dfDp.setText(rs.getString("Depts"));
									flag = true ;
							
									break ;	
								}
							}
							con.close();
						}
						catch(Exception i) {
							JOptionPane.showMessageDialog(null, i.getMessage());
						}	
						if(flag==true) {
							label_3.add(AFTER_DELETE);
							AFTER_DELETE.setBounds(800, 143, 800, 500);		
							Delet_panel.setVisible(false);
						}
						else {JOptionPane.showMessageDialog(null, "Book Not Found ! " , "" , JOptionPane.WARNING_MESSAGE);}
						
					}								
				}

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(429, 403, 106, 28);
		Delet_panel.add(btnDelete);
		
		JButton button_2 = new JButton("Back");
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delet_panel.setVisible(false);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(257, 404, 106, 27);
		Delet_panel.add(button_2);
		
/*========================After Saarch Contents=============================================================================*/
		AfterSearch = new JPanel();
		AfterSearch.setForeground(Color.WHITE);
		AfterSearch.setBorder(null);
		AfterSearch.setLayout(null);
		AfterSearch.setBackground(new Color(147, 112, 219  , 50));
//		AfterSearch.setBounds(800, 140, 800, 500);
//		label_3.add(AfterSearch);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterSearch.setVisible(false);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk.setBounds(349, 415, 117, 28);
		AfterSearch.add(btnOk);
		
		JLabel label_6 = new JLabel("NAME : ");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(95, 88, 108, 28);
		AfterSearch.add(label_6);
		
		JLabel label_8 = new JLabel("AUTHOR : ");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(95, 148, 117, 28);
		AfterSearch.add(label_8);
		
		JLabel label_10 = new JLabel("ADDITION : ");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(95, 203, 117, 28);
		AfterSearch.add(label_10);
		
		JLabel label_12 = new JLabel("ISBN NO : ");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_12.setBounds(436, 88, 124, 28);
		AfterSearch.add(label_12);
		
		JLabel label_13 = new JLabel("DATE : ");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_13.setBounds(436, 148, 124, 28);
		AfterSearch.add(label_13);
		
		JLabel label_14 = new JLabel("COPIES NO : ");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_14.setBounds(95, 263, 117, 28);
		AfterSearch.add(label_14);
		
		JLabel label_15 = new JLabel("PAGES NO : ");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_15.setBounds(436, 203, 124, 28);
		AfterSearch.add(label_15);
		
		JLabel label_16 = new JLabel("DEPTS : ");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_16.setBounds(436, 263, 124, 28);
		AfterSearch.add(label_16);
		
		afName = new JLabel("");
		afName.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afName.setForeground(Color.WHITE);
		afName.setFont(new Font("Tahoma", Font.BOLD, 16));
		afName.setBounds(233, 89, 151, 28);
		AfterSearch.add(afName);
		
		afI = new JLabel("");
		afI.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afI.setForeground(Color.WHITE);
		afI.setFont(new Font("Tahoma", Font.BOLD, 16));
		afI.setBounds(580, 88, 120, 28);
		AfterSearch.add(afI);
		
		afA = new JLabel("");
		afA.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afA.setForeground(Color.WHITE);
		afA.setFont(new Font("Tahoma", Font.BOLD, 16));
		afA.setBounds(229, 149, 155, 28);
		AfterSearch.add(afA);
		
		afAdd = new JLabel("");
		afAdd.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afAdd.setForeground(Color.WHITE);
		afAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		afAdd.setBounds(236, 204, 148, 28);
		AfterSearch.add(afAdd);
		
		afC = new JLabel("");
		afC.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afC.setForeground(Color.WHITE);
		afC.setFont(new Font("Tahoma", Font.BOLD, 16));
		afC.setBounds(233, 264, 151, 28);
		AfterSearch.add(afC);
		
		afD = new JLabel("");
		afD.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afD.setForeground(Color.WHITE);
		afD.setFont(new Font("Tahoma", Font.BOLD, 16));
		afD.setBounds(580, 148, 120, 28);
		AfterSearch.add(afD);
		
		afP = new JLabel("");
		afP.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afP.setForeground(Color.WHITE);
		afP.setFont(new Font("Tahoma", Font.BOLD, 16));
		afP.setBounds(580, 203, 120, 28);
		AfterSearch.add(afP);
		
		afDp = new JLabel("");
		afDp.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		afDp.setForeground(Color.WHITE);
		afDp.setFont(new Font("Tahoma", Font.BOLD, 16));
		afDp.setBounds(580, 263, 120, 28);
		AfterSearch.add(afDp);

		
/*=================Searching Panel=====================================================================================*/
		p_search = new JPanel();
		p_search.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		p_search.setOpaque(false);
		p_search.setBackground(new Color(30, 144, 255));
//		p_search.setBounds(800, 140, 800, 500);
//		label_3.add(p_search);
		p_search.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name of the Book : ");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(68, 28, 222, 26);
		p_search.add(lblNewLabel_1);
		
		SearchName = new JTextField();
		SearchName.setFont(new Font("Tahoma", Font.BOLD, 14));
		SearchName.setBounds(300, 31, 123, 25);
		p_search.add(SearchName);
		SearchName.setColumns(10);
		
		JLabel lblDepts_1 = new JLabel("Depts : ");
		lblDepts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDepts_1.setForeground(Color.WHITE);
		lblDepts_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepts_1.setBounds(483, 28, 80, 26);
		p_search.add(lblDepts_1);
		
		searchDept = new JComboBox();
		searchDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		searchDept.setForeground(new Color(0, 0, 0));
		searchDept.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "MATH", "B ED"}));
		searchDept.setBounds(573, 26, 125, 26);
		p_search.add(searchDept);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnSearch) {
					String srchName = SearchName.getText();
					String srchDept = searchDept.getSelectedItem().toString();
					
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
								
								if(name.equalsIgnoreCase(srchName) && dept.equalsIgnoreCase(srchDept)) {								
									
									afName.setText(rs.getString("Name"));	afI.setText(rs.getString("Isbn"));	afA.setText(rs.getString("Author"));
									afD.setText( rs.getString("Date"));	afAdd.setText(rs.getString("Addition"));	afP.setText(rs.getString("Pages"));	
									afC.setText(rs.getInt("Copies")+"");	afDp.setText(rs.getString("Depts"));
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
							p_search.setVisible(false);
							label_3.add(AfterSearch);
							AfterSearch.setBounds(800, 140, 800, 500);
						}
						else {JOptionPane.showMessageDialog(null, "Book Not Found ! " , "" , JOptionPane.WARNING_MESSAGE);}
						
					}
				}

			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(426, 434, 89, 26);
		p_search.add(btnSearch);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack_1) {
					p_search.setVisible(false);	
				}
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack_1.setBounds(288, 434, 89, 26);
		p_search.add(btnBack_1);
		
		
/*==========================Adding contents' Panel=============================================================================================*/
		Add = new JPanel();
		Add.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Add.setOpaque(false);
		Add.setBackground(new Color(30, 144, 255));
//		label_3.add(Add);
//		Add.setBounds(800, 140, 800, 500);
		Add.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack) {
					Add.setVisible(false);
				}
			}
		});
		btnBack.setBounds(287, 413, 108, 35);
		Add.add(btnBack);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a , b ,c ,d , f , g  ,k ;
				int h ;
				a = tfName.getText() ;
				b = tfIsbn.getText();
				c = tfAuthor.getText();
				d  = ((JTextField)tfDate.getDateEditor().getUiComponent()).getText();				
				f = tfAddition.getText();
				g = tfPages.getText() ;
				h = Integer.parseInt(tfCopies.getText());
				k = tfDepts.getSelectedItem().toString();
				if(a.equalsIgnoreCase("")||b.equalsIgnoreCase("")||c.equalsIgnoreCase("")||d.equalsIgnoreCase("")||f.equalsIgnoreCase("")||g.equalsIgnoreCase("")||k.equalsIgnoreCase("")||h==0) {
					JOptionPane.showMessageDialog(null, "Fillout all the Fields" , "Warnings..." , JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						con = DriverManager.getConnection("jdbc:ucanaccess://F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS/LMS_FINAL.accdb");
						String sql = "select * from bookRecord ";
						
						PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
						rs = ps.executeQuery();
						rs.moveToInsertRow();
						
						rs.updateString("Name",a);
						rs.updateString("Isbn",b);
						rs.updateString("Author",c);
						rs.updateString("Date",d);
						rs.updateString("Addition",f);
						rs.updateString("Pages",g);
						rs.updateInt("Copies",h);
						rs.updateString("Depts",k);
						
						rs.insertRow();
					
						Add.setVisible(false);
						JOptionPane.showMessageDialog(null,  "Row Inserted Successfully !" , "Alert" , JOptionPane.INFORMATION_MESSAGE);
						con.close();
						
					}
					catch(Exception i) {
						JOptionPane.showMessageDialog(null, i.getMessage());
					}
				}
			}
		});
		btnAdd.setBounds(430, 413, 108, 35);
		Add.add(btnAdd);
		
		JLabel lblName = new JLabel("NAME : ");
		lblName.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(88, 109, 122, 28);
		Add.add(lblName);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfName.setBounds(226, 111, 141, 27);
		Add.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblIsbnNo = new JLabel("AUTHOR : ");
		lblIsbnNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIsbnNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbnNo.setForeground(Color.WHITE);
		lblIsbnNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblIsbnNo.setBounds(88, 171, 122, 28);
		Add.add(lblIsbnNo);
		
		tfAuthor = new JTextField();
		tfAuthor.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfAuthor.setColumns(10);
		tfAuthor.setBounds(226, 173, 141, 27);
		Add.add(tfAuthor);
		
		JLabel lblAuthor = new JLabel("ADDITION : ");
		lblAuthor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAuthor.setBounds(88, 228, 122, 28);
		Add.add(lblAuthor);
		
		tfAddition = new JTextField();
		tfAddition.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfAddition.setColumns(10);
		tfAddition.setBounds(226, 230, 141, 27);
		Add.add(tfAddition);
		
		JLabel label_2 = new JLabel("ISBN NO : ");
		label_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(408, 109, 108, 28);
		Add.add(label_2);
		
		tfIsbn = new JTextField();
		tfIsbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfIsbn.setColumns(10);
		tfIsbn.setBounds(536, 111, 165, 27);
		Add.add(tfIsbn);
		
		JLabel lblDate = new JLabel("PUB DATE : ");
		lblDate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDate.setBounds(408, 171, 108, 28);
		Add.add(lblDate);
		
		JLabel lblCopiesNo = new JLabel("COPIES :");
		lblCopiesNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCopiesNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopiesNo.setForeground(Color.WHITE);
		lblCopiesNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCopiesNo.setBounds(88, 285, 122, 28);
		Add.add(lblCopiesNo);
		
		tfCopies = new JTextField();
		tfCopies.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfCopies.setColumns(10);
		tfCopies.setBounds(226, 287, 141, 27);
		Add.add(tfCopies);
		
		JLabel lblPagesNo = new JLabel("PAGES NO : ");
		lblPagesNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblPagesNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagesNo.setForeground(Color.WHITE);
		lblPagesNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPagesNo.setBounds(408, 228, 108, 28);
		Add.add(lblPagesNo);
		
		tfPages = new JTextField();
		tfPages.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfPages.setColumns(10);
		tfPages.setBounds(536, 230, 165, 27);
		Add.add(tfPages);
		
		JLabel lblDepts = new JLabel("DEPTS : ");
		lblDepts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDepts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepts.setForeground(Color.WHITE);
		lblDepts.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDepts.setBounds(408, 285, 108, 28);
		Add.add(lblDepts);
		
		tfDepts = new JComboBox();
		tfDepts.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfDepts.setEditable(true);
		tfDepts.setModel(new DefaultComboBoxModel(new String[] {"CS", "EE", "BBA", "A&F", "B ED", "MATH"}));
		tfDepts.setBounds(536, 287, 165, 27);
		Add.add(tfDepts);
		
		tfDate = new JDateChooser();
		tfDate.setBounds(536, 171, 165, 27);
		Add.add(tfDate);
						
	}
}
