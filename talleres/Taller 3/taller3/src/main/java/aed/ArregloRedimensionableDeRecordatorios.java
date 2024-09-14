package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    Recordatorio[] recordatorios;
    int tamañoArray = 0; 
    int elementos = 0;
    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorios = new Recordatorio[0];
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.recordatorios = vector.copiar().recordatorios;
    }

    public int longitud() {
        return this.recordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        if(this.elementos == this.recordatorios.length){
            this.crearNuevoArreglo();
        }
        this.recordatorios[this.elementos] = i;

        this.elementos += 1;
    }

    public Recordatorio obtener(int i) {
        return this.recordatorios[i];
    }

    public void crearNuevoArreglo(){
        int nuevoTamaño  = this.recordatorios.length == 0 ? 1 : this.recordatorios.length+1;
        this.tamañoArray = nuevoTamaño;
        Recordatorio[] recordatoriosRedimensionado = new Recordatorio[tamañoArray];
        for(int i = 0; i<this.recordatorios.length; i++){
            recordatoriosRedimensionado[i] = this.recordatorios[i];
        }
        this.recordatorios = recordatoriosRedimensionado;

    }

    public void quitarAtras() {
        Recordatorio[] nuevoArray = new Recordatorio[this.elementos-1];
        System.arraycopy(this.recordatorios, 0, nuevoArray, 0, this.elementos - 1);
        this.recordatorios = nuevoArray;
        this.elementos-=1;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.recordatorios[indice] = valor;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios arregloRecordatorioNuevo = new ArregloRedimensionableDeRecordatorios();
        for(int i=0; i<recordatorios.length; i++){
            arregloRecordatorioNuevo.agregarAtras(new Recordatorio(this.recordatorios[i].mensaje, this.recordatorios[i].fecha, this.recordatorios[i].horario));
            
        }

        return arregloRecordatorioNuevo;
    }

}
