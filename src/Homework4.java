public class Homework4 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonus = service.calculate(10_000);
        System.out.println(bonus);


    }
}