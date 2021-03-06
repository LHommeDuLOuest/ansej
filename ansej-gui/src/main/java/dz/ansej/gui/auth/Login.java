package dz.ansej.gui.auth;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dz.ansej.gui.common.DocListener;
import dz.ansej.gui.common.EnumButtonActionCmd;
import dz.ansej.gui.common.UserActionEvent;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
@SuppressWarnings("serial")
public class Login extends JPanel {
	
	private static final int HBOX1_HORIZONTAL_STRUT = 5;
	private static final int HBOX2_HORIZONTAL_STRUT = 20;
	private static final int HBOX3_HORIZONTAL_STRUT = 40;
	private static final int CONTENT_WIDTH = 300;
	private static final int CONTENT_HEIGHT = 200;
	
	private static JButton cancelButton;
	private static JButton loginButton;
	private static JTextField loginText ;
	private static JTextField pwdText;
	private JLabel loginLabel, pwdLabel;
	private Box hBox1, hBox2, hBox3, vBox;
	
	private UserActionEvent userActionEvent = new UserActionEvent();
	private DocListener docListener = new DocListener();
	
	/*
	 * Constructor
	 */
	public Login() {
		this.jbInit();
	}
	
	/*
	 * Called from Constructor
	 */
	private void jbInit() {
		cancelButton = new JButton("Annuler");
		loginButton = new JButton("Se connecter");
		loginText = new JTextField(10);
		pwdText = new JPasswordField(10);
		loginLabel = new JLabel("Login d'utilisateur");
		pwdLabel = new JLabel("Mot de Passe");
		hBox1 = Box.createHorizontalBox();
		hBox2 = Box.createHorizontalBox();
		hBox3 = Box.createHorizontalBox();
		vBox = Box.createVerticalBox();
		loginText.setMaximumSize(loginText.getPreferredSize());
		pwdText.setMaximumSize(pwdText.getPreferredSize());
		loginText.getDocument().putProperty("loginText", loginText);
		loginText.getDocument().addDocumentListener(docListener);
		pwdText.getDocument().putProperty("pwdText", pwdText);
		pwdText.getDocument().addDocumentListener(docListener);
		
		hBox1.add(loginLabel);
		hBox1.add(Box.createHorizontalStrut(HBOX1_HORIZONTAL_STRUT));
		hBox1.add(loginText);
		hBox2.add(pwdLabel);
		hBox2.add(Box.createHorizontalStrut(HBOX2_HORIZONTAL_STRUT));
		hBox2.add(pwdText);
		
		cancelButton.addActionListener(userActionEvent);
		cancelButton.setBackground(Color.blue);
		cancelButton.setForeground(Color.white);
		cancelButton.setActionCommand(EnumButtonActionCmd.CANCEL_LOGIN.name());
		loginButton.addActionListener(userActionEvent);
		loginButton.setBackground(Color.BLUE);
		loginButton.setForeground(Color.WHITE);
		loginButton.setActionCommand(EnumButtonActionCmd.LOGIN.name());
		try {
			Image img = ImageIO.read(getClass().getResource("/"+EnumButtonActionCmd.LOGIN.name()+".png"));
			Image scaled = img.getScaledInstance(20, 15, java.awt.Image.SCALE_SMOOTH);
			loginButton.setIcon(new ImageIcon(scaled));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hBox3.add(cancelButton);
		hBox3.add(Box.createHorizontalStrut(HBOX3_HORIZONTAL_STRUT));
		hBox3.add(loginButton);
		
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(Box.createGlue());
		vBox.add(hBox3);
		
		this.add(vBox, BorderLayout.CENTER);
		this.setVisible(true);
		this.setSize(CONTENT_WIDTH, CONTENT_HEIGHT);
	}
	
	public static JButton getCancelButton() {
		return cancelButton;
	}

	public static JButton getLoginButton() {
		return loginButton;
	}
	
	public static JTextField getLoginText() {
		return loginText;
	}
	
	public static JTextField getPwdText() {
		return pwdText;
	}
	
}
