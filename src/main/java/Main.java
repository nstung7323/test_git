import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());
//        System.out.println(Utils.caculate(100, 0.01));
//        List<String> lst = new ArrayList<>();
//        String a = "A";
//        String b = "b";
//        String c = "c";
//        lst.add(a);
//        lst.add(b);
//        lst.add(c);
//        Map<String, Boolean> maps = new HashMap<>();
//        for (String s : lst) {
//            maps.put(s, false);
//        }
//        maps.put(c, true);
//        for (Map.Entry<String, Boolean> s : maps.entrySet()) {
//            System.out.println(s.getKey() + " - " + s.getValue());
//        }
//        maps.put(a, true);
//        for (String s : lst) {
//            maps.put(s, false);
//        }
//        for (Map.Entry<String, Boolean> s : maps.entrySet()) {
//            System.out.println(s.getKey() + " - " + s.getValue());
//        }

        System.out.println(MainKt.calculate(100));;
    }
}
