public class Reduce {
    public static void main(String[] args) {
        int n = 100, count = 0;
        while(n > 0){
            n = (n % 2 == 1 ? n - 1 : n / 2);
            count++;
        }
        System.out.println(count);
    }
}
