package erdam.ej6.LineaTelefonica.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * panel para mostrar el total del costo.
 */
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
@SuppressWarnings("serial")
/**
 * Panel con los totales.
 */
public class PanelCostoTotal extends JPanel {
	//------- A T R I B U T O S -------//
	/**
	 * Etiqueta con el costo.
	 */
	private JLabel lblCosto;
	/**
	 * Etiqueta con el n�mero de llamadas.
	 */
	private JLabel lblNumeroDeLlamadas;
	/**
	 * Etiqueta con los minutos consumidos.
	 */
	private JLabel lblMinutos;
	
	/**
     * Etiqueta costo promedio de llamadas.
     */
    private JLabel lblCostoPromedio;
	/**
	 * Texto con el costo.
	 */
	private JTextField txtCosto;
	/**
	 * Texto con el m�mero de llamadas.
	 */
	private JTextField txtNumeroDeLlamadas;
	/**
	 * Texto con los minutos consumidos.
	 */
	private JTextField txtMinutos;
	/**
	 * Texto con el costo promedio
	 */
	private JTextField txtCostoPromedio;
	
	//----- C O N S T R U C T O R  -----//
    /**
     * Constructor del panel.
     * <b>post: </b> Se construy� el panel.
	 */
	public PanelCostoTotal()
	{
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Totales");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		lblCosto 							= new JLabel("Costo total:");
		lblCosto.setForeground(Color.BLUE.darker());
		lblCosto.setFont(new Font("omic Sans MS",Font.BOLD,20));
		lblNumeroDeLlamadas 				= new JLabel("N�mero total de llamadas:");
		lblMinutos         				 	= new JLabel("N�mero total de minutos:");
		lblCostoPromedio       		   		= new JLabel("Costo promedio por minutos:");
		txtCosto 							= new JTextField(8);
		txtCosto.setText(formatearValor(0.0));
		txtCosto.setForeground(Color.BLUE.brighter());
		txtCosto.setFont(new Font("omic Sans MS", Font.BOLD, 16));
		txtCosto.setEditable(false);
		txtNumeroDeLlamadas 				= new JTextField(8);
		txtNumeroDeLlamadas.setText("0");
		txtNumeroDeLlamadas.setEditable(false);
		txtMinutos 							= new JTextField(6);
		txtMinutos.setText("0");
		txtMinutos.setEditable(false);
		txtCostoPromedio 					= new JTextField(0);
		txtCostoPromedio.setEditable(false);
		txtCostoPromedio.setText("N/A");
		JPanel contenedor			 		= new JPanel();
		
		contenedor.setLayout(new GridLayout(4,2));
		contenedor.add(lblCosto);
		contenedor.add(txtCosto);
		contenedor.add(lblNumeroDeLlamadas);
		contenedor.add(txtNumeroDeLlamadas);
		contenedor.add(lblMinutos);
		contenedor.add(txtMinutos);
		contenedor.add(lblCostoPromedio);
		contenedor.add(txtCostoPromedio);
		
		add(contenedor);
		
	}
	//--------- M � T O D O S ----------//
	 /**
     * Actualiza la informaci�n.
     * @param pCostoTotal Costo total de las llamadas de las tres l�neas. pCostoTotal>=0.
     * @param pTotalLlamadas Total n�mero de llamadas. pTotalLlamadas>=0.
     * @param pTotalMinutos Total n�mero de minutos. pTotalMinutos>=0.
     * @param pCostoPromedio Costo promedio por minutos. pCostoPromedio>=0.
     */
    public void actualizar( double pCostoTotal, int pTotalLlamadas, int pTotalMinutos, double pCostoPromedio )
    {
         txtCosto.setText(formatearValor(pCostoTotal));
         txtNumeroDeLlamadas.setText(formatearValorEntero(pTotalLlamadas));
         txtMinutos.setText(formatearValorEntero(pTotalMinutos));
         
         if( !Double.isNaN( pCostoPromedio ) )
         {
        	  txtCostoPromedio.setText(formatearValor(pCostoPromedio));
         }
         else
         {
         	txtCostoPromedio.setText( "N/A" );
         }

    }
    //---------------------------------------------------//
	/**
	 * Formatea un valor num�rico para presentar en la interfaz <br>
	 * @param pValor Valor num�rico a ser formateado. pValor >0.
	 * @return Retorna una cadena con el valor formateado con puntos y signos.
	 */
    private String formatearValor(Double pValor) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$  ###,###.##");
		df.setMinimumFractionDigits(2);
		return df.format(pValor);

	}
  //---------------------------------------------------//
	/**
	 * Formatea un valor num�rico para presentar en la interfaz <br>
	 * @param pValor Valor num�rico a ser formateado. pValor >0.
	 * @return Retorna una cadena con el valor formateado con puntos y signos.
	 */
    private String formatearValorEntero( int pValor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( " ###,###" );
        df.setMinimumFractionDigits( 0 );
        return df.format( pValor );
    }
	 //---------------------------------------------------//


}
