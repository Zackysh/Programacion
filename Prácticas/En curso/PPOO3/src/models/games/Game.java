package models.games;

import java.util.ArrayList;
import java.util.Collections;

import enums.EnumGame.Juegos;
import models.Mesa;
import models.players.Player;
import utils.StringUtils;

public abstract class Game {

	protected Juegos modo;
	protected ArrayList<Player> jugadores;
	protected Mesa mesa;
	protected int ronda;
	// Cuando se termina una partida es false, cuando se empieza es true.
	protected boolean finished;
	protected double[] config;
	
	public double[] getConfig() {
		return config;
	}
	
	public Mesa getMesa() {
		return mesa;
	}

	public abstract void bienvenida();

	public abstract void menuPrincipal();

	/**
	 * Cada juego recibir�, al instanciarse, una configuraci�n. Cada juego
	 * especificar� qu� valores deber� contener en su documentaci�n.
	 */
	public abstract void start(double[] config);

	public abstract Player nextTurno();

	public void launch() {
		this.finished = false;
		bienvenida();
		menuPrincipal();
		finish();
	}
	
	public void barajar() {
		this.mesa.barajarBaraja();
	}
	
	/**
	 * M�todo que devuleve las cartas de los jugadores a la baraja y
	 * restablece los datos de los jugadores (ver m�todo resetPlayerState).
	 */
	public void finish() {		
		for (Player player : jugadores) {
			for (int i = 0; i < player.getNumeroCartas(); i++) {
				mesa.addCartaBaraja(player.jugarCarta());				
			}
			player.resetPlayerState();
		}
		this.finished = true;
	}
}
