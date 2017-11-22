package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import model.PizzaPlanet;
import model.User;
import view.PStyle;

@SuppressWarnings("serial")
public class UserPage extends PPanel {

	JButton btnGuest;
	JPanel pnlSubmit;
	JButton btnLogin;
	JButton btnSignUp;
	JLabel lblSubmit;
	private JTextField txtUserName;
	private JLabel lblUserError;
	private JLabel lblPassError;
	private JPasswordField txtPassword;
	private JPanel pnlLoginPage;
	
	public UserPage(PizzaPlanet pp, ExitTab exit){
		super(pp);		
		
		add(exit);
		
		// Login Page Panel 
		pnlLoginPage = new JPanel();
		pnlLoginPage.setVisible(false);
		pnlLoginPage.setBounds(0, 0, 1914, 1091);
		add(pnlLoginPage);
		pnlLoginPage.setLayout(null);
		
		// Setting pnlSubmit Background/Border/Color/Bounds
		pnlSubmit = new JPanel();
		pnlSubmit.setBackground(new Color(0, 0, 0));
		pnlSubmit.setOpaque(true);
		pnlSubmit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		pnlSubmit.setBounds(560, 460, 750, 494);
		pnlSubmit.setLayout(null);
		
		// Adding Submit Panel to the Login Page
	    add(pnlSubmit);
	    
	    // Setting btnSignup Foreground/Background/Font
		btnGuest = new JButton("GUEST");
		
		btnGuest.setForeground(new Color(204, 0, 0));
		btnGuest.setBackground(PStyle.primaryButtonColor);
		btnGuest.setFont(PStyle.secondaryFontStyle);
		btnGuest.setBounds(196, 439, 121, 34);
		
		// Adding btnSignUp to pnlSubmit
		pnlSubmit.add(btnGuest);
		
		// Setting btnLoginS Foreground/Background
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(204, 0, 0));
		btnLogin.setBackground(PStyle.primaryButtonColor);
		btnLogin.setFont(PStyle.primaryFontStyle);
		btnLogin.setBounds(274, 353, 223, 74);
		
		btnSignUp = new JButton("SIGN");
		
		btnSignUp.setForeground(new Color(204, 0, 0));
		btnSignUp.setFont(PStyle.secondaryFontStyle);
		btnSignUp.setBackground(PStyle.primaryButtonColor);
		btnSignUp.setBounds(444, 439, 121, 34);
		pnlSubmit.add(btnSignUp);
		
		// Adding Button to Panel
		pnlSubmit.add(btnLogin);
		
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
		
		// Setting lblSumbit Bounds/Icon/Name
		lblSubmit = new JLabel("");
		lblSubmit.setBounds(6, 6, 738, 482);
		lblSubmit.setIcon(new ImageIcon(UserPage.class.getResource("/Resources/Submit.jpg")));
		
		// Adding Lbl to Panel
		pnlSubmit.add(lblSubmit);
		
		// Setting lblBackgroundLogin Bounds/Icon/Name
		JLabel lblBackgroundLogin = new JLabel("");
		lblBackgroundLogin.setBounds(0, -11, 2000, 1103);
		lblBackgroundLogin.setIcon(new ImageIcon(UserPage.class.getResource("/Resources/Login_Final.png")));
		
		// Adding Label to panel
		add(lblBackgroundLogin);
		
		AddEvent();
		setLayout(null);
	}
	
	public void AddEvent(){
		
		// EVENT: When User clicks a button, call 		
		// controller.handleUserClick("","") if GUEST						
		btnGuest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				@SuppressWarnings("unused")
				User user = null;

				//[username. password]
				pp.apiValidateUser(null, false);
			}
		});
		

		btnLogin.addActionListener(new ActionListener() 
		{		
					
			public void actionPerformed(ActionEvent e) 
			{		
				validateUserPass();
				pp.apiValidateUser(null, false);
			}
		});
		
		btnSignUp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				pp.apiValidateUser(null, true);
			}
		});
	}
	
	public void validateUserPass(){
		
		String username = txtUserName.getText();
		@SuppressWarnings("deprecation")
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
						pp.apiValidateUser(user, false);
					}
				}
			}
		}
	}
}
