package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    private int longitud;
    private Nodo primero; 


    private class Nodo {
        Nodo prev; 
        T valor;
        Nodo sig;
        public Nodo(T valor){
            this.valor = valor;
        }
        
    }

    public ListaEnlazada() {
        this.longitud = 0; 
    }

     public ListaEnlazada(ListaEnlazada l) {
        this.longitud = l.longitud;
        this.primero = l.primero;  
    }

    public int longitud() {
        return this.longitud; 
    }

    public void agregarAdelante(T elem) {
        Nodo nuevoNodo = new Nodo(elem);
        Nodo primeroAnterior = this.primero; 
        if(this.longitud == 0){
            this.primero = nuevoNodo; 
        }else{
          nuevoNodo.sig = primeroAnterior;
          primeroAnterior.prev = nuevoNodo; 
          this.primero = nuevoNodo; 
        }
        this.longitud += 1; 
        
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        Nodo actual = this.primero;
        if (this.longitud == 0) {
           this.primero = nuevo;
        } else {
           while (actual.sig != null) {
                actual = actual.sig;
           }
        actual.sig = nuevo;
        nuevo.prev = actual; 
        }
        this.longitud += 1;
    }

    public T obtener(int i) {
        T nodoEncontrado = null; 
        Nodo nodoActual = this.primero; 
        for(int j = 0; j<this.longitud; j++){
            if(j == i){
                nodoEncontrado = nodoActual.valor;
                break;
            }else{
                nodoActual = nodoActual.sig; 
            }
        }
        return nodoEncontrado; 
    }

    public void eliminar(int i) {
        Nodo actual = this.primero; 
        Nodo sig = actual.sig;
        Nodo prev = actual.prev;
        if(i == 0 && this.longitud==1){
            this.primero = null; 
        }
        else if(i == 0 && this.longitud>1){
            sig.prev = null; 
            this.primero = sig;
        }else if(i == this.longitud-1){
            for(int j = 0; j<this.longitud; j++){
                prev = actual.prev;
                actual = actual.sig;
            }
        }else{
            for(int j = 0; j<i; j++){
                actual = actual.sig;
            }
            prev = actual.prev;
            sig = actual.sig;
            prev.sig = sig; 
            sig.prev = prev; 
              
        }
        this.longitud -= 1;
        
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo actual = this.primero;
        Nodo sig = actual.sig;
        Nodo nuevoNodo = new Nodo(elem);
        if(indice == 0){
                sig = this.primero;
                this.primero = nuevoNodo;
                nuevoNodo.sig = sig;
                sig.prev = nuevoNodo;
        }
        for(int j = 0; j<this.longitud; j++){
            Nodo prev = actual.prev;
            if(j == indice && j == this.longitud-1){
                prev.sig = nuevoNodo; 
            }else if(j == indice){
                sig = actual.sig; 
                actual = nuevoNodo;
                nuevoNodo.prev = prev;
                nuevoNodo.sig = sig;
                prev.sig = nuevoNodo;
                sig.prev = nuevoNodo; 
            }else{
                actual = actual.sig;
            }
        }
    }

    public ListaEnlazada<T> copiar() {
        return new ListaEnlazada(this); 
    }
 /*    public ListaEnlazada(ListaEnlazada<T> lista) {
        this.primero = lista.primero;
        this.longitud = lista.longitud;
    } */
    
    @Override
    public String toString() {
        StringBuffer string = new StringBuffer(); 
        string.append("[");
        for(int j = 0; j<this.longitud; j++){
            string.append(this.primero.valor);
            this.primero = this.primero.sig; 
            if(j != this.longitud-1){
                string.append(", ");
            }
        }
        string.append("]");
        return string.toString(); 
    }

    private class ListaIterador implements Iterador<T> {
    	Nodo prev; 
        Nodo act;  

        public ListaIterador(){
            this.prev = null; 
            this.act = primero; 
        }

        public boolean haySiguiente() {
            return this.act != null; 
        }
        
        public boolean hayAnterior() {
            return this.prev != null; 
        }

        public T siguiente() {
            Nodo actual = this.act;
            this.prev = this.act;
            this.act = this.act.sig;
            return actual.valor;
        }
        

        public T anterior() {
            Nodo actual = this.prev;
            this.act = this.prev;
            this.prev = this.prev.prev;
            return actual.valor;
        }
    }

    public Iterador<T> iterador() {
	    return new ListaIterador();
    }

}
