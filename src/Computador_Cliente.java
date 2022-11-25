
public class Computador_Cliente {

	private String nome;
	private String so;
	private double memoriaRam;
	private double memoriaFree;
	private double memoriaLoad;
	private String drive;

	

	public Computador_Cliente(String nome, String so, double memoriaRam, double memoriaFree, double memoriaLoad,
			String drive) {
		this.nome = nome;
		this.so = so;
		this.memoriaRam = memoriaRam;
		this.memoriaFree = memoriaFree;
		this.memoriaLoad = memoriaLoad;
		this.drive = drive;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public double getMemoriaFree() {
		return memoriaFree;
	}

	public void setMemoriaFree(double memoriaFree) {
		this.memoriaFree = memoriaFree;
	}

	public double getMemoriaLoad() {
		return memoriaLoad;
	}

	public void setMemoriaLoad(double memoriaLoad) {
		this.memoriaLoad = memoriaLoad;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}
	
	

}
