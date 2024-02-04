package CollectionFramework;

import java.util.Vector;

public class Enumeration {

    public static void main(String[] args) {

        Vector<Object> v = new Vector<>();

        v.add(10);
        v.add("nikita");
        v.add('a');

        java.util.Enumeration<Object> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

