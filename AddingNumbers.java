public class AddingNumbers {
    //Maanya and Vinay
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