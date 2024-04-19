package cliente;

import java.util.ArrayList;
import java.util.List;

import produto.ColecaoProdutos;
import produto.Produto;


public class Cliente {
	
	public static void main(String[] args) {
		// Criando alguns produtos
        Produto produto1 = new Produto("Produto 1", "A", 99.9);
        Produto produto2 = new Produto("Produto 2", "B", 19.9);
        Produto produto3 = new Produto("Produto 3", "A", 29.9);
        Produto produto4 = new Produto("Produto 4", "C", 19.9);
        Produto produto5 = new Produto("Produto 5", "C", 49.9);
        Produto produto6 = new Produto("Produto 6", "A", 20.9);
        Produto produto7 = new Produto("Produto 7", "C", 9.9);
        Produto produto8 = new Produto("Produto 8", "B", 10.9);
        Produto produto9 = new Produto("Produto 9", "C", 2);
        Produto produto10 = new Produto("Produto 10", "A", 30);
        Produto produto11 = new Produto("Produto 11", "B", 199);
        Produto produto12 = new Produto("Produto 12", "C", 27);

        // Criando a lista de produtos desordenada
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);
        produtos.add(produto9);
        produtos.add(produto10);
        produtos.add(produto11);
        produtos.add(produto12);
        
        
        ColecaoProdutos colecaoProdutos = new ColecaoProdutos(produtos);
        
        // Percorrendo a coleção de produtos usando o Iterator personalizado
        //Primeiro sera ordenado os produtos da categoria A pelo valor, depois os da categoria B pelovalor e os de categoria C pelo valor
        java.util.Iterator<Produto> iterator = colecaoProdutos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println("Nome: " + produto.getNome() + ", Categoria: " + produto.getCategoria() + ", Valor: " + produto.getValor());
        }
	}
}
