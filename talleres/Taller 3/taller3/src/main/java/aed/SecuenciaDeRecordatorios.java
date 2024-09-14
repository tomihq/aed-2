package aed;

interface SecuenciaDeRecordatorios {

    /**
     * Devuelve el largo de la secuencia.
     * 
     */
    public int longitud();

    /**
     * Agrega un elemento al final de la secuencia.
     * 
     */
    public void agregarAtras(Recordatorio r);

    /**
     * Retorna el elemento en la i-esima posicion.
     * 
     */
    public Recordatorio obtener(int i);

    /**
     * Quita el ultimo elemento de la secuencia.
     * 
     */
    public void quitarAtras();

    /**
     * Cambia el valor de la indice-esima posicion
     * por el valor dado por parametro.
     * 
     */
    public void modificarPosicion(int indice, Recordatorio valor);

    /**
     * Retornar un vector con los mismos elementos
     * 
     */
    public ArregloRedimensionableDeRecordatorios copiar();

}