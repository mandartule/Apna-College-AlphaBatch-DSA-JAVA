public class num_to_words {

    public static void main(String args[]) {

        convert(2019);

    }

    public static void convert(int num) {

        String map[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        // base case
        // as int the question it is said that last no. cannot be zero therefore
        if (num == 0) {
            return;
        }

        // work

        int lastDigit = num % 10;
        convert(num / 10);

        System.out.print(map[lastDigit] + " ");
    }

}
