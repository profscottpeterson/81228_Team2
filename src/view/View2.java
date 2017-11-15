package view;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.PizzaPlanet;

public class View2 {
	
	PizzaPlanet pp;
	CardLayout cl;
	JFrame frame;
	JPanel p;
	HashMap<String, PPanel> map;
	
	public View2(PizzaPlanet pp)
	{
		this.pp = pp;
		initComponents();
	}
	
	private void initComponents(){
		
		frame = new JFrame();
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PizzaPlanetGui.class.getResource("/Resources/Planet.png")));
		frame.setTitle("Pizza Planet");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setBounds(0,0,1920,1080);
		
		cl = new CardLayout();
		
		frame.getContentPane().setLayout(cl);
		
		p = new JPanel(cl);
		
		frame.add(p);
		
		frame.setVisible(true);
		
		
		map = new HashMap<String, PPanel>();
		
		makeUserPage(pp);
	}
	
	public void makeUserPage(PizzaPlanet pp){
		UserPage userPage = new UserPage(pp);
		map.put("userPage",  userPage);
		
		p.add(userPage,  "userPage");
	}
	
	public void showUserPage(){
		cl.show(p,  "userPage");
	}

}
