package aed;

public class Horario {
    int hora;
    int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    public String horarioCompleto(){
        return this.hora + ":" + this.minutos;
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        if(otro == null || otro.getClass() != this.getClass()) return false;
        Horario otroHorario = (Horario) otro;
        return otroHorario.hora == this.hora && otroHorario.minutos == this.minutos;
    }

}
