package ecommerce.model;

public class Lhama2 extends Produto{
	private float quantidade;

public Lhama2(int id, float quantidade, String cor, int tamanho, int categoria, double valor) {
	super(id, quantidade, cor, tamanho, categoria, valor); 
	this.quantidade = quantidade;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nIdentificação do produto  " + this.id);
	}
}

