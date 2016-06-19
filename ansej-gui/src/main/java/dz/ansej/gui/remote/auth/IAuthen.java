package dz.ansej.gui.remote.auth;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public interface IAuthen extends Remote {
	
	public void doLogin(String login, String pwd) throws RemoteException;

}
