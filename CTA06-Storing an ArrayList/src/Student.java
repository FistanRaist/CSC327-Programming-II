/**
 * Represents a student with roll number, name, and address.
 * This class encapsulates student data and provides accessor methods.
 */
public class Student {
    private final int rollno;
    private final String name;
    private final String address;

    /**
     * Constructs a Student object with specified roll number, name, and address.
     *
     * @param rollno  the student's roll number
     * @param name    the student's name
     * @param address the student's address
     */
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Gets the student's roll number.
     *
     * @return the roll number
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Gets the student's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the student's address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return a string containing roll number, name, and address
     */
    @Override
    public String toString() {
        return "Student{rollno=" + rollno + ", name='" + name + "', address='" + address + "'}";
    }
}