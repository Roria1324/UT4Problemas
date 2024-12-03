
import java.util.Scanner;

public class Prueba2 {

    //private int[] listaEnteros = new int[10];
    public static void main(String[] args) {
        Prueba2 programa = new Prueba2();
        programa.inicio();

    }

    public void inicio() {
        //leerLista();
        //ordenarLista();
        //imprimirLista();
        //buscarNumPequeño();
        System.out.println(maxRecursiu(8, 8));
        int[] num = {5, 8, 9};
        imprimirArray(num);
    }

    /*
    public void leerLista() {
        for (int i = 0; i < listaEnteros.length; i++) {
            listaEnteros[i] = (int) (Math.random() * 10);
        }
    }

    public void ordenarLista() {
        for (int i = 0; i < listaEnteros.length; i++) {
            for (int j = 0; j < listaEnteros.length; j++) {
                if (listaEnteros[i] > listaEnteros[j]) {
                    int cambio = listaEnteros[i];
                    listaEnteros[i] = listaEnteros[j];
                    listaEnteros[j] = cambio;
                }

            }
        }
    }
    
    public void imprimirLista() {
        System.out.print("[ ");
        for (int i = 0; i < listaEnteros.length; i++) {
            System.out.print(listaEnteros[i] + " ");
        }
        System.out.print(" ]");
    }
    
    public void buscarNumPequeño(){
        int contador =0;
        int numGrande = listaEnteros[0] / 2;
        for (int i = 0; i < listaEnteros.length; i++) {
            if (numGrande < listaEnteros[i]) {
                contador++;
            }
        }System.out.println(contador);
    }
    public void inicio() {
        Scanner input = new Scanner(System.in); 
        imprimirAsteriscos(5);
        System.out.println("-------");
        imprimirAsteriscos(15);
        System.out.println("-------");
        imprimirAsteriscos(input.nextInt());
        double[] notas = {5.6, 4, 1, 8.7, 6, 5, 9.9, 5, 9.874};
        

    }

    
    public void imprimirAsteriscos(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.print(" *");
        }System.out.println("");
    }

    public void maxMin(double[] notas) {
        double max = 0, min = 10;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
    }*/

    public static String maxRecursiu(int n1, int n2) {
        if (n1 == 0 && n2 == 0) {
            return "son iguales";
        }
        if (n1 == 0) {
            return "n2 >";

        }

        if (n2 == 0) {
            return "n1 >";

        }

        return maxRecursiu(--n1, --n2);
    }

    public static void imprimirArray(int[] ent) {
        if (ent == null) {
            System.out.print("ARRAY NULO");
            
        }else{
            imprimirArray(ent, 0);
        }
    }

    public static void imprimirArray(int[] ent, int index) {
        if (index == ent.length) {
            System.out.print("FIN EL HUMANO ");
        } else {
            imprimirArray(ent, index + 1);
            System.out.print(ent[index] + " ");
            
        }
    }
    
    public static boolean pares(Integer n1){
        if (n1 == 0) {
            return true;
        }
        if (n1 % 10 % 2 != 0) {
            return false;
        }
        return pares(n1/ 10);
    }
    
    
}
