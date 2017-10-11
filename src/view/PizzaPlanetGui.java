package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import model.*;

public class PizzaPlanetGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnGuest;
	private JButton btnLogin;
	private JPanel pnlLoginPage;
	private JPanel pnlGuestLoginPage;
	private JLabel lblSubmit;
	private JButton btnExit;
	private JPanel pnlExitTab;
	private JButton btnLoginS;
	private JButton btnSignUp;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JPanel pnlMenuPage;
	private JLabel lblBackgroundMenu;
	private JPanel pnlCat;
	private JPanel pnlTabs;
	private JLabel lblTabs;
	private JButton btnShopping;
	private JButton btnMenu;
	private JButton btnAccount;
	private JPanel pnlShoppingPage;
	private JLabel lblBackgroundShop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					PizzaPlanetGui frame = new PizzaPlanetGui();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	// Calls InitComponents and CreateEvents
	public PizzaPlanetGui() 
	{
		initComponents();
		createEvents();
	}
	
	public static void userMenu(String user)
	{
		
	}
	
	public static void menuCats(String menu, User user)
	{
		
	}
	
	////////////////////////////////////////////////////////////////////
	///// This method contains all of the code 
	///// for creating and initializing.
	////////////////////////////////////////////////////////////////////
	private void initComponents()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(PizzaPlanetGui.class.getResource("/Resources/Planet.png")));
		setTitle("Pizza Planet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1920, 1080);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// This code sets the Frame to Fullscreen.						IF FULL SCREEN DOESNT WORK, COMMENT THE 4 LINES BELOW
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setUndecorated(true);
		this.setVisible(true);
		contentPane.setLayout(null);
		
		// Tabs panel (Top Right of the UI)
		pnlTabs = new JPanel();
		pnlTabs.setBackground(new Color(250, 240, 230));
		pnlTabs.setBounds(1483, 6, 407, 101);
		contentPane.add(pnlTabs);
		pnlTabs.setVisible(false);
		
		// Label Within the Tabs panel (Top Right of the UI)
		lblTabs = new JLabel("");
		lblTabs.setBounds(0, 0, 407, 107);
		lblTabs.setVisible(false);
		pnlTabs.setLayout(null);
		lblTabs.setBackground(new Color(250, 240, 230));
		
		// Adding the Label inside the Panel
		pnlTabs.add(lblTabs);
		
		// Shopping Cart Button (Top Right of the UI)
		btnShopping = new JButton("New button");
		btnShopping.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Shopping Cart.jpg")));
		btnShopping.setBounds(297, 6, 104, 89);
		
		// Adding the Button to the Panel
		pnlTabs.add(btnShopping);
		
		// Menu Button (Top Right of the UI)
		btnMenu = new JButton("New button");
		btnMenu.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.png")));
		btnMenu.setBounds(156, 6, 104, 89);
		
		// Adding the Button to the Panel
		pnlTabs.add(btnMenu);
		
		
		// Account Button (Top Right of the UI)
		btnAccount = new JButton("New button");
		btnAccount.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Account.png")));
		btnAccount.setBounds(18, 6, 104, 89);
		
		// Adding the Button to the Panel
		pnlTabs.add(btnAccount);
		
		// Exit Panel (Bottom Right)
		pnlExitTab = new JPanel();
		pnlExitTab.setBounds(1787, 1002, 103, 60);
		contentPane.add(pnlExitTab);
		pnlExitTab.setLayout(null);	
		btnExit = new JButton("EXIT");
		btnExit.setBounds(-12, -13, 128, 86);
		
		// Adding Button Inside the Panel
		pnlExitTab.add(btnExit);
		
		// Exit Button (Bottom Right)
		btnExit.setBackground(new Color(250, 240, 230));
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnExit.setForeground(new Color(153, 0, 0));
		
		// Login Page Panel 
		pnlLoginPage = new JPanel();
		pnlLoginPage.setVisible(false);
		
		// Menu Page Panel
		pnlMenuPage = new JPanel();
		pnlMenuPage.setVisible(false);
		pnlMenuPage.setBounds(0, -11, 1914, 1091);
		pnlMenuPage.setLayout(null);
		
		// Adding Panel to the Content Pane
		contentPane.add(pnlMenuPage);
		
		// Category Panel
		pnlCat = new JPanel();
		pnlCat.setBounds(322, 262, 1297, 779);
		pnlCat.setLayout(null);

		// Adding Panel to the Content Pane
		pnlMenuPage.add(pnlCat);
		
		// Setting Label Bounds/Name/Source 
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuInside_Final.png")));
		label_1.setBounds(0, 0, 1297, 779);
		pnlCat.add(label_1);
		
		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu = new JLabel("");
		lblBackgroundMenu.setBounds(-8, 0, 2000, 1103);
		lblBackgroundMenu.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundMenu.setBackground(new Color(250, 240, 230));
		pnlMenuPage.add(lblBackgroundMenu);
		pnlLoginPage.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlLoginPage);
		pnlLoginPage.setLayout(null);
		
		// Setting pnlSubmit Background/Border/Color/Bounds
		JPanel pnlSubmit = new JPanel();
		pnlSubmit.setBackground(new Color(0, 0, 0));
		pnlSubmit.setOpaque(true);
		pnlSubmit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		pnlSubmit.setBounds(560, 460, 750, 494);
		pnlSubmit.setLayout(null);
		
		// Adding Submit Panel to the Login Page
		pnlLoginPage.add(pnlSubmit);
		
		
		// Setting txtUserName with Name/Font/Bounds
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		txtUserName.setBounds(311, 77, 383, 64);
		pnlSubmit.add(txtUserName);
		txtUserName.setColumns(10);
		
		// Setting lblUserName with Font/Bounds/Name
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		lblUserName.setBounds(68, 66, 200, 82);
		pnlSubmit.add(lblUserName);
		
		// Setting lblPassword Name/Font/Bounds
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		lblPassword.setBounds(68, 203, 200, 82);
		pnlSubmit.add(lblPassword);
		
		// Setting txtPassword Name/Font/Bounds
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		txtPassword.setColumns(10);
		txtPassword.setBounds(311, 214, 383, 64);
		pnlSubmit.add(txtPassword);
		
		// Setting btnLoginS Foreground/Background
		btnLoginS = new JButton("Login");
		btnLoginS.setForeground(new Color(204, 0, 0));
		btnLoginS.setBackground(new Color(250, 240, 230));
		btnLoginS.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		btnLoginS.setBounds(270, 320, 223, 74);
		
		// Adding Button to Panel
		pnlSubmit.add(btnLoginS);
				
		// Setting btnSignup Foreground/Background/Font
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(204, 0, 0));
		btnSignUp.setBackground(new Color(250, 240, 230));
		btnSignUp.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnSignUp.setBounds(323, 406, 121, 34);
		
		// Adding btnSignUp to pnlSubmit
		pnlSubmit.add(btnSignUp);
				
		// Setting lblSumbit Bounds/Icon/Name
		lblSubmit = new JLabel("");
		lblSubmit.setBounds(6, 6, 738, 482);
		lblSubmit.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Submit.jpg")));
		
		// Adding Lbl to Panel
		pnlSubmit.add(lblSubmit);
				
		// Setting lblBackgroundLogin Bounds/Icon/Name
		JLabel lblBackgroundLogin = new JLabel("");
		lblBackgroundLogin.setBounds(-8, 0, 2000, 1103);
		lblBackgroundLogin.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Login_Final.png")));
		
		// Adding Label to panel
		pnlLoginPage.add(lblBackgroundLogin);
				
		// Setting pnlGuestLoginPage bounds
		pnlGuestLoginPage = new JPanel();
		pnlGuestLoginPage.setBounds(0, -11, 1914, 1091);
		pnlGuestLoginPage.setLayout(null);
		
		// Adding Panel to Content Pane
		contentPane.add(pnlGuestLoginPage);
			
		// Setting btnGuest Foreground/Font/Background/Bounds
		btnGuest = new JButton("Guest");			
		btnGuest.setForeground(new Color(204, 0, 0));
		btnGuest.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		btnGuest.setBackground(new Color(250, 240, 230));
		btnGuest.setBounds(559, 596, 275, 244);
		
		// Adding Button on Panel
		pnlGuestLoginPage.add(btnGuest);

		// Setting btnLogin Foreground/Font/Background/Bounds
		btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(204, 0, 0));
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		btnLogin.setBackground(new Color(250, 240, 230));
		btnLogin.setBounds(1032, 596, 275, 244);
		
		// Adding Button to Panel
		pnlGuestLoginPage.add(btnLogin);
			
		// Setting Background/Bounds/Icon
		JLabel lblBackgroundGuestLogin = new JLabel("");
		lblBackgroundGuestLogin.setBackground(new Color(192, 192, 192));
		lblBackgroundGuestLogin.setBounds(-8, 0, 2000, 1103);
		pnlGuestLoginPage.add(lblBackgroundGuestLogin);
		lblBackgroundGuestLogin.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Login_Final.png")));
		
		// Setting panel Bounds and Adding it to the content pane
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlShoppingPage);
		pnlShoppingPage.setLayout(null);
				
		// Setting Background/bounds/Icon
		lblBackgroundShop = new JLabel("");
		lblBackgroundShop.setBounds(-8, 0, 2000, 1103);
		lblBackgroundShop.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuCat_Final.png")));
		lblBackgroundShop.setBackground(Color.LIGHT_GRAY);
		pnlShoppingPage.add(lblBackgroundShop);
	
		// Setting Bounds
		JPanel pnlShoppingLeft = new JPanel();
		pnlShoppingLeft.setBounds(322, 261, 623, 782);
		pnlShoppingPage.add(pnlShoppingLeft);
						
		// Setting Bounds
		JPanel pnlShoppingRight = new JPanel();
		pnlShoppingRight.setBounds(974, 261, 642, 782);
		pnlShoppingPage.add(pnlShoppingRight);
				
		// Setting Visibility/Bounds 
		JPanel pnlSelectDetails = new JPanel();
		pnlSelectDetails.setVisible(false);
		pnlSelectDetails.setBounds(0, 0, 1914, 1091);
		contentPane.add(pnlSelectDetails);
		pnlSelectDetails.setLayout(null);
				
		// Setting Icon/Background
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuCat_Final.png")));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(-8, 0, 2000, 1103);
		pnlSelectDetails.add(label);
	}
	
	////////////////////////////////////////////////////////////////////
	///// This Method contains all of the code for creating Events
	////////////////////////////////////////////////////////////////////
	private void createEvents() 
	{
		
		btnGuest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pnlLoginPage.setVisible(false);
				pnlMenuPage.setVisible(true);
				pnlTabs.setVisible(true);
				pnlGuestLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				
			}
		});
		
		// This Event exists on pnlGuestLogin
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// Altering Panels so the correct ones show
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(true);
				pnlTabs.setVisible(false);
				pnlGuestLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
			}
		});
		
		// This Event exists on pnlExit
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// Closes down the Program
				System.exit(0);
			}
		});
		
		// This Event exists on pnlLogin
		btnLoginS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				// Altering Panels so the correct ones show
				pnlMenuPage.setVisible(true);
				pnlLoginPage.setVisible(false);
				pnlTabs.setVisible(true);
				pnlGuestLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
			}
		});
		
		// This Event exists on the pnlTabs
		btnAccount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlGuestLoginPage.setVisible(true);
				pnlTabs.setVisible(false);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
			}
		});
		
		// This Event exists on the pnlTabs
		btnMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlGuestLoginPage.setVisible(false);
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(true);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
			}
		});
		
		// This Event exists on the pnlTabs
		btnShopping.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlGuestLoginPage.setVisible(false);
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				pnlShoppingPage.setVisible(true);
			}
		});
	}
}
