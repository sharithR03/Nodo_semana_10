public class Nodo {
    int valor;
    Nodo siguiente;

    Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

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

        // Buscar varios valores, incluyendo uno que no está en la lista
        int[] valoresBuscados = {10, 20, 30, 40};
        for (int valor : valoresBuscados) {
            if (buscar(n1, valor)) {
                System.out.println("El valor " + valor + " - SI se encontró en la lista.");
            } else {
                System.out.println("El valor " + valor + " - NO se encontró en la lista.");
            }
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
