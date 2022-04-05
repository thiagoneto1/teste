
public class Teste {
	
	public static void main(String[] args) {
		//Ponto de partida: Coloco os objetos em memória
		Cachorro c = new Cachorro();
		c.nome = "BIDU";
		c.raca = "SRD";
		c.latir();
		c.mostrarRaca();
		
		Cachorro d = new Cachorro();
		d.nome = "AMORA";
		d.raca = "PASTOR";
		d.latir();
		d.mostrarRaca();
	}

}
