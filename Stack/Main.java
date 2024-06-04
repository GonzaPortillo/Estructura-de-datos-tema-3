public class Main {
    public static void main(String[] args) {
        PilaLista stack = new PilaLista();
        stack.Agregar(1);
        stack.Agregar(2);
        stack.Agregar(3);
        stack.Agregar(4);
        stack.Agregar(5);
        stack.Agregar(6);

        System.out.println("Peek: " + stack.Devuelve());
        System.out.println("Pop: " + stack.Eliminar());
        System.out.println("Peek: " + stack.Devuelve());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Is empty: " + stack.EstaVacia());
    }
}
