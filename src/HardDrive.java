
public class HardDrive {
	
	public void read(Computador_Cliente c) {
		System.out.println("Lendo drive de: " + c.getDrive());
	}
	
	public void write(Computador_Cliente c) {
		System.out.println("O drive de" + c.getDrive() + "está sendo utilizado ");
	}

}
