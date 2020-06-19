package poealerts;

import java.util.List;

public class Alert {
    // Comment for improved readability of json file.
    private String comment;
    // Ability to disable part of alert configuration without deleting any text.
    // Useful if user wants to disable just physical reflect warning for current
    // build, but keep it in file for future builds.
    private boolean enabled;
    // All regex conditions in this list must be met.
    private List<String> matchAll;
    // Any regex condition in this list must be met.
    private List<String> matchAny;
    // Sound file to play. If file is missing (or empty): play beep.
    private String sound;

    public String getComment() {
        return comment;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<String> getMatchAll() {
        return matchAll;
    }

    public List<String> getMatchAny() {
        return matchAny;
    }

    public String getSound() {
        return sound;
    }
}