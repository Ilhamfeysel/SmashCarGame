public class GameObject {
    // generell basklass innehåller grundläggande attribut och metoder för alla objekt i spelet
    private boolean enabled;
    private String name;
    private String tag;

    public GameObject() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void onCollision(GameObject other) {

    }
}
