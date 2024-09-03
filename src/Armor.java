public class Armor extends PowerUp{
    @Override
    public void ApplyPowerup(Player player, int damage, int cash) {
        int totalDamage = player.getPlayerVehicle().getStrength() + damage / 2;
        player.getPlayerHealth().setHealthUnits(player.getPlayerHealth().getHealthUnits() - totalDamage);
        // add GameManager + addCash
        if(--countdown == 0) {
            player.setPowerUp(new NoPowerUp());
        }
    }

    @Override
    public void onCollision(GameObject other) {
        if(other.getTag().equalsIgnoreCase("Player")) {
            System.out.println("*******************************");
            System.out.println("*********** ARMOR **********");
            System.out.println("*******************************");
            Player p = (Player)other;
            p.setPowerUp(this);
        }
    }

    @Override
    public String toString() {
        return "Armor" +
                "countdown=" + countdown;
    }
}
