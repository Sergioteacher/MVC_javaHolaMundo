package mvc_javaHolaMundo;

public class Controlador {

	private Modelo mi_modelo;
	private Vista mi_vista;
	
	public Controlador(Modelo mi_modelo, Vista mi_vista) {

		this.mi_modelo = mi_modelo;
		this.mi_vista = mi_vista;
		
		
		
	}

	public void iniciarVista() throws Throwable {
		mi_modelo.setTexto("Hola Mundo!");
		mi_vista.campoTexto = mi_modelo.getTexto();
		
		mi_vista.Presenta();
		mi_vista.finalize();
	}
	
}
