import javax.swing.JOptionPane;

/**
 * 
 * Proyecto Challenger Conversor de Monedas
 * 
 * @author: Manuel Andrades Mella
 * 
 * @version: 27/07/2023 V.1
 * 
 */

public class Conversor_Monedas {

	public static void main(String[] args) {

		arregloValores();
	}

	public static void arregloValores() {

		/**
		 * Crea un array, con los valores a desplegar en el menu de conversion
		 * 
		 * @param monedas2 Array con la lista de conversiones
		 * @param Lista    Lista despegable con las conversiones cargadas desde el array
		 *                 monedas 2
		 */

		String monedas2[] = { "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras", "Pesos a Yen Japones",
				"Pesos a Won Coreano", "Dolar a Pesos", "Euros a Pesos", "Libras a Pesos", "Yen a Pesos",
				"Won Coreano a Pesos" };

		String Lista = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir: ",
				"Conversor de Moneda", JOptionPane.DEFAULT_OPTION, null, monedas2, monedas2[0]);

		String monedas = Lista;

		if (monedas == null) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");

			/**
			 * @param monedas Metodo If, para preguntar si del string moneda paso algun dato
			 *                desde Lista, si es Null, este envia mensaje de termino del
			 *                programa
			 */

		} else {

			/**
			 * try Catch, para hacer manejo de excepciones, y hacer el reqerimienro de
			 * "Valor no Valido"
			 */

			try {

				switch (monedas) {

				/**
				 * Case, se usa para uso de las opciones de conversiones, cada case tiene un
				 * valor distinto, y hace la operacion destinada a hacer segun el nombre de
				 * este.
				 * 
				 * Case DEFAULT, no se usa en este caso, ya que no hay que ingresar alguna
				 * opcion, la opcion se cargan automaticamnte desde el Array
				 */
				case "Pesos a Dolar":
					double valord = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valord / 800 + " Dolares");
					break;
				case "Pesos a Euros":
					double valoreu = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valoreu / 914 + " Euros");
					break;
				case "Pesos a Libras":
					double valorlb = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valorlb / 1068 + " Libras");
					break;
				case "Pesos a Yen Japones":
					double valoryn = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valoryn / 5.917 + " Yen Japones");
					break;
				case "Pesos a Won Coreano":
					double valorwn = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valorwn / 0.65 + " Won Coreano");
					break;
				case "Dolar a Pesos":
					double valord2 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valord2 * 800 + " Pesos");
					break;
				case "Euros a Pesos":
					double valoreu2 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valoreu2 * 914 + " Pesos");
					break;
				case "Libras a Pesos":
					double valorlb2 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valorlb2 * 1068 + " Pesos");
					break;
				case "Yen a Pesos":
					double valoryn2 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valoryn2 * 5.917 + " Pesos");
					break;
				case "Won Coreano a Pesos":
					double valorwn2 = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Introduce valor a cambiar", 0.0));
					JOptionPane.showMessageDialog(null, "Tienes " + valorwn2 * 0.65 + " Pesos");
					break;

				default:

					break;
				}

				int salida = JOptionPane.showConfirmDialog(null, "Deseas Salir");

				/**
				 * ShowConfirmDialog, se usa, para realizar la pregunta de salir del programa,
				 * este envia un paranmetro que se guarda en salida
				 * 
				 * @param salida, aca llega un pametro, YES(0),NO(1),CANCELAR(2)
				 */
				// System.out.println(salida);

				if (salida != 0) {
					arregloValores();

				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");

				}

				/**
				 * If, realiza la pregunta al paranetro salida, si este es distinto de 0(YES),
				 * cierra el programa, de lo contrario llama a la clase arreglovalores(), y se
				 * reinicia el programa
				 */

			} catch (Exception e) {

				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Valor no Valido");
				arregloValores();

				/**
				 * @param e, Aca se realiza el manejo de excepcion, en el cual si haces ingreso
				 *           de letras te regresa un mensaje de vaor no valido, y llama a a
				 *           clase areglovalores(), para reiniciar el programa
				 */

			}

		}

	}

}
