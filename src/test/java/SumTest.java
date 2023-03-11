import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sumOfTwoNumbers() {
        Sum s = new Sum(); //вызываем экземпляр класса
        assertEquals(9,s.sumOfTwoNumbers(5,4));
    }
}