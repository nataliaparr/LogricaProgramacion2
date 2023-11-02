import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //HashMap (diccionari-almacenamineto)
        HashMap<String, String> diccionario = new HashMap<>();
        // clave-valor
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("porfavor", "please");
        diccionario.put("gracias", "thank you");
        diccionario.put("sí", "yes");
        diccionario.put("no", "no");
        diccionario.put("perdón", "excuse me");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "boy");
        diccionario.put("niña", "girl");
        diccionario.put("casa", "house");
        diccionario.put("carro", "car");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("tiempo", "time");
        diccionario.put("trabajo", "job");
        diccionario.put("escuela", "school");

        int palabrasAleatorias = 5;
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[palabrasAleatorias];

        // determinar 5 palabrasAleatorias
        Object[] palabrasArray = diccionario.keySet().toArray();
        for (int i = 0; i < palabrasAleatorias; i++) {
            int indiceAleatorio = random.nextInt(palabrasArray.length);
            palabrasSeleccionadas[i] = (String) palabrasArray[indiceAleatorio];
        }

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);

        for (String palabra : palabrasSeleccionadas) {

            System.out.print("Escribe la palabra traducida '" + palabra + "': ");
            String respuestaUsuario = scanner.nextLine();
            String traduccionCorrecta = diccionario.get(palabra);

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("Muy bien");
                respuestasCorrectas++;
            } else {
                System.out.println("Te equivocaste. La palabra correcta era: '" + traduccionCorrecta + "'.");
                respuestasIncorrectas++;
            }
        }

        // resultado
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
