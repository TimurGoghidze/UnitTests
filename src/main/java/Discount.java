import java.sql.SQLOutput;

public class Discount {
    // на каждую вторую покупку, скидка 2%
    // после 18:00 еще 2% скидка
    // int i - номер покупки
    // int after18 (0,1) - после 18:00 или нет

    public int getDiscountValue(int i, int after18) {
        int discountValue = 0;

//        if (i % 2 == 0) { // если номер покупки четный
//            discountValue += 2; // скидка 2%
//        }
//        if (after18 == 1) {      // если время после 18:00
//            discountValue += 2; // дополнительная скидка 2%
//        }
//второй вариант
        if (i <= 0) {
            System.out.println("Order number should be positive value!");

        }
        if (after18 < 0 || after18 > 1) {
            System.out.println("Time data should be 1 or 0");
        }

        if (i % 2 == 0 && after18 == 1) { //чет и после18
            discountValue = 4;
        }
        if (i % 2 == 0 && after18 == 0) {//чет но не после 18
            discountValue = 2;
        }
        if (i % 2 != 0 && after18 == 1) { //нечет но после 18
            discountValue = 2;
        }
        if (i % 2 != 0 && after18 == 0) {//нечет но не после 18
            discountValue = 2;
        }
        return discountValue;
    }

}
