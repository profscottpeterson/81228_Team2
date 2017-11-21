package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.PizzaPlanet;

@SuppressWarnings("serial")
public class AcountPage extends PPanel {

	private JPanel pnlAccountPage;
	private JLabel lblBackground;

	public AcountPage(PizzaPlanet pp, ExitTab exit, NavTab nav) {
		super(pp);
		
		add(exit);
		add(nav);
		
		pnlAccountPage = new JPanel();
		pnlAccountPage.setVisible(false);
		pnlAccountPage.setBounds(0, -11, 1914, 1091);
		add(pnlAccountPage);
		pnlAccountPage.setLayout(null);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, -11, 2000, 1103);
		lblBackground.setIcon(new ImageIcon(AcountPage.class.getResource("/Resources/Menu_Final.png")));
		lblBackground.setBackground(new Color(250, 240, 230));
		add(lblBackground);
		
		setLayout(null);

	}

}
