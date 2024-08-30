public class NoPowerUp extends PowerUp{

    @Override
    public void ApplyPowerup(Player player, int damage, int cash) {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
