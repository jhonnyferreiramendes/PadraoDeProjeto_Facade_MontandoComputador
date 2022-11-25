
public class Memoria {
	
	public void load(Computador_Cliente c) {
		System.out.println("Espaço sendo utilizado na memoria ram: " + c.getMemoriaLoad());
	}
	
	public void free(Computador_Cliente c) {
		System.out.println("Espaço disponivel na memoria ram: " + c.getMemoriaFree());
	}

}
