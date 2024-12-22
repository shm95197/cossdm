public class AddNum {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through the first 100 even numbers
        for (int i = 1; i <= 100; i++) {
            sum += 2 * i;  // Even numbers are 2, 4, 6, ..., 200
        }

        System.out.println("The sum of the first 100 even numbers is: " + sum);
    }
}
