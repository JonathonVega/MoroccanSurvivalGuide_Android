package jonathonvega.com.moroccansurvivalguide.model;

/**
 * Created by jonathonfvega on 10/21/16.
 */
public class Section {

    private String section;
    private String[][] words;

    public Section(String section, String[][] words) {
        this.section = section;
        this.words = words;
    }

    public String getSection() {
        return section;
    }

    public String[][] getWords() {
        return words;
    }
}
