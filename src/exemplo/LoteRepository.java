package exemplo;

import java.util.*;

public class LoteRepository {

    private Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<String, Lote>();
    }

    public String addLote(Lote lote) {
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }

    public void updateProdutoDeLote(String id, Produto produto) {
        Lote l = lotes.get(id);
        l.setProduto(produto);
        updateLote(l);
    }

    public void updateQuantidade(String id, long quantidade) {
        Lote l = lotes.get(id);
        l.setQuantidade(quantidade);
        updateLote(l);
    }

    public void updateDataFabricacao(String id, Date fabricacao) {
        Lote l = lotes.get(id);
        l.setDataFabricacao(fabricacao);
        updateLote(l);
    }

    public void updateDataValidade(String id, Date validade) {
        Lote l = lotes.get(id);
        l.setDataValidade(validade);
        updateLote(l);
    }

    private void updateLote(Lote lote) {
        lotes.put(lote.getId(), lote);
    }

    public void removeLote(String id) {
        lotes.remove(id);
    }

    public String getProduto(String id) {
        Lote l = lotes.get(id);
        return l.toString();
    }

    public String listLotes() {
        return "";
    }

    public List<Lote> getAll(){
        return new ArrayList<Lote>(lotes.values());
    }
}
