package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Ingredient;
import model.Menu;
import model.MenuItem;
import model.PizzaPlanet;

@SuppressWarnings("serial")
public class SecondMenuPage extends PPanel {

	private JPanel pnlMenuPage2;
	private JPanel pnlCat1;
	private JLabel lblBackgroundMenu2;
	private JPanel pnlCat2;
	private JLabel lblBack;
	private JLabel lblBack2;
	ArrayList<MenuItem> FullMenu;

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
		pnlCat1.setBounds(322, 252, 627, 779);
		pnlCat1.setLayout(null);
		add(pnlCat1);

		pnlCat2 = new JPanel();
		pnlCat2.setBackground(new Color(165, 42, 42));
		pnlCat2.setBounds(980, 248, 647, 781);
		pnlCat2.setLayout(null);
		add(pnlCat2);
		
		// Adding Panel to the Content Pane
		pnlMenuPage2.add(pnlCat1);
		pnlMenuPage2.add(pnlCat2);
		
		setLayout(null);
		
		//Left List for pizzas
		List<JButton> buttonList = new ArrayList<>();

		
		FullMenu = menu.getFullMenu();
		for (MenuItem menuItem : FullMenu)
		//menu.getFullMenu().forEach((menuItem) ->	
		{
			int index = FullMenu.indexOf(menuItem);
			String id = menuItem.getName();
			//System.out.println(menuItem.getName());
			JButton btn = new JButton(id);

			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{	
					//menu.getFullMenu().get(index);
					pnlCat2.invalidate();
					pnlMenuPage2.remove(pnlCat2);
					
					pnlCat2 = new JPanel();
					pnlCat2.setBackground(new Color(165, 42, 42));
					pnlCat2.setBounds(980, 248, 647, 781);
					pnlCat2.setLayout(null);
					
					pnlMenuPage2.add(pnlCat2);
					populateIng(index);
					
					btn.revalidate();
					pnlCat2.repaint();

				}
			});
			buttonList.add(btn); 

		};
		
		placeButtons(buttonList);
		//populateIng(0);
		
		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu2 = new JLabel("");
		lblBackgroundMenu2.setBounds(0, -11, 2000, 1103);
		lblBackgroundMenu2.setIcon(new ImageIcon(SecondMenuPage.class.getResource("/Resources/MenuCat_Final.png")));
		lblBackgroundMenu2.setBackground(new Color(250, 240, 230));
		pnlMenuPage2.add(lblBackgroundMenu2);
		
		lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 627, 779);
		lblBack.setIcon(new ImageIcon(SecondMenuPage.class.getResource("/Resources/MenuInside_Final.png")));
		pnlCat1.add(lblBack);
		
	}
	
	public void populateIng(int index) {
		
		MenuItem menuIndex = FullMenu.get(index);
		int y = 40;
		for(Ingredient ingItem : menuIndex.getItemIngred()){
			JPanel ingPanel = new JPanel();
			//pnlCat2 is where these are getting added
			
			String id = ingItem.getName();
			
			JCheckBox button = new JCheckBox(id);
			button.setBounds(0, 0, 500, 100);
			button.setAlignmentX(LEFT_ALIGNMENT);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			button.setForeground(new Color(204, 0, 0));
			//button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			ingPanel.setBounds(0, y, 500, 100);
			ingPanel.add(button);
			ingPanel.setBackground(new Color(165, 42, 42));
			ingPanel.setAlignmentX(LEFT_ALIGNMENT);
			pnlCat2.setAlignmentX(LEFT_ALIGNMENT);
			pnlCat2.add(ingPanel);
			
			y = y + 100;
				
		};
		pnlCat2.revalidate();
		

		
		//lblBack2 = new JLabel("");
		//lblBack2.setBounds(-650, 0, 2007, 779);
		//lblBack2.setIcon(new ImageIcon(SecondMenuPage.class.getResource("/Resources/MenuInside_Final.png")));
		//pnlCat2.add(lblBack2);
	}
	
	public void placeIngredients(List<JCheckBox> check){
		
		int y = 40;
		
		for (int i = 0; i < check.size(); i++)
		{
			JCheckBox c = check.get(i);
			c.setBounds(50, y, 500, 100);
			c.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			pnlCat2.add(c);
			
			y = y + 120;
		}
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
