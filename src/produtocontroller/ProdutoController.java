package produtocontroller;

import java.util.ArrayList;

import carrinhorepository.ProdutoRepository;
import ecommerce.model.Produto;
public class ProdutoController implements ProdutoRepository {
	public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;
	public Object listarProdutos;

	@Override
	public void procurarPorId(int id) {
		ArrayList<Produto> procuraId = null;
		Produto produto = null;
		procuraId.add(produto);
		Object quantidade = null;
		System.out.println("Item encontrado" + quantidade);
	
	}
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}
	@Override
	public void escolherProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}
		
	}

	