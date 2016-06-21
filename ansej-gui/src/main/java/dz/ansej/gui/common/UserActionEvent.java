package dz.ansej.gui.common;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dz.ansej.gui.auth.Login;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public class UserActionEvent implements ActionListener {
	
	//TODO make this class like a spring bean
	
	/*
	 * Constructor
	 */
	public UserActionEvent() {
		super();
	}

	public void actionPerformed(java.awt.event.ActionEvent e) {
		//String buttonText = e.getActionCommand();
		//System.out.println(buttonText);
		if (e.getSource().getClass().equals(JTextField.class)) {
			JTextField textField = (JTextField)e.getSource();
			if(textField == Login.getLoginText()) {
				System.out.println("Jtext "+Login.getLoginText().getText());
			}
		}
		if(e.getSource().getClass().equals(JPasswordField.class)) {
			JTextField textField = (JTextField)e.getSource();
			if(textField == Login.getPwdText()) {
				System.out.println("Jtext "+Login.getPwdText().getText());
			}
		}
		if(e.getSource().getClass().equals(JButton.class)) {
			JButton buttonClicked = (JButton)e.getSource();
			if(buttonClicked == Login.getLoginButton()) {
				System.out.println("login button is clicked");
				System.out.println("Data Size "+ Login.getAnsejListModelData().size());
				System.out.println("Data "+ Login.getAnsejListModelData().get(0));
			}
		}
		
	}

}
