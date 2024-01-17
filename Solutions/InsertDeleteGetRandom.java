package Solutions;

import java.util.*;

class RandomizedSet {
    private final Random random = new Random();
    private final Map<Integer, Integer> map = new HashMap<>();
    private int[] vals = new int[32];
    private int i = 0;

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        Integer added = map.putIfAbsent(val, i);
        if (added != null) return false;

        if (i >= vals.length) {
            vals = Arrays.copyOf(vals, vals.length * 2);
        }
        vals[i++] = val;
        return true;
    }
    
    public boolean remove(int val) {
        Integer removed = map.remove(val);
        if (removed == null) return false;

        if (removed < i - 1) {
            vals[removed] = vals[i-1];
            map.put(vals[i-1], removed);
        }
        i--;
        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(i);
        return vals[index];
    }
}


/*Alt:
 * 
class RandomizedSet {

    HashSet<Integer> hs;

    public RandomizedSet() {
        hs =  new HashSet<>();
    }
    
    public boolean insert(int val) {

        if(hs.contains(val)){
            return false;
        }
        else{
            hs.add(val);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        if(!hs.contains(val)){
            return false;
        }
        else{
            hs.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        Integer[] arr = hs.toArray(new Integer[hs.size()]);
        int randomIndex = new Random().nextInt(arr.length);
        return arr[randomIndex];
    }
}
 */