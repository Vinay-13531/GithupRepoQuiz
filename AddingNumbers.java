public class AddingNumbers {
    public static void main(String[] args) {
        Operations operationsInterface = (numOne, numTwo) -> {
            int sum = 0;
            for (int i = numOne; i <= numTwo; i++) {
                sum += i;
            }
            return sum;
        };
	}
}