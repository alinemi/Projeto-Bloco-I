package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstoqueAlimento extends CestaBasica {

	public EstoqueAlimento(String nome, List<String> produto, List<Integer> estoque,
			List<Integer> composicaoReferencia) {
		super(nome, produto, estoque, composicaoReferencia);

	}

	@Override
	public void doar(int codigoProduto, int qtd) {
		// TODO Auto-generated method stub

		int novaQtd = estoque.get(codigoProduto) + qtd;
		estoque.set(codigoProduto, novaQtd);

		System.out.println("Seu estoque aumentou, agora ele é de " + estoque.get(codigoProduto));
		System.out.println("Obrigado peladoação!");

	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		for (int i = 1; i < estoque.size(); i++) {
			System.out.println(produto.get(i) + " = " + estoque.get(i));
		}
	}

	@Override
	public void calcularCestas() {
		// TODO Auto-generated method stub
		List<Integer> nCestas = new ArrayList<Integer>();
		for (int i = 1; i < estoque.size(); i++) {
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
			Collections.sort(nCestas);
		}
		System.out.println("O número de cestas completas é de: " + nCestas.get(0));
	}

	@Override
	public void distribuirCestas(int n) {
		// TODO Auto-generated method stub
		List<Integer> nCestas = new ArrayList<Integer>();
		for (int i = 1; i < estoque.size(); i++) {
			System.out.println(produto.get(i) + " = " + estoque.get(i));
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
		}

		Collections.sort(nCestas);
		int a = nCestas.get(0);

		if (a > 0) {
			for (int i = 1; i < estoque.size(); i++) {
				int atual = estoque.get(i);
				int ref = estoque.get(i);
				estoque.set(i, n * (atual - ref));
				System.out.println("Seu estoque foi atualizado com sucesso!");
			}
		} else {
			System.out.println("Quantidade de cestas insuficientes ...");
		}

		
		
		
		
	}

}
