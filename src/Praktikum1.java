public class Praktikum1 {

    public static void main(String[] args) {

        char operator = args[0].charAt(0);
        int bil1 = Integer.parseInt(args[1]);
        int bil2 = Integer.parseInt(args[2]);

        System.out.print(args[0]+ " " +args[1]+ " " +args[2]+ " = ");

        switch(operator) {
            case ('1'):
                System.out.println(bil1 + bil2);
                break;
            case ('2'):
                System.out.println(bil1 - bil2);
                break;
            case ('3'):
                System.out.println(bil1 * bil2);
                break;
            default:
        }
    }
}