public class PlayerHealth {
    private int healthUnits = 100;
    private PlayerState playerState = PlayerState.HEALTHY;

    //metod som uppdaterar spelarens tillstånd
    private void UpdateState() {
        if(healthUnits > 70) {
            playerState = PlayerState.HEALTHY;
        } else if (healthUnits >= 25 && healthUnits <= 70) {
            playerState = PlayerState.INJURED;
        } else if (healthUnits >= 1 && healthUnits < 25) {
            playerState = PlayerState.CRITICAL;
        } else {
            playerState = PlayerState.DEAD;
        }
        System.out.println("Current state: " + playerState);
    }

    public int getHealthUnits() {
        return healthUnits;
    }

    public void setHealthUnits(int healthUnits) {
        this.healthUnits = healthUnits;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }
}
