import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiscountTest {

    @Test
    void getDiscountValue() {
        Discount d = new Discount(); //вызываем экземпляр класса
        assertEquals(2,d.getDiscountValue(2,0));
    }

    @Test
    void getDiscountValue1() {
        Discount d = new Discount();
        assertEquals(4,d.getDiscountValue(2,1));
    }

    @Test
    void getDiscountValue2() {
        Discount d = new Discount();
        assertEquals(2,d.getDiscountValue(1,0));
    }

    @Test
    void getDiscountValue3() {
        Discount d = new Discount();
        assertEquals(2,d.getDiscountValue(1,1));
    }

    @Test
    void getDiscountValue4() {
        Discount d = new Discount();
        assertNotEquals(7,d.getDiscountValue(1,0));
    }

    @Test
    void getDiscountValue5() {
        Discount d = new Discount(); //вызываем экземпляр класса
        assertEquals(4,d.getDiscountValue(2,0));
    }
//    @ParameterizedTest
//    @MethodSource("validData") //параметреризуемый и откуда будут считывать данные
//    void garlandLength(int [] arr, int after18) {
//        Discount d = new Discount();
//        assertEquals(2,getDiscountValue(2,1);
//    }
//
//    static Stream<Arguments> validData(){ //провайдер данных
//        return Stream.of(
//                arguments(new int[]{1,1},2), // поток данных из которых будем перебирать аргументы
//                arguments(new int[]{2,0},1)
//        );
//    }
}