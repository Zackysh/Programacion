package models;

import java.util.ArrayList;

public class Mano extends Mazo {
	
	/**
	 * He optado por relacionar la mano con la mesa, para que pueda interactuar
	 * directamente con cualquier elemento (jugador, baraja...) en lugar de solo con
	 * la baraja.
	 * 
	 * Para que esta clase cumpliese con el diagrama original, deber�a relacionarse
	 * solo con la baraja. En el costructor recibir�a la
	 * baraja en lugar de la mesa.
	 * 
	 * private Baraja baraja; en lugar de private Mesa mesa;
	 */	 
	private Mesa mesa;
	
	/**
	 * Constructor que sigue el modelo UML.
	 * 
	 * @param baraja
	 */
	public Mano(Baraja baraja) { // No se implementa en los juegos.
		
	}
	
	/**
	 * Costructor de mano. Recibir� la mesa en la que jugar� y contendr� los
	 * elemetnos con los que interactuar� cuando sea necesario.
	 * 
	 * @param mesa Mesa de juego.
	 */
	public Mano(Mesa mesa) { // Se implementa en cada juego.
		this.lista = new ArrayList<Carta>();
		this.mesa = mesa;
	}
	
	/**
	 * M�todo que roba una carta de la baraja en la mesa y la a�ade a la mano. Solo
	 * robar� carta si la baraja de la mesa no est� vac�a.
	 */
	public void insertarCarta(Carta carta) {
		if(carta != null)
			this.lista.add(carta);
	}

	/**
	 * M�todo que devolver� la carta cuyo �ndice coincida con el par�metro que
	 * recibe el m�todo, borr�ndola en el proceso.
	 * 
	 * @param index �ndice de la carta objetivo.
	 * @return carta Carta deseada. Se borra de la mano.
	 */
	public Carta jugarCarta(int index) {
		Carta temp = this.lista.get(index);
		this.lista.remove(index);
		return temp;
	}
	
	/**
	 * M�todo que devuelve el n�mero de cartas que hay en la mano.
	 * 
	 * @return numero N�mero de cartas que quedan en la mano.
	 */
	public int getNumroCartas() {
		return this.lista.size();
	}
	
	/**
	 * M�tdodo que devuelve la �ltima carta que se ha a�adido a la mano.
	 * 
	 * @return carta �ltima carta a�adida.
	 */
	public Carta ultimaCartaInsertada() {
		return this.lista.get(this.lista.size()-1);
	}
}
