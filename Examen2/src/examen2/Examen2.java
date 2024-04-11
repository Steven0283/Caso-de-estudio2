/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomPelicula = "Oppenheimer";
        int asiento [][] = new int [6][6];
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("***** Bienvenido al sistema de reserva de asientos ***** \n"
                + "*** Ingrese el número de la acción que desea realizar ***\n"
                + "1. Mostrar asientos \n"
                + "2. Cambiar el nombre de la película \n"
                + "3. Asignar asientos"));
        switch (opcion) {
            case 1:
                muestraSala(asiento);
                break;
            case 2:
                nomPelicula = JOptionPane.showInputDialog("Ingrese el nombre de la nueva película: ");
                break;
            case 3:
                Reserva(asiento, 0, 0);
                muestraReserva(asiento, opcion, opcion);
                break;
            default:
                throw new AssertionError();
        }
    }
    /*
        Aquí se muestra el estado inicial de la sala de cine
    */
    public static void muestraSala(int[][] asiento){
        String resultado2 = "";
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {
                resultado2 += asiento[i][j];
                resultado2 += "     ";
            }
            resultado2 += "\n";
        }
        JOptionPane.showMessageDialog(null, "        Pantalla \n"
                + resultado2);
    }
    
    /*
        En este método se realiza el proceso de reserva (solo logré que funcionara UNA vez)
    */
    public static void Reserva(int asiento[][], int fila, int columna){
        fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de fila: "));
        if ((fila < 0) || (fila > 6)) {
            JOptionPane.showMessageDialog(null, "Número de fila inválido, por favor digite un número de fila válido (de 1 a 6)");
        }
        columna = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columna: "));
        if ((columna < 0) || (columna > 6)) {
            JOptionPane.showMessageDialog(null, "Número de columna inválido, por favor digite un número de columna válido (de 1 a 6)");
        }
        
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {
                if (asiento[fila][columna] == (asiento[i][j])) {
                    asiento[fila][columna] = 1;
                }
            }
        }
    }
    
    /*
        En este método se realiza el prceso de mostrar que espacio de sala se reservó en el método anteriior
    */
    public static void muestraReserva(int asiento[][], int fila, int columna){
        String resultado = "";
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {
                resultado += asiento[i][j];
                resultado += "       ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, "        Pantalla \n"
                + resultado);
    }
    

    
}
