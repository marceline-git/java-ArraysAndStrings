import java.util.Arrays;

public class AL01 {
    //need to change to generics
    private String[] al = new String[1];
    private int index = 0;

    public int size() {
        return this.index;
    }

    private String[] doubleUp() {
        String[] newAl = new String[this.al.length*2];
        for (int i = 0; i < this.al.length; i++) {
            newAl[i] = al[i];
        }
        return newAl;
    }

    public void add(String s) {
        if (this.index < this.al.length) {
            this.al[index] = s;
            this.index++;
        } else {
            this.al = this.doubleUp();
            this.al[index] = s;
            this.index++;
        }
    }

    public String get(int n) {
        return this.al[n];
    }

    public void print() {
        System.out.println(Arrays.toString(this.al));
    }

    public boolean contains(String s) {
        for (String t: this.al) {
            if (t.equals(s)) return true;
        }
        return false;
    }
}
