import java.util.ArrayList;

/**
 * Demonstrates storing and sorting Student objects in an ArrayList using selection sort.
 */
public class Main {
    /**
     * Main method to create, sort, and display a list of students.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<Student> students = createStudentList();
        displayStudents("Original List:", students);
        sortAndDisplayByName(students);
        sortAndDisplayByRollno(students);
    }

    /**
     * Creates and populates an ArrayList with 10 Student objects.
     *
     * @return the populated ArrayList of Student objects
     */
    private static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", "123 Main St"));
        students.add(new Student(102, "Alice", "456 Oak Ave"));
        students.add(new Student(103, "Bob", "789 Pine Rd"));
        students.add(new Student(104, "Emma", "321 Elm St"));
        students.add(new Student(105, "David", "654 Maple Dr"));
        students.add(new Student(106, "Clara", "987 Cedar Ln"));
        students.add(new Student(107, "Frank", "147 Birch Ct"));
        students.add(new Student(108, "Grace", "258 Spruce Way"));
        students.add(new Student(109, "Henry", "369 Willow Pl"));
        students.add(new Student(110, "Isabel", "741 Aspen Blvd"));
        return students;
    }

    /**
     * Displays the list of students with a specified header.
     *
     * @param header   the header to display before the list
     * @param students the ArrayList of Student objects to display
     */
    private static void displayStudents(String header, ArrayList<Student> students) {
        System.out.println(header);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    /**
     * Sorts the student list by name and displays it.
     *
     * @param students the ArrayList of Student objects to sort and display
     */
    private static void sortAndDisplayByName(ArrayList<Student> students) {
        SelectionSort.selectionSort(students, new NameComparator());
        displayStudents("\nSorted by Name:", students);
    }

    /**
     * Sorts the student list by roll number and displays it.
     *
     * @param students the ArrayList of Student objects to sort and display
     */
    private static void sortAndDisplayByRollno(ArrayList<Student> students) {
        SelectionSort.selectionSort(students, new RollnoComparator());
        displayStudents("\nSorted by Rollno:", students);
    }
}