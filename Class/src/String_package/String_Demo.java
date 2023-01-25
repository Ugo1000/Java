package String_package;

public class String_Demo {
    public static void main(String[] args) {

        String name = new String(" Samuel ");
        System.out.println(name.toUpperCase());
        System.out.println(name.codePointAt(2));
        System.out.println("character at 4 is : "+ name.charAt(4));

        System.out.println(name.stripTrailing());


        System.out.println(name);

    }
}
