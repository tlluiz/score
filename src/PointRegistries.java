/**
 * Created by tluiz on 05/06/17.
 */
public class PointRegistries {

    private BonusCalculator bonusCalculator;

    public PointRegistries(BonusCalculator bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }

    public void doOneComment(User user) {
        user.points += 3 * bonusCalculator.bonus(user);
    }

    public void createOneTopic(User user) {
        user.points += 5 * bonusCalculator.bonus(user);
    }

    public void getOneLike(User user) {
        user.points += 1 * bonusCalculator.bonus(user);
    }
}
