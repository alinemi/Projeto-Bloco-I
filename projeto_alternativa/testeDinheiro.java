package test1;

import java.util.ArrayList;
import java.util.List;

public class testeDinheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome2 = "Caixa";
		List<Integer> estoque2 = new ArrayList<Integer>();
		List<String> produto2 = new ArrayList<String>();
		List<Integer> cbDinheiro = new ArrayList<Integer>();
		produto2.add("Dinheiro");
		estoque2.add(4000);
		cbDinheiro.add(400);
		
		EstoqueDinheiro RedeDeAjudaSantaCasa = new EstoqueDinheiro (nome2, produto2, estoque2, cbDinheiro);
		
		RedeDeAjudaSantaCasa.calcularCestas();

	}

}
