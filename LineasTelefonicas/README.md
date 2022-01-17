[TOC]

#### Bienvenido a el programa "La encuesta"
Se quiere crear una aplicación para controlar los gastos telefónicos de una empresa. La empresa cuenta con tres líneas telefónicas a través de las cuales se pueden realizar llamadas locales, de larga distancia y a celulares.
La empresa cuenta con planes telefónicos que establecen las siguientes tarifas:
Minuto Llamada Local: $35 pesos Minuto Llamada Larga Distancia: $380 pesos Minuto Llamada Celular: $999 pesos
El programa debe permitir:
- Agregar una llamada a alguna de las líneas telefónicas de la empresa.
- Visualizar la información de cada línea. Esta información incluye el número total de llamadas realizadas, la duración total de las llamadas en minutos y el costo total de las llamadas en pesos.
- Visualizar la información consolidada de todas las líneas telefónicas de la empresa. Esta información incluye el costo total en pesos de las tres líneas, el número total de llamadas realizadas, la duración total de llamadas en minutos y el cálculo del costo promedio por minuto según el costo total y el total de minutos.
- Reiniciar la información de las líneas telefónicas de la empresa.
#### Requerimientos Funcionales"
------------------------------------------------------------------------------------------------------
**Nombre** R1 – Agregar una llamada a alguna de las líneas telefónicas.
**Resumen** Agrega una llamada a cualquiera de las tres líneas. Se debe especificar la cantidad de minutos consumidos, así como el tipo de llamada. 
**Entrada**
Número de línea, siendo válido linea1, linea2 y linea3.
Cantidad de minutos consumidos.
Tipo de llamada. 
**Resultado**
Se registra la llamada y se actualiza el total de minutos.
Si la cantidad de minutos consumidos no es válida dará un mensaje de error.

------------------------------------------------------------------------------------------------------
**Nombre** R2 – Visualizar la información de cada línea.
**Resumen** Visualizar la información de cada línea como número total de llamadas, duración total de llamadas en minutos y el total de llamadas en pesos.
**Entrada**
Ninguna.
**Resultado**
Se muestra el número total de llamadas realizadas.
Se muestra la duración total de llamadas en minutos.
Se muestra el total de las llamadas en pesos

------------------------------------------------------------------------------------------------------
**Nombre** R3 – Visualizar la información consolidada de todas las líneas telefónicas.
**Resumen** Visualiza la información total (suma de todas las líneas). Esta información debe incluir: total de llamadas, total de minutos y total costo de llamadas, y el costo promedio por minuto en todas las líneas.
**Entrada**
Ninguna.
**Resultado**
Se muestra el número de llamadas y el número de minutos que se han realizado en cada línea.

------------------------------------------------------------------------------------------------------
**Nombre**
R4 – Reiniciar la información de las líneas telefónicas de la empresa.
**Resumen**
Reinicia el número de llamadas, número de minutos y el costo 
**Entrada**
Ninguna.
**Resultado**
Se reinician todos los valores en cero.

------------------------------------------------------------------------------------------------------
#### Directorio
    editor.md/
       		 source/
        		test/source/
       		 data/
        		docs/
            		specs/
            		api/
        ...

[Javadoc](https://github.com/Erdam/L-nea-telef-nica/tree/main/LineasTelefonicas/docs/api "Javadoc")
