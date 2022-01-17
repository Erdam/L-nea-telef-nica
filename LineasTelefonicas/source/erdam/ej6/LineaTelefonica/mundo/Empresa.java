package erdam.ej6.LineaTelefonica.mundo;
/**
 * Clase que representa la empresa.
 */
public class Empresa {
	//------- A T R I B U T O S -------//
    /**
     * L�nea telef�nica n�mero 1.
     */
	private LineaTelefonica linea1;
    /**
     * L�nea telef�nica n�mero 2.
     */
	private LineaTelefonica linea2;
    /**
     * L�nea telef�nica n�mero 3.
     */
	private LineaTelefonica linea3;
	
	//----- C O N S T R U C T O R  -----//
    /**
     * Inicializa las l�neas telef�nicas de la empresa. <br>
     * <b>post: </b> Se inicializaron las 3 l�neas telef�nicas.
     */
	public Empresa() {
		linea1 = new LineaTelefonica();
		linea2 = new LineaTelefonica();
		linea3 = new LineaTelefonica();
		}
	//--------- M � T O D O S ----------//
	 
	/**
     * Retorna la l�nea 1.
     * @return L�nea 1.
     */
	public LineaTelefonica getLinea1() {
		return linea1;
	}
	 //---------------------------------------------------//
	 /**
     * Retorna la l�nea 2.
     * @return L�nea 2.
     */
	public LineaTelefonica getLinea2() {
		return linea2;
	}
	 //---------------------------------------------------//
	 /**
     * Retorna la l�nea 3.
     * @return L�nea 3.
     */
	public LineaTelefonica getLinea3() {
		return linea3;
	}
	//---------------------------------------------------//
    /**
	 * Retorna el n�mero total de llamadas realizadas.
	 * @return Total de llamadas de las tres l�neas.
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
	 * @return Total de minutos de las tres l�neas.
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
	 * @return Costo total de las tres l�neas.
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
	 * Retorna el costo promedio de un minuto, seg�n los minutos consumidos. <br>
	 * @return Costo promedio por minuto.
	 */
	public double darCostoPromedioMinuto( )
	{
		  double promedio = darTotalCostoLlamadas() / darTotalMinutos();
	      return promedio;
	}
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la l�nea telef�nica 1 <br>
     * <b>post: </b> Se agreg� la llamada a la l�nea 1.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea1( int pMinutos ) {
    	linea1.llamadaLocal(pMinutos);
    }
    
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la l�nea telef�nica 2 <br>
     * <b>post: </b> Se agreg� la llamada a la l�nea 2.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea2( int pMinutos ) {
    	linea2.llamadaLocal(pMinutos);
    }
    
	//---------------------------------------------------//
	/**
     * Agrega una llamada local a la l�nea telef�nica 3 <br>
     * <b>post: </b> Se agreg� la llamada a la l�nea 31.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea3( int pMinutos ) {
    	linea3.llamadaLocal(pMinutos);
    }
  //---------------------------------------------------//
    /**
     * Reinicia todas las l�neas telef�nicas.
     * <b>post: </b> Se reinici� la llamada a la l�nea 1, 2 y 3.
     */
    public void reiniciar()
    {
    	linea1.reiniciar();
    	linea2.reiniciar();
    	linea3.reiniciar();
    }
    
}
