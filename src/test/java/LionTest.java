import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.Test;
import com.example.Feline;
import com.example.Lion;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    private final String predator = "Травоядное";

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittensTest() {
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void wrongSexTest()  {
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> lion = new Lion("Тест", feline));
        assertEquals(expected, exception.getMessage());
    }
}
