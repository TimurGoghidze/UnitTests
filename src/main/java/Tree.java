public class Tree {

    public int garlandLength(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length - 1; i++) { //0-начало массива, покуда меньше массива, и увеличиваем на 1 ед. и -1 чтобы не заходило за массив
            length = length + (arr[i + 1] - arr[i]);
        }
        return length;
    }
}
