public class Bank {
    static int x100;
    static int x50;
    static int x20;

    public static void addMoney(int addnote100, int addnote50, int addnote20) {

        addnote100 += x100;
        addnote50 += x50;
        addnote20 += x20;

    }

    static void askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, pleas enter correct sum");
        } else {
            boolean firstAnswer;
            if (100 * x100 + 50 * x50 + 20 * x20 >= requestCash) {
                firstAnswer = true;

            } else {
                firstAnswer = false;
                System.out.println("not enough money");
            }
        }
    }
}
