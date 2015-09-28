import errores.MovimientoInvalido;
import errores.NoFicha;
import errores.FueraDeTablero;

public abstract class Juego
{
	public Tablero tablero;
	public Jugador turno;
	public boolean estado;
	
	public void moverPieza(int x,int y,int nx,int ny)
	{
		try{
		tablero.validarMovimientoTablero(x,y,nx,ny);
		}catch(NoFicha ex){
		ex.printStackTrace();
		}catch(FueraDeTablero ex)
		{
		ex.printStackTrace();
		}
		catch(MovimientoInvalido ex)
		{
			ex.printStackTrace();
		}finally{
			tablero.moverFicha(x,y,nx,ny);
		}

	}
	public void ponerPieza(int x,int y,Fichas ficha){
		try{
			tablero.validarPoner(x,y);
		}catch(FueraDeTablero e){
			e.printStackTrace();
		}finally{
			tablero.ponerFicha(x,y,ficha);
		}
	}
}
