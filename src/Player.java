public class Player extends GameObject{
    // PlayerVehicle
    private PlayerHealth playerHealth = new PlayerHealth();

    public PlayerHealth getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(PlayerHealth playerHealth) {
        this.playerHealth = playerHealth;
    }


}
