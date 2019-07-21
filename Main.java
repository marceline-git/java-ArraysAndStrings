public class Main {
    public static void main(String[] args) {
        AL01 al = new AL01();
        al.add("test");
        al.add("test2");
        al.add("test3");
        al.print();

        SB01 sb = new SB01();
        String[] array = new String[] {"abc","def","ghi","jkl","mno","pqr"};
        for (String w: array) {
            sb.append(w);
        }
        System.out.println(sb.toString());

        HM01 hm = new HM01();
        String[] cities = new String[] {"dublin","seattle","tokyo","sydney","newyork","vancouver"};

        for (String w: cities) {
            hm.put(w);
        }
        hm.get("tokyo");
    }
}
