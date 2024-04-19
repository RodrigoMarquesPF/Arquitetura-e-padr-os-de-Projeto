package produto;

import java.util.Iterator;
import java.util.List;

public class ColecaoProdutos implements Iterable<Produto> {
	private List<Produto> produtos;
	
	public ColecaoProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

	@Override
	public Iterator<Produto> iterator() {
		return new OrdenadorIterator(produtos);
	}
}
