import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		ProdutoRepository catalogo = new ProdutoRepository();
		Produto produto = new Produto("Leite", "Parmalat");
		Produto p = new Produto("Margarina", "Delicia");
		Lote lote = new Lote(produto, 10L);
		catalogo.addProduto(produto);
		catalogo.addProduto(p);
		
		System.out.println(produto);
		System.out.println(lote);
	}
}
