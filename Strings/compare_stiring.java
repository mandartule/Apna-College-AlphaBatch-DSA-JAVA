public class compare_stiring {
    public static void main(String args[]) {

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // normal compare in strings
        if (s1 == s2) {
            System.out.println("S1 = S2");
        } else {
            System.out.println("S1 != S2");
        }
        System.out.println("Comparision of strings normaly created and Created using new String()");
        if (s1 == s3) {
            System.out.println(("S1 = S3"));

        } else {
            System.out.println("S1 != S3");
        }

        // Compare in String with COMPARE FUNCTION
        System.out.println();

        if (s1.equals(s3)) {
            System.out.println("This comparision is done by compare function  ");
            System.out.println( "S1 = S3");

        }

    }

}
