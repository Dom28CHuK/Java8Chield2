package Massiv;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.println("Иcxoднoe сообщение:");
        System.out.println(msg);

        // Зашифровать сообщение
        for(int i = 0; i < msg.length(); i++)
        // Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Зamифpoвaннoe сообщение: ");
        System.out.println(encmsg);

        // Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++)
        // Построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Дeшифpoвaннoe сообщение: ");
        System.out.println(decmsg);


    }
}
