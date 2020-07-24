package map.petLove;

import core.Element;
import enums.ByValue;

public class InicialMap {
//https://www.petlove.com.br/
	
	public Element pesquisa = new Element(ByValue.ID, "autocomplete-input");
	public Element tituloProduto = new Element(ByValue.CSS, "h2[itemprop=name]");
	public Element precoProduto = new Element(ByValue.CSS, "div[itemprop=offers] > div:nth-of-type(2)");
	public Element link = new Element(ByValue.CSS, "div.catalog-list-item > a[itemprop=url]");
	
	
	
}
