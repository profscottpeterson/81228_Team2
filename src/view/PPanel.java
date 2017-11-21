package view;

import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class PPanel extends JPanel {

	PizzaPlanet pp;
	
	public PPanel(PizzaPlanet pp){
		this.pp = pp;
	}
}
