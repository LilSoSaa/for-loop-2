package it.develhope.forloop;

public class Start {

    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.println(n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            System.out.println(i);
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;


            // you can declare in one line to avoid repeating int 3 times


        }
    }
}