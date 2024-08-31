package ejercicios;

import static javax.swing.JOptionPane.*;

public class E4 {
    //Escribir un programa en JAVA que dado dos números, muestre la suma, resta, división y multiplicación de ambos
    public static void main(String[] args) {
        int b=0;
        double n1=0,n2=0;

        do{
            n1 = Math.random()*100+1;
            n2 = Math.random()*100+1;

            showMessageDialog(null,"Los números son\n"+n1+" y "+n2,"Operaciones Matemáticas",INFORMATION_MESSAGE);

            showMessageDialog(null,"Operaciones:\nSuma: "+(n1+n2)+"\nResta: "+(n1-n2)+"\nMultiplicación: "+n1*n2+"\nDivisión: "+n1/n2);

            b = showConfirmDialog(null,"¿Desea repetir  la ejecución del programa?","Operaciones Matemáticas",YES_NO_OPTION);
        }while(b==0);
    }
}
