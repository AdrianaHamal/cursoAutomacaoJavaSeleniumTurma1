package cursoTest;

import org.junit.Test;

import core.Driver;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{
	RegisterPage registerPage = new RegisterPage();
	
	@Test
	public void preencheCampos() {
		Driver.setUrl("http://demo.automationtesting.in/Register.html");
		registerPage.setFirstName("Adriana");
		registerPage.setLastName("Hamal");
		registerPage.setAddress("Rua Mauro");
		registerPage.setEmailAddress("joaninha@gmail.com");
		registerPage.setPhone("11982524185");
		registerPage.clickGender("FeMale");
		registerPage.clickHobbie("movies");
		registerPage.selectLanguage("Portuguese");
		registerPage.selectSkills("Java");
		registerPage.selectCountry("Brazil");
		registerPage.selectCountry2("Australia");
		registerPage.selectYear("1985");
		registerPage.selectmonth("March");
		registerPage.selectday("22");
		registerPage.setPassword("123456");
		registerPage.setConfirmPassword("123456");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
