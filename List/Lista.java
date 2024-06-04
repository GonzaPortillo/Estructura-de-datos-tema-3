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
