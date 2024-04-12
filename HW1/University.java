public class University {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.5),
                new Student("Bob", 4.2),
                new Student("Charlie", 2.4),
                new Student("Dave", 4.5),
                new Student("Eve", 4.8)
        };
        bubbleSortStudents(students);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAverageScore());
        }
    }

    private static void bubbleSortStudents(Student[] students) {
        boolean swapped;
        int n = students.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (students[i - 1].getAverageScore() > students[i].getAverageScore()) {
                    Student temp = students[i];
                    students[i] = students[i - 1];
                    students[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
