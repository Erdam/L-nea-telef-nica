package erdam.ej6.LineaTelefonica.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import erdam.ej6.LineaTelefonica.mundo.LineaTelefonica;
/**
 * Clase usada para verificar que los métodos de la clase LineaTelefonica estén correctamente implementados.
 */
public class LineaTelefonicaTest {
	//------- A T R I B U T O S -------//
    /**
     * Clase donde se harán las pruebas.
     */
	private LineaTelefonica linea1;
	
	
	//--------- E S C E N A R I O S ----------//
    /**
     * Escenario 1: Construye una nueva línea telefónica vacía.
     */
	private void setupEscenario1()
	{
		linea1 = new LineaTelefonica();
	}
	
	
	//--------- M É T O D O S  D E  P R U E B A ----------//
	/**
     * Prueba 1: Método que se encarga de verificar el método llamadaCelular. <br>
     * <b> Métodos a probar: </b> <br>
     * llamadaCelular<br>
     * getNumeroLlamada<br>
     * getNumeroMinutos<br>
     * getCostoLlamada<br>
     * <b> Casos de prueba: </b> <br>
     * 1. No hay llamadas el la línea.
     */

	@Test
	public void testAgregarLLamadaCelular()
	{
		setupEscenario1();
		linea1.llamadaCelular(10);
		assertEquals("El numero de llamadas debe ser 1", 1, linea1.getNumeroLlamada());
		assertEquals("Los minutos consumidos deben ser 10", 10, linea1.getNumeroMinutos());
		assertEquals("El costo total de la llamada debe ser de  9990", 9990, linea1.getCostoLlamada(),0.000001);
	}
	//---------------------------------------------------//
	/**
     * Prueba 2: Método que se encarga de verificar el método llamadaLocal. <br>
     * <b> Métodos a probar: </b> <br>
     * llamadaLocal<br>
     * getNumeroLlamada<br>
     * getNumeroMinutos<br>
     * getCostoLlamada<br>
     * <b> Casos de prueba: </b> <br>
     * 1. No hay llamadas el la línea.
     */
	
	@Test
	public void testAgregarLLamadaLocal()
	{
		setupEscenario1();
		linea1.llamadaLocal(2);
		linea1.llamadaLocal(2);
		linea1.llamadaLocal(2);
		linea1.llamadaLocal(2);
		linea1.llamadaLocal(2);
		assertEquals("El numero de llamadas debe ser 5", 5, linea1.getNumeroLlamada());
		assertEquals("Los minutos consumidos deben ser 10", 10, linea1.getNumeroMinutos());
		assertEquals("El costo total de la llamada debe ser de  350", 350, linea1.getCostoLlamada(),0.000001);
		
	}
	//---------------------------------------------------//
	/**
     * Prueba 3: Método que se encarga de verificar el método llamadaLocal. <br>
     * <b> Métodos a probar: </b> <br>
     * llamadaLargaDistancia<br>
     * getNumeroLlamada<br>
     * getNumeroMinutos<br>
     * getCostoLlamada<br>
     * <b> Casos de prueba: </b> <br>
     * 1. No hay llamadas el la línea.
     */
	
	@Test
	public void testAgregarLLamadaLargaDistancia()
	{
		setupEscenario1();
		linea1.llamadaLargaDistancia(5);
		linea1.llamadaLargaDistancia(5);
		assertEquals("El numero de llamadas debe ser 2", 2, linea1.getNumeroLlamada());
		assertEquals("Los minutos consumidos deben ser 10", 10, linea1.getNumeroMinutos());
		assertEquals("El costo total de la llamada debe ser de  3800", 3800, linea1.getCostoLlamada(),0.000001);
		
	}
	//---------------------------------------------------//
    /**
     * Prueba 4: Método que se encarga de verificar el método reiniciar. <br>
     * <b> Métodos a probar: </b> <br>
     * reiniciar<br>
     * llamadaLargaDistancia<br>
     * getNumeroLlamada<br>
     * getNumeroMinutos<br>
     * getCostoLlamada<br>
     * <b> Casos de prueba: </b> <br>
     * 1. No hay llamadas el la línea.
     */
	
	@Test
	public void testReinciar()
	{
		setupEscenario1();
		linea1.reiniciar();
		assertEquals("El numero de llamadas debe ser 0", 0, linea1.getNumeroLlamada());
		assertEquals("Los minutos consumidos deben ser 0", 0, linea1.getNumeroMinutos());
		assertEquals("El costo total de la llamada debe ser de  0", 0, linea1.getCostoLlamada(),0.000001);
		
	}
	//---------------------------------------------------//

}
