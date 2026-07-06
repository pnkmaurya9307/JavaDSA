public class LearnJava {

    public static int reverse(int n) {
        int sum = 0;

        while (n > 0) {
            int m = n % 10;
            sum = (sum * 10) + m;
            n = n / 10;     // 
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        reverse(2465);

        System.out.println("Start small. Ship something.");
    }
}