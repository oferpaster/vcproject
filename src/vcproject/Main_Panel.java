package vcproject;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Main_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnExit;
	private JButton btnEmploeyLogin;
	private JButton btnMakeOrder;
	private JButton btnRegister;
	private JButton btnCheckIn;
	private JButton btnCheckOut;
	
	public Main_Panel() {
		super();
		setLayout(null);
		
		
		initialize();
	}

	private void initialize() {
		this.setSize(785, 575);
		setBackground(SystemColor.activeCaption);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(10, 519, 93, 35);
		add(btnExit);
		
		JLabel lblVcp = new JLabel("VCP");
		lblVcp.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblVcp.setBounds(368, 27, 48, 23);
		add(lblVcp);
		
		btnEmploeyLogin = new JButton("Emploey login");
		btnEmploeyLogin.setBounds(648, 519, 127, 35);
		add(btnEmploeyLogin);
		
		btnMakeOrder = new JButton("Make order");
		btnMakeOrder.setBounds(516, 121, 110, 35);
		add(btnMakeOrder);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(516, 167, 110, 35);
		add(btnRegister);
		
		btnCheckIn = new JButton("Check in");
		btnCheckIn.setBounds(217, 121, 110, 35);
		add(btnCheckIn);
		
		btnCheckOut = new JButton("Check out");
		btnCheckOut.setBounds(217, 167, 110, 35);
		add(btnCheckOut);
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public JButton getBtnEmploeyLogin() {
		return btnEmploeyLogin;
	}

	public JButton getBtnMakeOrder() {
		return btnMakeOrder;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public JButton getBtnCheckIn() {
		return btnCheckIn;
	}

	public JButton getBtnCheckOut() {
		return btnCheckOut;
	}
}
