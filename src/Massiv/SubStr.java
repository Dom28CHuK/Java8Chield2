package Massiv;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        String substr = orgstr.substring(7,25);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
