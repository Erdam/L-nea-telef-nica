package erdam.ej6.LineaTelefonica.mundo;
/**
 * Clase que representa una l�nea telef�nica.
 */
public class LineaTelefonica {
	//------- A T R I B U T O S -------//
    /**
     * N�mero de llamadas realizadas.
     */
	private int 	numeroLlamada;
	/**
     * N�mero de minutos consumidos.
     */

	private int 	numeroMinutos;
	/**
     * Costo total de las llamadas.
     */

	private double 	costoLlamada;
    /**
     * Inicializa la l�nea telef�nica. <br>
     * <b>post: </b> La l�nea se inicializ� con valores en cero.
     */
	//----- C O N S T R U C T O R  -----//
	public LineaTelefonica()
	{
		numeroLlamada = 0;
		numeroMinutos = 0;
		costoLlamada = 0;
	}
	//--------- M � T O D O S ----------//
	
    /**
     * Retorna el n�mero de llamadas realizadas por esta l�nea.
     * @return N�mero de llamadas realizadas por esta l�nea.
     */
	public int getNumeroLlamada() {
		return numeroLlamada;
	}
	
	 //---------------------------------------------------//
    /**
     * Retorna el n�mero de minutos consumidos.
     * @return N�mero de minutos consumidos.
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
	 * Reinicia la l�nea telef�nica, dejando todos sus valores en cero.<br>
	 * <b> post: </b> El n�mero de llamadas, n�mero de minutos y costo de llamadas son 0.
	 */
	public void reiniciar()
	{
		numeroLlamada 	= 0;
		numeroMinutos 	= 0;
		costoLlamada 	= 0;
	}
	
	 //---------------------------------------------------//
	/**
     * Agrega una llamada local a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 35 ).
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
	public void llamadaLocal(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 35);
		
	}
	
	 //---------------------------------------------------//
	/**
     * Agrega una llamada de larga distancia a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 380 )
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
	public void llamadaLargaDistancia(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 380);
	}
	
	 //---------------------------------------------------//
    /**
     * Agrega una llamada a celular a la l�nea telef�nica <br>
     * <b>post: </b> Se increment� en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos, costoLlamadas aument� en ( minutos * 999 )
     * @param pMinutos N�mero de minutos de la llamada. pMinutos >0.
     */
	public void llamadaCelular(int pMinuto)
	{
		numeroLlamada +=1;
		numeroMinutos +=pMinuto;
		costoLlamada +=(pMinuto * 999);
	}

}
