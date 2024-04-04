package Week_11_Flyweight;
public class FlyweightStringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);  // Tulostaa true, koska s1 ja s2 viittaa samaan String-flyweightiin
        System.out.println(s1 == s3);  // Tulostaa false, koska s3 luodaan erikseen new-operaattorilla
    }
}
