package view;
import model.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.PizzaPlanet;
import model.User;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AcountPage extends PPanel {

	private JPanel pnlAccountPage;
	private JLabel lblBackground;
	private JTextField txtUserName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipCode;
	private JTextField txtPhone;
	private JLabel lblUserNameLabel;
	private JLabel lblFirstNameLabel;

	public AcountPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp, exit, nav);
		
		add(exit);
		add(nav);
		
		User currentUser = 	new User();
		
		if (pp.getUser() != null)
		{
			currentUser = pp.getUser();
			System.out.println(currentUser.getFirstName());
		}
		else
		{
			System.out.println(currentUser.getFirstName() + " "+ " maybe nothing.");
			currentUser = new User("","","","","","","","","","","");
		}
		
		pnlAccountPage = new JPanel();
		pnlAccountPage.setVisible(true);
		pnlAccountPage.setBounds(0, -11, 1914, 1091);
		add(pnlAccountPage);
		pnlAccountPage.setLayout(null);
		//pnlAccountPage.setLayout(null);
		
		lblUserNameLabel = new JLabel("User Name: ");
		lblUserNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblUserNameLabel.setBounds(374, 306, 343, 65);
		pnlAccountPage.add(lblUserNameLabel);
		
		lblFirstNameLabel = new JLabel("First Name:");
		lblFirstNameLabel.setBounds(374, 388, 290, 53);
		lblFirstNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		pnlAccountPage.add(lblFirstNameLabel);
		
		JLabel lblLastNameLabel = new JLabel("Last Name:");
		lblLastNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblLastNameLabel.setBounds(374, 457, 264, 79);
		pnlAccountPage.add(lblLastNameLabel);
		
		JLabel lblEmailLabel = new JLabel("Email:");
		lblEmailLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblEmailLabel.setBounds(374, 547, 225, 71);
		pnlAccountPage.add(lblEmailLabel);
		
		JLabel lblNewLabel = new JLabel("Address:");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(374, 629, 209, 53);
		pnlAccountPage.add(lblNewLabel);
		
		JLabel lblCityLabel = new JLabel("City: ");
		lblCityLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblCityLabel.setBounds(374, 707, 155, 65);
		pnlAccountPage.add(lblCityLabel);
		
		JLabel lblStateLabel = new JLabel("State:");
		lblStateLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblStateLabel.setBounds(374, 783, 196, 65);
		pnlAccountPage.add(lblStateLabel);
		
		JLabel lblPhoneLabel = new JLabel("Phone Number:");
		lblPhoneLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblPhoneLabel.setBounds(374, 859, 350, 53);
		pnlAccountPage.add(lblPhoneLabel);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtUserName.setBounds(672, 306, 363, 59);
		txtUserName.setText(currentUser.getUserName());
		pnlAccountPage.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtFirstName.setBounds(672, 382, 363, 65);
		txtFirstName.setText(currentUser.getFirstName());
		pnlAccountPage.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtLastName.setBounds(672, 467, 363, 59);
		txtLastName.setText(currentUser.getLastName());
		pnlAccountPage.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtEmail.setBounds(533, 550, 363, 65);
		txtEmail.setText(currentUser.getEmailAddress());
		pnlAccountPage.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtAddress.setBounds(593, 620, 343, 71);
		txtAddress.setText(currentUser.getStreet());
		pnlAccountPage.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtCity.setBounds(499, 701, 324, 71);
		txtCity.setText(currentUser.getCity());
		pnlAccountPage.add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtState.setBounds(533, 780, 350, 70);
		txtState.setText(currentUser.getState());
		pnlAccountPage.add(txtState);
		txtState.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtPhone.setBounds(725, 853, 363, 65);
		txtPhone.setText(currentUser.getPhone());
		pnlAccountPage.add(txtPhone);
		txtPhone.setColumns(10);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 2000, 1103);
		lblBackground.setIcon(new ImageIcon(AcountPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackground.setBackground(new Color(250, 240, 230));
		
		pnlAccountPage.add(lblBackground);
		
		setLayout(null);

		
		
		
		
	}
}
