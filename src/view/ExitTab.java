package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExitTab extends JPanel {
	
	private JButton btnExit;
	
	public ExitTab(){
		
		// Exit Panel (Bottom Right)
		//pnlExitTab = new JPanel();
		this.setBounds(1787, 970, 103, 52);
		//add(pnlExitTab);
		//pnlExitTab.setLayout(null);	
		btnExit = new JButton("EXIT");
		btnExit.setBounds(-12, -12, 128, 70);

		// Adding Button Inside the Panel
		add(btnExit);

		// Exit Button (Bottom Right)
		btnExit.setBackground(new Color(250, 240, 230));
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnExit.setForeground(new Color(153, 0, 0));
		
		Event();
		setLayout(null);
	}

	public void Event(){
		
		// This Event exists on pnlExit
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// Closes down the Program
				System.out.println("Exit is Pressed");
				System.exit(0);

			}
		});
	}
}
