import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.RestMonth;


public class RestMonthTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restMonth.csv")
    public void test(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int rest = service.calculate(income, expenses, threshold);
        System.out.println("Месяцев отдыха в году - " + rest);
    }
}

