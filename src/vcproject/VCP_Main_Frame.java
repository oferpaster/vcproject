package vcproject;

import javax.swing.JFrame;
import java.awt.SystemColor;

public class VCP_Main_Frame extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Main_Panel mainPanel;

	

	public VCP_Main_Frame() {
		super();
		initialize();
	}

	private void initialize() {
		this.setContentPane(getMainPanel());
		getContentPane().setBackground(SystemColor.activeCaption);
		this.setSize(800, 600);
		
		
	}

	public Main_Panel getMainPanel() {
		if(mainPanel == null)
		{
			mainPanel = new Main_Panel();
		}
		return mainPanel;
	}
}
