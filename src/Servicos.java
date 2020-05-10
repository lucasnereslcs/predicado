import java.util.List;
import java.util.function.Predicate;

public class Servicos {

	private static double soma = 0;

	public static double filtros(List<Produto> produtos, Predicate<Produto> condicao) {

		for (Produto p : produtos) {
			if(condicao.test(p)) {
			soma += p.getPreco();
			}
		}

		return soma;

	}

}
