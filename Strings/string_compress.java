public class string_compress {

    public static String compressed(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            // str.length()-1 because we are checking is the next element is same for that
            // there should be a next element so we added -1
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count);
            }

        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aabbccccddeefg";

        System.out.println(compressed(str));
    }

}
