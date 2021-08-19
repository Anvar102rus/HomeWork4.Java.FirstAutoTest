public class BonusMilesService {
    public int calculate(int price) {
        int miles = 20;
        int bonusMiles = price / miles;
        return bonusMiles;

    }

}

