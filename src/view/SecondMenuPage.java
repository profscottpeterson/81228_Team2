package view;

import java.awt.Color;
import java.awt.Container;
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

import com.sun.xml.internal.ws.api.Component;

import model.Ingredient;
import model.Menu;
import model.MenuItem;
import model.Order;
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
	private JButton btnSubmit;
	private int foodIndex = -1;
	private ArrayList<Integer> ingIndexes = new ArrayList<Integer>();


	public SecondMenuPage(PizzaPlanet pp, ExitTab exit, Menu menu, NavTab nav) {

		super(pp, exit, nav);

		btnSubmit = new JButton("ADD");
		btnSubmit.setForeground(new Color(204, 0, 0));
		btnSubmit.setBackground(PStyle.primaryButtonColor);
		btnSubmit.setFont(PStyle.primaryFontStyle);
		btnSubmit.setBounds(1687, 800, 200, 74);
		add(btnSubmit);

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
		pnlCat2.setName("panel 2");
		add(pnlCat2);

		// Adding Panel to the Content Pane
		pnlMenuPage2.add(pnlCat1);
		pnlMenuPage2.add(pnlCat2);

		setLayout(null);

		//Left List for pizzas
		List<JButton> buttonList = new ArrayList<>();


		FullMenu = menu.getFullMenu();
		for (MenuItem menuItem : FullMenu)
		{
			int index = FullMenu.indexOf(menuItem);
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
					pnlCat2.invalidate();
					pnlMenuPage2.remove(pnlCat2);

					pnlCat2 = new JPanel();
					pnlCat2.setBackground(new Color(165, 42, 42));
					pnlCat2.setBounds(980, 248, 647, 781);
					pnlCat2.setLayout(null);

					pnlMenuPage2.add(pnlCat2);
					ingIndexes.clear();
					populateIng(index);
					foodIndex = index;

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

		AddEventsToAddButton();

	}

	public void populateIng(int index) {

		MenuItem menuIndex = FullMenu.get(index);
		int y = 40;
		for(Ingredient ingItem : menuIndex.getItemIngred()){
			//JPanel ingPanel = new JPanel();
			//pnlCat2 is where these are getting added

			String id = ingItem.getName();
			JCheckBox button = new JCheckBox(id);
			button.setBounds(0, 0, 500, 100);
			button.setAlignmentX(LEFT_ALIGNMENT);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			button.setForeground(new Color(204, 0, 0));
			button.setSelected(true);
			//button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			button.setName(Integer.toString(ingItem.getIng_id()));
			ingIndexes.add(ingItem.getIng_id());
			//System.out.println(button.getName());
			button.setBounds(0, y, 500, 100);
			//			ingPanel.add(button);
			//			ingPanel.setBackground(new Color(165, 42, 42));
			button.setAlignmentX(LEFT_ALIGNMENT);
			pnlCat2.setAlignmentX(LEFT_ALIGNMENT);
			pnlCat2.add(button);


			y = y + 100;

		};
		pnlCat2.revalidate();
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
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
			button.setForeground(new Color(204, 0, 0));
			button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			pnlCat1.add(button);

			y = y + 120;

		}
	}

	public void updateIngredients(){

	}

	public void AddEventsToAddButton() {

		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (foodIndex != -1){
					Order currentOrder = new Order();
					MenuItem mu = FullMenu.get(foodIndex);
					MenuItem orderM = new MenuItem();
					orderM.setName(mu.getName());
					orderM.setmIndex(mu.getmIndex());
					orderM.setPrice(mu.getPrice());
					for (java.awt.Component c : pnlCat2.getComponents())
					{
						JCheckBox j = (JCheckBox)c;
						if(j.isSelected())
						{
							orderM.addIngred(mu.getOrderIngred(j.getName()));
						}//if
					}
					currentOrder.addItem(orderM);
					System.out.println(orderM.getPrice());
					pp.setOrder(currentOrder);
					//currentOrder.displayEverything();
					currentOrder = null;
				}
			}//actionPerformed
		});//addActionListner	
	}//AddEvents
}
