public class HDD {
    String name;
    String obem;
    String type;

    HDD (String name, String obem, String type){
        this.name=name;
        this.obem=obem;
        this.type=type;
    }

    String getObem() {
        return obem;
    }
    String getName() {
        return name;
    }
    String getType() {
        return type;
    }

}
