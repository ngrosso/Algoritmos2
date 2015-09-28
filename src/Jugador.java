import java.util.ArrayList;


public class Jugador
{
		public Juego juego;
		public ArrayList<Fichas> fichas;
		public void jugador(){
			
		}
		public void jugador(Juego njuego,ArrayList<Fichas> coleccion){
			juego=njuego;
			fichas=coleccion;
		}
		
		public void moverPieza(int x,int y,int nx,int ny){
			juego.moverPieza(x,y,nx,ny);
		}
		public void ponerPieza(int x, int y,Fichas ficha){
			juego.ponerPieza(x,y,ficha);
		}
}

