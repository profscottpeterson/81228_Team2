package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Order;
import model.Payment;
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class ConfirmationPage extends PPanel {
	private JPanel pnlShoppingPage;
	private JLabel lblThanks;
	private JLabel lblBackgroundShop;
	private JButton btnSubmit;
	private static DecimalFormat df = new DecimalFormat(".##");
	
	public ConfirmationPage(PizzaPlanet pp, ExitTab exit) {
		super(pp);
		add(exit);
		//add(nav);
		
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setVisible(true);
		pnlShoppingPage.setBounds(0, 0, 1914, 1091);
		pnlShoppingPage.setLayout(null);
		add(pnlShoppingPage);
		
		lblThanks = new JLabel("Thank you for your order! Your total is $" + df.format(pp.getOrder().getSubtotal()));
		lblThanks.setBounds(450, 400, 1600, 100);
		lblThanks.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		pnlShoppingPage.add(lblThanks);
		
		btnSubmit = new JButton("Finish Order");
		btnSubmit.setForeground(new Color(204, 0, 0));
		btnSubmit.setBackground(PStyle.primaryButtonColor);
		btnSubmit.setFont(PStyle.primaryFontStyle);
		btnSubmit.setBounds(700, 600, 500, 74);
		pnlShoppingPage.add(btnSubmit);		
		AddEventsToSubmitButton();	
		setLayout(null);
		
		lblBackgroundShop = new JLabel("");
		lblBackgroundShop.setBounds(0, -11, 2000, 1103);
		lblBackgroundShop.setIcon(new ImageIcon(ShoppingPage.class.getResource("/Resources/Menu_Final.png")));
		pnlShoppingPage.add(lblBackgroundShop);	
	}

	public void AddEventsToSubmitButton() {

		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				{
					pp.voidOrder();
				}
				
			}//actionPerformed
		});//addActionListner	
	}//AddEvents
	
	
}
