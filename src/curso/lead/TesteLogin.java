package curso.lead;

import static org.junit.Assert.assertEquals;

import javax.swing.JButton;
import javax.swing.plaf.ButtonUI;

import org.junit.Test;

//não funciona
public class TesteLogin {
	
	@Test
	public void testeLogin() throws Exception {
		String username = "jorge";
		String password = "123456";
		LoginGUI login = new LoginGUI();
		login.userText.setText(username);
		login.pwText.setText(password);
		login.button.doClick();
		
		
		assertEquals("Login Efetuado", login.log.getText().toString());

	}

}