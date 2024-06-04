public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    // Constructor
    public Queue() {
        front = null;
        rear = null;
    }

    // Método para comprobar si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Método para eliminar y devolver el elemento del frente de la cola
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T data = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
          front = front.next;
        }
        return data;
    }

    // Método para obtener el elemento del frente de la cola sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return front.data;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        // Constructor de Nodo
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
