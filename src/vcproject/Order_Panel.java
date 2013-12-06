package vcproject;

import java.awt.SystemColor;

import javax.swing.JPanel;

public class Order_Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Order_Panel() {
		super();
		setLayout(null);
		initialize();
	}

	private void initialize() {
		this.setSize(785, 575);
		setBackground(SystemColor.activeCaption);
	}
	
	
}
