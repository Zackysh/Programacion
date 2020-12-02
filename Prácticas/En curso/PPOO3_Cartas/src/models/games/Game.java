package models.games;

import java.util.ArrayList;
import java.util.Collections;

import enums.EnumGame.Juegos;
import models.Mesa;
import models.players.Player;
import utils.StringUtils;

public abstract class Game {

	// El juego transcurre en una mesa
	protected Mesa mesa;
	
	// Atributos importantes
	protected Juegos modo;
	protected ArrayList<Player> jugadores;
	
	// Atributos de estado
	protected double[] config;
	protected int ronda;
	protected boolean finished;
	
	public Game (Juegos modo, Mesa mesa) {
		this.modo = modo;
		this.mesa = mesa;
		this.jugadores = new ArrayList<Player>();
	}
	
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
			player.devolverCartas();
			player.resetPlayerState();
		}
		this.finished = true;
	}
}
