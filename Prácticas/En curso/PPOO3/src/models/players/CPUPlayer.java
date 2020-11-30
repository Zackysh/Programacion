package models.players;

import enums.EnumGame.Juegos;
import models.Mano;
import models.games.Game;
import utils.StringUtils;

public class CPUPlayer extends Player {

	public CPUPlayer(String nombre, Game game) {
		super(nombre, 0, new Mano(game.getMesa()), game);
	}

	@Override
	public void jugarTurno(Juegos juego) {
		System.out.print(
				    "Jugador: " + this.getNombre() + "\n"
				  + "Puntuaci�n actual: " + this.puntos + "\n");
		StringUtils.br();
		if(this.puntos < 6) {
			System.out.println("Ha decidido robar");
			this.robar();
			this.puntos += this.mano.ultimaCartaInsertada().getValor7yMedia();
			System.out.println(
					  "Carta robada: " + this.mano.ultimaCartaInsertada() + "\n"
					+ "Valor que suma: " + this.mano.ultimaCartaInsertada().getValor7yMedia() + "\n"
					+ "Nueva puntuaci�n: " + this.puntos);
		} else {
			System.out.println("Ha decidido plantarse con " + this.puntos);
			this.plantarse();
		}
		
		StringUtils.br();
	}
}