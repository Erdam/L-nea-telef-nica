package erdam.ej6.LineaTelefonica.mundo;
/**
 * Clase que representa una línea telefónica.
 */
public class LineaTelefonica {
	//------- A T R I B U T O S -------//
    /**
     * Número de llamadas realizadas.
     */
	private int 	numeroLlamada;
	/**
     * Número de minutos consumidos.
     */

	private int 	numeroMinutos;
	/**
     * Costo total de las llamadas.
     */

	private double 	costoLlamada;
    /**
     * Inicializa la línea telefónica. <br>
     * <b>post: </b> La línea se inicializó con valores en cero.
     */
	//----- C O N S T R U C T O R  -----//
	public LineaTelefonica()
	{
		numeroLlamada = 0;
		numeroMinutos = 0;
		costoLlamada = 0;
	}
	//--------- M É T O D O S ----------//
	
    /**
     * Retorna el número de llamadas realizadas por esta línea.
     * @return Número de llamadas realizadas por esta línea.
     */
	public int getNumeroLlamada() {
		return numeroLlamada;
	}
	
	 //---------------------------------------------------//
    /**
     * Retorna el número de minutos consumidos.
     * @return Número de minutos consumidos.
     */
	public int getNumeroMinutos() {
		return numeroMinutos;
	}
	
	 //---------------------------------------------------//
    /**
     * Retorna el costo total de las llamadas realizadas.
     * @return Costo total de las llamadas realizadas.
     */
	public double getCostoLlamada() {
		return costoLlamada;
	}
	
	 //---------------------------------------------------//
    /**
	 * Reinicia la línea telefónica, dejando todos sus valores en cero.<br>
	 * <b> post: </b> El número de llamadas, número de minutos y costo de llamadas son 0.
	 */
	public void reiniciar()
	{
		numeroLlamada 	= 0;
		numeroMinutos 	= 0;
		costoLlamada 	= 0;
	}
	
	 //---------------------------------------------------//
	/**
     * Agrega una llamada local a la línea telefónica <br>
     * <b>post: </b> Se incrementó en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aumentó en ( minutos * 35 ).
     * @param pMinutos Número de minutos de la llamada. pMinutos >0.
     */
	public void llamadaLocal(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 35);
		
	}
	
	 //---------------------------------------------------//
	/**
     * Agrega una llamada de larga distancia a la línea telefónica <br>
     * <b>post: </b> Se incrementó en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aumentó en ( minutos * 380 )
     * @param pMinutos Número de minutos de la llamada. pMinutos >0.
     */
	public void llamadaLargaDistancia(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 380);
	}
	
	 //---------------------------------------------------//
    /**
     * Agrega una llamada a celular a la línea telefónica <br>
     * <b>post: </b> Se incrementó en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aumentó en ( minutos * 999 )
     * @param pMinutos Número de minutos de la llamada. pMinutos >0.
     */
	public void llamadaCelular(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 999);
	}

}
