package view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class DetailsPage extends PPanel {

	private JPanel pnlDetailsPage;

	public DetailsPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp, exit, nav);		
		
		//add(exit);
		//add(nav);
		
		pnlDetailsPage = new JPanel();
		pnlDetailsPage.setBounds(0, 0, 1914, 1091);
		pnlDetailsPage.setLayout(null);
		
		// Adding Panel to the Content Pane
		add(pnlDetailsPage);
			
	}
	
	public void placeTypes(List<JButton> buttons){
		
	}

}
