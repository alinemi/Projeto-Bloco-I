package test1;

import java.util.ArrayList;
import java.util.List;

// Essa classe cria cestas b�sicas de acordo com  a necessidade do cliente

public abstract class CestaBasica {

	protected List<String> produto = new ArrayList<String>();// Lista com nomes dos produtos que v�o na cesta b�sica

	protected List<Integer> estoque = new ArrayList<Integer>();// Lista com quantidade de produtos

	protected List<Integer> composicaoReferencia; // cesta de referencia

	protected String nome; // nome do objeto

	public CestaBasica(String nome, List<String> produto, List<Integer> estoque, List<Integer> composicaoReferencia) {
		this.nome = nome;
		this.produto = produto;
		this.estoque = estoque;
		this.composicaoReferencia = composicaoReferencia;
	}

	abstract public void doar(int codigoProduto);

	abstract public void visualizar();

	abstract public void calcularCestas();

	abstract public void distribuirCestas(int n);

	public List<String> getProduto() {
		return produto;
	}

	public void setProduto(List<String> produto) {
		this.produto = produto;
	}

	public List<Integer> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Integer> estoque) {
		this.estoque = estoque;
	}

	public List<Integer> getComposicaoReferencia() {
		return composicaoReferencia;
	}

	public void setComposicaoReferencia(List<Integer> composicaoReferencia) {
		this.composicaoReferencia = composicaoReferencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
