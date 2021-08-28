import com.hank.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun averageTest() {
        val stu = Student("001", "Hank", 60, 70)
        Assertions.assertEquals(65, stu.average())
    }
}