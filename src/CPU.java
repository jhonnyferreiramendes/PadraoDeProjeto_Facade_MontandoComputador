
public class CPU {
	
	public void start(Computador_Cliente c) {
		System.out.println("O computador do cliente " + c.getNome() +" esta sendo inicializando!");
	}
	
	public void execute(Computador_Cliente c) {
		System.out.println("Executando o sistema operacinal " +c.getSo());
	}

}
