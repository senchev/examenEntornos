
public class DNI {

	private boolean numeros() {

		String numero = "";
		String dni = "";
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22" };

		for (int i = 0; i < dni.length() - 1; i++) {
			numero = dni.substring(i, i + 1);

			for (int j = 0; j < numeros.length; j++) {
				if (numero.equals(numeros[j])) {
					dni += numeros[j];
				}
			}

		}

		if (dni.length() != 8) {
			return false;
		} else {
			return true;
		}

	}

	public String dni() {
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };
		int dni = Integer.parseInt(this.dni().substring(0, 8));
		int resta = 0;
		String letra = "";

		resta = dni % 23;
		letra = asignacionLetra[resta];
		return null;
	}

	private boolean comprobar() {
		String mayusucla = "";
		if (dni().length() != 9 || Character.isLetter(this.dni().charAt(8)) == false) {
			return false;
		}

		mayusucla = (this.dni().substring(8)).toUpperCase();

		if (numeros() == true && dni().equals(mayusucla)) {
			return true;
		} else {
			return false;
		}
	}

}
