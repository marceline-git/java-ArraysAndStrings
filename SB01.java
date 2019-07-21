public class SB01 {
    AL01 al = new AL01();

    public void append(String s) {
        this.al.add(s);
    }

    //complexity can be reduced
    public String toString() {
        String ret = "";
        for (int i = 0; i < this.al.size(); i++) {
            ret += this.al.get(i);
        }
        return ret;
    }
}