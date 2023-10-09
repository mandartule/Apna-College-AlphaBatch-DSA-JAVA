public class palidrome {

  public static boolean palidrome(String a) {

    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != a.charAt(a.length() - i - 1)) {

        System.out.println("It is a  Not Palidrome");
        return false;

      }

    }
    return true;

  }

  public static void main(String args[]) {

    String str = "racecar";
    String str2 = "noon";

    String str3 = "Mandar";
    System.out.println(palidrome(str));
    System.out.println(palidrome(str2));
    System.out.println(palidrome(str3));

  }

}
