  # Estructuras lineales

## Indice
1. [Introducción](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#investigacion)
2. [Investigación](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#investigacion)
    * [Stack](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#pila-stack)
    * [Queue](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#cola-queue)
    * [List](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#lista-list)
3. [Operaciones Basicas](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#operaciones-basicas)
    * [Stack](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/blob/main/README.md#pila-stack-1)
    * [Queue](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/blob/main/README.md#cola-queue-1)
    * [List](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/blob/main/README.md#lista-list-1)
4. [Implementacion en java](https://github.com/GonzaPortillo/Estructura-de-datos-tema-3/tree/main?tab=readme-ov-file#implementacion-en-java)
    * [Stack]
    * [Queue]
    * [List]
5. [Conclusiones]()

## Introduccion

Las estructuras de datos son una forma de organizar y almacenar datos de manera eficiente para facilitar su acceso y modificación. Entre las estructuras de datos más básicas y fundamentales se encuentran las estructuras lineales. Un arreglo es una colección de elementos del mismo tipo, almacenados en ubicaciones de memoria contiguas. Los arreglos permiten un acceso rápido a cualquier elemento dado su índice. Una lista enlazada es una colección de elementos llamados nodos, donde cada nodo contiene un dato y una referencia (o enlace) al siguiente nodo de la secuencia.

## Investigacion

### Pila (Stack)
Una pila en estructura de datos es una colección lineal de elementos en la que las operaciones de inserción y eliminación se realizan en un extremo llamado "cima" o "top". Se caracteriza por seguir el principio de LIFO (Last In, First Out), lo que significa que el último elemento en ser insertado es el primero en ser eliminado. Las pilas se utilizan en una variedad de aplicaciones en informática y programación, como la implementación de algoritmos de evaluación de expresiones aritméticas, seguimiento de llamadas de funciones en la ejecución de programas, manejo de historiales de navegación en navegadores web, y en algoritmos de búsqueda y recorrido de grafos, entre otros.

### Cola (Queue)
Una cola en estructura de datos es una colección lineal de elementos en la que las operaciones de inserción se realizan en un extremo llamado "cola" o "rear", y las operaciones de eliminación se realizan en el otro extremo llamado "frente" o "front". Se caracteriza por seguir el principio de FIFO (First In, First Out), lo que significa que el primer elemento en ser insertado es el primero en ser eliminado.

### Lista (List)
Una lista en estructura de datos es una colección ordenada de elementos donde cada elemento puede tener una posición relativa dentro de la lista. A diferencia de las estructuras de datos como las pilas y las colas, que tienen restricciones en cómo se pueden agregar y quitar elementos (LIFO para pilas y FIFO para colas), las listas permiten la inserción y eliminación en cualquier posición.

Existen diferentes tipos de listas en estructuras de datos, pero las dos más comunes son:

Lista enlazada:
* En una lista enlazada, cada elemento (llamado nodo) contiene tanto el valor del elemento como una referencia (enlace) al siguiente elemento en la lista.

Lista basada en arreglo (array list):
* Una lista basada en arreglo almacena los elementos en un arreglo contiguo de memoria, donde cada elemento tiene una posición fija.

Las listas en estructuras de datos son fundamentales en la programación y se utilizan ampliamente en una variedad de aplicaciones. Son útiles cuando se necesita una colección de elementos que pueda crecer o disminuir dinámicamente y donde se requiera acceso eficiente a los elementos en posiciones arbitrarias.

## Operaciones Basicas

### Pila (Stack)
* Push: push(value)
* Pop: pop()
* Peek (o Top): peek()

### Cola (Queue)
* Enqueue: enqueue(value)
* Dequeue: dequeue()
* Front (o Peek): front()
* IsEmpty: isEmpty()

### Lista (List)
* Acceso: get(index)
* Inserción al inicio: addFirst(value)
* Inserción al final: addLast(value)
* Inserción en una posición: insert(index, value)
* Eliminación al inicio: removeFirst()
* Eliminación al final: removeLast()
* Eliminación en una posición: remove(index)
* Búsqueda: find(value)

## Implementacion en Java

### Pila (Stack)

    import java.util.ArrayList;
    import java.util.EmptyStackException;

    public class PilaLista {
        private ArrayList<Integer> list = new ArrayList<>();

        public void Agregar(int value) {
            list.add(value);
        }

        public int Eliminar() {
            if (EstaVacia()) {
                throw new EmptyStackException();
            }
            int value = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return value;
        }

        public int Devuelve() {
            if (EstaVacia()) {
                throw new EmptyStackException();
            }
            return list.get(list.size() - 1);
        }

        public boolean EstaVacia() {
            return list.isEmpty();
        }

        public int getSize() {
            return list.size();
        }
    }

    public class main {
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

### Cola (Queue)

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


### Lista (List)

    public class Lista {
        private int maxSize;
        private int[] listaArray;

        public Lista(int size) {
            this.maxSize = size;
            listaArray = new int[maxSize];
        }

        public void add(int element) {
            if (size() < maxSize) {
                listaArray[size()] = element;
            } else {
                System.out.println("List is full. Cannot add " + element);
            }
        }

        public int get(int index) {
            if (index >= 0 && index < size()) {
                return listaArray[index];
            } else {
                System.out.println("Index out of bounds.");
                return -1;
            }
        }

        public void remove(int index) {
            if (index >= 0 && index < size()) {
                for (int i = index; i < size() - 1; i++) {
                    listaArray[i] = listaArray[i + 1];
                }
                listaArray[size() - 1] = 0;
            } else {
                System.out.println("Index out of bounds.");
            }
        }
        
        public int size() {
            int count = 0;
            for (int i = 0; i < maxSize; i++) {
                if (listaArray[i]!= 0) {
                    count++;
                }
            }
            return count;
        }

        public boolean isEmpty() {
            return (size() == 0);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Lista mylist = new Lista (5);
            myList.add(10);
            myList.add(20);
            myList.add(30);
            myList.add(40);
            myList.add(50);
            
            System.out.println("Tamaño de lista: "+yList.size());
            System.out.println("Elemento en el indice 2: "+ ylist.get(2));
            System.out.println("¿La lista esta vacía? + List.isEmpty());
            myList.remove(2);
            System.out.println("Tamaño de la lista despues de eliminar el elemento del indice 2: ByList.size());
            System.out.println("Elemento en el indice 2 despues de eliminar: mycist.get(2));
        }
    }

## Conclusiones

Las pilas, colas y listas son pilares fundamentales en la programación y la informática, proporcionando herramientas esenciales para la gestión eficiente de datos, la implementación de algoritmos y la optimización de sistemas informáticos y de software. Su comprensión y dominio son fundamentales para cualquier desarrollador de software que busque crear aplicaciones robustas y eficientes.
