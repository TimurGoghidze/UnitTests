import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {

    @Test @ParameterizedTest @MethodSource("validData") //параметреризуемый и откуда будут считывать данные
    void sumOfTwoNumbersPositive(Integer expected, Integer a, Integer b) {
        Sum s = new Sum(); //вызываем экземпляр класса
        assertEquals(expected,s.sumOfTwoNumbers(a,b)); // ожидаемое и актуальное
    }

    static Stream<Arguments> validData(){ //провайдер данных
        return Stream.of(
                arguments(5,2,3), // поток данных из которых будем перебирать аргументы
                arguments(9,7,2), //их можно вставить сколько угодно и также можно вписать файл
                arguments(-6,-4,-2)
        );
    }



    @Test
    void sumOfTwoNumbersNegative() {
        Sum s = new Sum(); //вызываем экземпляр класса
        assertNotEquals(12,s.sumOfTwoNumbers(5,4));//не ожидаемое и актуальное
    }
}