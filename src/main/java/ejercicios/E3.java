package ejercicios;

import static javax.swing.JOptionPane.*;

public class E3 {
    public static void main(String[] args){
        double c1=0,c2=0,h;
        int b;
        //Escribir un programa en JAVA que calcule la hipotenusa de un triángulo rectángulo conociendo sus catetos.
        do{
            try{
                c1 = Double.parseDouble(showInputDialog(null,"Ingresar el primer cateto del triángulo rectángulo","Cálculo de Hipotenusa",INFORMATION_MESSAGE));
            }catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            try{
                c2 = Double.parseDouble(showInputDialog(null,"Ingresar el segundo cateto del triángulo rectángulo","Cálculo de Hipotenusa",INFORMATION_MESSAGE));
            }catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            if(c1<=0 || c2<=0){
                showMessageDialog(null,"Se ha detectado una incongruencia.\n Los catetos no pueden ser negativos ni iguales a cero","Errores",ERROR_MESSAGE);
            }else{
                h=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
                showMessageDialog(null,"La medida de la hipotenusa es:\n"+h,"Calculadora de Hipotenusa",INFORMATION_MESSAGE);
            }

            b = showConfirmDialog(null,"¿Desea repetir  la ejecución del programa?","Cálculo de Hipotenusa",YES_NO_OPTION);
        }while(b==0);
    }
}
