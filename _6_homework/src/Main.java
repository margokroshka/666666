public class Main {
    public static void main(String[] args) {
        main3();
    }

    public static void main1() {

        CreditCard one = new CreditCard(12345, 300);
        CreditCard two = new CreditCard(56789, 400);
        CreditCard three = new CreditCard(23456, 500);


        one.receiveSumm(two.getNumber(), two.getSumm());
        one.receiveMin(three.getNumber(), three.getSumm());
        System.out.println();
        System.out.println(one.getNumber());
        System.out.println(one.getSumm());
        System.out.println();
        System.out.println(two.getNumber());
        System.out.println(two.getSumm());
        System.out.println();
        System.out.println(three.getNumber());
        System.out.println(three.getSumm());
    }

    public static void main2() {

        comp comp1 = new comp("700", "1.2.34");
        comp comp2 = new comp("1000", "gveve");
        RAM ram1 = new RAM("RAM", " 200");
        HDD hdd1 = new HDD("HDD", " 230", "aa");
        comp comp = new comp(ram1, hdd1,"ffle", "gveve");

        System.out.println(comp1.getPrice());
        System.out.println(comp2.getPrice());
        System.out.println();
        System.out.println(comp1.RAM.getName());
        System.out.println(comp2.RAM.getName());
        System.out.println();
        System.out.println(comp1.RAM.getObem());
        System.out.println(comp2.RAM.getObem());
        System.out.println();
        System.out.println(comp1.HDD.getType());
        System.out.println(comp2.HDD.getType());
    }

    public static void main3() {
        Bank CM1 = new Bank();

        CM1.addMoney(10, 10, 10);
        CM1.askMoney(200);

    }
}