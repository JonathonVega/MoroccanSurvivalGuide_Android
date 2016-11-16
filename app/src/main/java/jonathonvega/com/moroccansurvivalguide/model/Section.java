package jonathonvega.com.moroccansurvivalguide.model;

/**
 * Created by jonathonfvega on 10/21/16.
 */
public class Section {

    private String mSection;
    private String[][] mWords;

    public Section(String section, String[][] words) {
        mSection = section;
        mWords = words;
    }

    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }

    public String[][] getWords() {
        return mWords;
    }

    public void setWords(String[][] words) {
        mWords = words;
    }
}
