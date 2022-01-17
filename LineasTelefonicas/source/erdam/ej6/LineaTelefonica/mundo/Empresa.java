package erdam.ej6.LineaTelefonica.mundo;
/**
 * Clase que representa la empresa.
 */
public class Empresa {
	//------- A T R I B U T O S -------//
    /**
     * Línea telefónica número 1.
     */
	private LineaTelefonica linea1;
    /**
     * Línea telefónica número 2.
     */
	private LineaTelefonica linea2;
    /**
     * Línea telefónica número 3.
     */
	private LineaTelefonica linea3;
	
	//----- C O N S T R U C T O R  -----//
    /**
     * Inicializa las líneas telefónicas de la empresa. <br>
     * <b>post: </b> Se inicializaron las 3 líneas telefónicas.
     */
	public Empresa() {
		linea1 = new LineaTelefonica();
		linea2 = new LineaTelefonica();
		linea3 = new LineaTelefonica();
		}
	//--------- M É T O D O S ----------//
	 
	/**
     * Retorna la línea 1.
     * @return Línea 1.
     */
	public LineaTelefonica getLinea1() {
		return linea1;
	}
	 //---------------------------------------------------//
	 /**
     * Retorna la línea 2.
     * @return Línea 2.
     */
	public LineaTelefonica getLinea2() {
		return linea2;
	}
	 //---------------------------------------------------//
	 /**
     * Retorna la línea 3.
     * @return Línea 3.
     */
	public LineaTelefonica getLinea3() {
		return linea3;
	}
	//---------------------------------------------------//
    /**
	 * Retorna el número total de llamadas realizadas.
	 * @return Total de llamadas de las tres líneas.
	 */
	public int darTotalNumeroDeLlamadas()
	{
		int totalLlamada = linea1.getNumeroLlamada() +
						   linea2.getNumeroLlamada() +
						   linea3.getNumeroLlamada();
		return totalLlamada;
	}
	//---------------------------------------------------//
	/**
	 * Retorna el total de minutos consumidos.
	 * @return Total de minutos de las tres líneas.
	 */
	public int darTotalMinutos()
	{
		int totalMinutos = linea1.getNumeroMinutos() +
						   linea2.getNumeroMinutos() +
				           linea3.getNumeroMinutos();
		return totalMinutos;
	}
	//---------------------------------------------------//
	
	/**
	 * Retorna el costo total de las llamadas realizadas.
	 * @return Costo total de las tres líneas.
	 */
	public double darTotalCostoLlamadas( )
	{
		double totalCosto = linea1.getCostoLlamada() +
				   		 	linea2.getCostoLlamada() +
				   		 	linea3.getCostoLlamada();
		return totalCosto;
	}
	
	
	//---------------------------------------------------//
	/**
	 * Retorna el costo promedio de un minuto, según los minutos consumidos. <br>
	 * @return Costo promedio por minuto.
	 */
	public double darCostoPromedioMinuto( )
	{
		  double promedio = darTotalCostoLlamadas() / darTotalMinutos();
	      return promedio;
	}
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la línea telefónica 1 <br>
     * <b>post: </b> Se agregó la llamada a la línea 1.
     * @param pMinutos Número de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea1( int pMinutos ) {
    	linea1.llamadaLocal(pMinutos);
    }
    
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la línea telefónica 2 <br>
     * <b>post: </b> Se agregó la llamada a la línea 2.
     * @param pMinutos Número de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea2( int pMinutos ) {
    	linea2.llamadaLocal(pMinutos);
    }
    
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la línea telefónica 3 <br>
     * <b>post: </b> Se agregó la llamada a la línea 31.
     * @param pMinutos Número de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea3( int pMinutos ) {
    	linea3.llamadaLocal(pMinutos);
    }
  //---------------------------------------------------//
    /**
     * Reinicia todas las líneas telefónicas.
     * <b>post: </b> Se reinició la llamada a la línea 1, 2 y 3.
     */
    public void reiniciar()
    {
    	linea1.reiniciar();
    	linea2.reiniciar();
    	linea3.reiniciar();
    }
    
}
