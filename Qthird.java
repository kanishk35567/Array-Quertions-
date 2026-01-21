public class Qthird {

    // # find smallest number in array
    public static int smallest(int number[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = {5, 3, 8, 1, 2, 7};
        System.out.println("Smallest value: " + smallest(number));
    }
}