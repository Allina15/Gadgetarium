package gadgetarium;

import java.util.List;
import java.util.Map;

public class Characters {
    private int id;
    private Map<KeyCharacter, List<String>> character;

    public Characters(int id, Map<KeyCharacter, List<String>> character) {
        this.id = id;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<KeyCharacter, List<String>> getCharacter() {
        return character;
    }

    public void setCharacter(Map<KeyCharacter, List<String>> character) {
        this.character = character;
    }

}
