package Problem1;

public class PrintMyName {
    public static void main(String[] args) {
        String name = "Margulan";
        String border = "+";

        for (int i = 0; i < name.length(); i++) {
            border += "-";
        }
        border += "+";

        System.out.println(border);
        System.out.println("|" + name + "|");
        System.out.println(border);
    }
}
