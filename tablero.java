package tp.pr1;

public class Tablero {
	private Ficha [][] Tablero;
	private int ancho;
	private int alto;
	
	public Tablero(int ancho, int alto){
		this.Tablero = new Ficha [ancho][alto];
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public void reset(){
		for (int i = 0; i < this.ancho; i++){
			for (int j = 0; j < this.alto; j++){
				this.Tablero[i][j] = Ficha.VACIA;
			}
		}
	}
	public boolean consultaAltoyAncho(int ancho, int alto){
		boolean hueco = true;
		if (this.ancho < ancho){
			System.err.println("Movimiento incorrecto");
			hueco = false;
		}
		else if(this.Tablero[ancho][0] != Ficha.VACIA){
			System.err.println("Columna llena");
			hueco = false;
		}
		return hueco;
	}
	
	public void colocarFicha(int ancho, int alto, Ficha col){
		this.Tablero[ancho][alto] = col;
	}
	
	public Ficha consultaFicha(int ancho, int alto){
		Ficha col;
		col = this.Tablero[ancho][alto];
		return col;
	}
	
	public String toString(){
		String mensaje = "";
		return mensaje;
	}

}
