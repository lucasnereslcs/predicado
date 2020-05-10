
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Tv", 1200.00));
		produtos.add(new Produto("Celular", 800.00));
		produtos.add(new Produto("Computador", 900.00));

		
		System.out.println(Servicos.filtros(produtos, p -> p.getNome().charAt(0)=='C'));
		
		
		
	}

}

