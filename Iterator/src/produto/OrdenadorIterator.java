package produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class OrdenadorIterator  implements Iterator<Produto>{
	private List<Produto> produtosOrdem;
	private int posicao;
	
	public OrdenadorIterator(List<Produto> produtos) {
		this.produtosOrdem = ordenarProdutos(produtos);
        this.posicao = 0;
	}

	@Override
	public boolean hasNext() {
		return posicao < produtosOrdem.size();
	}

	@Override
	public Produto next() {
		if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return produtosOrdem.get(posicao++);
	}
	
	// Método para ordenar os produtos por categoria e valor
    private List<Produto> ordenarProdutos(List<Produto> produtos) {
        List<Produto> produtosOrdenados = new ArrayList<>(produtos);

        
        for (int i = 1; i < produtosOrdenados.size(); i++) {
        	// Seleciona o produto atual como a chave
            Produto chave = produtosOrdenados.get(i);
            int j = i - 1;
            while (j >= 0 && (produtosOrdenados.get(j).getCategoria().compareTo(chave.getCategoria()) > 0 ||
                             (produtosOrdenados.get(j).getCategoria().equals(chave.getCategoria()) &&
                              produtosOrdenados.get(j).getValor() > chave.getValor()))) {
                produtosOrdenados.set(j + 1, produtosOrdenados.get(j));
                j--;
            }
            produtosOrdenados.set(j + 1, chave);
        }

        return produtosOrdenados;
    }
	
	

}
