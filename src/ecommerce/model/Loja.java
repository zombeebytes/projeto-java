package ecommerce.model;

public class Loja extends Produto {
int produto;
int idProduto;
double valorProduto;
double desconto;
public Loja(int produto, int idProduto, double valorProduto, double desconto) {
	this.produto = produto;
	this.idProduto = idProduto;
	this.valorProduto = valorProduto;
	this.desconto = desconto;
}
public int getProduto() {
	return produto;
}
public void setProduto(int produto) {
	this.produto = produto;
}
public int getIdProduto() {
	return idProduto;
}
public void setIdProduto(int idProduto) {
	this.idProduto = idProduto;
}
public double getValorProduto() {
	return valorProduto;
}
public void setValorProduto(double valorProduto) {
	this.valorProduto = valorProduto;
}
public double getDesconto() {
	return desconto;
}
public void setDesconto(double desconto) {
	this.desconto = desconto;
}


}
