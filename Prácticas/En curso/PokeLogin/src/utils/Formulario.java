package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* La clase JFrame encapsula el concepto de una ventana, para implementar una aplicaci�n que muestre una ventana debemos plantear una clase que herede de la clase JFrame e implemente a a ActionListener para el evento del bot�n*/
public class Formulario extends JFrame implements ActionListener {

	/* Definimos variables. */
	private JMenuBar menuBar;
	private JMenu menu1, menu2, menu3;
	private JMenuItem menuItem21, menuItem22, menuItem31, menuItem32;

	/*
	 * En el constructor de la clase llamamos al m�todo heredado de la clase JFrame
	 * llamado setLayout y le pasamos como par�metro un valor null, con esto estamos
	 * inform�ndole a la clase JFrame que utilizaremos posicionamiento absoluto para
	 * los controles visuales dentro del JFrame
	 */
	public Formulario() {

		setLayout(null);

		/* Creamos el JMenuBar y lo asociamos con el JFrame */
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		/*
		 * Creamos el primer JMenu y lo pasamos como par�metro al JMenuBar mediante el
		 * m�todo add
		 */
		menu1 = new JMenu("Opciones");
		menuBar.add(menu1);

		/*
		 * Creamos el segundo y tercer objetos de la clase JMenu y los asociamos con el
		 * primer JMenu creado
		 */
		menu2 = new JMenu("Tama�o de la ventana");
		menu1.add(menu2);
		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3);

		/*
		 * Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el
		 * segundo JMenu
		 */
		menuItem21 = new JMenuItem("640*480");
		menu2.add(menuItem21);
		menuItem21.addActionListener(this);
		menuItem22 = new JMenuItem("1024*768");
		menu2.add(menuItem22);
		menuItem22.addActionListener(this);

		/*
		 * Creamos los otros dos objetos de la clase JMenuItem y los asociamos con el
		 * tercer JMenu
		 */
		menuItem31 = new JMenuItem("Rojo");
		menu3.add(menuItem31);
		menuItem31.addActionListener(this);
		menuItem32 = new JMenuItem("Verde");
		menu3.add(menuItem32);
		menuItem32.addActionListener(this);
	}

	/* M�todo que implementa las acciones de cada �tem de men� */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem21) {
			setSize(640, 480);
		}
		if (e.getSource() == menuItem22) {
			setSize(1024, 768);
		}
		if (e.getSource() == menuItem31) {
			getContentPane().setBackground(new Color(255, 0, 0));
		}
		if (e.getSource() == menuItem32) {
			getContentPane().setBackground(new Color(0, 255, 0));
		}
	}

	/*
	 * En el m�todo main creamos un objeto de la clase Formulario, llamamos al
	 * m�todo setBounds para ubicar y dar tama�o al control y mediante el m�todo
	 * setVisible hacemos visible el JFrame
	 */
	public static void main(String[] args) {

		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0, 0, 300, 200);
		formulario1.setVisible(true);

	}

}