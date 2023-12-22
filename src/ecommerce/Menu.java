package ecommerce;

import java.util.Scanner;

import projeto.util.Cores;
import ecommerce.model.Carrinho;
import ecommerce.model.Cliente;
import ecommerce.model.Loja;
import ecommerce.model.Produto;

public class Menu {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	int opcao = 0;
	
	while(true) {
		System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_PURPLE_BOLD_BRIGHT);
		System.out.println("|*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*|");
		System.out.println("|                   Loja LhamasFofas                  |");
		System.out.println("|*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*|");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("1 - Inicio");
		System.out.println("2 - Criar conta");
		System.out.println("3 - Produtos");
		System.out.println("4 - Adicionar ao Carrinho");
		System.out.println("5 - Remover do Carrinho");
		System.out.println("6 - Finalizar Compra");
		System.out.println("7 - Quem Somos");
		
		if(opcao == 7) {
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nLoja ⭐ LhamasFofas ⭐");
			System.out.println(" ❤ Escolha a sua lhama de pelúcia para alegrar o seu dia! ❤" + Cores.TEXT_RESET);
			leia.close();
			System.exit(opcao);
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Voltar para o inicio");

				break;
			case 3:
				System.out.println("Lista de Produtos\n\n");

				break;
			case 4:
				System.out.println("Carrinho\n\n");

				break;
			case 5:
				System.out.println("Lista de Compras\n\n");

				break;
	
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		}
		}
	}
	}
}