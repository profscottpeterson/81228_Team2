package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class ShoppingPage extends PPanel {

	private JPanel pnlShoppingPage;
	private JLabel lblBackgroundShop;

	public ShoppingPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp);

		add(exit);
		add(nav);
		
		pnlShoppingPage = new JPanel();
		pnlShoppingPage.setVisible(false);
		
		pnlShoppingPage.setBounds(0, 0, 1914, 1091);
		add(pnlShoppingPage);
		pnlShoppingPage.setLayout(null);

		// Setting Background/bounds/Icon
		lblBackgroundShop = new JLabel("");
		lblBackgroundShop.setBounds(0, -11, 2000, 1103);
		lblBackgroundShop.setIcon(new ImageIcon(ShoppingPage.class.getResource("/Resources/MenuCat_Final.png")));
		lblBackgroundShop.setBackground(Color.LIGHT_GRAY);
		add(lblBackgroundShop);
		
		setLayout(null);
		
		
		
	}

}
