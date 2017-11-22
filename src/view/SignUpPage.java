package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.PizzaPlanet;
import model.User;

@SuppressWarnings("serial")
public class SignUpPage extends PPanel {

	JLabel lblUsername;
	JLabel lblNewLabel;
	JButton btnSignUpSign;
	JLabel lblNewLabel_1;
	private JTextField txtUserSign;
	JLabel lblPassword2;
	private JPasswordField txtPassSign;
	JLabel lblRewritePass;
	private JPasswordField txtPassSign2;
	private JLabel lblEmailSign;
	private JTextField txtEmailSign;
	private JLabel lblCitySign;
	private JTextField txtCitySign;
	@SuppressWarnings("rawtypes")
	JComboBox cBoxState;
	private JLabel lblStateSign;
	private JLabel lblStreet;
	private JTextField txtStreetSign;
	private JLabel lblFirst;
	private JTextField txtFirstSign;
	private JLabel lblLast;
	private JTextField txtLastSign;
	private JLabel lblPhone;
	private JTextField txtPhoneSign;
	private JLabel lblBackgroundSign;
	JPanel pnlSignUpPage;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public SignUpPage(PizzaPlanet pp, ExitTab exit, NavTab nav){
		super(pp);
		
		add(exit);
		add(nav);

		pnlSignUpPage = new JPanel();
		pnlSignUpPage.setBounds(0, -11, 1914, 1091);
		pnlSignUpPage.setLayout(null);
		add(pnlSignUpPage);

		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblUsername.setBounds(372, 422, 266, 84);
		pnlSignUpPage.add(lblUsername);

		lblNewLabel = new JLabel("------------------------------------------------------");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(372, 371, 1222, 59);
		pnlSignUpPage.add(lblNewLabel);

		btnSignUpSign = new JButton("LOGIN");

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

		cBoxState = new JComboBox<>();
		cBoxState.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		cBoxState.setModel(new DefaultComboBoxModel(new String[] {"WI"}));
		cBoxState.setBounds(885, 822, 89, 59);
		pnlSignUpPage.add(cBoxState);

		lblStateSign = new JLabel("State:");
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

		lblFirst = new JLabel("First Name:");
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

		lblBackgroundSign = new JLabel("");
		lblBackgroundSign.setBounds(0, 0, 2000, 1103);
		lblBackgroundSign.setIcon(new ImageIcon(SignUpPage.class.getResource("/Resources/Menu_Final.png")));
		pnlSignUpPage.add(lblBackgroundSign);

		addEvent();
		setLayout(null);
	}

	public void addEvent(){

		btnSignUpSign.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				validateUserSign();
			}

		});

	}

	@SuppressWarnings("deprecation")
	public void validateUserSign(){


		String[] creds = new String[9];	

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

										//
										User u = new User(creds[0], "C", creds[6] , creds[7], creds[2], creds[5], creds[3], creds[4], "54304", null, creds[8], creds[1]);
											// no message needs to be diplayed			
											pp.apiValidateUser(u, true);

									}
								}
							}
						}
					}
				}
			}
		}
	}
}

