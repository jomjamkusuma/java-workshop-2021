import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    void emptyCase(){
        List<Integer> testArr = new ArrayList<>();
        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.Empty());
    }

    @Test
    void case01(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(1);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.Sort);
    }
}