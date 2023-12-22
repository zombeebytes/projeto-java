package ecommerce.model;

public class Carrinho {
	int item;
	int quantidade;
	int codigoProduto;
	int formaPagamento;
	double desconto;
	double precoProduto;
	double pagar;
	
	public double getPagar() {
		return pagar;
	}
	public void setPagar(double pagar) {
		this.pagar = pagar;
	}
	public Carrinho(double pagar) {
		this.pagar = pagar;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public int getformaPagamento(int formaPagamento) {
		return formaPagamento;
	}
	public void setformaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;		
	}	
	public boolean pagar(double precoProduto) {
		if(this.getPagar() < precoProduto) {
			System.out.println("\nPagamento não realizado!");
			return false;
		}
		this.setPagar(this.getPagar() - precoProduto);
		return true;
	}
	
	public Carrinho(int item, double desconto, double precoProduto, int quantidade, int codigoProduto) {
		this.item = item;
		this.desconto = desconto;
		this.precoProduto = precoProduto;
		this.quantidade = quantidade;
		this.codigoProduto = codigoProduto;
		
	}

}
