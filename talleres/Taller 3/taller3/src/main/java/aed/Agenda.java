package aed;

public class Agenda {

    Recordatorio[] recordatorios;
    Fecha fechaActual;
    int tamañoArray = 0; 
    int elementos = 0;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.recordatorios = new Recordatorio[0];
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

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if(this.elementos == this.recordatorios.length){
            this.crearNuevoArreglo();
        }
        this.recordatorios[this.elementos] = recordatorio;
        this.elementos += 1;

    }

    @Override
    public String toString() {
        String mensaje = this.fechaActual.fechaCompleta() + "\n" + "=====" + "\n";
        for(int i = 0; i<this.recordatorios.length; i++){
            if(this.recordatorios[i].fecha.dia == fechaActual.dia && this.recordatorios[i].fecha.mes == fechaActual.mes){
                mensaje = mensaje.concat(this.recordatorios[i].toString() + "\n");
            }
        }
        return mensaje;
    }

    public void incrementarDia() {
       this.fechaActual.incrementarDia();

    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}
