package dz.ansej.gui.common;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 
 * @author lyes
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public class DocListener implements DocumentListener {
	
	/*
	 * Constructor
	 */
	public DocListener() {
		super();
	}

	public void insertUpdate(DocumentEvent e) {
		//System.out.println(e.getDocument().getProperty("loginText").equals(Login.getLoginText()));
		//System.out.println(e.getClass().getName());
		//System.out.println(e.getType().toString());
		this.warn(e);
	}

	public void removeUpdate(DocumentEvent e) {
		//System.out.println(e.getClass().getName());
		//System.out.println(e.getType().toString());
		this.warn(e);
	}

	public void changedUpdate(DocumentEvent e) {
		//System.out.println(e.getClass().getName());
		//System.out.println(e.getType().toString());
		this.warn(e);
	}
	
	private void warn(DocumentEvent e) {
		//if(e.getLength()>0);
		if(e.getLength()>0 && e.getDocument().getProperty("loginText")!=null) {
		    System.out.println(((JTextField)e.getDocument().getProperty("loginText")).getText());
		}
		if(e.getLength()>0 && e.getDocument().getProperty("pwdText")!=null) {
			System.out.println(((JTextField)e.getDocument().getProperty("pwdText")).getText());
		}
	}

}
