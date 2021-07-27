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
        assertEquals(testArr,arr.sortOneElement());
    }

    @Test
    void case02(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(1);
        testArr.add(2);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case03(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(2);
        testArr.add(1);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case04(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case05(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(2);
        testArr.add(1);
        testArr.add(3);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case06(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(1);
        testArr.add(3);
        testArr.add(2);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case07(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(3);
        testArr.add(2);
        testArr.add(1);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }

    @Test
    void case08(){
        List<Integer> testArr = new ArrayList<>();
        testArr.add(5);
        testArr.add(4);
        testArr.add(3);
        testArr.add(2);
        testArr.add(1);

        MySort arr = new MySort(testArr);
        assertEquals(testArr,arr.sortElement());
    }
}