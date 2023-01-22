package Map.Example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryServiceImpl implements DictionaryService{

    private Map<String, Dictionary> map = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addWord() {
        System.out.print("Word: ");
        String word = scanner.next();
        System.out.print("Translate: ");
        String translate = scanner.next();
        Dictionary d1 = new Dictionary(translate);
        map.put(word, d1);
    }

    @Override
    public void addSynonyms() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            Dictionary dictionary = map.get(word);
            System.out.print("Synonym:");
            String synonym = scanner.next();
            dictionary.getSynonyms().add(synonym);
        }else {
            System.out.print("Not found");
        }
    }

    @Override
    public void translate() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            Dictionary dictionary = map.get(word);
            System.out.println(dictionary);
        }else {
            System.out.println("Not found");
        }
    }

    @Override
    public void list() {
//        Set<String> set = map.keySet();
//        for (String s : set) {
//            System.out.println(s +" -> "+ map.get(s));
//        }
        Set<Map.Entry<String, Dictionary>> entries = map.entrySet();
        for (Map.Entry<String, Dictionary> entry : entries) {
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }

    }

    @Override
    public void editTranslate() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            Dictionary dictionary = map.get(word);
            System.out.print("New translate:");
            String t1 = scanner.next();
            dictionary.setTranslate(t1);
        }else {
            System.out.println("Not found");
        }
    }

    @Override
    public void editWord() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            Dictionary dictionary = map.get(word);
            System.out.print("New word:");
            String w1 = scanner.next();
            map.put(w1, dictionary);
            map.remove(word);
        }else {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteWord() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            map.remove(word);
        }else {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteTranslate() {
        System.out.print("Word: ");
        String word = scanner.next();
        if(map.containsKey(word)){
            Dictionary dictionary = map.get(word);
            dictionary.setTranslate(null);
        }else {
            System.out.println("Not found");
        }
    }
}
