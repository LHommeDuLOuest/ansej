package dz.ansej.gui.remote.auth;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

	public static void main(String[] args) throws Exception {
		
		AuthenImpl obj = new AuthenImpl ();
		IAuthen stub = (IAuthen) UnicastRemoteObject.exportObject(obj, 0);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("test", stub);
		System.out.println("Server ready ...");
	}

}
