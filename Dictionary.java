public class Dictionary implements Map<String, Integer> {
    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {
        if(count == elems.length){
            increaseCapacity();
        }
        Pair newPair = new Pair(key, value);
        elems[count] = newPair;
        count ++;
    }

    private void increaseCapacity() {
        Pair[] increase = new Pair[elems.length + INCREMENT];
        for(int i = 0; i < elems.length; i ++){
            increase[i] = elems[i];
        }
        elems = increase;
    }

    @Override
    public boolean contains(String key) {
        for(Pair elem: elems){
            if(elem.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(String key) {
        int v = 0;
        for(Pair elem: elems){
            if(elem.getKey().equals(key)){
                 v =  elem.getValue();
            }    
        }
        Integer vInt = Integer.valueOf(v);
        return vInt;    

        /* Your code here. */
    }

    @Override
    public void replace(String key, Integer value) {
        for(int i = 0; i < elems.length; i++){
            if(elems[i].getKey().equals(key)){
                elems[i].setValue(value);
            }
        }
    }

    @Override
    public Integer remove(String key) {
        int index = 0;
        int value = 0;
        if(contains(key)){
            value = get(key);
            for(int i = 0; i < elems.length; i++){
                if(elems[i].getKey().equals(key)){
                     index = i;
                    }
                }
            for(int j = index; j < elems.length; j ++){
                elems[j] = elems[j+1];
            }
            elems[elems.length -1] = null;
        }
        Integer iInt = Integer.valueOf(value);
        return iInt;
    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }
}
