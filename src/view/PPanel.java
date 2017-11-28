package view;

import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class PPanel extends JPanel {


	ExitTab exit;
	NavTab nav;
	PizzaPlanet pp;
	
	public PPanel(PizzaPlanet pp, ExitTab exit, NavTab nav){
		this.pp = pp;
		
		this.exit = exit;
		this.nav = nav;
		
		add(exit);
		add(nav);
		
		this.exit.setVisible(true);
		this.nav.setVisible(true);
	}
	
	public PPanel(PizzaPlanet pp, ExitTab exit){
		this.pp = pp;
		
		this.exit = exit;
		
		add(exit);
		
		this.exit.setVisible(true);
	}
	
	public PPanel(PizzaPlanet pp){
		this.pp = pp;
	}
}
