
public class MainProgram {

    public static void main(String[] args) {
        Counter test = new Counter(10);
        test.decrease();
        System.out.println(test.value());
        test.decrease(10);
        System.out.println(test.value());
        test.decrease(9);
        System.out.println(test.value());
    }
}
