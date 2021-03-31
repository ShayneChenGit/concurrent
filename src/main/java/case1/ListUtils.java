package case1;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static <T>List<List<T>> splitList(List<T> list, int pageSize) {
        int listSize = list.size();
        int page = (listSize + (pageSize - 1))/pageSize;

        List<List<T>> listArray = new ArrayList<>();

        for(int i=0; i<page; i++) {
            List<T> subList = new ArrayList<>();
            subList.addAll(list.subList(i*pageSize, (i+1)*pageSize<list.size()?(i+1)*pageSize:list.size()));

            listArray.add(subList);
        }
        return listArray;
    }
}
