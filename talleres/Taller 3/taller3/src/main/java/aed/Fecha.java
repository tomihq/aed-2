package aed;

public class Fecha {
    int dia;
    int mes; 

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes; 
    }

    public Fecha(Fecha fecha) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes; 
    }

    public String fechaCompleta() {
        return this.dia + "/" + this.mes;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes;
    }

    @Override
    public boolean equals(Object otraFecha) {
        if(otraFecha == null || otraFecha.getClass() != this.getClass()) return false; 
        Fecha otraFechaCast = (Fecha) otraFecha;
        return 
        this.dia().equals(otraFechaCast.dia) &&
        this.mes().equals(otraFechaCast.mes);
    }

    public void incrementarDia() {
        if(this.diasEnMes(this.mes)<this.dia+1){
            this.dia = 1;
            if(this.mes+1<12){
                this.mes += 1;
            }else{
                this.mes = 1; 
            }
            
        }else{
            this.dia += 1;
        }

    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
