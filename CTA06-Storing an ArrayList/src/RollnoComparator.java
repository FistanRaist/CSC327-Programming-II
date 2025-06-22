import java.util.Comparator;

/**
 * Comparator for sorting Student objects by roll number in ascending order.
 */
public class RollnoComparator implements Comparator<Student> {
    /**
     * Compares two Student objects based on their roll numbers.
     *
     * @param s1 the first Student object
     * @param s2 the second Student object
     * @return a negative integer, zero, or a positive integer as the first student's
     *         roll number is less than, equal to, or greater than the second's roll number
     */
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}