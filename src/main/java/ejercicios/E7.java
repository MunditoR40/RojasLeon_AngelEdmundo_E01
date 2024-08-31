package ejercicios;

import static javax.swing.JOptionPane.*;

public class E7 {
    public static void main(String[] args) {
        int b=0,i=0,m=0,h=0;

        do{
            i=Integer.parseInt(showInputDialog(null,"Ingrese la cantidad de minutos","Conversor de minutos",INFORMATION_MESSAGE));

            h= (int) i/60;
            m=i%60;

            if(i>0){
                if(h>1){
                    showMessageDialog(null,"La conversión de: "+i+" minutos"+"\nEs: "+h+" horas y "+m+" minutos");
                }else{
                    showMessageDialog(null,"La conversión de: "+i+" minutos"+"\nEs: "+h+" hora y "+m+" minutos");
                }
            }else{
                showMessageDialog(null,"Ha ingresado un valor negativo.","Error",ERROR_MESSAGE);
            }
            b=showConfirmDialog(null,"¿Quiere volver a ejecutar el programa?","Conversor de minutos",YES_NO_OPTION);

        }while(b==0);
    }
}
