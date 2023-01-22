package Map.Example;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private String translate;
    private List<String> synonyms = new ArrayList<>();

    public Dictionary() {
    }

    public Dictionary(String translate) {
        this.translate = translate;
    }

    public Dictionary(String translate, List<String> synonyms) {
        this.translate = translate;
        this.synonyms = synonyms;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "translate='" + translate + '\'' +
                ", synonyms=" + synonyms +
                '}';
    }

}
