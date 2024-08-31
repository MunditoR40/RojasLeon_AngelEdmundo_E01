package ejercicios;

import static javax.swing.JOptionPane.*;

public class E5 {
    //Escribir un programa en JAVA que convierta un valor dado en grados Fahrenheith a grados Celsius.
    public static void main(String[] args) {
        double f=0,c=0;
        int b=0;

        do{
            f = Double.parseDouble(showInputDialog(null,"Introduzca la temperatura en grados Fahrenheith.","Convertirdor de Fahrenheith a Celsius",INFORMATION_MESSAGE));

            c=(f*1.8)+32;

            showMessageDialog(null,"Se ha hecho la conversión:\n"+f+"°F → "+c+"°C");

            b = showConfirmDialog(null,"¿Desea volver a ejecutar el programa","Convertidor de Fahrenheith a Celsius",YES_NO_OPTION);
        }while(b==0);

    }
}
