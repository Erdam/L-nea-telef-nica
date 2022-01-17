package erdam.ej6.LineaTelefonica.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * Panel para reiniciar las llamadas telef�nicas
 *
 */

@SuppressWarnings("serial")
public class PanelBoton extends JPanel implements ActionListener {
	//------- C O N S T A N T E S -------//
	/**
	 * Comando para reiniciar la lineas telef�nicas
	 */
	private final static String REINICIAR = 	"Reiniciar";
	//------- A T R I B U T O S -------//
	/**
	 * Ventana principal de la aplicaci�n,
	 */
	private InterfazLineaTelefonica principal;
	/**
	 * Bot�n para reiniciar las llamadas
	 */
	private JButton reiniciar;
	//----- C O N S T R U C T O R  -----//

	/**
	 * Constructor del panel.<br>
	 * <b></b> Se construy� el panel. <br>
	 * @param pPrincipal Ventana principal de la aplicaci�n. pPrincipal!=null.
	 */
	public PanelBoton(InterfazLineaTelefonica pPrincipal) {
	principal = pPrincipal;
	setLayout(new BorderLayout());
	TitledBorder border = BorderFactory.createTitledBorder("Opciones");
	border.setTitleColor(Color.BLACK);
	setBorder(border);
	//**** Inicializa Bot�n ****//
	reiniciar = new JButton(REINICIAR);
	reiniciar.setActionCommand(REINICIAR);
	reiniciar.addActionListener(this);
	add(reiniciar,BorderLayout.CENTER);
	
	
	}//--------- M � T O D O S ----------//
	

	@Override
	public void actionPerformed(ActionEvent pEvento) {
		String command = pEvento.getActionCommand();
		if(command.equals(REINICIAR))
		{
			principal.reiniciar();
			JOptionPane.showMessageDialog(this,"Se Reiniciaron todas las lineas telef�nicas","mensaje", JOptionPane.INFORMATION_MESSAGE );
		}
		
	}

}
