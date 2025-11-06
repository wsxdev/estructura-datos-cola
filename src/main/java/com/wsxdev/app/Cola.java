package com.wsxdev.app;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int tamaño;

    public Cola() {
        this.frente = null;
        this.tamaño = 0;
    }

    public boolean encolar(int dato){
        Nodo nuevo = new Nodo(dato);
        boolean respuesta = false;
        // VERIFICAR SI ESTÁ VACÍA PARA UN NUEVO NODO
        if (isEmpty()) {
            frente = nuevo;
            ultimo = nuevo;
            respuesta = true;
            // tamaño++;
            return respuesta;
        } // SI NO ESTÁ VACÍA, SE AGREGA AL FINAL 
        else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            respuesta = true;
            // tamaño++;
            return true;
        }
    }

    public boolean desencolar(){
        boolean respuesta = false;
        // VERIFICAR SI ESTÁ VACÍA
        if (isEmpty()){
            return respuesta;
        } 
        // SI ESTÁ LLENA SE ELIMINA EL NODO DEL FRENTE
        else {
            frente = frente.getSiguiente();
            // tamaño--;
            return respuesta;
        }
    }

    public boolean isEmpty(){
        return frente == null;
    }

    public boolean isFull(){
        return false;
    }

    public int peek(){

        return 0;
    }

    // MÉTODO PARA MOSTRAR LA COLA
    public void mostrar(){
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}