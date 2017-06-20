/**
 * Created by tluiz on 05/06/17.
 */
public class BonusCalculator {

    public int dayBonus;

    public BonusCalculator(int dayBonus) {
        this.dayBonus = dayBonus;
    }

    public int bonus(User user) {
        int multiplier = dayBonus;
        if (user.vip)
            multiplier *= 5;
        return multiplier;
    }
}
