package view;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Menu;
import model.PizzaPlanet;

public class View2 {
	
	PizzaPlanet pp;
	CardLayout cl;
	JFrame frame;
	JPanel p;
	HashMap<String, PPanel> map;
	public ExitTab exit;
	public NavTab nav;
	
	public View2(PizzaPlanet pp)
	{
		this.pp = pp;
		initComponents();
	}
	
	private void initComponents(){
		
		frame = new JFrame();
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(View2.class.getResource("/Resources/Planet.png")));
		frame.setTitle("Pizza Planet");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setSize(1920, 1080);
		frame.setBounds(0,0,1920,1080);
		
		exit = new ExitTab();
		
		nav = new NavTab();
		
		cl = new CardLayout();
		
		frame.getContentPane().setLayout(cl);
		
		p = new JPanel(cl);
		
		frame.add(p);
		
		frame.setVisible(true);		
		
		map = new HashMap<String, PPanel>();
		
		makeUserPage();
	}
	
	public void makeUserPage(){
		UserPage userPage = new UserPage(pp, exit);
		map.put("userPage",  userPage);
		
		p.add(userPage,  "userPage");
	}
	
	public void showUserPage(){
		cl.show(p,  "userPage");
	}
	
	public void makeFirstMenuPage(Map<String,String> foodtypes){
		FirstMenuPage firstMenuPage = new FirstMenuPage(foodtypes, pp, exit, nav);
		map.put("firstMenuPage", firstMenuPage);
		
		p.add(firstMenuPage, "firstMenuPage");
		showFirstMenuPage();
	}
	
	public void showFirstMenuPage(){
		cl.show(p,  "firstMenuPage");
	}
	
	public void makeSignUpPage(){
		SignUpPage signUpPage = new SignUpPage(pp, exit, nav);
		map.put("signUpPage", signUpPage);
		
		p.add(signUpPage, "signUpPage");
		showSignUpPage();
	}
	
	public void showSignUpPage(){
		cl.show(p, "signUpPage");
	}
	
	public void makeAcountPage(){
		AcountPage acountPage = new AcountPage(pp, exit, nav);
		map.put("acountPage", acountPage);
		
		p.add(acountPage, "acountPage");
		showAcountPage();
	}
	
	public void showAcountPage(){
		cl.show(p, "acountPage");
	}
	
	public void makeShoppingPage(){
		ShoppingPage shoppingPage = new ShoppingPage(pp, exit, nav);
		map.put("shoppingPage", shoppingPage);
		
		p.add(shoppingPage, "shoppingPage");
		showShoppingPage();
	}
	
	public void showShoppingPage(){
		cl.show(p, "shoppingPage");
	}
	
	public void makeSecondMenuPage(Menu menu){
		SecondMenuPage secondMenuPage = new SecondMenuPage(pp, exit, menu, nav);
		map.put("secondMenuPage", secondMenuPage);
		
		p.add(secondMenuPage, "secondMenuPage");
		showSecondMenuPage();
	}
	
	public void showSecondMenuPage(){
		cl.show(p, "secondMenuPage");
	}

}
