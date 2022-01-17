package erdam.ej6.LineaTelefonica.interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBanner extends JPanel{
	//----- C O N S T R U C T O R  -----//
	/**
	 * Constructor del panel.<br>
	 * <b>post: </b>El panel quedó iniciado.
	 */
	public PanelBanner()
	{
		JLabel contenedor = new JLabel();
		ImageIcon ruta = new ImageIcon("data/Encabezado.jpg");
		contenedor.setIcon(ruta);
		add(contenedor);
	}

}
