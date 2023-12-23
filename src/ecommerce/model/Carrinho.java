package ecommerce.model;
import java.util.ArrayList;
import java.util.List;
public class Carrinho  extends Produto{
	private List<Produto>itens;
	public Carrinho(List<Produto> itens, int produto, float quantidade, int id) {
		super();
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(Produto produto, float quantidade, int i) {
		Carrinho item = new Carrinho(itens, id, quantidade, id);
		itens.add(item);
		
	}
	int produto;
	private float quantidade;
	int id;

	
	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	
		this.itens = itens;
		this.produto = produto;
		this.quantidade = quantidade;
		this.id = id;
	}

	}	
