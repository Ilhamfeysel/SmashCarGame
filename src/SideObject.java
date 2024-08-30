public class SideObject extends GameObject{
    private int damage;
    private int cash;
    protected int count;

    public SideObject(int damage, int cash) {
        super();
        this.damage = damage;
        this.cash = cash;
        count = 0;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
