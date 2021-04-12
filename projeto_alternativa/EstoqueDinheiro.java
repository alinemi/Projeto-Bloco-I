package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class EstoqueDinheiro extends CestaBasica {
	
	Scanner ler = new Scanner(System.in);
	
	public EstoqueDinheiro(String nome, List<String> produto, List<Integer> estoque,
			List<Integer> composicaoReferencia) {
		super(nome, produto, estoque, composicaoReferencia);
	}

	@Override
	public void doar(int codigoProduto) {
		System.out.println("qual valor voc� gostaria de doar?");
		int qtd = ler.nextInt();
		int novaQtd = estoque.get(0) + qtd;
		estoque.set(0, novaQtd);
	   System.out.println("Seu estoque mudou, agora ele � de: "+estoque.get(0));
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		System.out.println("Produto / Quantidade");
		System.out.println("-----------------------------------");
	//	for (int i = 1; i < estoque.size(); i++) {
		//	System.out.println(produto.get(i) + " = " + estoque.get(i));
		//	System.out.println(NumberFormat.getCurrencyInstance().format(dinheiro));
		System.out.println("Dinheiro em caixa = "+estoque.get(0));

		
		}
//	}
	

	@Override
	public void calcularCestas() {
		// TODO Auto-generated method stub
		List<Integer> nCestas = new ArrayList<Integer>();
		for (int i = 0; i < estoque.size(); i++) {
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
			Collections.sort(nCestas);
		}
		System.out.println("O n�mero de cestas completas � de: " + nCestas.get(0));		
	}

	@Override
	public void distribuirCestas(int n) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


