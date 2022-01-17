package erdam.ej6.LineaTelefonica.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import erdam.ej6.LineaTelefonica.mundo.Empresa;

/**
 * Ventana principal de la aplicación.
 */

@SuppressWarnings("serial")
public class InterfazLineaTelefonica extends JFrame {
	/**
	 * Clase principal del mundo.
	 */
	private Empresa empresa;
	/**
	 * Panel de la linea 1
	 */
	private PanelLineaTelefonica linea1;
	/**
	 * Panel de la linea 2
	 */
	private PanelLineaTelefonica linea2;
	/**
	 * Panel de la linea 3
	 */
	private PanelLineaTelefonica linea3;
	/**
	 * Panel del banner
	 */
	private PanelBanner banner;
	/**
	 * Panel del costo total
	 */
	private PanelCostoTotal panelCostoTotal;
	/**
	 * Panel del botón
	 */
	private PanelBoton panelBoton;
	
	/**
	 * Constructor de la interfaz <br>
	 * <b>post:</b> se inicializó la interfaz inicial y todo sus paneles.<br>
	 */
	public InterfazLineaTelefonica()
	{
		empresa 		= new Empresa();
		panelBoton 		= new PanelBoton(this);
		panelCostoTotal = new PanelCostoTotal();
		banner 			= new PanelBanner();
		linea1 			= new PanelLineaTelefonica(this, 1);
		linea2 			= new PanelLineaTelefonica(this, 2);
		linea3 			= new PanelLineaTelefonica(this, 3);
		JPanel contenedorHeader = new JPanel();
		JPanel contenedorFooter = new JPanel();
		setSize(600, 635);
		setTitle("Línea Telefónica");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(banner,BorderLayout.NORTH);
		contenedorHeader.setLayout(new GridLayout(1, 3));
		contenedorHeader.add(linea1);
		contenedorHeader.add(linea2);
		contenedorHeader.add(linea3);
		getContentPane().add(contenedorHeader,BorderLayout.CENTER);
		contenedorFooter.setLayout(new BorderLayout());
		contenedorFooter.add(panelCostoTotal,BorderLayout.CENTER);
		contenedorFooter.add(panelBoton,BorderLayout.SOUTH);
		getContentPane().add(contenedorFooter,BorderLayout.SOUTH);
		}


    /**
     * Agrega una llamada a una línea telefónica. <br>
     * @param pNumeroDeLinea Número de la línea telefónica. pNumeroDeLinea>0 && pNumeroDeLinea<4.
     */
	
		public void agregarLlamada(int pNumeroDeLinea) {

			String minutos = JOptionPane.showInputDialog(this, "Número de minutos hablados:", "Agregar llamada",
					JOptionPane.QUESTION_MESSAGE);
			try {
				if (minutos != null) {
					int min = Integer.parseInt(minutos);
					if (min <= 0) {
						JOptionPane.showMessageDialog(this, "El número de minutos debe ser mayor a cero",
								"Agregar llamada", JOptionPane.ERROR_MESSAGE);
						return;
					}
					Object[] lista = { "Local", "Larga distancia", "Celular" };

					String tipo = (String) JOptionPane.showInputDialog(this, "Tipo de llamada:", "Tipo",
							JOptionPane.QUESTION_MESSAGE, null, lista, "Local");
					if (tipo != null) {

						switch (pNumeroDeLinea) {
						case 1:
							switch (tipo) {
							case "Local":
								empresa.getLinea1().llamadaLocal(min);
								break;
							case "Larga distancia":
								empresa.getLinea1().llamadaLargaDistancia(min);
								break;
							case "Celular":
								empresa.getLinea1().llamadaCelular(min);
								break;
							}

							break;
						case 2:
							switch (tipo) {
							case "Local":
								empresa.getLinea2().llamadaLocal(min);
								break;
							case "Larga distancia":
								empresa.getLinea2().llamadaLargaDistancia(min);
								break;
							case "Celular":
								empresa.getLinea2().llamadaCelular(min);
								break;
							}

							break;
						case 3:
							switch (tipo) {
							case "Local":
								empresa.getLinea3().llamadaLocal(min);
								break;
							case "Larga distancia":
								empresa.getLinea3().llamadaLargaDistancia(min);
								break;
							case "Celular":
								empresa.getLinea3().llamadaCelular(min);
								break;
							}
							break;
						}
						actualizar();
					}
				}
			} catch (NumberFormatException pEvent) {
				JOptionPane.showMessageDialog(this, "El número de minutos es inválido", "Agregar llamada",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		 //---------------------------------------------------//
		
		/**
		 * Actualiza la visualización de la interfaz. <br>
	     * <b>post: </b> Se actualizó la información de la interfaz.<br> 
		 */
	   private void actualizar() {
			
			panelCostoTotal.actualizar(empresa.darTotalCostoLlamadas(), empresa.darTotalNumeroDeLlamadas(),empresa.darTotalMinutos(), empresa.darCostoPromedioMinuto());
			linea1.actualizar(empresa.getLinea1().getCostoLlamada(),empresa.getLinea1().getNumeroLlamada(),empresa.getLinea1().getNumeroMinutos());
			linea2.actualizar(empresa.getLinea2().getCostoLlamada(),empresa.getLinea2().getNumeroLlamada(),empresa.getLinea2().getNumeroMinutos());
			linea3.actualizar(empresa.getLinea3().getCostoLlamada(),empresa.getLinea3().getNumeroLlamada(),empresa.getLinea3().getNumeroMinutos());
		}
		 //---------------------------------------------------//
	   
	   /**
	    * Reinicia las líneas telefónicas. <b>post: </b> Se reinició las líneas telefónicas.
	    */
	   public void reiniciar() {
		   empresa.reiniciar();
		   //actualizar(); 
	   }
	   //---------------------------------------------------//
	/**
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
     */
	public static void main(String[] pArgs) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			InterfazLineaTelefonica principal = new InterfazLineaTelefonica();
			principal.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
