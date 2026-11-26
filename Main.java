/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

/**
 *
 * @author Ismael Flores
 */
public class Main {

    public static void mostrar(listaDoble lista) {
        System.out.println("Adelante: " + lista);
        System.out.println("Atras:    " + lista.mostrarInverso());
        System.out.println("Tamanio:  " + lista.getTamanio());
        System.out.println();
    }

    public static void main(String[] args) {
        listaDoble lista = new listaDoble();

        System.out.println("PRUEBA: LISTA VACIA");
        System.out.println("Esta vacia: " + lista.estaVacia());
        System.out.println("Eliminar ultimo: " + lista.eliminarUltimo());
        System.out.println("Eliminar valor 10: " + lista.eliminarPorValor(10));
        mostrar(lista);

        System.out.println("PRUEBA: INSERTAR EN POSICION");
        lista.insertarEnPosicion(0, 20);
        lista.insertarEnPosicion(0, 10);
        lista.insertarEnPosicion(2, 40);
        lista.insertarEnPosicion(2, 30);
        // Resultado esperado: 10, 20, 30, 40.
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR POR VALOR");
        System.out.println("Eliminar 20: " + lista.eliminarPorValor(20));
        System.out.println("Eliminar 99: " + lista.eliminarPorValor(99));
        // Resultado esperado: 10, 30, 40.
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR EN POSICION");
        System.out.println("Dato eliminado: " + lista.eliminarEnPosicion(1));
        // Resultado esperado: 10, 40.
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR ULTIMO");
        System.out.println("Resultado: " + lista.eliminarUltimo());
        // Resultado esperado: 10.
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR EL UNICO NODO");
        System.out.println("Dato eliminado: " + lista.eliminarEnPosicion(0));
        System.out.println("Esta vacia: " + lista.estaVacia());
        mostrar(lista);

        System.out.println("PRUEBA: INSERTAR ORDENADO");
        lista.insertarOrdenado(30);
        lista.insertarOrdenado(10);
        lista.insertarOrdenado(20);
        lista.insertarOrdenado(40);
        lista.insertarOrdenado(20);
        // Resultado esperado: 10, 20, 20, 30, 40.
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR CABEZA Y COLA POR VALOR");
        System.out.println("Eliminar 10: " + lista.eliminarPorValor(10));
        System.out.println("Eliminar 40: " + lista.eliminarPorValor(40));
        mostrar(lista);

        System.out.println("PRUEBA: ELIMINAR ULTIMO POR POSICION");
        int ultimaPosicion = lista.getTamanio() - 1;
        System.out.println("Dato eliminado: "
                + lista.eliminarEnPosicion(ultimaPosicion));
        mostrar(lista);

        System.out.println("PRUEBA: POSICIONES INVALIDAS");
        try {
            lista.insertarEnPosicion(-1, 50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            lista.eliminarEnPosicion(lista.getTamanio());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("PRUEBA: METODOS BASICOS");
        lista.insertarAlInicio(5);
        lista.insertarFinal(60);
        System.out.println("Buscar 60: " + lista.Buscar(60));
        System.out.println("Dato en posicion 0: " + lista.obtener(0));
        lista.actualizar(6, 0);
        mostrar(lista);
        System.out.println("Eliminado al inicio: " + lista.eliminarAlInicio());

        System.out.println();
        System.out.println("PRUEBA: VACIAR Y VOLVER A INSERTAR");
        while (!lista.estaVacia()) {
            lista.eliminarUltimo();
        }
        mostrar(lista);
        lista.insertarFinal(100);
        mostrar(lista);
        lista.eliminarUltimo();
        mostrar(lista);
    }
    
}
