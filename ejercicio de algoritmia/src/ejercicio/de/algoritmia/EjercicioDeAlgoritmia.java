package ejercicio.de.algoritmia;
import java.util.Scanner;
public class EjercicioDeAlgoritmia {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantVelas, VelasApagadas=0;
        System.out.println("digite la cantidad de velas que va a tener el pastel");
        cantVelas=entrada.nextInt();
        int alturaVelas[]=new int[cantVelas];
        for(int i=0;i<cantVelas;i++)
        {
            System.out.println("digite la altura de la vela "+(i+1)+"como numero entero");
            alturaVelas[i]=entrada.nextInt();
        }
        for(int i=0;i<cantVelas-1;i++)
        {
            int velaMasAlta;
            if(alturaVelas[i]>alturaVelas[i+1])
            {
                velaMasAlta=alturaVelas[i];
                VelasApagadas=1;
            }else if(alturaVelas[i+1]>alturaVelas[i])
            {
                velaMasAlta=alturaVelas[i];
                VelasApagadas=1;
            }else if(alturaVelas[i]==alturaVelas[i+1])
            {
                VelasApagadas++;
            }
        }
        System.out.println("se van a apagar "+VelasApagadas+" velas");        
    }
}
