package utils;

/**
 * Clase orientada a generar aleatoriamente valores para los constructores de
 * las clases de este proyecto.
 * 
 * Est� implmentado durante la insercci�n de nuevos veh�culos al taller.
 * Leer mensajes durante la insercci�n para m�s informaci�n.
 * 
 * @author AdriGB
 * @author Jhony
 */
public class RandomGenerator {

	/**
	 * M�todo que genera el nombre de un color aleatorio de entre unos ya
	 * predefinidos.s
	 * 
	 * @return
	 */
	public String strR_Color() {
		String[] randomColors = { "Absenta", "Alabastro", "Almendra", "Amaranto", "Amarillo", "Verde", "Negro",
				"Naranja", "Magenta", "Rosa", "Lima", "Rojo", "�mbar", "Amatista", "Azul", "Azul cobalto",
				"Azul marino", "Carmes�", "Cian", "Escarlata", "Esmeralda" };
		return randomColors[(int) (Math.random() * randomColors.length)];
	}

	/**
	 * M�todo que genera una marca de Escape de Motocicleta aleatoria de entre unas
	 * ya predefinidas.
	 * 
	 * @return String Marca aleatoria de Escape de Motocicleta .
	 */
	public String strR_MarcaEscape() {
		String[] randomBrands = { "Akrapovic", "Arrow", "Bunker", "Hurric", "Leo Vince", "MIW", "Remus", "Shark",
				"Spark", "Termignoni", "Yasuni" };
		return randomBrands[(int) (Math.random() * randomBrands.length)];
	}

	/**
	 * M�todo que genera una marca de Coche aleatoria de entre unas ya predefinidas.
	 * 
	 * @return String Marca aleatoria de Coche.
	 */
	public String strR_MarcaCoche() {
		String[] randomMarcaCoche = { "BMW", "Dacia", "Infiniti", "Kia", "Cadillac", "Ferrari", "Isuzu", "KTM",
				"Chevrolet", "Ford", "Jaguar", "Lamborghini" };
		return randomMarcaCoche[(int) (Math.random() * randomMarcaCoche.length)];
	}

	/**
	 * M�todo que genera una marca de Ciclomotor aleatoria de entre unas ya
	 * predefinidas.
	 * 
	 * @return String Marca aleatoria de Ciclomotor.
	 */
	public String strR_MarcaCiclomotor() {
		String[] randomMarcaCiclomotor = { "Yamaha", "Reiju", "Beta", "Piaggo", "Kymco", "Vespa", "Peugeot Scooters",
				"SYM Jet", "Aprilia" };
		return randomMarcaCiclomotor[(int) (Math.random() * randomMarcaCiclomotor.length)];
	}

	/**
	 * M�todo que genera una marca de Motocicleta aleatoria de entre unas ya
	 * predefinidas.
	 * 
	 * @return String Marca aleatoria de Motocicleta.
	 */
	public String strR_MarcaMotocicleta() {
		String[] randomMarcaMotocicleta = { "AJP", "Aprilia", "Arch Motocycles", "Ariel", "Benelli", "Beta", "BMW",
				"Brixton", "Brought Superior", "Can-Am", "CF Moto", "Daelim", "Derbi", "Ducati", "ENERGICA", "Fantic",
				"Gas Gas" };
		return randomMarcaMotocicleta[(int) (Math.random() * randomMarcaMotocicleta.length)];
	}

	/**
	 * M�todo que genera una matr�cula aleatoria de entre unas ya predefinidas.
	 * 
	 * @return String Matricula aleatoria.
	 */
	public String strR_Matricula() {
		String[] randomMtrs = { "7382 BYH", "1313 ZIB", "6472 BRX", "3407 LZJ", "4082 ROO", "7185 TZQ", "4121 OXC",
				"0017 YSR", "4260 YAN", "7793 UZD" };
		return randomMtrs[(int) (Math.random() * randomMtrs.length)];
	}

	/**
	 * M�todo que devuelve un tlf m�vil aleatorio de entre unos ya predefinidos.
	 * 
	 * @return String N�mero de tel�fono aleatorio.
	 */
	public String strR_Tlfmovil() {
		String[] randomTlfs = { "686 97 88 36", "608 65 29 13", "680 54 27 41", "606 22 52 71", "663 36 63 75",
				"615 21 56 64", "634 05 62 77", "760 53 65 21", "610 57 82 48", "666 79 26 95", "645 17 84 51",
				"786 39 51 19", "619 44 15 42", "669 00 07 84", "717 29 96 99", "641 78 51 92", "632 48 69 32",
				"607 28 84 87" };
		return randomTlfs[(int) (Math.random() * randomTlfs.length)];
	}

	/**
	 * /** M�todo que genera un modelo de Coche aleatorio de entre unos ya
	 * predefinidos.
	 * 
	 * @return String Modelo aleatorio de Coche.
	 */
	public String strR_CocheModel() {
		String[] modelosCoche = { "3008", "Renegade", "Wrangler", "F-Pace", "Caddy", "Arteon", "Niva", "Chiron",
				"Super 7", "Corvette C6", "Dokker", "Ateca", "C1", "C2", "C4 Cactus", "C4 SpaceTourer" };
		return modelosCoche[(int) (Math.random() * modelosCoche.length)];
	}

	/**
	 * M�todo que genera un modelo de Ciclomotor aleatorio de entre unos ya
	 * predefinidos.
	 * 
	 * @return String Modelo aleatorio de Ciclomotor.
	 */
	public String strR_CiclomotorModel() {
		String[] modelosCiclomotor = { "Aerox", "MRT 50", "RR 50", "Enduro", "Piaggio", "Typhoon", "Aprilia", "SR 50",
				"SX 50", "Senda X-Treme", "Ebroh", "Strada" };
		return modelosCiclomotor[(int) (Math.random() * modelosCiclomotor.length)];

	}

	/**
	 * M�todo que genera un modelo de Motocicleta aleatorio de entre unos ya
	 * predefinidos.
	 * 
	 * @return String Modelo aleatorio de Motocicleta.
	 */
	public String strR_MotocicletaModel() {
		String[] modelosMotocicleta = { "C 400 GT", "C 400 X", "C 650 Motorsport", "C650 Sport", "F 900 R 2020",
				"F 850 GS", "R 1250 RT", "R nineT", "S 1000 XR 2020", "Diavel 1260", "Hypermontard 950",
				"Multistrada 1250", "Scrambler 1100", "XDiavel S" };
		return modelosMotocicleta[(int) (Math.random() * modelosMotocicleta.length)];
	}

	/**
	 * M�todo que devuelve un Double entre 50 y 250. Pensado para establecer la
	 * velocidad m�xima de un veh�culo.
	 * 
	 * @return double Double comprendido entre 50 y 250.
	 */
	public double doubleR_VMax() {
		return 50 + Math.random() * 200;
	}
}
