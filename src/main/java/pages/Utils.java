package pages;

import java.util.List;

public class  Utils {
    public static boolean is_arraylist_sorted_accessding(List<Integer> list){
        boolean sorted = true;
        for(int i = 1; i<list.size(); i++){
            if(list.get(i-1).compareTo(list.get(i))>0){
                sorted=false;
            }
        }
        return sorted;
    }
}
