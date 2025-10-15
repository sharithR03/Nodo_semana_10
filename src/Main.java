//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Clase principal movida a Nodo.java. Este archivo puede eliminarse o dejarse vacío para evitar confusión y errores de ejecución.

public class Main {
    public static void main(String[] args) {
        // Crear tres nodos y enlazarlos
        Nodo n1 = new Nodo(10);
        Nodo n2 = new Nodo(20);
        Nodo n3 = new Nodo(30);
        n1.siguiente = n2;
        n2.siguiente = n3;

        // Contar nodos
        int total = contarNodos(n1);
        System.out.println("Total de nodos: " + total);

        // Buscar un valor
        int valorBuscado = 20;
        if (buscar(n1, valorBuscado)) {
            System.out.println("El valor " + valorBuscado + " se encontró en la lista.");
        } else {
            System.out.println("El valor " + valorBuscado + " NO se encontró en la lista.");
        }
    }

    // Método recursivo para contar nodos
    public static int contarNodos(Nodo n) {
        if (n == null) return 0;
        return 1 + contarNodos(n.siguiente);
    }

    // Método recursivo para buscar un valor
    public static boolean buscar(Nodo n, int valor) {
        if (n == null) return false;
        if (n.valor == valor) return true;
        return buscar(n.siguiente, valor);
    }
}