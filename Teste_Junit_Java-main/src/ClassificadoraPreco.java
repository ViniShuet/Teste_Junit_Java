

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassificadoraPreco {

//Método que recebe uma lista de produtos e preços e ordena 

	public List<Produto> classificaProdutosPorPreco(List<Produto> produtosPrecos) {

		List<Produto> produtosOrdenadosPreco = new ArrayList<>();

		// Ordena, considerando primeiro o código do produto e e depois o preço

		produtosPrecos.sort(Comparator.comparing((Produto p) -> p.codigo).thenComparing(p -> p.preco));

		// Inicializa e alimenta uma lista nova com os produtos e precos ordenados

		produtosOrdenadosPreco.clear();

		produtosOrdenadosPreco.addAll(produtosPrecos);

		// Devolve a lista ordenada por código e preço

		return (produtosOrdenadosPreco);

	}

}