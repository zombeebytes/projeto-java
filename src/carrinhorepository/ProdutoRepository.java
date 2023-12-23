package carrinhorepository;
import ecommerce.model.Produto;

public interface ProdutoRepository {

		public void procurarPorId(int id);

		public void listarProdutos();

		public void escolherProduto(Produto produto);

		


	}



