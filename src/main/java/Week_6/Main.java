package Week_6;

import java.util.List;

public class Main {
          public static void main(String[] args){
            List<String> testList = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");


            ListConverter strategy1 = new EveryItemStrategy();
            ListConverter strategy2 = new EveryOtherItemStrategy();
            ListConverter strategy3 = new EveryThirdItemStrategy();


            System.out.println("Strategy 1:");
            System.out.println(strategy1.listToString(testList));

            System.out.println("Strategy 2:");
            System.out.println(strategy2.listToString(testList));

            System.out.println("Strategy 3:");
            System.out.println(strategy3.listToString(testList));
        }
}
