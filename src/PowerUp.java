public abstract class PowerUp extends GameObject{
    private static final int DURATION=5;
    protected int countdown = DURATION;
    public static final int POWERUP_COUNT = 2;

    public boolean isActive() {
        return true;
    }
    public abstract void ApplyPowerup(Player player, int damage, int cash);

    @Override
    public String toString() {
        return "DEFAULT";
    }
}
