package strings;

public class Strings {

    public static void main(String[] args) {

        String str1 = "Welcome " + " Nick";
        String str2 = new String("Welcome");
        String str3 = ("Welcome");
        String str4 = new String("Welcome");
        str1 = "Goodbye";
        int age = 17;
        String newString = str1.concat(" " + age);
        System.out.println(newString);

        int s = str1.length();
        System.out.println(s);
        char c = str1.charAt(6);
        System.out.println(c);

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        for (char x : str1.toCharArray()) {
            System.out.print(x);
        }
        System.out.println();

        System.out.println(str1.toUpperCase());
        System.out.println(str1.indexOf("d"));
        //-----------------------------------------------------------
        char a = 'm';
        char a2 = 109;
        char a3 = '\u006d';
        int index = str1.indexOf(a);

        if (index != -1) {
            System.out.println("value of index " + a + " is " + index);
        } else {
            System.out.println("Does not exist!");
        }
        //-----------------------------------------------------------

        String name = "  Mary   ";
        System.out.println(name);
        int lengthOfName = name.length();
        System.out.println(lengthOfName);
        System.out.println(name.trim().length());
        System.out.println(name.substring(1, 3));
        //-----------------------------------------------------------

        String names = "Nick, Jack, Peter";
        String[] array = names.split(",");
        for (String x : array) {
            System.out.println(x);
        }
        System.out.println(names.replace("Jack", "John"));
        //-----------------------------------------------------------

        System.out.printf("My name is %s and I am %d years old\n", "Nick", 18);
        String text = String.format("My name is %s and I am %d years old", "Nick", 18);
        System.out.println(text);

        System.out.printf("%-10s%5s\n\n", "NAME", "AGE");
        System.out.printf("%-10s%5d\n", "Nick", 29);
        System.out.printf("%-10s%5d\n", "Jack", 24);
        System.out.printf("%-10s%5d\n", "Kathrine", 32);
        System.out.printf("%-10s%5d\n", "Jonathan", 23);
        // System.out.printf("%-10s%5s\n", "NAME","AGE");
        //-----------------------------------------------------------

        String aa = "name";
        String bb = "name";
        String cc = new String("name");
        boolean result = (aa.equalsIgnoreCase(cc));
        System.out.println("result is: " + result);
        //Den einai isa epeidh apothikevodai se diaforetiko xwro sth mnhmh
        //To == sta string elegxei an einai idies oi theseis twn dyo string!!!
        //-----------------------------------------------------------
        splitPrint(names);
        //-----------------------------------------------------------

        StringBuilder builder = new StringBuilder("Kathrine");
        StringBuilder builder2 = new StringBuilder();
        builder2 = builder;
        //builder.append(", Jack");
        int t = builder.length();
        System.out.println(t);
        System.out.println(builder);
        //builder.reverse();
        //System.out.println(builder);
        builder.insert(2, " this ");
        System.out.println(builder);
        builder.delete(2, 8);
        System.out.println(builder);
        builder.insert(builder.length(), " + Jack = LFE");
        System.out.println(builder);
        builder.replace(9, 10, "loves").replace(20, 21, "and").append(" until she met John");
        System.out.println(builder);
        System.out.println("builder2 is "+builder2);
        builder2.toString();
        builder.toString();
    }

    public static void splitPrint(String parameter) {

        String[] array = parameter.split(",");
        for (String x : array) {
            System.out.print(x);
        }
        System.out.println();

    }

}
