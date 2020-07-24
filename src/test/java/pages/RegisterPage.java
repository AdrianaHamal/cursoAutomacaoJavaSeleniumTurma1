package pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebElement;

import core.Element;
import map.RegisterMap;

public class RegisterPage {

	private RegisterMap registerMap = new RegisterMap();
	
	public void setFirstName(CharSequence... value) {
		registerMap.firstName.sendKeys(value);
	}
	
	public void setLastName(CharSequence... value ) {
		registerMap.lastName.sendKeys(value);
	}
	
	public void setAddress(CharSequence... value) {
		registerMap.address.sendKeys(value);
	}
	
	public void setEmailAddress(CharSequence... value) {
		registerMap.emailAddress.sendKeys(value);		
	}
	
	public void setPhone(CharSequence... value) {
		registerMap.phone.sendKeys(value);
	}
	
	public void clickGender(String gender) {
		if (gender.toLowerCase().equals("male")) {
			registerMap.Male.click();
			return;
		}
		registerMap.FeMale.click();
		
	}
	
	public void clickHobbie(String hobbie) {
		LinkedHashMap<String , Element> map = new LinkedHashMap<>();
		map.put("cricket", registerMap.cricket);
		map.put("movies", registerMap.movies);
		map.put("hockey", registerMap.hockey);
		map.get(hobbie).click();
	}
	
	public void selectLanguage(String language) {
		
		registerMap.languages.click();
		List<WebElement> listLanguages = registerMap.vLanguages.getElements();
		for (WebElement elLanguage : listLanguages) {
			if (elLanguage.getText().equals(language)) {
				elLanguage.click();
				return;
			}
		}
	}
	
	public void selectSkills(String skills) {
		registerMap.skills.select(skills);
	}
	
	public void selectCountry(String country) {
		registerMap.country.select(country);
	}
	
	public void selectCountry2(String country2) {
		registerMap.country2.select(country2);
	}
	
	public void selectYear(String year) {
		registerMap.year.select(year);
	}

	public void selectmonth(String month) {
		registerMap.month.select(month);
	}
	
	public void selectday(String day) {
		registerMap.day.select(day);
	}
	
	public void setPassword(CharSequence... value) {
		registerMap.password.sendKeys(value);
	}
	
	public void setConfirmPassword(CharSequence... value) {
		registerMap.confirmpassword.sendKeys(value);
	}
	
}
