package Final_Project_LMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Cover_LMS {

	private JFrame frmClickOnThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cover_LMS window = new Cover_LMS();
					window.frmClickOnThe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cover_LMS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClickOnThe = new JFrame();
		frmClickOnThe.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\mmmnmnmm.png"));
		frmClickOnThe.setTitle("______________________________________________________________________________________Click on the Page to Enter the main page of LMS___________________________________________________________________________________");
		frmClickOnThe.setBounds(50, 20, 1270, 710);
		frmClickOnThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClickOnThe.getContentPane().setLayout(null);
		frmClickOnThe.setResizable(false);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmClickOnThe.dispose();
				HOMEPAGE_ hp = new HOMEPAGE_();
				hp.main(null);				
			}
		});
		label.setIcon(new ImageIcon("F:\\Semester_II_Contents_Practicles\\JavaEclipse\\Drag and Drop Designing using JAVA\\src\\Final_Project_LMS\\Pics and Icons\\taj mahal.jpg"));
		label.setBounds(0, 0, 1264, 681);
		frmClickOnThe.getContentPane().add(label);
	}

}

/*Thread for Slide show*/
