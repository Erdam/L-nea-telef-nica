package erdam.ej6.LineaTelefonica.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
/**
 * Panel con la informaci�n de una l�nea telef�nica.
 */
@SuppressWarnings("serial")
public class PanelLineaTelefonica extends JPanel implements ActionListener{
	//------- C O N S T A N T E S -------//
    /**
     * Comando para agregar una llamada.
     */
	private static final String AGREGAR = "Agregar lllamada";
	//------- A T R I B U T O S -------//
    /**
     * Ventana principal de la aplicaci�n.
     */
	private InterfazLineaTelefonica principal;
	/**
	 * N�mero del l�nea telef�nica.
	 */
	private int 					numeroDeLinea;
	/**
	 * Etiqueta con la imagen del tel�fono.
	 */
	private JLabel 					lblImagen;
	/**
	 * Etiqueta costo de llamadas.

	 */
	private JLabel 					lblCosto;
	/**
	 * Etiqueta con el n�mero de llamadas.
	 */
	private JLabel              	lblNumeroDeLlamadas;
	/**
	 * Etiqueta con los minutos consumidos.
	 */
	private JLabel              	lblMinutos;
	/**
	 * Campo de texto para el n�mero de llamadas.
	 */
	private JTextField          	txtNumeroDeLlamadas;
	/**
	 * Campo de texto para los minutos consumidos.
	 */
	private JTextField          	txtMinutos;
	/**
	 * Bot�n para agregar llamada.
	 */
	private JButton             	btnAgregar;
	
	//----- C O N S T R U C T O R  -----//
	public PanelLineaTelefonica(InterfazLineaTelefonica pPrincipal, int pNumeroDeLinea)
	{
		principal 					= pPrincipal;
		numeroDeLinea			 	= pNumeroDeLinea;

		                   
		                  
		
		setBorder(new TitledBorder("Linea"+ numeroDeLinea));
		setPreferredSize(new Dimension(260,220));
		
		 //Etiqueta de Imagen
		
        ImageIcon icono = new ImageIcon( "data/linea"+numeroDeLinea+".png" );
        lblImagen  = new JLabel( "" );
        lblImagen .setIcon( icono );
        lblImagen .setHorizontalAlignment( JLabel.CENTER );
        
        //Etiqueta Costo
        lblCosto = new JLabel( formatearValor(0.0) );
        lblCosto.setForeground( Color.BLUE.darker( ) );
        lblCosto.setFont( new Font( "Times New Roman", Font.BOLD, 18 ) );
        lblCosto.setHorizontalAlignment( JLabel.CENTER ) ;

        //Etiqueta N�mero de llamadas
        lblNumeroDeLlamadas = new JLabel( "N�mero llamadas: " );

        //Etiqueta Total de Minutos
        lblMinutos = new JLabel( "N�mero minutos: " );

        //Campo de texto N�mero de llamadas
        txtNumeroDeLlamadas = new JTextField( 4 );
        txtNumeroDeLlamadas.setEditable( false );
        txtNumeroDeLlamadas.setText( "0" );
        
        //Campo de texto Total de Minutos
        txtMinutos = new JTextField( 4 );
        txtMinutos.setEditable( false );
        txtMinutos.setText( "0" );
        
        //Bot�n Agregar llamada
        btnAgregar = new JButton( AGREGAR );
        btnAgregar.setPreferredSize( new Dimension( 150, 25 ) );
        btnAgregar.setActionCommand( AGREGAR );
        btnAgregar.addActionListener( this );
        
        
        //Organizaci�n.
        JPanel panelDatos = new JPanel( new GridLayout( 4, 1 ) );
        JPanel panelLlamadas = new JPanel( new BorderLayout( ) );
        JPanel panelMinutos = new JPanel( new BorderLayout( ) );
        
        panelDatos.setBorder( new EmptyBorder( 8, 0, 8, 0 ) );
        panelDatos.add(  lblCosto );
        panelDatos.add( panelLlamadas );
        panelDatos.add( panelMinutos );
        panelDatos.add( btnAgregar );
  
        panelLlamadas.add( lblNumeroDeLlamadas, BorderLayout.CENTER );
        panelLlamadas.add( txtNumeroDeLlamadas, BorderLayout.EAST );
        panelMinutos.add( lblMinutos, BorderLayout.CENTER );
        panelMinutos.add( txtMinutos, BorderLayout.EAST );

		add(lblImagen);
		add(panelDatos);
	}

	//--------- M � T O D O S ----------//

    /**
     * Actualiza la visualizaci�n de la informaci�n.
     * @param pCostoLlamadas Costo total de las llamadas realizadas en esta l�nea. pCostoLlamadas>=0. 
     * @param pTotalLLamadas Total n�mero de llamadas. pTotalLlamadas>=0.
     * @param pTotalMinutos Total n�mero de minutos. pTotalMinutos>=0.
     */
    public void actualizar( double pCostoLlamadas, int pTotalLLamadas, int pTotalMinutos)
    {
    	lblCosto.setText(formatearValor(pCostoLlamadas));
    	txtMinutos.setText(formatearValorEntero(pTotalMinutos));
    	txtNumeroDeLlamadas.setText(formatearValorEntero(pTotalLLamadas));
    	
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
	
	@Override
	public void actionPerformed(ActionEvent pEvento) {
	String command = pEvento.getActionCommand();
	if(command.equals(AGREGAR))
	{
		principal.agregarLlamada(numeroDeLinea);
	}
		
	}
}
