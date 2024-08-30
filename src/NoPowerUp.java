public class NoPowerUp extends PowerUp{

    @Override
    public void ApplyPowerup(Player player, int damage, int cash) {
        int newHealth = player.getPlayerHealth().getHealthUnits()-damage - player.getPlayerVehicle().getStrength();
        player.getPlayerHealth().setHealthUnits(newHealth);

        // Pengar läggs till via GameManager
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
