package dz.ansej.gui.common;

import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dz.ansej.gui.remote.auth.IAuthen;

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
				if(AnsejListModel.getData().size() == 2 && !AnsejListModel.getData().get(0).toString().isEmpty() && !AnsejListModel.getData().get(1).toString().isEmpty()) {
					System.out.println("Data Login: "+AnsejListModel.getData().get(0));
				    System.out.println("Data Pwd: "+AnsejListModel.getData().get(1));
				    
				    try {
						Registry registry = LocateRegistry.getRegistry();
						IAuthen refObjDist = (IAuthen) registry.lookup("test");
						refObjDist.doLogin(AnsejListModel.getData().get(0).toString(), AnsejListModel.getData().get(0).toString());
						
					} catch (RemoteException e1) {
						e1.printStackTrace();
					} catch (NotBoundException e1) {
						e1.printStackTrace();
					}
				    
				} else {
					JOptionPane.showConfirmDialog(null,
							"Vous devez entrez votre nom d'utilisateur et un mot de passe ",
						    "Juste un test",
						    JOptionPane.PLAIN_MESSAGE);
					}
					
			}
			if(e.getActionCommand().equals(EnumButtonActionCmd.CANCEL_LOGIN.name())) {
				AnsejListModel.getData().clear();
				System.out.println("Must Clear TextField !");
			}
		}
		
	}

}
