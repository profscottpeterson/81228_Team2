package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Menu;
import model.MenuItem;
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class SecondMenuPage extends PPanel {

	private JPanel pnlMenuPage2;
	private JPanel pnlCat1;
	private JLabel lblBackgroundMenu2;
	private JPanel pnlCat2;

	public SecondMenuPage(PizzaPlanet pp, ExitTab exit, Menu menu, NavTab nav) {
		super(pp, exit, nav);

		//add(exit);
		//add(nav);
		
		//System.out.println(menu.getFullMenu().get(0).getName());
		
		pnlMenuPage2 = new JPanel();
		pnlMenuPage2.setBounds(0, 0, 1914, 1091);
		pnlMenuPage2.setLayout(null);
		
		// Adding Panel to the Content Pane
		add(pnlMenuPage2);

		// Category Panel
		pnlCat1 = new JPanel();
		pnlCat1.setBackground(new Color(165, 42, 42));
		pnlCat1.setBounds(322, 262, 697, 779);
		pnlCat1.setLayout(null);
		add(pnlCat1);
		
		pnlCat2 = new JPanel();
		pnlCat2.setBackground(new Color(165, 42, 42));
		pnlCat2.setBounds(1022, 262, 697, 779);
		pnlCat2.setLayout(null);
		add(pnlCat2);
		
		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu2 = new JLabel("");
		lblBackgroundMenu2.setBounds(0, -11, 2000, 1103);
		lblBackgroundMenu2.setIcon(new ImageIcon(SecondMenuPage.class.getResource("/Resources/MenuCat_Final.png")));
		lblBackgroundMenu2.setBackground(new Color(250, 240, 230));
		pnlMenuPage2.add(lblBackgroundMenu2);
		
		// Adding Panel to the Content Pane
		pnlMenuPage2.add(pnlCat1);
		pnlMenuPage2.add(pnlCat2);
		
		setLayout(null);
		
		List<JButton> buttonList = new ArrayList<>();

		ArrayList<MenuItem> FullMenu = menu.getFullMenu();
		
		for (MenuItem menuItem : FullMenu)
		//menu.getFullMenu().forEach((menuItem) ->
		{
			String id = menuItem.getName();
			//System.out.println(menuItem.getName());
			JButton btn = new JButton(id);

			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					
				}
			});
			buttonList.add(btn); 

		};
		placeButtons(buttonList);
		
	}
	
	public void placeButtons(List<JButton> buttons)
	{

		int y = 40;

		for (int i = 0; i < buttons.size(); ++i)
		{
			JButton button = buttons.get(i);

			button.setBounds(50, y, 500, 100);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			button.setForeground(new Color(204, 0, 0));
			button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			pnlCat1.add(button);

			y = y + 120;

		}
	}
	
	public void updateIngredients(){
		
	}

}
