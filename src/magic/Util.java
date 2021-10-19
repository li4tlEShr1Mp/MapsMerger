package magic;

import java.util.Scanner;

public class Util {
    public static int colorMapping(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "ao" -> {
                System.out.println("Processing AO Maps");
                return 0xFFFFFF;
            }
            case "curve" -> {
                System.out.println("Processing Curve Maps");
                return 0x7F7F7F;
            }
            default -> {
                System.out.println("Processing Normal Maps");
                return 0x7F7FFF;
            }
        }
    }

    public static String typeReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input type:");
        return scanner.nextLine();
    }
}
