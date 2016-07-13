package dz.ansej.gui.remote.auth;

import java.rmi.RemoteException;

/**
 * 
 * @author lyes Kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public class AuthenImpl implements IAuthen {

	public void doLogin(String login, String pwd) throws RemoteException {
		System.out.println("Login: "+login +" Pwd: "+pwd);
	}

}
