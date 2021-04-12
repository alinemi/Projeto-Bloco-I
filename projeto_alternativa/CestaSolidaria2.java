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

		
		// Estoque Padrao de F�brica
		String nome = "estoquePadrao";

		String[] arrayproduto = {"arroz", "a��car", "biscoito", "caf�", "farinha de trigo", "feij�o", "leite em p�",
				"macarr�o", "manteiga", "molho de tomate", "�leo", "sal", "sardinha", "seleta de legumes",
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
			System.out.println("\n(1) -- Realizar doa��o ");
			System.out.println("\n(2) -- Visualizar estoque");
			System.out.println("\n(3) -- Total de cestas dispon�veis");
			System.out.println("\n(4) -- Realizar distribui��o de cesta a uma fam�lia");
			System.out.println("\n(0) -- Encerrar programa");
			opt2 = ler.nextInt();

			// Doar produto

			if (opt2 == 1) {
				// case 1:

				// Lista de op��es de produto

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
								+ " aumentou, a nova quantidade �: " + meuEstoque.getEstoque().get(i));
					}
				}

				System.out.println("Digite algum n�mero para continuar...");
				prosseguir = ler.nextInt();

				// break;

			}
			
			// Visualizar Estoque
			if (opt2 == 2) {			
				meuEstoque.visualizar();
				
				
			}
			
			// Ver n�mero de cestas dispon�veis
			if (opt2 == 3) {
				meuEstoque.calcularCestas();	
				
				
			}
			
			
			if (opt2 == 4) {
				System.out.println("Qual a quantidade de cestas voc� gostaria de distribuir?");
				qtde = ler.nextInt();
				meuEstoque.distribuirCestas(qtde);		
				
				
			}

			System.out.println("Digite algum n�mero para continuar...");
			prosseguir = ler.nextInt();
			
		} while (opt2 != 0);

	}

}
