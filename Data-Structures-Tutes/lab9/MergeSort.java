package lab9;
import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static void sort(List<Integer> list){
    	sort(list, 0, list.size());
    }
    
    private static void sort(List<Integer> list, int startIndex, int endIndex){
    	int length = endIndex - startIndex;
    	if (length <= 1)
    	    return;
    	int middleIndex = startIndex + (length / 2);
    	sort(list, startIndex, middleIndex);
    	sort(list, middleIndex, endIndex);
    	
    	int upperStart = startIndex;
    	int upperEnd = startIndex + (length / 2);
    	int lowerStart = upperEnd;
    	int lowerEnd = endIndex;
    	
    	int i = upperStart;
    	int j = lowerStart;
    	List<Integer> tmpList = new ArrayList<Integer>();
    	while (i < upperEnd || j < lowerEnd) {
    		if (i >= upperEnd) {
    		    tmpList.add(list.get(j));
    		    j ++;
    		} else if (j >= lowerEnd) {
    		    tmpList.add(list.get(i));
    		    i ++;
    		}else {
    		    if (list.get(i) < list.get(j)) {
    				tmpList.add(list.get(i));
    				i ++;
    			    } else {
    				tmpList.add(list.get(j));
    				j ++;
    			    }
    			}
    	}
    	
    	for (int k = startIndex; k < endIndex; k ++) {
    	    list.set(k, tmpList.get(k - startIndex));
    	}
    }
}
