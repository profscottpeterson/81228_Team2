package view;
import model.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
	private JTextField txtPhone;
	private JLabel lblUserNameLabel;
	private JLabel lblFirstNameLabel;
	private JLabel lblSubmitLabel;
	protected User currentUser = new User();
	
	public AcountPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {

		super(pp, exit, nav);
		
		add(exit);
		add(nav);	
		
    
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
		
		JButton btnSubmit = new JButton("Submit Changes");
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		btnSubmit.setBounds(1156, 863, 430, 146);
		pnlAccountPage.add(btnSubmit);
		
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
		lblNewLabel.setBounds(374, 643, 209, 53);
		pnlAccountPage.add(lblNewLabel);
		
		JLabel lblCityLabel = new JLabel("City: ");
		lblCityLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblCityLabel.setBounds(1081, 306, 155, 65);
		pnlAccountPage.add(lblCityLabel);
		
		JLabel lblStateLabel = new JLabel("State:");
		lblStateLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblStateLabel.setBounds(1081, 388, 155, 65);
		pnlAccountPage.add(lblStateLabel);
		
		JLabel lblPhoneLabel = new JLabel("Phone #:");
		lblPhoneLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblPhoneLabel.setBounds(374, 728, 218, 53);
		pnlAccountPage.add(lblPhoneLabel);
		
		txtUserName = new JTextField();
		txtUserName.setBackground(new Color(192, 192, 192));
		txtUserName.setEnabled(false);
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
		txtEmail.setBounds(533, 550, 502, 65);
		txtEmail.setText(currentUser.getEmailAddress());
		pnlAccountPage.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtAddress.setBounds(595, 634, 440, 71);
		txtAddress.setText(currentUser.getStreet());
		pnlAccountPage.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtCity.setBounds(1201, 303, 368, 71);
		txtCity.setText(currentUser.getCity());
		pnlAccountPage.add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtState.setBounds(1236, 379, 110, 70);
		txtState.setText(currentUser.getState());
		pnlAccountPage.add(txtState);
		txtState.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		txtPhone.setBounds(595, 722, 440, 65);
		txtPhone.setText(currentUser.getPhone());
		pnlAccountPage.add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblSubmitLabel = new JLabel("");
		lblSubmitLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblSubmitLabel.setBounds(1086, 536, 528, 236);
		pnlAccountPage.add(lblSubmitLabel);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 2000, 1103);
		lblBackground.setIcon(new ImageIcon(AcountPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackground.setBackground(new Color(250, 240, 230));
		
		pnlAccountPage.add(lblBackground);
		
		setLayout(null);

		btnSubmit.addActionListener(new ActionListener() 
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{				
				String fName = txtFirstName.getText(); 
				String lName = txtLastName.getText();
				String email = txtEmail.getText();
				String address = txtAddress.getText();
				String city = txtCity.getText();
				String state = txtState.getText();
				String pNum = txtPhone.getText();
				boolean flag = false;
				
				currentUser.setFirstName(fName);
				currentUser.setLastName(lName);
				currentUser.setEmailAddress(email);
				currentUser.setStreet(address);
				currentUser.setCity(city);
				currentUser.setState(state);
				currentUser.setPhone(pNum);
				
				String mySQL = "update Users set FName = \'" + currentUser.getFirstName() + "\',  LName = \'" + currentUser.getLastName() + "\', Email = \'" + currentUser.getEmailAddress() + "\', Address = \'" + currentUser.getStreet() + "\', "
						+ "City = \'" + currentUser.getCity() + "\', State = \'" + currentUser.getState() + "\', PhoneNum = \'" + currentUser.getPhone() + "\' where UserName = \'" + currentUser.getUserName() + "\'"; 
				flag = Api.UpdateUserInfo(mySQL);
				System.out.println(flag);
				if(flag == true) //we successfully update the user in the Database
				{
					lblSubmitLabel.setText("User Info Updated Successfully!");
					System.out.println("in true");
				}//if
				else //this is if we are unable to update the user for some reason. Reason is unknown at this time
				{
					lblSubmitLabel.setText("User Info was not Updated, Please contact system admin.");
					btnSubmit.setEnabled(flag);
					System.out.println("in false");
				}//else
			}
		});
	}
}
