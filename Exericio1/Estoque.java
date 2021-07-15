package Exericio1;

public class Estoque {
	private int numero;
	private String marca;
	private int quantidade;
	public Estoque(int numero, String marca, int quantidade) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.quantidade = quantidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Estoque [numero=" + numero + ", marca=" + marca + ", quantidade=" + quantidade + "]";
	}
	
}
