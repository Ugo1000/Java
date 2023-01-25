package String_package;

public class String_Builder {
    public static void main(String[] args) {

        StringBuilder firstName = new StringBuilder("Okoro");
        StringBuilder fullName = firstName.append(" Samuel");
        System.out.println(fullName.reverse());
        String toUpper = firstName.toString();
        System.out.println("doe the name contain 'e' " + toUpper.contains("e"));
        System.out.println(fullName);

    }
}
