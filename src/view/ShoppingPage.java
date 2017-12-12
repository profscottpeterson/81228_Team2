package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MenuItem;
import model.Order;
import model.Payment;
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class ShoppingPage extends PPanel {

	private JPanel pnlShoppingPage;
	private JLabel lblBackgroundShop;
	private JButton btnDelete; 
	private JButton btnSubmit;
	private int foodIndex = -1;
	private JPanel pnlCat;

	public ShoppingPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp);

		add(exit);
		add(nav);
		btnDelete = new JButton("CLEAR");
		btnSubmit = new JButton("Submit");
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setVisible(true);
		
		pnlShoppingPage.setBounds(0, 0, 1914, 1091);
		add(pnlShoppingPage);
		pnlShoppingPage.setLayout(null);

		btnDelete.setForeground(new Color(204, 0, 0));
		btnDelete.setBackground(PStyle.primaryButtonColor);
		btnDelete.setFont(PStyle.primaryFontStyle);
		btnDelete.setBounds(1687, 800, 200, 74);
		add(btnDelete);
		AddEventsToDeleteButton();
		
		btnSubmit.setForeground(new Color(204, 0, 0));
		btnSubmit.setBackground(PStyle.primaryButtonColor);
		btnSubmit.setFont(PStyle.primaryFontStyle);
		btnSubmit.setBounds(1687, 500, 200, 74);
		add(btnSubmit);
		AddEventsToSubmitButton();
		
		pnlCat = new JPanel();
		pnlCat.setBackground(new Color(165, 42, 42));
		pnlCat.setBounds(322, 252, 1297, 779);
		pnlCat.setLayout(null);
		add(pnlCat);		
		setLayout(null);	
		// Setting Background/bounds/Icon
		lblBackgroundShop = new JLabel("");
		lblBackgroundShop.setBounds(0, -11, 2000, 1103);
		lblBackgroundShop.setIcon(new ImageIcon(ShoppingPage.class.getResource("/Resources/Menu_Final.png")));
		pnlShoppingPage.add(lblBackgroundShop);	
			
	}
	
	public void repaintCart(){
		List<JButton> buttonList = new ArrayList<>();
		System.out.println("THIS IS BEING REPAINTED");
		pnlShoppingPage.invalidate();
//		pnlShippingPage.revalidate();
		pnlShoppingPage.repaint();
		for (MenuItem menuItem : pp.getOrder().getOrderItems())
		{				
			int index = pp.getOrder().getOrderItems().indexOf(menuItem);
			double iPrice = menuItem.getPrice();
			DecimalFormat money = new DecimalFormat ("$0.00");
			String id = menuItem.getName() +"   "+money.format(iPrice);			
			//System.out.println(menuItem.getName());
			JButton btn = new JButton(id);
			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{	
					//menu.getFullMenu().get(index);
					
					//pnlMenuPage2.remove(pnlShoppingPage);
					
					pnlShoppingPage = new JPanel();
					pnlShoppingPage.setBackground(new Color(165, 42, 42));
					pnlShoppingPage.setBounds(980, 248, 647, 781);
					pnlShoppingPage.setLayout(null);
					
					//pnlMenuPage2.add(pnlShoppingPage);
					
				
					foodIndex = index;
					
										
				}
			});
			buttonList.add(btn);
		}	
		placeButtons(buttonList);
		pnlShoppingPage.repaint();
		
	}
	public void placeButtons(List<JButton> buttons)
	{

		int y = 40;

		for (int i = 0; i < buttons.size(); ++i)
		{
			
			JButton button = buttons.get(i);

			button.setBounds(50, y, 500, 100);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
			button.setForeground(new Color(204, 0, 0));
			button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			pnlCat.add(button);

			y = y + 120;

		}
	}
	
	public void AddEventsToDeleteButton() {

		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				pp.resetOrder();
				pp.displayFirstMenu();
			}//actionPerformed
		});//addActionListner	
	}//AddEvents
	
	public void AddEventsToSubmitButton() {

		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				{
					double price = 0;
					
					Order o = pp.getOrder();
					Payment.CreateOrder(Integer.parseInt(pp.getUser().getUserId()),o.getSubtotal(), pp.getOrder());
					pp.displayConfirmation(o);
				}
				pnlShoppingPage.repaint();
			}//actionPerformed
		});//addActionListner	
	}//AddEvents
	

}
