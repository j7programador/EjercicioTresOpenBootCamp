public class Main {
    public static void main(String[] args) {

        String [] arreglo = {"Hola", "Mundo", "Java"};
        StringBuilder cadena = new StringBuilder();
        
        for (String string : arreglo) {
            cadena.append(string + " ");
        }
        System.out.println(cadena);

    }
}