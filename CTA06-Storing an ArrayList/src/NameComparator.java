import java.util.Comparator;

/**
 * Comparator for sorting Student objects by name in lexicographical order.
 */
public class NameComparator implements Comparator<Student> {
    /**
     * Compares two Student objects based on their names.
     *
     * @param s1 the first Student object
     * @param s2 the second Student object
     * @return a negative integer, zero, or a positive integer as the first student's
     *         name is less than, equal to, or greater than the second's name
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}