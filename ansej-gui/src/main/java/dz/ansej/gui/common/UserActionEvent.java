package dz.ansej.gui.common;

import java.awt.event.ActionListener;

import javax.swing.JButton;

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
			if(e.getActionCommand().equals(EnumButtonActionCmd.LOGIN.name())) {
				System.out.println("login button is clicked");
			    System.out.println("Data Login: "+AnsejListModel.getData().get(0));
			    System.out.println("Data Pwd: "+AnsejListModel.getData().get(1));
			}
			if(e.getActionCommand().equals(EnumButtonActionCmd.CANCEL_LOGIN.name())) {
				System.out.println("Must RESET");
			}
		}
		
	}

}
