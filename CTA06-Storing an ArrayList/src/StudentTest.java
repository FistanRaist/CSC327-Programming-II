import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * JUnit test class for testing Student class and sorting functionality.
 */
public class StudentTest {

    /**
     * Tests valid Student object creation.
     */
    @Test
    public void testValidStudentCreation() {
        Student student = new Student(101, "John", "123 Main St");
        assertEquals(101, student.getRollno());
        assertEquals("John", student.getName());
        assertEquals("123 Main St", student.getAddress());
    }

    /**
     * Tests Student creation with negative roll number.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRollno() {
        new Student(-1, "John", "123 Main St");
    }

    /**
     * Tests Student creation with null name.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullName() {
        new Student(101, null, "123 Main St");
    }

    /**
     * Tests Student creation with null address.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullAddress() {
        new Student(101, "John", null);
    }

    /**
     * Tests sorting by name using SelectionSort.
     */
    @Test
    public void testSortByName() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(102, "Bob", "789 Pine Rd"));
        students.add(new Student(101, "Alice", "456 Oak Ave"));
        SelectionSort.selectionSort(students, new NameComparator());
        assertEquals("Alice", students.get(0).getName());
        assertEquals("Bob", students.get(1).getName());
    }

    /**
     * Tests sorting by roll number using SelectionSort.
     */
    @Test
    public void testSortByRollno() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(102, "Bob", "789 Pine Rd"));
        students.add(new Student(101, "Alice", "456 Oak Ave"));
        SelectionSort.selectionSort(students, new RollnoComparator());
        assertEquals(101, students.get(0).getRollno());
        assertEquals(102, students.get(1).getRollno());
    }
}