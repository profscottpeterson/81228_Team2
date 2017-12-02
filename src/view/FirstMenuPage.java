package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.PizzaPlanet;


@SuppressWarnings("serial")
public class FirstMenuPage extends PPanel{


	private JPanel pnlMenuPage;
	private JPanel pnlCat;
	private JLabel lblBackgroundMenu;
	private JLabel lblBackBack;

	public FirstMenuPage( Map<String,String> foodtypes, PizzaPlanet pp, ExitTab exit, NavTab nav){

		super(pp, exit, nav);

		//add(exit);
		//add(nav);


		pnlMenuPage = new JPanel();
		pnlMenuPage.setBounds(0, 0, 1914, 1091);
		pnlMenuPage.setLayout(null);
		
		// Adding Panel to the Content Pane
		add(pnlMenuPage);

		// Category Panel
		pnlCat = new JPanel();
		pnlCat.setBackground(new Color(165, 42, 42));
		pnlCat.setBounds(322, 252, 1297, 779);
		pnlCat.setLayout(null);
		add(pnlCat);
	
		// Adding Panel to the Content Pane
		pnlMenuPage.add(pnlCat);
		
		setLayout(null);
		
		List<JButton> buttonList = new ArrayList<>();

		foodtypes.forEach((k, v) ->
		{
			String id = k;
			String name = v;

			JButton btn = new JButton(name);

			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					pp.getMenu(id);
				}
			});
			buttonList.add(btn); 

		});
		placeButtons(buttonList);
		
		// Setting Background/Name/Source/Bounds for Background Menu
		lblBackgroundMenu = new JLabel("");
		lblBackgroundMenu.setBounds(0, -11, 2000, 1103);
		lblBackgroundMenu.setIcon(new ImageIcon(FirstMenuPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackgroundMenu.setBackground(new Color(250, 240, 230));
		pnlMenuPage.add(lblBackgroundMenu);
		
		lblBackBack = new JLabel("");
		lblBackBack.setBounds(0, 0, 1297, 779);
		lblBackBack.setIcon(new ImageIcon(FirstMenuPage.class.getResource("/Resources/MenuInside_Final.png")));
		pnlCat.add(lblBackBack);
	}

	public void placeButtons(List<JButton> buttons)
	{

		int x = 50;
		final int X = 50;
		int y = 50;
		int Count = 1;

		for (int i = 0; i < buttons.size(); ++i)
		{
			JButton button = buttons.get(i);

			button.setBounds(x, y, 200, 200);
			//button.setIcon(new ImageIcon(PizzaPlanetGui.class.getResource("/Resources/Menu.jpg")));
			button.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			button.setForeground(new Color(204, 0, 0));
			button.setMargin(new Insets (0, 0, 0, 0));
			button.setBackground(new Color(250, 240, 230));
			pnlCat.add(button);

			Count++;

			if (Count < 4){
				x = x + 500;
			}

			else if (Count >= 4){		
				x = X;
				y = y + 300;
			}

		}
	}
}
