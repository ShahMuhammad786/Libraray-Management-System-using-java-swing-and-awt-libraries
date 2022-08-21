package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class HOMEPAGE_ {

	private JFrame frmHomePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOMEPAGE_ window = new HOMEPAGE_();
					window.frmHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HOMEPAGE_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomePage = new JFrame();
		frmHomePage.getContentPane().setBackground(new Color(127, 255, 0));
		frmHomePage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\Honeme.png"));
		frmHomePage.setTitle("Home Page\r\n");
		frmHomePage.setResizable(false);
		frmHomePage.setBounds(100, 20, 1247, 681);
		frmHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomePage.getContentPane().setLayout(null);
		
		JLabel back_image = new JLabel("");
		back_image.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		back_image.setBackground(new Color(0, 255, 255));
		back_image.setFont(new Font("Rockwell", Font.PLAIN, 18));
		back_image.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\nm,.jpg"));
		back_image.setHorizontalAlignment(SwingConstants.CENTER);
		back_image.setBounds(0, 0, 1241, 652);
		frmHomePage.getContentPane().add(back_image);
		
		JLabel libryary = new JLabel("LIBRARY");
		frmHomePage.getContentPane().add(libryary);
		libryary.setForeground(Color.WHITE);
		libryary.setVerticalAlignment(SwingConstants.TOP);
		libryary.setHorizontalAlignment(SwingConstants.CENTER);
		libryary.setFont(new Font("Candara Light", Font.BOLD, 24));
		libryary.setBounds(680, 551, 98, 22);
		
		JLabel exit = new JLabel("EXIT\r\n");
		frmHomePage.getContentPane().add(exit);
		exit.setForeground(Color.WHITE);
		exit.setVerticalAlignment(SwingConstants.TOP);
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setFont(new Font("Candara Light", Font.BOLD, 24));
		exit.setBounds(577, 541, 98, 22);
		
		JLabel Std_Center = new JLabel("STD CENTER");
		frmHomePage.getContentPane().add(Std_Center);
		Std_Center.setForeground(Color.WHITE);
		Std_Center.setLabelFor(back_image);
		Std_Center.setBackground(Color.MAGENTA);
		Std_Center.setVerticalAlignment(SwingConstants.TOP);
		Std_Center.setHorizontalAlignment(SwingConstants.CENTER);
		Std_Center.setFont(new Font("Candara Light", Font.BOLD, 24));
		Std_Center.setBounds(329, 497, 209, 22);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		back_image.add(panel);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 0 , 80));
		panel.setBounds(84, 81, 1079, 499);
		panel.setLayout(null);
		
		JLabel student_lbl = new JLabel("");
		student_lbl.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 255), new Color(255, 0, 255), new Color(0, 255, 255), new Color(0, 255, 255)));
		student_lbl.setOpaque(true);
		student_lbl.setBackground(new Color(255, 255, 255 , 80));
		student_lbl.setBounds(431, 133, 241, 259);
		panel.add(student_lbl);
		student_lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StdLogin stdl = new StdLogin();
				stdl.main(null);
				frmHomePage.dispose();
			}
		});
		student_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		student_lbl.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\student-with-graduation-cap.png"));
		
		JLabel Library_lbl = new JLabel("");
		Library_lbl.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		Library_lbl.setOpaque(true);
		Library_lbl.setBackground(new Color(255, 255, 255 , 80));
		Library_lbl.setBounds(778, 133, 241, 259);
		panel.add(Library_lbl);
		Library_lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage lp = new LoginPage();
				lp.main(null);
				frmHomePage.dispose();
				
				
			}
		});
		Library_lbl.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\books (1).png"));
		Library_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Exit_lbl = new JLabel("");
		Exit_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Exit_lbl.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 0), new Color(0, 255, 0), new Color(0, 0, 255), new Color(0, 0, 255)));
		Exit_lbl.setOpaque(true);
		Exit_lbl.setBackground(new Color(255,255,255,80));
		Exit_lbl.setBounds(87, 133, 253, 259);
		panel.add(Exit_lbl);
		Exit_lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmHomePage.dispose();
				
			}
		});
		Exit_lbl.setIcon(new ImageIcon("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\logout.png"));
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		lblExit.setOpaque(true);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setFont(new Font("Tahoma", Font.BOLD, 38));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setFont(new Font("Tahoma", Font.BOLD, 34));
			}
		});
		lblExit.setForeground(new Color(255, 255, 255));
		lblExit.setBackground(new Color(0, 0, 0 ));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblExit.setBounds(87, 405, 253, 63);
		panel.add(lblExit);
		
		JLabel lblLibrary = new JLabel("LIBRARY");
		lblLibrary.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		lblLibrary.setOpaque(true);
		lblLibrary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLibrary.setFont(new Font("Tahoma", Font.BOLD, 38));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLibrary.setFont(new Font("Tahoma", Font.BOLD, 34));
			}
		});
		lblLibrary.setForeground(new Color(255, 255, 255));
		lblLibrary.setBackground(new Color(0, 0, 0));
		lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrary.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblLibrary.setBounds(778, 405, 241, 63);
		panel.add(lblLibrary);
		
		JLabel lblStdCenter = new JLabel("STD CENTER");
		lblStdCenter.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		lblStdCenter.setOpaque(true);
		lblStdCenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStdCenter.setFont(new Font("Tahoma", Font.BOLD, 38));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblStdCenter.setFont(new Font("Tahoma", Font.BOLD, 34));
			}
		});
		lblStdCenter.setForeground(new Color(255, 255, 255));
		lblStdCenter.setBackground(new Color(0, 0, 0  ));
		lblStdCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdCenter.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblStdCenter.setBounds(431, 405, 241, 63);
		panel.add(lblStdCenter);
		
		JLabel lblCoverPage = new JLabel("COVER  PAGE");
		lblCoverPage.setOpaque(true);
		lblCoverPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCoverPage.setFont(new Font("Tahoma", Font.BOLD, 17));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCoverPage.setFont(new Font("Tahoma", Font.BOLD, 15));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Cover_LMS.main(null);
				frmHomePage.dispose();
			}
		});
		lblCoverPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoverPage.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0)));
		lblCoverPage.setBackground(new Color(255, 255, 255));
		lblCoverPage.setForeground(new Color(0, 0, 0));
		lblCoverPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		back_image.add(lblCoverPage);
		lblCoverPage.setBounds(577, 595, 113, 22);
		
	}
}
