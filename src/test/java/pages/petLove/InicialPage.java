package pages.petLove;

import map.petLove.InicialMap;

public class InicialPage {
	
	InicialMap inicialMap = new InicialMap();
	
	public void pesquisa(CharSequence... value) {
		inicialMap.pesquisa.sendKeys(value);
	}
	
	public String getTitulo() {
		return inicialMap.tituloProduto.getText();
	}
	
	public String getPreco() {
		return inicialMap.precoProduto.getText();
	}
		
	public void clickLink() {
		inicialMap.link.click();
	}
	

	
	
	
	
	
	
	
	
}
