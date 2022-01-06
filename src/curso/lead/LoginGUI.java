package curso.lead;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

public class LoginGUI implements ActionListener {
	
	static JLabel userLabel;
	static JTextField userText;
	static JLabel pwLabel;
	static JPasswordField pwText;
	static JButton button;
	static JLabel log;
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText =  new JTextField("");
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		pwLabel = new JLabel("Password");
		pwLabel.setBounds(10, 50, 80, 25);
		panel.add(pwLabel);
		
		pwText =  new JPasswordField("");
		pwText.setBounds(100, 50, 165, 25);
		panel.add(pwText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginGUI ());
		panel.add(button);
		
		
		log = new JLabel("");
		log.setBounds(10, 110, 300, 25);
		panel.add(log);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String username = userText.getText();
		String password = pwText.getText();
		
		if(username.equals("jorge") && password.equals("123456")) {
			log.setText("Login Efetuado");
			System.out.println(log.getText());
		}
		
	}	

}