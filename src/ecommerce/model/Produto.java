package ecommerce.model;

import projeto.util.Cores;

public abstract class Produto {

		
		private float tamanho;
		private String cor;
		private float quantidade;
		private int categoria;
		private double valor;
		protected int id;
		public Produto(int id, float tamanho, String cor, float quantidade, int categoria, double valor) {
			super();
			this.id = id;
			this.tamanho = tamanho;
			this.cor = cor;
			this.quantidade = quantidade;
			this.categoria = categoria;
			this.valor = valor;
		}
		public Produto(float quantidade2, String cor2, int tamanho2, int categoria2) {
			// TODO Auto-generated constructor stub
		}
		public Produto() {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public int setId() {
			return this.id = id;
		}
		public float getTamanho() {
			return tamanho;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(float quantidade) {
			this.quantidade = quantidade;
		}

		public int getCategoria() {
			return categoria;
		}

		public void setCategoria(int categoria) {
			this.categoria = categoria;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public void visualizar() {
			String id = "";

			switch (this.id) {
			case 1:
				id = "L1";
				break;
			case 2:
				id = "L2";
				break;
			}
	
			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_PURPLE_BRIGHT);
			System.out.println("_____________________________________");
			System.out.println("|          Dados do Produto         |");
			System.out.println("|___________________________________|");
			System.out.println(Cores.TEXT_RESET);
			System.out.println("Tamanho: " + this.tamanho);
			System.out.println("Modelo: " + this.cor);
			System.out.println("Quantidade: " + this.quantidade);
			System.out.println("Categoria: " + this.categoria);
			System.out.println("Valor: " + this.valor);
			}
		}
	
