public class CWH_14_ch3_Strings_methods {
    public static void main(String[] args) {
        String name = "Rakesh";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

          String lstring = name.toLowerCase();
          System.out.println(lstring);

          String ustring = name.toUpperCase();
          System.out.println(ustring);

          String nonTrimmedString = "       Rakesh      ";
          System.out.println(nonTrimmedString);

          String trimmedString = nonTrimmedString.trim();
          System.out.println(trimmedString);

          System.out.println(name.substring(1));
          System.out.println(name.substring(1,5));

          System.out.println(name.replace('R','p')); //old to new replace

          System.out.println(name.replace("R", " pan"));

          System.out.println(name.startsWith("Rak"));
          System.out.println(name.endsWith("kes"));

          System.out.println(name.charAt(1));

          String modifiedName = "Rakesh";
          System.out.println(modifiedName.indexOf("ake"));
          System.out.println(name.indexOf("s"));
          System.out.println(modifiedName.lastIndexOf("kes", 5));
          System.out.println(name.equals("Rakesh"));

          System.out.println("I am escape sequence\\tdouble quote");





    }
}
