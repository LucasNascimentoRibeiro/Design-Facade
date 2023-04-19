public class Combo {
	
	private Burger burger;
	private Bebida bebida;
	private Sobremesa sobremesa;
	
	public Combo() {}
	
	public void criarCombo(int tipo) {
		
		switch (tipo) {
		case 1:
			this.burger = new Burger("Hambúrguer de Queijo", 20.99, 150);
			this.bebida = new Bebida("Refrigerante de Laranja", 8.99, 500);
			this.sobremesa = new Sobremesa("Sorvete de Chocolate", 6.99, "Médio");
			break;
		case 2:
			this.burger = new Burger("Hambúrguer de Frango", 30.99, 120);
			this.bebida = new Bebida("Coca-cola", 10.99, 300);
			this.sobremesa = new Sobremesa("Pudim de Leite", 5.99, "Pequeno");
		break;
		}
	}
	
	public String toString() {
		return "Combo: " +
		"\n" + this.burger.getDescricao() + " - R$" + this.burger.getPreco() + " - Gramas: " + this.burger.getGramas() +
		"\n" + this.bebida.getDescricao() + " - R$" + this.bebida.getPreco() + " - ML: " + this.bebida.getMl() +
		"\n" + this.sobremesa.getDescricao() + " - R$" + this.sobremesa.getPreco() + " - Tamanho: " + this.sobremesa.getTamanho();
	}
	
}