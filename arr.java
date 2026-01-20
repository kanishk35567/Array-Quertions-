//# arr quertions
//Q1- linerar search or find a array

public class arr {

    public static int linerar(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 14;
        int index = linerar(number, key);
        if (index == -1) {
            System.out.println("nai mili ji");

        } else {
            System.out.println("key found at index: " + index);
        }

    }
}
