public class Van extends Vehicle{
    public Van(int damage, int cash) {
        super(damage, cash);
        setName("Van");
    }

    @Override
    public void onCollision(GameObject other) {
        if(other.getTag().equals("Player")) {
            Player player = (Player)other;
            System.out.println("### COLLISION -> [Van] Boxes falling");
            player.ApplyDamage(getDamage(), getCash());
        }
    }
}
