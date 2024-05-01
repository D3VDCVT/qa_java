import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        feline.eatMeat();
        verify(feline).getFood("Хищник");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgumentTest() {
        int argument = 10;
        int expected = 10;
        assertEquals(expected, feline.getKittens(argument));
    }
}
