package Login;

import static org.junit.Assert.*;

import org.junit.Test;

public class logintest {

	@Test
	public void logincorrecto() {
		boolean resul1 = Login.login("usuario", "usuario");
		assertEquals(true, resul1);
		
	}
	
	@Test
	public void login_incorrecto() {
		boolean resul2 = Login.login("User", "User");
		assertEquals(false, resul2);
	}

}
