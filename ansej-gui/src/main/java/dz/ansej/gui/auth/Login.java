package dz.ansej.gui.auth;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * @author lyes kherbiche
 *
 */
@SuppressWarnings("serial")
public class Login extends JPanel implements ActionListener {
	
	private static final int HBOX1_HORIZONTAL_STRUT = 5;
	private static final int HBOX2_HORIZONTAL_STRUT = 20;
	private static final int HBOX3_HORIZONTAL_STRUT = 40;
	private static final int CONTENT_WIDTH = 300;
	private static final int CONTENT_HEIGHT = 200;
	
	private JButton annulerButton;
	private JButton loginButton;
	private JTextField loginText ;
	private JTextField pwdText;
	private JLabel loginLabel, pwdLabel;
	private Box hBox1, hBox2, hBox3, vBox;
	private Container container;
	
	/*
	 * Constructor
	 */
	public Login() {
		//this.setTitle("Login");
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jbInit();
	}
	
	/*
	 * Called from Constructor
	 */
	private void jbInit() {
		annulerButton = new JButton("Annuler");
		loginButton = new JButton("Se connecter");
		loginText = new JTextField(10);
		pwdText = new JPasswordField(10);
		loginLabel = new JLabel("Login d'utilisateur");
		pwdLabel = new JLabel("Mot de Passe");
		hBox1 = Box.createHorizontalBox();
		hBox2 = Box.createHorizontalBox();
		hBox3 = Box.createHorizontalBox();
		vBox = Box.createVerticalBox();
		loginText.setMaximumSize(loginText.getPreferredSize());
		pwdText.setMaximumSize(pwdText.getPreferredSize());
		
		hBox1.add(loginLabel);
		hBox1.add(Box.createHorizontalStrut(HBOX1_HORIZONTAL_STRUT));
		hBox1.add(loginText);
		hBox2.add(pwdLabel);
		hBox2.add(Box.createHorizontalStrut(HBOX2_HORIZONTAL_STRUT));
		hBox2.add(pwdText);
		
		annulerButton.addActionListener(this);
		annulerButton.setBackground(Color.blue);
		annulerButton.setForeground(Color.white);
		loginButton.addActionListener(this);
		loginButton.setBackground(Color.BLUE);
		loginButton.setForeground(Color.WHITE);
		
		hBox3.add(annulerButton);
		hBox3.add(Box.createHorizontalStrut(HBOX3_HORIZONTAL_STRUT));
		hBox3.add(loginButton);
		
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(Box.createGlue());
		vBox.add(hBox3);
		
		//container = this.getRootPane();
		//container.add(vBox, BorderLayout.CENTER);
		this.add(vBox, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setSize(CONTENT_WIDTH, CONTENT_HEIGHT);
		//this.setResizable(false);
		//this.setLocationRelativeTo(null);
	}
    
	/*
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked == annulerButton) {
			
		}
		if(buttonClicked == loginButton) {
			
		}
		
	}
	
	public static void main(String[] args) {
		//Login login = new Login ();
	}

}
