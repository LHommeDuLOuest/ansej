package dz.ansej.gui.common;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import dz.ansej.gui.auth.Login;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public class UserActionEvent implements ActionListener {
	
	/*
	 * Constructor
	 */
	public UserActionEvent() {
		super();
	}

	public void actionPerformed(java.awt.event.ActionEvent e) {
		String buttonText = e.getActionCommand();
		System.out.println(buttonText);
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked == Login.getLoginButton()) {
			System.out.println("login button is clicked");
		}
	}

}
