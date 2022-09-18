public class comp {
    String price;
    String model;

RAM RAM;
HDD HDD;

    comp(String price, String model) {
        this.price = price;
        this.model = model;
    }
    comp(RAM RAM, HDD HDD, String price, String model) {
        this(price, model);
        this.RAM = RAM;
        this.HDD = HDD;

    }
    comp(String name , HDD HDD, String price, String model) {
        this(price, model);
        this.RAM = RAM;
        this.HDD = HDD;


    }
    String getPrice() {
        return price;
    }

}
