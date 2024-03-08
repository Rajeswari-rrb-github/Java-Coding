public class StringMethods {
    public static void main(String[] args) {
        String name = "Rajeswari";
        int value= name.length();
        String inLowercase= name.toLowerCase();
        String inUppercase = name.toUpperCase();
        System.out.println(value);
        System.out.println(inLowercase);
        System.out.println(inUppercase);
        String nonTrimmedString= "                    Cat person hu                    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString); /// remove unnecessary spaces
        System.out.println(name.substring(3, 8));
        System.out.println(name.substring(0, 9));
        System.out.println(name.replace("r","m"));
        System.out.println(name.replace("r","meaw! hehe"));
        System.out.println(name.startsWith("R"));
        System.out.println(name.endsWith("i"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ri"));
        String newName= "Rajrajrajrajeswariswariswari";
        System.out.println(newName.indexOf("Raj"));
        System.out.println(newName.indexOf("cat"));
        System.out.println(newName.lastIndexOf("Raj", 4)); // need to understand in more depth
        System.out.println(newName.equals("Raj"));
        System.out.println(name.equalsIgnoreCase("rajeswari")); // ghanta farq padta hain, uppercase ki lowercase

        // lets learn escape sequence
        System.out.println("main huuu \"Jiaaan!!!!\"  main hu sabse taqatwaar!!!!!!!!!!"); // backslash ---> \ is used as escape sequences
    }
}