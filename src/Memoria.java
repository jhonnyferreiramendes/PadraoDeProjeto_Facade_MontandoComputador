
public class Memoria {
	
	public void load(Computador_Cliente c) {
		System.out.println("Espa�o sendo utilizado na memoria ram: " + c.getMemoriaLoad());
	}
	
	public void free(Computador_Cliente c) {
		System.out.println("Espa�o disponivel na memoria ram: " + c.getMemoriaFree());
	}

}
