public class BonusMilesService {
    public long calculate(int cost
    ) {
        int price = 1020;//стоимостиь билета
        int amount = 20; // количество
        int miles = 1; //мили

        int bonus = (price / amount) * miles;

        return bonus;

    }
}
