import java.util.*; // con este importamos todas las librerias de java, entre ellas scanner

public class Anagrama { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // pedimos la palabra 1 y la palabra 2, todo esto mediante un scanner
        System.out.println("Ingrese la palabra 1: ");
        String palabra_1 = scanner.nextLine();
        System.out.println("Ingrese la palabra 2: ");
        String palabra_2 = scanner.nextLine();
        palabra_1 = palabra_1.toLowerCase(); // Convertimos las palabras a minusculas con .toLowercase();
        palabra_2 = palabra_2.toLowerCase();

        String Anagrama = esAnagrama(palabra_1.toCharArray(), palabra_2.toCharArray()) ? "Si es un angrama" : "No es un anagrama";//Utilice el operador ternario para asignar Anagrama "Si es un anagrama" o "No es un anagrama" según el resultado del metodo esAnagrama
        System.out.println(Anagrama); 

        scanner.close();
    }

    private static boolean esAnagrama(char[] caracteres_1, char[] caracteres_2) { // Cambié 'Boolean' a 'boolean' y corregí el nombre de los parámetros
        if (caracteres_1.length != caracteres_2.length) { // Verificamos la longitud de los arrays
            return false;
        }
        
        Arrays.sort(caracteres_1); // usamos .sort para organizar los arreglos 
        Arrays.sort(caracteres_2); 

        for (int i = 0; i < caracteres_1.length; i++) { 
            if (caracteres_1[i] != caracteres_2[i]) {
                return false;
            }
        }
        return true;
    }
}
