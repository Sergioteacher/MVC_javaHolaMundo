package mvc_javaHolaMundo;

public class Vista {
	String campoTexto;

	public Vista() {
		System.out.println("");
		System.out.println("...");
		System.out.println("*********************");
		
	}
	
	public void Presenta() {
		System.out.print("   ");
		System.out.println(campoTexto);
	}

	protected void finalize()throws Throwable {
		System.out.println("*********************");
		System.out.println("...");
		System.out.println("");
		super.finalize();
	}
	
}
