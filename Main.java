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
        String[] keys = new String[] {"Japan","United States","United Kingdom","Ireland"};
        String[] values = new String[] {"Tokyo","Washington D.C.","London","Dublin"};
        for (int i = 0; i < keys.length; i++) {
            hm.put(keys[i],values[i]);
        }

        for (String country : keys) {
            System.out.println(country + "'s capital is ... " + hm.get(country) + " !");
        }
    }
}
