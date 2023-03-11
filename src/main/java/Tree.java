import static java.lang.Math.abs;

public class Tree {

    public int garlandLength(int[] arr) {
        int length = 0;


        for (int i = 0; i <(arr.length) - 1; i++) { //0-начало массива, покуда меньше массива, и увеличиваем на 1 ед.
            // и -1 чтобы не заходило за массив чтобы шло только до 4 т.е. на одну атерацию меньше
            length = length + abs(arr[i + 1] - arr[i]);//abs - абсолютное значение где исключаются "-" в отриц. числах
        }
        return length;
    }
}
