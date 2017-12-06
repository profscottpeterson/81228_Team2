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
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class ShoppingPage extends PPanel {

	private JPanel pnlShoppingPage;
	private JLabel lblBackgroundShop;
	private JButton btnDelete; 
	private int foodIndex = -1;
	private JPanel pnlCat1;

	public ShoppingPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp);

		add(exit);
		add(nav);
		
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setVisible(true);
		
		pnlShoppingPage.setBounds(0, 0, 1914, 1091);
		add(pnlShoppingPage);
		pnlShoppingPage.setLayout(null);
		
		pnlCat1 = new JPanel();
		pnlCat1.setBackground(new Color(165, 42, 42));
		pnlCat1.setBounds(322, 252, 1297, 779);
		pnlCat1.setLayout(null);
		add(pnlCat1);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setForeground(new Color(204, 0, 0));
		btnDelete.setBackground(PStyle.primaryButtonColor);
		btnDelete.setFont(PStyle.primaryFontStyle);
		btnDelete.setBounds(1687, 800, 200, 74);
		add(btnDelete);
		AddEventsToAddButton();
		
		setLayout(null);
			
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
		
		// Setting Background/bounds/Icon
		lblBackgroundShop = new JLabel("");
		lblBackgroundShop.setBounds(0, -11, 2000, 1103);
		lblBackgroundShop.setIcon(new ImageIcon(ShoppingPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundShop.setBackground(Color.LIGHT_GRAY);
		pnlShoppingPage.add(lblBackgroundShop);
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
			pnlCat1.add(button);

			y = y + 120;

		}
	}
	
	public void AddEventsToAddButton() {

		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pnlShoppingPage.invalidate();
				if (foodIndex != -1){
					pp.getOrder().removeItem(foodIndex);
					btnDelete.revalidate();
				}
				pnlShoppingPage.repaint();
			}//actionPerformed
		});//addActionListner	
		
	}//AddEvents
}
