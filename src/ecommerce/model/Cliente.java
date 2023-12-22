package ecommerce.model;

public class Cliente {

	private int id; 
	private String nome;
	private float preco;
	private float pagar;
	private float valorFinal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPagar() {
		return pagar;
	}
	public void setPagar(float pagar) {
		this.pagar = pagar;
	}
	public float getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}
	public Cliente(int id, String nome, float preco, float pagar, float valorFinal) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.pagar = pagar;
		this.valorFinal = valorFinal;
		if (this.getPagar() < valorFinal) {
				System.out.println("\nPagamento não efetuado!");
			
					
				}
			
			}
		}
	
	

