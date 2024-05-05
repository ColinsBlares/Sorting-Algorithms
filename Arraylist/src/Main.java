public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList); // Выводит: [1, 2, 3]

        myList.remove(1);
        System.out.println(myList); // Выводит: [1, 3]

        System.out.println(myList.get(1)); // Выводит: 3
    }
}
