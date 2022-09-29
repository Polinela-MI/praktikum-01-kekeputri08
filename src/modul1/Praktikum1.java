package modul1;

public class Praktikum1 {

    public static void main(String[] args) {

        for (int i = 1; i < args.length; i += 3) {
            int operator = Integer.parseInt(args[i]);
            int operan1 = Integer.parseInt(args[i + 1]);
            int operan2 = Integer.parseInt(args[i + 2]);


            switch (operator) {
                case (1):
                    System.out.println(operan1 + operan2);
                    break;
                case (2):
                    System.out.println(operan1 - operan2);
                    break;
                case (3):
                    System.out.println(operan1 * operan2);
                    break;
                default:

            }
        }
    }
}
