public class MyArrayList {
    private int[] array;
    private int size;

    public MyArrayList() {
        array = new int[10];
        size = 0;
    }

    public void add(int element) {
        ensureCapacity();
        array[size++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                sb.append(array[i] + ", ");
            }
            sb.append(array[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
