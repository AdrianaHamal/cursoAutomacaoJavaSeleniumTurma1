package map;


import core.Element;
import enums.ByValue;

public class RegisterMap {
	//http://demo.automationtesting.in/Register.html
	
	public Element firstName = new Element(ByValue.CSS, "input[ng-model=FirstName]");
	public Element lastName = new Element(ByValue.CSS, "input[ng-model=LastName]");
	public Element address = new Element(ByValue.CSS,"textarea[ng-model=Adress]");
	public Element emailAddress = new Element(ByValue.CSS, "input[ng-model=EmailAdress]");
	public Element phone = new Element(ByValue.CSS, "input[ng-model=Phone]");
	public Element Male = new Element(ByValue.CSS, "input[value=Male]");
	public Element FeMale = new Element(ByValue.CSS, "input[value=FeMale]");
	public Element cricket = new Element(ByValue.CSS, "#checkbox1");
	public Element movies = new Element(ByValue.CSS, "#checkbox2");
	public Element hockey = new Element(ByValue.CSS, "#checkbox3");
	public Element languages = new Element(ByValue.CSS, "#msdd");
	public Element vLanguages = new Element(ByValue.CSS, "ul.ui-menu > li > a");	
	public Element skills = new Element(ByValue.ID, "Skills");
	public Element country = new Element(ByValue.ID, "countries");
	public Element country2 = new Element(ByValue.ID, "country");
	public Element year = new Element(ByValue.ID, "yearbox");
	public Element month = new Element(ByValue.CSS, "select[ng-model=monthbox]");
	public Element day = new Element(ByValue.CSS, "select[ng-model=daybox]");
	public Element password = new Element(ByValue.CSS, "input[ng-model=Password]");
	public Element confirmpassword = new Element(ByValue.CSS, "input[ng-model=CPassword]");
	
	
}

