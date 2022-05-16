package exemplo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    ProdutoRepository p_rep;
    LoteRepository l_rep;

    public ProdutoService(ProdutoRepository p_rep, LoteRepository l_rep) {
        this.p_rep = p_rep;
        this.l_rep = l_rep;
    }

    public List<Produto> listProductLote(String nome){
        List<Lote> lotes = l_rep.getAll();
        List<Produto> products = getProductLote(lotes);
        return getProductByName(nome, products);
    }

    private List<Produto> getProductLote(List<Lote> lotes) {
        List<Produto> produtos = new ArrayList<>();
        for (Lote l : lotes) {
            produtos.add(l.getProduto());
        }
        return produtos;
    }

    private List<Produto> getProductByName(String nome, List<Produto> products) {
        List<Produto> produtos = new ArrayList<>();
        for (Produto p : products) {
            if (p.getNome().toLowerCase().contains(nome)) {
                produtos.add(p);
            }
        }
        return produtos;
    }

    public List<Produto> listProductByName(String nome) {
        List<Produto> produtos = p_rep.getAll();
        return buscaProduct(nome, produtos);
    }

    private List<Produto> buscaProduct(String nome, List<Produto> produtos){
        List<Produto> lista = new ArrayList<Produto>();
        for (Produto p : produtos) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                lista.add(p);
            }
        }
        return lista;
    }

}
