import errores.MovimientoInvalido;


public abstract class Fichas{
public Jugador due�o;
protected void validarMovimientoFicha(int x,int y,int nx,int ny) throws MovimientoInvalido{
	boolean movimientoAprobado = true;
	if (movimientoAprobado){
		
	}else{
		throw(new MovimientoInvalido("movimiento invalido"));
	}
}
}
