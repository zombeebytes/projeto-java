package ecommerce.model;

public class Cliente {

	private int nomeCliente;
	private int sobrenomeCliente;
	private int cpfCliente;
	private int telefone;
	private int endereco;
	private int dataNasc;
	private int email;
	private int senha;
	private int idCliente;
	public Cliente(int nomeCliente, int sobrenomeCliente, int cpfCliente, int telefone, int endereco, int dataNasc,
			int email, int senha, int idCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.email = email;
		this.senha = senha;
		this.idCliente = idCliente;
	}
	public int getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(int nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	public void setSobrenomeCliente(int sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	public int getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getEndereco() {
		return endereco;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	public int getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}

