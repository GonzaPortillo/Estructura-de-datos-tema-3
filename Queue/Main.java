public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // Agregando elementos a la cola
        queue.enqueue(10);
        queue.enqueue(26);
        queue.enqueue(36);

        System.out.println("Elementos de la cola: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
