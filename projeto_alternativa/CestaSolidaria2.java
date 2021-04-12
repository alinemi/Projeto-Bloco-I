package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CestaSolidaria2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MENU PRINCIPAL

		Scanner ler = new Scanner(System.in);

		int opt1, opt2, opt3, qtde, prosseguir;

		List<Integer> cb1 = new ArrayList<Integer>();
		List<String> produto = new ArrayList<String>();
		List<Integer> estoque = new ArrayList<Integer>();

		
		// Estoque Padrao de Fábrica
		String nome = "estoquePadrao";

		String[] arrayproduto = {"arroz", "açúcar", "biscoito", "café", "farinha de trigo", "feijão", "leite em pó",
				"macarrão", "manteiga", "molho de tomate", "óleo", "sal", "sardinha", "seleta de legumes",
				"condicionador", "creme dental", "desodorante", "escova de dentes", "papel higienico", "sabonete",
				"shampoo" };

		int[] arrayestoque = { 10, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

		int[] arraycb1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 1; i < 20; i++) {
			produto.add(arrayproduto[i]);
			estoque.add(arrayestoque[i]);
			cb1.add(arraycb1[i]);
		}

		EstoqueAlimento meuEstoque = new EstoqueAlimento(nome, produto, estoque, cb1);
		
		//Estoquedinheiro primeiro objeto
		String nome2 = "Caixa";
		List<Integer> estoque2 = new ArrayList<Integer>();
		List<String> produto2 = new ArrayList<String>();
		List<Integer> cbDinheiro = new ArrayList<Integer>();
		produto2.add("Dinheiro");
		estoque2.add(1000);
		cbDinheiro.add(400);
		
		EstoqueDinheiro meuEstoque2 = new EstoqueDinheiro (nome2, produto2, estoque2, cbDinheiro);
		

		// Menu principal

		do {
			System.out.println("\n Escolha sua alternativa: ");
			System.out.println("-------------------------------------------");
			System.out.println("\n(1) -- Realizar doação ");
			System.out.println("\n(2) -- Visualizar estoque");
			System.out.println("\n(3) -- Total de cestas disponíveis");
			System.out.println("\n(4) -- Realizar distribuição de cesta a uma família");
			System.out.println("\n(0) -- Encerrar programa");
			opt2 = ler.nextInt();

			// Doar produto

			if (opt2 == 1) {
				// case 1:

				// Lista de opções de produto

				// System.out.println("meu estoque: " + meuEstoque.getEstoque());

				for (int i = 1; i < estoque.size(); i++) {
					meuEstoque.getEstoque().get(i);
					meuEstoque.getProduto().get(i);
					System.out.println("(" + i + ") para adicionar " + meuEstoque.getProduto().get(i));
				}

				opt3 = ler.nextInt();
				for (int i = 1; i < estoque.size(); i++) {

					if (opt3 == i) {
						System.out.println("Em quanto gostaria de incrementar?");
						qtde = ler.nextInt();
						meuEstoque.doar(i, qtde);

						System.out.println("A quantidade do produto " + meuEstoque.getProduto().get(i)
								+ " aumentou, a nova quantidade é: " + meuEstoque.getEstoque().get(i));
					}
				}

				System.out.println("Digite algum número para continuar...");
				prosseguir = ler.nextInt();

				// break;

			}
			
			// Visualizar Estoque
			if (opt2 == 2) {			
				meuEstoque.visualizar();
				
				
			}
			
			// Ver número de cestas disponíveis
			if (opt2 == 3) {
				meuEstoque.calcularCestas();	
				
				
			}
			
			
			if (opt2 == 4) {
				System.out.println("Qual a quantidade de cestas você gostaria de distribuir?");
				qtde = ler.nextInt();
				meuEstoque.distribuirCestas(qtde);		
				
				
			}

			System.out.println("Digite algum número para continuar...");
			prosseguir = ler.nextInt();
			
		} while (opt2 != 0);

	}

}
