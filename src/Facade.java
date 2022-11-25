
public class Facade {
	
	private CPU cpu;
	
	private HardDrive hd;
	
	private Memoria ram;

	public Facade() {
		this.cpu = new CPU();
		this.hd = new HardDrive();
		this.ram = new Memoria();
	}
	
	public void montarPc(Computador_Cliente c) {
		this.cpu.start(c);
		this.cpu.execute(c);
		this.ram.load(c);
		this.ram.free(c);
		this.hd.read(c);
		this.hd.write(c);
		
	}

}
