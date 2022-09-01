import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HumanTest {

    private static Human testHuman;

    @BeforeAll
    public static void before() {
        testHuman = new Human(31, "John", "Smith");
    }

    @Test
    public void getLastNameAndNameTest() {
        Assertions.assertEquals(testHuman.getLastNameAndName(), "Smith John");
    }

    @Test
    public void ageIsGreaterThan30Test() {
        Assertions.assertTrue(testHuman.ageIsGreaterThan30());
    }

    @Test
    @Disabled
    public void humanConstructorTest() {
        Assertions.assertEquals(testHuman.getAge(), 31);
        Assertions.assertEquals(testHuman.getName(), "John");
        Assertions.assertEquals(testHuman.getLastName(), "Smith");
    }
}
