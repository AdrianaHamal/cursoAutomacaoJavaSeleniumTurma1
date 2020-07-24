package map.petLove;

import core.Element;
import enums.ByValue;

public class ProdutoMap {

	public Element produto = new Element(ByValue.CSS, "h1[itemprop=name]");
	public Element preco = new Element(ByValue.CSS,"div.product-info > div > div:nth-child(4) > div > div");
	public Element adicionarCarrinho = new Element(ByValue.ID, "#buy-button");
}
