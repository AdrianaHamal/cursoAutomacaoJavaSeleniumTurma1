package map;

import core.Element;
import enums.ByValue;

public class CarrinhoMap {

	public Element cep = new Element (ByValue.ID, "#input-zipcode");
	public Element comprar = new Element(ByValue.ID, "#continue-checkout");
	public Element validarProduto = new Element(ByValue.CSS,"div > a > span");
	public Element validarPreco = new Element(ByValue.ID, "#total-price");
	public Element deletarProduto = new Element(ByValue.CSS, "span[title=\"Remover produto\"]");
	public Element carrinhoVazio = new Element(ByValue.CSS, "h1.empty-page__title");
}
