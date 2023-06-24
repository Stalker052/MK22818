package src.tests;

import org.junit.jupiter.api.Test;
import src.people.Student;
import src.people.Teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Teacher class.
 */
public class TeacherTest {
    /**
     * Tests the getSubject method of the Teacher class.
     */
    @Test
    public void testGetSubject() {
        Teacher teacher = new Teacher("Pan Paweł", 50, "Physics");
        assertEquals("Physics", teacher.getSubject());
    }

    /**
     * Tests the grade method of the Teacher class.
     */
    @Test
    public void testGrade() {
        Student student = new Student("AZosia", 18, "Math");
        Teacher teacher = new Teacher("Pan Paweł", 50, "Math");

        teacher.grade(student);

        assertEquals(1, student.getGrades().size());
        int grade = student.getGrades().get(0);
        assertEquals(true, grade >= 3 && grade <= 6);
    }
}
