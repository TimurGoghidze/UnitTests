import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sumOfTwoNumbersPositive() {
        Sum s = new Sum(); //вызываем экземпляр класса
        assertEquals(9,s.sumOfTwoNumbers(5,4)); // ожидаемое и актуальное
    }

    @Test
    void sumOfTwoNumbersNegative() {
        Sum s = new Sum(); //вызываем экземпляр класса
        assertNotEquals(12,s.sumOfTwoNumbers(5,4));//не ожидаемое и актуальное
    }
}