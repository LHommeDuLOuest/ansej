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
	
	//TODO make this class like a spring bean
	
	/*
	 * Constructor
	 */
	public UserActionEvent() {
		super();
	}

	public void actionPerformed(java.awt.event.ActionEvent e) {
		if(e.getSource().getClass().equals(JButton.class)) {
			JButton buttonClicked = (JButton)e.getSource();
			if(buttonClicked == Login.getLoginButton()) {
				System.out.println("login button is clicked");
				//System.out.println("Data Size "+ Login.getAnsejListModelData().size());
				//System.out.println("Data "+ Login.getAnsejListModelData().get(0));
			System.out.println("Data Login: "+AnsejListModel.getData().get(0));
			System.out.println("Data Pwd: "+AnsejListModel.getData().get(1));
			}
		}
		
	}

}
