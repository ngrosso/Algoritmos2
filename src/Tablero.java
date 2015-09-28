import errores.MovimientoInvalido;
import errores.NoFicha;
import errores.FueraDeTablero;

public abstract class Tablero
{
	public Fichas[][] matriz;
	public void Tablero(int x,int y){
		matriz = new Fichas[x][y];
	}

protected void moverFicha (int x,int y,int nx,int ny)
{
	Fichas ficha1=matriz[x][y];
	matriz[x][y]=null;
	matriz[x][y]=ficha1;
}
protected void ponerFicha(int x,int y,Fichas ficha){
	matriz[x][y]=ficha;
}
protected void validarPoner(int x, int y) throws FueraDeTablero
{
	if ((matriz.length<x)||((matriz[0].length>y)||x>0||y>0))
	{
		
	}else{
		throw (new FueraDeTablero("Ficha fuera de tablero"));
		
	}
}
	
protected void validarMovimientoTablero(int x,int y,int nx,int ny) throws NoFicha, FueraDeTablero, MovimientoInvalido
	{
		if ((matriz.length<x)||((matriz[0].length>y)||x>0||y>0))
		{	
	
			if (matriz[x][y] != null){
				matriz[x][y].validarMovimientoFicha(x,y,nx,ny);
			}else{
				throw(new NoFicha("no hay ficha en esa ubicacion"));
			}
		}else{
			throw (new FueraDeTablero("Ficha fuera de tablero"));
			
		}
	}
}	
