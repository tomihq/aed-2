package aed;

class Funciones {
    int cuadrado(int x) {
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt((x*x) + (y*y));
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        return ((n%4 == 0) && (n%100!=0) || (n % 400 == 0));
    }

    int factorialIterativo(int n) {
        int factorialN = 1;
        while(n>1){
            factorialN *=n;
            n-=1;
        }
        return factorialN;
    }

    int factorialRecursivo(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        return n * factorialIterativo(n-1);
    }

    boolean esPrimo(int n) {
        boolean primo = true;
        if(n<2) return false;  
        for(int i = 1; i<=n; i++){
            if((i!=1 && i!=n) && (n % i == 0)) primo = false;
        }
        return primo;
    }

    int sumatoria(int[] numeros) {
        int acum = 0;
        for(int i = 0; i<numeros.length; i++){
            acum += numeros[i];
        }
        return acum;
    }

    int busqueda(int[] numeros, int buscado) {
        int posicion = 0;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] == buscado){
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    boolean tienePrimo(int[] numeros) {
        boolean existePrimo = false; 
        for(int i = 0; i<numeros.length; i++){
            if(esPrimo(numeros[i])){
                existePrimo = true;
                break; 
            }
        }
        return existePrimo;
    }

    boolean todosPares(int[] numeros) {
        boolean todosPares = true;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] % 2 != 0){
                todosPares = false;
                break; 
            }
        }
        
        return todosPares;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean esPrefijo = true;
        if(s1.length() > s2.length()) return false; 
        for(int i = 0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)) esPrefijo = false; 
        }
        return esPrefijo;
    }

    boolean esSufijo(String s1, String s2) {
        boolean esSufijo = true; 
        if(s1.length() > s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
                if(s1.charAt(s1.length()-i-1) != s2.charAt(s2.length()-i-1)) esSufijo = false; 
        }
        return esSufijo;
    }
}


