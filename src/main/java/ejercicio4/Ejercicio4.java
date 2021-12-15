/*
Hacer una  aplicación que le numeros enteros hasta que el numero ingresado
sea superior a 200
al finalizar imprimir en pantalla la cantidad de numeros leidos ,utilizando un cuadro de dialogo.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author ferch
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definición de la variables
        int numero=0;
        int cantidad=-1;
        while (numero<=200) 
        {  
            //leemos el numero con JOptionpane.showInputDialog y convertimos a entero.
          numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));
          //cantidad = cantidad + 1;
          //tambien podemos hacerlo asi
          cantidad++;
        }
        //vamos a mostrar la cantidad de numeros ingresados
        JOptionPane.showInputDialog(null,"la cantidad de numeros ingresados menos o iguales a 200 es:"+cantidad);
    }
    
}
