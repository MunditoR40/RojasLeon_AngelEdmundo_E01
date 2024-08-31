package ejercicios;

import static javax.swing.JOptionPane.*;

public class E6 {
    public static void main(String[] args) {
        int b=0;
        double n1=0,n2=0,n3=0,m=0;
        do{
            n1 = Double.parseDouble(showInputDialog(null,"Ingresar el primer número","Media de 3 números",INFORMATION_MESSAGE));

            n2 = Double.parseDouble(showInputDialog(null,"Ingresar el segundo número","Media de 3 números",INFORMATION_MESSAGE));

            n3 = Double.parseDouble(showInputDialog(null,"Ingresar el tercer número","Media de 3 números",INFORMATION_MESSAGE));

            m=(n1+n2+n3)/3;

            showMessageDialog(null,"Los números ingresados son: "+n1+", "+n2+", "+n3+"\nLa media de los tres números ingresados es: "+m,"Media de 3 números",INFORMATION_MESSAGE);
            b = showConfirmDialog(null,"¿Desea volver a ejecutar el programa?","Media de 3 números",YES_NO_OPTION);
        }while(b==0);
    }
}
