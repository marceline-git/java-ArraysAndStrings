public class HM01 {
    private LinkedList root[] = new LinkedList[10];

    private int hash(String str) {
        int i = str.hashCode();
        return Math.abs(i%10);
    }

    public void put(String k, String v) {
        int index = this.hash(k);
        if (root[index] == null) {
            root[index] = new LinkedList();
            root[index].append(k,v);
        } else {
            root[index].append(k,v);
        }
    }

    public String get(String k) {
        int index = this.hash(k);
        return root[index].valueLookUp(k);
    }

}
