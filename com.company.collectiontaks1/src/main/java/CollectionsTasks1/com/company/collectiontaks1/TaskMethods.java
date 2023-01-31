package CollectionsTasks1.com.company.collectiontaks1;

import java.util.*;

public class TaskMethods {
    public int secondBiggestNumber(List<Integer> arrayList){

        Collections.sort(arrayList);
        int sizeOfList = arrayList.size();

        if (sizeOfList == 0 || sizeOfList == 1){
            return 0;
        }
        return arrayList.get((arrayList.size() - 2));
    }

    public List<Integer> sortReverse(List<Integer> arrayList){

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 > o1){
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(arrayList, comparator);
        return arrayList;
    }


    public List<String> sortEmployeeReverse(List<String> arrayList){

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 1;
                }
                return -1;
            }

        };

        Collections.sort(arrayList, comparator);
        return arrayList;
    }
    public <K extends Comparable<K>, V extends Comparable<V> > Map<K, V>
    valueSort( Map<K, V> map) {
        Comparator<K> cmpComparator = new Comparator<K>() {
            @Override
            public int compare(K key1, K key2) {
                return -map.get(key1).compareTo(map.get(key2));
            }
        };


        TreeMap<K, V> sortedMap = new TreeMap<>(cmpComparator);
        sortedMap.putAll(map);



        return sortedMap;
    }

}
