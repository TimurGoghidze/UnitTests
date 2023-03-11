import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void garlandLength() {
        Tree tree = new Tree();
        int[] arr = {1,2,3,4,5};
        assertEquals(4,tree.garlandLength(arr));
    }
}