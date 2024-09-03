public class GameManager {
    private int cash;
    private GameManager() {

    }
    static GameManager instance = new GameManager();

    public static GameManager getInstance() {
        return instance;
    }

    public int getCash() {
        return cash;
    }

    public void addCash(int amount) {
        cash += amount;
    }

    public void newGame() {
        PlayerVehicle playerVehicle = new PlayerVehicle("Sedan", 5, 70, 4);
        Player player = new Player(100, playerVehicle);
        player.setTag("Player");

        // prepare Scene
        // start Scene

        while(player.isAlive()) {
            // execute Scene

            player.Drive();
        }
        endGame();
    }

    public void endGame() {
        System.out.printf("Total cash accumulated: %d", cash);
    }
}



























