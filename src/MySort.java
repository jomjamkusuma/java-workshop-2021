import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MySort {
    List<Integer> arr = new ArrayList<>();

    public MySort(){

    }
    public MySort(List<Integer> arr){
        this.arr = arr;
    }

    public List Empty(){
        return arr;
    }

    public List sortOneElement(){
        return arr;
    }

    public List sortElement(){
        Collections.sort(arr);
        return arr;
    }



}
