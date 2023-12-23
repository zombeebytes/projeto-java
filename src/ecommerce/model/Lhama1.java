package ecommerce.model;

public class Lhama1 extends Produto {
	private float quantidade;

public Lhama1(int id, float quantidade, String cor, int tamanho, int categoria, double valor) {
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
		System.out.println("\nIdentificação do produto 2:  " + this.id);
	}
}