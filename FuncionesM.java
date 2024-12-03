import java.util.Scanner;

public class FuncionesM {
    
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        FuncionesM programa = new FuncionesM();
        programa.inicio();
    }
    public void inicio(){
        //leerEntero();
        //leerEntero(10);
        //leerEntero(0, 10);
        //esMultiplo();
        /*int resultado = recursivo(2,4);
        System.out.println(resultado);
        int res =potenciaNeg(2, -4);
        System.out.println(res);*/
        //System.out.println(binario(155));
        //System.out.println(binarioNeg(-15));
        char[] palabra = {'-','-','-','-'};
        int[] indices = {0,3};
        char letra = 'a';
        rellenarCaracter(palabra, indices, letra);
    }
    
    /*public int leerEntero(){
        
        boolean numero = false;
        int entero = 0;
        
        while (numero == false) {
            System.out.print("Introduzca numeros: ");
            if (input.hasNextInt()) {
                entero = input.nextInt();
                System.out.println("El número es un número " + entero);
                numero = true;
                

            }else {
                System.out.println("Error");
                input.nextLine();
                
            }
            
        }
        return entero;
    }
    
    public void leerEntero( int enteroMin){
        boolean numero = false;
        int entero = 0;
        
        while (numero == false) {
            System.out.print("Introduzca numeros: ");
            if ((input.hasNextInt()) && (entero = input.nextInt()) > enteroMin) {
                System.out.println("El numero" + entero + "es más grande que " + enteroMin);
                
                numero = true;
            }else {
                System.out.println("Error");
                System.out.println("Introduzca entero más grande que " + enteroMin);
                input.nextLine();
            }
        }
    }
    
    public void leerEntero(int enteroMin, int enteroMax){
        boolean numero = false;
        int entero = 0;
        
        while (numero == false) {
            System.out.print("Introduzca numeros: ");
            if ((input.hasNextInt()) && (entero = input.nextInt()) > enteroMin && entero < enteroMax) {
                System.out.println("El numero " + entero + " esta dentro del rango");
                
                numero = true;
            }else {
                System.out.println("Error");
                System.out.println("Introduzca numero dentro de los rangos " + enteroMin + " y " + enteroMax);
                input.nextLine();
            }
        }
    }
    
    public void esMultiplo(){
    
        int num1 = leerEntero();
        int num2 = leerEntero();
        
        if (num1 % num2 == 0 && num2 % num1 == 0) {
            System.out.println("Es múltiplo");
        }else{
            System.out.println("No son múltiplos");
        }
    }

    public boolean elPrimo(){
        int num1= leerEntero();
        
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }return true;
       
    }
    
    public int[] divisorDe(int num1){
        int numDiv = 0;
        int indexREs = 0;
        
        for (int i = 2; i < num1; i++) {
            if (elPrimo(i) && num1 % 2 == 0) {
                numDiv++;
            }
        }
        int[] resultado = new int[numDiv];
        for (int i = 2; i < num1; i++) {
            if (elPrimo(i) && num1 % i == 0) {
                resultado[indexREs] = i;
                indexREs++;
            }
        }return resultado;
    }
    
    public int recursivo(int base, int exp){
        if (exp == 0) {
            return 1;
        }else{
             return base * recursivo(base, exp - 1);
        }
    }
    
    public int potenciaNeg(int base, int exp){
        if (exp == 0) {
            return 1;
        }
        if (exp > 0) {
            return base * recursivo(base, exp - 1);
        }else{
            return recursivo(base, exp + 1) / base;
        }         
    }
    
    public String binario(int n){
        if (n == 1) {
            return "1";
        }else{
            return (binario(n / 2) + (n % 2));
        }
    }
    
    public String binarioNeg(int n){
        if (n <= 1 && n >= -1) {
            return "1";
        }else{
            return (binario(n / 2) + (n % 2));
        }
    }*/
    
    public static void rellenarCaracter(char[] palabra, int[] indices, char letra){
        for (int i = 0; i < indices.length; i++) {
            palabra[indices[i]] = letra;
            if (indices[i] < palabra.length && indices[i] >= 0) {
                palabra[indices[i]] = letra;
                
            }
        }
        System.out.println(palabra);
       
    }
    
    
}