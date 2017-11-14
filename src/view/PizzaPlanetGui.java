package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import model.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PizzaPlanetGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JPanel pnlLoginPage;
	private JLabel lblSubmit;
	private JButton btnExit;
	private JPanel pnlExitTab;
	private static JButton btnLogin;
	private static JButton btnGuest;
	private static JTextField txtUserName;
	private static JTextField txtPassword;
	private static JPanel pnlMenuPage;
	private JLabel lblBackgroundMenu;
	private JPanel pnlCat;
	private static JPanel pnlTabs;
	private JButton btnShopping;
	private JButton btnMenu;
	private JButton btnAccount;
	private static JPanel pnlShoppingPage;
	private JLabel lblBackgroundShop;
	private JPanel pnlMenuPage2;
	private JLabel lblBackgroundMenu2;
	private JPanel pnlCat2;
	private JLabel lblBackgroundCat;
	private static JPanel pnlPayment;
	private static JPanel pnlConfirm;
	private JButton btnHome;
	private JPanel pnlAccountPage;
	private JLabel lblBackground;
	private JPanel pnlCat3;
	private JLabel lblBackgroundCat2;
	private JLabel lblUserAnswer;
	private JButton btnSignUp;
	private static JPanel pnlSignUpPage;
	private JLabel lblUserError;
	private JLabel lblPassError;
	private JLabel lblUsername;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUserSign;
	private JLabel lblPassword2;
	private JTextField txtPassSign;
	private JLabel lblRewritePass;
	private JTextField txtPassSign2;
	private JLabel lblEmailSign;
	private JTextField txtEmailSign;
	private JLabel lblCitySign;
	private JTextField txtCitySign;
	private JLabel lblStreet;
	private JTextField txtStreetSign;
	private JTextField txtFirstSign;
	private JLabel lblLast;
	private JTextField txtLastSign;
	private JLabel lblPhone;
	private JTextField txtPhoneSign;
	private static JButton btnSignUpSign;



	// Calls InitComponents and CreateEvents
	public PizzaPlanetGui() 
	{
		initComponents();
		createEvents();
	}

	public void UserPage(User u, PizzaPlanet pp) {
		// All the code needed to turn this panel on and any others off
		pnlMenuPage.setVisible(false);
		pnlLoginPage.setVisible(true);
		pnlTabs.setVisible(false);
		pnlShoppingPage.setVisible(false);
		pnlSignUpPage.setVisible(false);
		pnlAccountPage.setVisible(false);

		// EVENT: When User clicks a button, call 		
		// controller.handleUserClick("","") if GUEST						
		btnGuest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				User user = null;

				//[username. password]
				pp.apiValidateUser(user);

				pnlMenuPage.setVisible(true);
				pnlLoginPage.setVisible(false);
				pnlTabs.setVisible(true);
				pnlShoppingPage.setVisible(false);
			}
		});

		//controller.handleUserClick("txtUserName.Text", "txtPassword.Text") if LOGIN		
		// This Event exists on pnlLogin
		btnLogin.addActionListener(new ActionListener() 
		{		
			
			public void actionPerformed(ActionEvent e) 
			{		
				String username = txtUserName.getText();
				String password = txtPassword.getText();
				
				User user = new User(username, password);
				
				//String[] creds = new String[2];	
				//creds[0] = txtUserName.getText();
				//creds[1] = txtPassword.getText();
				
				//Validate Username
				if (username.length() < 5)
				{
					String Error1 = "<html>Please Enter a Large Enough Username! <br>(Range 5 - 15)</html>";
					lblUserError.setText(Error1);
				}
				else
				{
					if (username.length() > 15)
					{
						System.out.println("Your Username is to large! (RANGE 5 - 15)");
						String Error2 = "<html>Your Username is to large!</html>";
						lblUserError.setText(Error2);
					}
					else
					{
						System.out.println("USERNAME:" + " " + username);
						
						//Validate Password				
						if (password.length() < 5) 
						{
							System.out.println("Please Enter a Large Enough Password!");
							String Error3 = "<html>Please Enter a Large Enough Password! <br>(Range 5-25)</html>";
							lblPassError.setText(Error3);
							lblUserError.setText("");
						}
						else
						{
							if (password.length() > 25)
							{
								System.out.println("Your Password is too Large! (Range 5 - 25)");
								String Error4 = "<html>Your Password is too Large! <br>(Range 5 - 25)</html>";
								lblPassError.setText(Error4);
							}
							else
							{
								System.out.println("PASSWORD:" + " " + password);
								//[username. password]
								pp.apiValidateUser(user);
								pnlMenuPage.setVisible(true);
								pnlLoginPage.setVisible(false);
								pnlTabs.setVisible(true);
								pnlShoppingPage.setVisible(false);
							}
						}
					}
				}
			}
		});
		
		btnSignUp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				pnlAccountPage.setVisible(false);
				pnlSignUpPage.setVisible(true);
				btnMenu.setVisible(false);
			}
		});
	}

	/**
	 * Instantiates the main menu (first screen)
	 * @param user String optional; may have an error message
	 */
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void get1stMenuPage(User user, Map<String,String> foodtypes,  PizzaPlanet pp) 
	{
		List<JButton> buttonList = new ArrayList<>();
		//HashMap<String, String> 
		
		  //Loop through the foodtypes...
	/*	  for(int i = 0; i <  foodtypes.size(); i++)
		  {
		  	Map<String, String> type = foodtypes.get(i); 
		  	
		  	String id = type.get("id");
		  	String name = type.get("name");
		  	
		    JButton btn = new JButton(name);
		    
			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					//pp.getMenu(id);
					System.out.println(id);
				}
			});
		    buttonList.add(btn); 
		  }	  
		  */	
		foodtypes.forEach((k, v) ->
		{
			String id = k;
			String name = v;
			
		    JButton btn = new JButton(name);
		    
			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					//pp.getMenu(id);
					System.out.println(id);
				}
			});
		    buttonList.add(btn); 
			
			
		});
		  placeButtons(buttonList);
		  
	}	
	
	public void placeButtons(List<JButton> buttons)
	{

		int x = 50;
		int y = 50;
		
		for (int i = 0; i < buttons.size(); ++i)
		{
			JButton button = buttons.get(i);
			
			button.setBounds(x, y, 200, 200);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			button.setForeground(new Color(204, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			pnlCat.add(button);
					
			x = x + 500;
		}
	}
	
	public void get2ndMenuPage(User user, Menu selectedMenu, PizzaPlanet pp)
	{
		/* This displays a menu. Consits of a Menu with a List<MenuItems> */
		
	}
	
	public void getMenuItemsDetailPage(User user, MenuItem pizza, PizzaPlanet pp)
	{
		
	}
	
	public void getOrdersPage(User user, ShoppingCart cart, PizzaPlanet pp)
	{
		
	}
	
	public void getPaymentPage(User user, ShoppingCart cart, PizzaPlanet pp)
	{
		
	}

	public void getConfirmationPage(User user, Payment pay, PizzaPlanet pp)
	{
		
	}
	
	public void getAccountPage(User user, PizzaPlanet pp)
	{

	}
	
	public void getSignUpPage(User user, PizzaPlanet pp) {
		
		btnSignUpSign.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String[] creds = new String[9];	
				
				creds[8] = txtPhoneSign.getText();
				String User = txtUserSign.getText();
				String Pass = txtPassSign.getText();
				String Email = txtEmailSign.getText();
				String City = txtCitySign.getText();
				String Street = txtStreetSign.getText();
				String First = txtFirstSign.getText();
				String Last = txtLastSign.getText();
				String Phone = txtPhoneSign.getText();
				
				creds[4] = "WI";
				
				if (User.equals("")) 
				{
					System.out.println("Input a Username!");
				}
				else 
				{
					creds[0] = txtUserSign.getText();
					
					if(Pass.equals("")) 
					{
						System.out.println("Input a Password!");
					}
					else 
					{
						creds[1] = txtPassSign.getText();
						
						if(Email.equals("")) 
						{
							System.out.println("Input an Email!");
						}
						else 
						{
							creds[2] = txtEmailSign.getText();
							
							if(City.equals("")) 
							{
								System.out.println("Input an Email!");
							}
							else 
							{
								creds[3] = txtCitySign.getText();
								
								if(Street.equals("")) 
								{
									System.out.println("Input a Street!");
								}
								else
								{
									creds[5] = txtStreetSign.getText();
									
									if(First.equals("")) 
									{
										System.out.println("Input a First Name!");
									}
									else 
									{
										creds[6] = txtFirstSign.getText();
										
										if (Last.equals("")) 
										{
											System.out.println("Input a Last Name!");
										}
										else 
										{
											creds[7] = txtLastSign.getText();
											
											if (Phone.equals("")) 
											{
												System.out.println("Input a Phone Number!");
											}
											else 
											{
												creds[8] = txtPhoneSign.getText();
											}
										}

									}
								}
							}
						}
						

					}
				}
				
				
			}
		});
	}
	
	
	/**
	 * Instantiates the category menu screen (second screen) 
	 * Shows all the categories (pizza, wings, subs) for User to choose 
	 * @param menu List; contains the MenuItems to list
	 * @param user User; if a User is logged in, display their info
	 */
	public static void menuCats(String menu, User user)
	{	
		// All the coded needed to turn this panel on and any others off
		pnlMenuPage.setVisible(true);
		pnlLoginPage.setVisible(false);
		pnlTabs.setVisible(true);
		pnlShoppingPage.setVisible(false);
		pnlPayment.setVisible(false);
		pnlConfirm.setVisible(false);
		pnlSignUpPage.setVisible(false);

		// EVENT: When User clicks a menu category, let the controller know...
		// controller.handleCatMenuClick("PIZZA"); pass in category chosen

	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS          NEW EVENTS       
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	////////////////////////////////////////////////////////////////////
	///// This method contains all of the code 
	///// for creating and initializing.
	////////////////////////////////////////////////////////////////////
	@SuppressWarnings("rawtypes")
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
		// This code sets the Frame to Fullscreen.						IF FULL SCREEN DOESNT WORK, COMMENT THE 2 LINES BELOW
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setVisible(true);
		contentPane.setLayout(null);

		// Tabs panel (Top Right of the UI)
		pnlTabs = new JPanel();
		pnlTabs.setVisible(false);

		// Exit Panel (Bottom Right)
		pnlExitTab = new JPanel();
		pnlExitTab.setBounds(1787, 970, 103, 52);
		contentPane.add(pnlExitTab);
		pnlExitTab.setLayout(null);	
		btnExit = new JButton("EXIT");
		btnExit.setBounds(-12, -12, 128, 70);

		// Adding Button Inside the Panel
		pnlExitTab.add(btnExit);

		// Exit Button (Bottom Right)
		btnExit.setBackground(new Color(250, 240, 230));
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnExit.setForeground(new Color(153, 0, 0));
		pnlTabs.setBackground(new Color(250, 240, 230));
		pnlTabs.setBounds(1359, 6, 531, 101);
		contentPane.add(pnlTabs);
		pnlTabs.setLayout(null);

		// Shopping Cart Button (Top Right of the UI)
		btnShopping = new JButton("New button");
		btnShopping.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Shopping Cart.jpg")));
		btnShopping.setBounds(409, 6, 104, 89);
		// Adding the Button to the Panel
		pnlTabs.add(btnShopping);

		// Menu Button (Top Right of the UI)
		btnMenu = new JButton("New button");
		btnMenu.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.png")));
		btnMenu.setBounds(268, 6, 104, 89);

		// Adding the Button to the Panel
		pnlTabs.add(btnMenu);


		// Account Button (Top Right of the UI)
		btnAccount = new JButton("New button");
		btnAccount.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Account.png")));
		btnAccount.setBounds(138, 6, 104, 89);

		// Adding the Button to the Panel
		pnlTabs.add(btnAccount);
		
	    btnHome = new JButton("New button");
		btnHome.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Home.png")));
		btnHome.setBounds(14, 6, 104, 89);
		pnlTabs.add(btnHome);

		pnlMenuPage2 = new JPanel();
		pnlMenuPage2.setVisible(false);
		
		pnlSignUpPage = new JPanel();
		pnlSignUpPage.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlSignUpPage);
		pnlSignUpPage.setLayout(null);
		pnlSignUpPage.setVisible(false);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblUsername.setBounds(372, 422, 266, 84);
		pnlSignUpPage.add(lblUsername);
		
		lblNewLabel = new JLabel("------------------------------------------------------");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(372, 371, 1222, 59);
		pnlSignUpPage.add(lblNewLabel);
		
		JButton btnSignUpSign = new JButton("LOGIN");

		btnSignUpSign.setForeground(new Color(204, 0, 0));
		btnSignUpSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		btnSignUpSign.setBackground(new Color(250, 240, 230));
		btnSignUpSign.setBounds(1217, 929, 223, 74);
		pnlSignUpPage.add(btnSignUpSign);
		
		lblNewLabel_1 = new JLabel("Welcome Guest!");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		lblNewLabel_1.setBounds(372, 275, 557, 122);
		pnlSignUpPage.add(lblNewLabel_1);
		
		txtUserSign = new JTextField();
		txtUserSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtUserSign.setBounds(641, 432, 332, 59);
		pnlSignUpPage.add(txtUserSign);
		txtUserSign.setColumns(10);
		
		lblPassword2 = new JLabel("Password:");
		lblPassword2.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblPassword2.setBounds(372, 511, 238, 84);
		pnlSignUpPage.add(lblPassword2);
		
		txtPassSign = new JPasswordField();
		txtPassSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtPassSign.setColumns(10);
		((JPasswordField) txtPassSign).setEchoChar('*');
		txtPassSign.setBounds(622, 518, 351, 64);
		pnlSignUpPage.add(txtPassSign);
		
		lblRewritePass = new JLabel("Re-write Pass:");
		lblRewritePass.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblRewritePass.setBounds(372, 607, 367, 84);
		pnlSignUpPage.add(lblRewritePass);
		
		txtPassSign2 = new JPasswordField();
		txtPassSign2.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtPassSign2.setColumns(10);
		((JPasswordField) txtPassSign2).setEchoChar('*');
		txtPassSign2.setBounds(748, 619, 225, 59);
		pnlSignUpPage.add(txtPassSign2);
		
		lblEmailSign = new JLabel("Email:");
		lblEmailSign.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblEmailSign.setBounds(372, 703, 156, 84);
		pnlSignUpPage.add(lblEmailSign);
		
		txtEmailSign = new JTextField();
		txtEmailSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtEmailSign.setColumns(10);
		txtEmailSign.setBounds(534, 716, 440, 59);
		pnlSignUpPage.add(txtEmailSign);
		
		lblCitySign = new JLabel("City:");
		lblCitySign.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblCitySign.setBounds(372, 809, 126, 84);
		pnlSignUpPage.add(lblCitySign);
		
		txtCitySign = new JTextField();
		txtCitySign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtCitySign.setColumns(10);
		txtCitySign.setBounds(504, 822, 185, 59);
		pnlSignUpPage.add(txtCitySign);
		
		JComboBox<?> cBoxState = new JComboBox<>();
		cBoxState.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		cBoxState.setModel(new DefaultComboBoxModel(new String[] {"WI"}));
		cBoxState.setBounds(885, 822, 89, 59);
		pnlSignUpPage.add(cBoxState);
		
		JLabel lblStateSign = new JLabel("State:");
		lblStateSign.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblStateSign.setBounds(710, 809, 163, 84);
		pnlSignUpPage.add(lblStateSign);
		
		lblStreet = new JLabel("Street:");
		lblStreet.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblStreet.setBounds(372, 919, 185, 84);
		pnlSignUpPage.add(lblStreet);
		
		txtStreetSign = new JTextField();
		txtStreetSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtStreetSign.setColumns(10);
		txtStreetSign.setBounds(561, 929, 414, 59);
		pnlSignUpPage.add(txtStreetSign);
		
		JLabel lblFirst = new JLabel("First Name:");
		lblFirst.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblFirst.setBounds(1005, 422, 315, 84);
		pnlSignUpPage.add(lblFirst);
		
		txtFirstSign = new JTextField();
		txtFirstSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtFirstSign.setColumns(10);
		txtFirstSign.setBounds(1305, 432, 288, 59);
		pnlSignUpPage.add(txtFirstSign);
		
		lblLast = new JLabel("Last Name:");
		lblLast.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblLast.setBounds(1005, 553, 315, 84);
		pnlSignUpPage.add(lblLast);
		
		txtLastSign = new JTextField();
		txtLastSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtLastSign.setColumns(10);
		txtLastSign.setBounds(1306, 560, 288, 59);
		pnlSignUpPage.add(txtLastSign);
		
		lblPhone = new JLabel("Phone #:");
		lblPhone.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblPhone.setBounds(1005, 691, 225, 84);
		pnlSignUpPage.add(lblPhone);
		
		txtPhoneSign = new JTextField();
		txtPhoneSign.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		txtPhoneSign.setColumns(10);
		txtPhoneSign.setBounds(1240, 702, 354, 59);
		pnlSignUpPage.add(txtPhoneSign);
		
		JLabel lblBackgroundSign = new JLabel("");
		lblBackgroundSign.setBounds(0, 0, 2000, 1103);
		lblBackgroundSign.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		pnlSignUpPage.add(lblBackgroundSign);
		
		// Login Page Panel 
		pnlLoginPage = new JPanel();
		pnlLoginPage.setVisible(false);
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
		
		lblUserError = new JLabel("");
		lblUserError.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblUserError.setBounds(311, 145, 383, 64);
		pnlSubmit.add(lblUserError);
		
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
		
		lblPassError = new JLabel("");
		lblPassError.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPassError.setBounds(311, 282, 383, 64);
		pnlSubmit.add(lblPassError);
		
		// Setting txtPassword Name/Font/Bounds
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		txtPassword.setColumns(10);
		((JPasswordField) txtPassword).setEchoChar('*');
		txtPassword.setBounds(311, 214, 383, 64);
		
		pnlSubmit.add(txtPassword);
		
		// Setting btnLoginS Foreground/Background
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(204, 0, 0));
		btnLogin.setBackground(new Color(250, 240, 230));
		btnLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		btnLogin.setBounds(274, 353, 223, 74);
		
		// Adding Button to Panel
		pnlSubmit.add(btnLogin);
		
	    // Setting btnSignup Foreground/Background/Font
		btnGuest = new JButton("GUEST");
		
		btnGuest.setForeground(new Color(204, 0, 0));
		btnGuest.setBackground(new Color(250, 240, 230));
		btnGuest.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnGuest.setBounds(196, 439, 121, 34);
		
		// Adding btnSignUp to pnlSubmit
		pnlSubmit.add(btnGuest);
		
		btnSignUp = new JButton("SIGN UP");
		
				btnSignUp.setForeground(new Color(204, 0, 0));
				btnSignUp.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				btnSignUp.setBackground(new Color(250, 240, 230));
				btnSignUp.setBounds(444, 439, 121, 34);
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
		pnlMenuPage2.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlMenuPage2);
		pnlMenuPage2.setLayout(null);

		lblBackgroundMenu2 = new JLabel("");
		lblBackgroundMenu2.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundMenu2.setVisible(false);
		lblBackgroundMenu2.setBounds(-8, 0, 2000, 1103);
		pnlMenuPage2.add(lblBackgroundMenu2);
		
		pnlCat2 = new JPanel();
		pnlCat2.setBounds(0, 0, 1297, 779);
		pnlMenuPage2.add(pnlCat2);
		pnlCat2.setLayout(null);
				
		lblBackgroundCat = new JLabel("");
		lblBackgroundCat.setBounds(0, 0, 1297, 779);
		pnlCat2.add(lblBackgroundCat);

		// Setting Visibility/Bounds 
		JPanel pnlSelectDetails = new JPanel();
		pnlSelectDetails.setVisible(false);
		pnlSelectDetails.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlSelectDetails);
		pnlSelectDetails.setLayout(null);

		// Setting Icon/Background
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuCat_Final.png")));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(-8, 0, 2000, 1103);
		pnlSelectDetails.add(label);

		// Setting panel Bounds and Adding it to the content pane
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setVisible(false);
		
		pnlAccountPage = new JPanel();
		pnlAccountPage.setVisible(false);
		pnlAccountPage.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlAccountPage);
		pnlAccountPage.setLayout(null);
		
		pnlCat3 = new JPanel();
		pnlCat3.setBounds(322, 262, 1297, 779);
		pnlCat3.setLayout(null);
		pnlAccountPage.add(pnlCat3);
		
		JLabel lblUser = new JLabel("USER:");
		lblUser.setBounds(30, 43, 157, 117);
		pnlCat3.add(lblUser);
		lblUser.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		lblUserAnswer = new JLabel("");
		lblUserAnswer.setBounds(199, 43, 593, 106);
		pnlCat3.add(lblUserAnswer);
		lblUserAnswer.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
		
		lblBackgroundCat2 = new JLabel("");
		lblBackgroundCat2.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuInside_Final.png")));
		lblBackgroundCat2.setBounds(0, 0, 1297, 779);
		pnlCat3.add(lblBackgroundCat2);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(-8, 0, 2000, 1103);
		lblBackground.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		pnlAccountPage.add(lblBackground);
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

		// Menu Page Panel
		pnlMenuPage = new JPanel();
		pnlMenuPage.setVisible(false);

		JPanel pnlPayment = new JPanel();
		pnlPayment.setVisible(false);
		pnlPayment.setLayout(null);
		pnlPayment.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlPayment);

		JLabel lblPaymentBackground = new JLabel("");
		lblPaymentBackground.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		lblPaymentBackground.setBounds(-8, 0, 2000, 1103);
		pnlPayment.add(lblPaymentBackground);
		pnlMenuPage.setBounds(0, -11, 1914, 1091);
		pnlMenuPage.setLayout(null);

		// Adding Panel to the Content Pane
		contentPane.add(pnlMenuPage);

		// Category Panel
		pnlCat = new JPanel();
		pnlCat.setBackground(new Color(165, 42, 42));
		pnlCat.setBounds(322, 262, 1297, 779);
		pnlCat.setLayout(null);

		// Adding Panel to the Content Pane
		pnlMenuPage.add(pnlCat);

		// Setting Label Bounds/Name/Source 
		//JLabel label_1 = new JLabel("");
		//label_1.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/MenuInside_Final.png")));
		//label_1.setBounds(0, 0, 1297, 779);
		//pnlCat.add(label_1);

		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu = new JLabel("");
		lblBackgroundMenu.setBounds(-8, 0, 2000, 1103);
		lblBackgroundMenu.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundMenu.setBackground(new Color(250, 240, 230));
		pnlMenuPage.add(lblBackgroundMenu);

		JPanel pnlConfirm = new JPanel();
		pnlConfirm.setVisible(false);
		pnlConfirm.setBounds(0, -11, 1914, 1091);
		contentPane.add(pnlConfirm);
		pnlConfirm.setLayout(null);

		JLabel lblBackgroundConfirm = new JLabel("");
		lblBackgroundConfirm.setBounds(-8, 0, 2000, 1103);
		lblBackgroundConfirm.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Login_Final.png")));
		pnlConfirm.add(lblBackgroundConfirm);
	}

	////////////////////////////////////////////////////////////////////
	///// This Method contains all of the code for creating Events 
	////////////////////////////////////////////////////////////////////
	

	
	private void createEvents() 
	{				
		// This Event exists on pnlExit
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// Closes down the Program
				System.out.println("Exit is Pressed");
				System.exit(0);

			}
		});
		


		// This Event exists on the pnlTabs
		btnAccount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				pnlAccountPage.setVisible(true);
				pnlSignUpPage.setVisible(false);
				
				String Name = txtUserName.getText(); 
				lblUserAnswer.setText(Name); 
			}
		});

		// This Event exists on the pnlTabs
		btnMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(true);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				pnlAccountPage.setVisible(false);
				pnlSignUpPage.setVisible(false);
			}
		});

		// This Event exists on the pnlTabs
		btnShopping.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Altering Panels so the correct ones show
				pnlTabs.setVisible(true);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(false);
				pnlShoppingPage.setVisible(false);
				pnlShoppingPage.setVisible(true);
				pnlAccountPage.setVisible(false);
				pnlSignUpPage.setVisible(false);
			}
		});
		
		btnHome.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pnlTabs.setVisible(false);
				pnlMenuPage.setVisible(false);
				pnlLoginPage.setVisible(true);
				pnlShoppingPage.setVisible(false);
				pnlAccountPage.setVisible(false);
				pnlSignUpPage.setVisible(false);
				txtUserName.setText("");
				txtPassword.setText("");
				lblUserError.setText("");
				lblPassError.setText("");
			}
		});
		

	}
}