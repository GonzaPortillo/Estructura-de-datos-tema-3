# Estructuras lineales

## Indice
1. Índice
2. Introducción
3. Investigación
4. Reporte práctico
5. Conclusiones
6. Referencias

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

● En una lista enlazada, cada elemento (llamado nodo) contiene tanto el valor del elemento como una referencia (enlace) al siguiente elemento en la lista.

Lista basada en arreglo (array list):

● Una lista basada en arreglo almacena los elementos en un arreglo contiguo de memoria, donde cada elemento tiene una posición fija.

Las listas en estructuras de datos son fundamentales en la programación y se utilizan ampliamente en una variedad de aplicaciones. Son útiles cuando se necesita una colección de elementos que pueda crecer o disminuir dinámicamente y donde se requiera acceso eficiente a los elementos en posiciones arbitrarias.

## Operaciones Basicas

### Pila (Stack)
Push: push(value)
Añade un elemento al tope de la pila. Tiempo de operación: O(1).
Pop: pop()
Elimina y devuelve el elemento del tope de la pila. Tiempo de operación: O(1).
Peek (o Top): peek()
Devuelve el elemento del tope sin eliminarlo. Tiempo de operación: O(1).


### Cola (Queue)

### Lista (List)
●Acceso: get(index)

●Inserción al inicio: addFirst(value)

●Inserción al final: addLast(value)

●Inserción en una posición: insert(index, value)

●Eliminación al inicio: removeFirst()

●Eliminación al final: removeLast()

●Eliminación en una posición: remove(index)

●Búsqueda: find(value)

## Codigo en Java
## Resultados 
## Conclusiones
## Referencias
