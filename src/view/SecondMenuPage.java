package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class SecondMenuPage extends PPanel {

	private JPanel pnlMenuPage2;
	private JPanel pnlCat;
	private JLabel lblBackgroundMenu2;

	public SecondMenuPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp);

		add(exit);
		add(nav);
		
		pnlMenuPage2 = new JPanel();
		pnlMenuPage2.setBounds(0, 0, 1914, 1091);
		pnlMenuPage2.setLayout(null);
		
		// Adding Panel to the Content Pane
		add(pnlMenuPage2);

		// Category Panel
		pnlCat = new JPanel();
		pnlCat.setBackground(new Color(165, 42, 42));
		pnlCat.setBounds(322, 262, 1297, 779);
		pnlCat.setLayout(null);
		add(pnlCat);
		
		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu2 = new JLabel("");
		lblBackgroundMenu2.setBounds(0, -11, 2000, 1103);
		lblBackgroundMenu2.setIcon(new ImageIcon(SecondMenuPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundMenu2.setBackground(new Color(250, 240, 230));
		pnlMenuPage2.add(lblBackgroundMenu2);
		
		// Adding Panel to the Content Pane
		pnlMenuPage2.add(pnlCat);
		
		setLayout(null);
		
	}

}
