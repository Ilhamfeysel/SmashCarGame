public class HealthKit extends PowerUp{
    @Override
    public void ApplyPowerup(Player player, int damage, int cash) {

    }

    @Override
    public void onCollision(GameObject other) {
        if(other.getTag().equalsIgnoreCase("Player")) {
            System.out.println("*******************************");
            System.out.println("*********** HEALTHKIT **********");
            System.out.println("*******************************");
            Player p = (Player)other;
            int newHealth = p.getPlayerHealth().getHealthUnits() + 25;
            p.getPlayerHealth().setHealthUnits(newHealth);
        }
    }
}
