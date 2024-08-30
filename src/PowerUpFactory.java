public class PowerUpFactory {
    public static PowerUp CreatePowerUp(int key) {
        switch(key) {
            case -1:
                return new NoPowerUp();
            case 0:
                // HealthKit
            case 1:
                // Armor
        }
        return null;
    }
}
