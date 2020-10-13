import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    Supplier<Integer> randomSupplier = () -> random.nextInt(10);
    System.out.println(randomSupplier.get());

    Integer[] numberList = {1,2,3,4,5,6,7,8,9};

    printEvenOrUneven("Even numbers from 1 to 9 are: ", numberList, num -> num%2 == 0);
    printEvenOrUneven("Uneven numbers from 1 to 9 are: ", numberList, num -> num%2 != 0);
  }
  private static void printEvenOrUneven(String message, Integer[] numberList, Predicate<Integer> condition){
    System.out.println(message);
    for (Integer x : numberList) {
      if (condition.test(x)){
        System.out.println(x);
      }
    }
  }
}
