package theater;

/**
 * Represents a play in the theater system.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getPlayName() {
        return name;
    }

    public String getPlayType() {
        return type;
    }
}
