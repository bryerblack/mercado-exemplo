package exemplo;

import exemplo.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> catalogo;

    public ProdutoRepository() {
        this.catalogo = new HashMap<String, Produto>();
    }

    public String addProduto(Produto produto) {
        catalogo.put(produto.getId(), produto);
        return produto.getId();
    }

    public void updateNome(String id, String nome) {
        Produto p = catalogo.get(id);
        p.setNome(nome);
        updateProduto(p);
    }

    public void updateFabricante(String id, String fabricante) {
        Produto p = catalogo.get(id);
        p.setFabricante(fabricante);
        updateProduto(p);
    }

    private void updateProduto(Produto produto) {
        catalogo.put(produto.getId(), produto);
    }

    public void removeProduto(String id) {
        catalogo.remove(id);
    }

    public String getProduto(String id) {
        Produto p = catalogo.get(id);
        return p.toString();
    }

    public String listProduto() {
        return "";
    }
}
