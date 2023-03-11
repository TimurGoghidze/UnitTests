import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TreeTest {

    @ParameterizedTest
    @MethodSource("validData") //параметреризуемый и откуда будут считывать данные
    void garlandLength(int [] arr, int res) {
        Tree tree = new Tree();
        assertEquals(res,tree.garlandLength(arr));
    }

    static Stream<Arguments> validData(){ //провайдер данных
        return Stream.of(
                arguments(new int[]{1,4,2,3,5},8), // поток данных из которых будем перебирать аргументы
                arguments(new int[]{1,2,3,4,5},4)
        );
    }


    @Test
    void garlandLengthPositive1() {
        Tree tree = new Tree();
        int[] arr = {1,4,2,3,5};
        assertEquals(8,tree.garlandLength(arr));
    }

    @Test
    void garlandLengthPositive2() {
        Tree tree = new Tree();
        int[] arr = {1,2,3,4,5};
        assertEquals(4,tree.garlandLength(arr));
    }
    @Test
    void garlandLengthNegative1() {
        Tree tree = new Tree();
        int[] arr = {1,2,3,4,5};
        assertNotEquals(5,tree.garlandLength(arr));
    }

}