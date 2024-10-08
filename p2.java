import java.util.Scanner;

public class ManipulacionTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una línea de texto:");
        String linea = sc.nextLine();
        
        // Encontrar el carácter que más veces se repite
        int[] contador = new int[256];
        for (char c : linea.toCharArray()) {
            contador[c]++;
        }
        
        char caracterMasFrecuente = ' ';
        int maxFrecuencia = 0;
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > maxFrecuencia) {
                maxFrecuencia = contador[i];
                caracterMasFrecuente = (char) i;
            }
        }
        
        // Reemplazar vocales por el carácter más frecuente
        String lineaModificada = linea.replaceAll("[aeiouAEIOU]", String.valueOf(caracterMasFrecuente));
        System.out.println("Línea con vocales reemplazadas: " + lineaModificada);
        
        // Inversión de la línea
        String lineaInvertida = new StringBuilder(lineaModificada).reverse().toString();
        System.out.println("Línea invertida: " + lineaInvertida);
        
        sc.close();
    }
}
