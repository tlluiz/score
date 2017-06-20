import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by tluiz on 05/06/17.
 */
class PointRegistriesTest {

    @Test
    public void shouldIncreaseTheUsersPointsWhenCreateTopics() {
        User user = new User();
        user.name = "Thiago";
        BonusCalculator bonusCalculator = new BonusCalculator(1);
        PointRegistries pointRegistry = new PointRegistries(bonusCalculator);
        pointRegistry.createOneTopic(user);
        assertEquals(user.points, 5);
    }

    @Test
    public void shouldIncreaseTheUsersVipPointsWhenCreateTopics() {
        User user = new User();
        user.name = "Thiago";
        user.vip = true;
        BonusCalculator bonusCalculator = new BonusCalculator(1);
        PointRegistries pointRegistry = new PointRegistries(bonusCalculator);
        pointRegistry.createOneTopic(user);
        assertEquals(user.points, 25);
    }

    @Test
    public void shouldIncreaseTheUsersPointsWithDayBonusWhenCreateTopics() {
        User user = new User();
        user.name = "Thiago";
        BonusCalculator bonusCalculator = new BonusCalculator(1);
        bonusCalculator.dayBonus = 3;
        PointRegistries pointRegistry = new PointRegistries(bonusCalculator);
        pointRegistry.createOneTopic(user);
        assertEquals(user.points, 15);
    }

    @Test
    public void shouldIncreaseTheUsersVipPointsWithDayBonusWhenCreateTopics() {
        User user = new User();
        user.name = "Thiago";
        user.vip = true;
        BonusCalculator bonusCalculator = new BonusCalculator(1);
        bonusCalculator.dayBonus = 2;
        PointRegistries pointRegistry = new PointRegistries(bonusCalculator);
        pointRegistry.createOneTopic(user);
        assertEquals(user.points, 50);
    }

}