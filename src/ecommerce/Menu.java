package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.model.Produto;
import produtocontroller.ProdutoController;
import projeto.util.Cores;
import ecommerce.model.Carrinho;

public class Menu {

	public static void main(String[] args) {
		ProdutoController produto = new ProdutoController();
		Scanner leia = new Scanner(System.in);
		String cor;
		int id = 0;
		int opcao;
		float valor = 0;
		while (true) {

			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_PURPLE_BOLD_BRIGHT);
			System.out.println("|*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*|");
			System.out.println("|                   Loja LhamasFofas                  |");
			System.out.println("|*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*|"+ Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD_BRIGHT +"|1 - Produtos                                         |");
			System.out.println("|2 - Adicionar ao Carrinho                            |");
			System.out.println("|3 - Remover do Carrinho                              |");
			System.out.println("|4 - Finalizar Compra                                 |");
			System.out.println("|5 - Quem Somos                                       |");
			System.out.println("|6 - Sair                                             |");
			System.out.println("|_____________________________________________________|" + Cores.TEXT_RESET);
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nSejam bem vindes! ");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nLojinha ⭐ LhamasFofas ⭐" + Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + " ❤ Ficamos felizes com a sua visita! Volte sempre! ❤"
						+ Cores.TEXT_RESET);
				leia.close();
				System.exit(opcao);
			}
			switch (opcao) {
			case 1:
				System.out.println("Lista de Produtos\n\n");	
				produto.listarProdutos();
				keyPress();
				break;
			case 2:
				System.out.println("Qual produto deseja comprar?\n\n");
				id = leia.nextInt();
				leia.skip("\\R?");	
				do {
					System.out.println("\nDigite o Tipo da Conta: ");
					System.out.println(
							Cores.TEXT_YELLOW + "(1 - Lhama \n ou 2 - Alparca): " + Cores.TEXT_RESET);
					id = leia.nextInt();
				} while (id < 1 && id > 2);
				keyPress();
				break;
			case 3:
				System.out.println("\nDigite a cor desejada : ");
				System.out.println(Cores.TEXT_YELLOW + "(1 - Cor Lilás\n ou 2 - Cor Rosa): " + Cores.TEXT_RESET);
				cor = leia.toString();
				keyPress();
				break;
			case 4:
				System.out.println("Carrinho\n\n");
				Carrinho Carrinho = new Carrinho(null, opcao, valor, opcao);
				Carrinho.adicionarItem(Carrinho, id, 2);
				Carrinho.adicionarItem(Carrinho, id, 1);	
				keyPress();
				break;
			case 5:
				System.out.println("Lista de Compras\n\n");
				produto.listarProdutos();
				keyPress();
				break;
			case 6:
				System.out.println("Hora de finalizar a sua compra!");
				break;

			case 7:
				System.out.println("Volte Sempre!");

			default:
				System.out.println("\nOpção Inválida!\n");
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
		System.out.println("Projeto Desenvolvido por: Andressa Patricio Barbosa ");
		System.out.println("Andressa Patricio Barbosa - andressapatricio93@gmail.com");
		System.out.println("github.com/zombeebytes");
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}

}
