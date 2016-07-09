package dz.ansej.gui.common;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 
 * @author lyes Kherbiche
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
		this.warn(e);
	}

	public void removeUpdate(DocumentEvent e) {
		this.warn(e);
	}

	public void changedUpdate(DocumentEvent e) {
		this.warn(e);
	}
	
	private void warn(DocumentEvent e) {
		if(e.getLength()>0 && e.getDocument().getProperty(EnumField.loginText.name())!=null) {
		    AnsejListModel.addElement(0, ((JTextField)e.getDocument().getProperty(EnumField.loginText.name())).getText());
		}
		if(e.getLength()>0 && e.getDocument().getProperty(EnumField.pwdText.name())!=null) {
			AnsejListModel.addElement(1, ((JTextField)e.getDocument().getProperty(EnumField.pwdText.name())).getText());
		}
	}

}
