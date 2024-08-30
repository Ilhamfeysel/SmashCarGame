public class Player extends GameObject{
    private PlayerHealth playerHealth = new PlayerHealth();
    private PlayerVehicle playerVehicle;
    private PowerUp powerUp = PowerUpFactory.CreatePowerUp(-1);

    public Player(int health, PlayerVehicle playerVehicle) {
        super();
        playerHealth.setHealthUnits(health);
        this.playerVehicle = playerVehicle;
    }

    // Drive metod

    public void ApplyDamage(int damage, int cash) {
        powerUp.ApplyPowerup(this, damage, cash);
    }

    public void Accelerate() {
        playerVehicle.Up();
    }

    public void Break() {
        playerVehicle.Down();
    }

    public void SteerRight() {
        playerVehicle.Right();
    }

    public void SteerLeft() {
        playerVehicle.Left();
    }

    public boolean isAlive() {
        return playerHealth.getPlayerState() != PlayerState.DEAD;
    }

    public PlayerHealth getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(PlayerHealth playerHealth) {
        this.playerHealth = playerHealth;
    }


    public PlayerVehicle getPlayerVehicle() {
        return playerVehicle;
    }

    public void setPlayerVehicle(PlayerVehicle playerVehicle) {
        this.playerVehicle = playerVehicle;
    }

    public PowerUp getPowerUp() {
        return powerUp;
    }
}
