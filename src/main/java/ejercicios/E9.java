package ejercicios;

import static javax.swing.JOptionPane.*;

public class E9 {
    public static void main(String[] args) {
        int b=0;
        double n1=0,n2=0,d=0;
        do{
            try{
                try{
                    n1=Double.parseDouble(showInputDialog(null,"Ingresar el primer número","División Aritmética",INFORMATION_MESSAGE));
                }catch(NumberFormatException e1){
                    showMessageDialog(null,"Se ha detectado un error \n"+e1,"Error",ERROR_MESSAGE);
                }

                try{
                    n2=Double.parseDouble(showInputDialog(null,"Ingresar el segundo número","División Aritmética",INFORMATION_MESSAGE));
                }catch(NumberFormatException e2){
                    showMessageDialog(null,"Se ha detectado un error \n"+e2,"Error",ERROR_MESSAGE);

                }
                d=n1/n2;
                if(n2==0){
                    throw new ArithmeticException();
                }else{
                    showMessageDialog(null,"La división es: "+d,"División Aritméitca",INFORMATION_MESSAGE);
                }
            }catch(ArithmeticException e3){
                showMessageDialog(null,"Se ha detectado un error \n"+e3,"Error",ERROR_MESSAGE);
            }

            b=showConfirmDialog(null,"¿Desea volver a ejecutar el programa?","División Aritmética",YES_NO_OPTION);
        }while(b==0);
    }
}
