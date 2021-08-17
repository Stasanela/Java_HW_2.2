public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 59_756;
        int miles = service.calculateBonus(price);
        System.out.println(miles);
    }
}
