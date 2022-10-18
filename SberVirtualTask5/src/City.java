public class City {
    private int num;
    private String region;
    public City(int num, String region) {
        this.num = num;
        this.region = region;
    }
    public void Output() {
        System.out.println(region + " - " + num);

    }
}
