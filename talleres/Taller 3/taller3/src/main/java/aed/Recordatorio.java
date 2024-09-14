package aed;

public class Recordatorio {
    String mensaje;
    Fecha fecha; 
    Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha.dia, fecha.mes);
        this.horario = new Horario(horario.hora, horario.minutos); 
    }

    public Horario horario() {
       return this.horario;
    }

    public Fecha fecha() {
        Fecha nuevaFecha = new Fecha(this.fecha.dia, this.fecha.mes);
        return nuevaFecha;
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje + " @ " + this.fecha.fechaCompleta() + " " + this.horario.horarioCompleto();
    }

    @Override
    public boolean equals(Object otro) {
       if(otro == null || otro.getClass() != this.getClass()) return false;
       Recordatorio otroRecordatorio = (Recordatorio) otro;
       return 
       this.mensaje().equals(otroRecordatorio.mensaje) &&
       this.horario().equals(otroRecordatorio.horario) &&
       this.fecha().equals(otroRecordatorio.fecha);
    }

}
