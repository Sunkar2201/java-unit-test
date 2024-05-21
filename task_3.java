@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
        this.age = age;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            {19, true},
            {17, false},
            {18, true},
            {20, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Ошибка: возраст " + age + " должен возвращать " 
+ expectedResult, expectedResult, isAdult);
    }
}
