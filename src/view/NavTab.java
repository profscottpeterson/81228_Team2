package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class NavTab extends JPanel{

	private JButton btnShopping;
	private JButton btnMenu;
	private JButton btnAccount;
	private JButton btnHome;
	
	public NavTab(){
		
		this.setBackground(new Color(250, 240, 230));
		this.setBounds(1359, 6, 531, 101);
		//this.setLayout(null);
		
		
		// Shopping Cart Button (Top Right of the UI)
		btnShopping = new JButton("New button");
		btnShopping.setIcon(new ImageIcon(NavTab.class.getResource("/Resources/Shopping Cart.jpg")));
		btnShopping.setBounds(409, 6, 104, 89);
		// Adding the Button to the Panel
		add(btnShopping);

		// Menu Button (Top Right of the UI)
		btnMenu = new JButton("New button");
		btnMenu.setIcon(new ImageIcon(NavTab.class.getResource("/Resources/Menu.png")));
		btnMenu.setBounds(268, 6, 104, 89);

		// Adding the Button to the Panel
		add(btnMenu);
		
		// Account Button (Top Right of the UI)
		btnAccount = new JButton("New button");
		btnAccount.setIcon(new ImageIcon(NavTab.class.getResource("/Resources/Account.png")));
		btnAccount.setBounds(138, 6, 104, 89);

		// Adding the Button to the Panel
		add(btnAccount);
				
		btnHome = new JButton("New button");
		btnHome.setIcon(new ImageIcon(NavTab.class.getResource("/Resources/Home.png")));
		btnHome.setBounds(14, 6, 104, 89);
		add(btnHome);
		
		Event();
		setLayout(null);
	}
	
	public void Event(){
		
		btnAccount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Connect to Acount Page
				PizzaPlanet.displayAccountPage();
			}
		});
		
		btnMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Connect to Menu Page
			}
		});
		
		btnShopping.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Connect to Shopping Page
				PizzaPlanet.displayShoppingPage();
			}
		});
		
		btnHome.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PizzaPlanet.displyUserPage();
			}
		});
	}
	
}
