public class Player extends GameObject{
    private PlayerHealth playerHealth = new PlayerHealth();
    private PlayerVehicle playerVehicle;

    public Player(int health, PlayerVehicle playerVehicle) {
        super();
        playerHealth.setHealthUnits(health);
        this.playerVehicle = playerVehicle;
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
}
