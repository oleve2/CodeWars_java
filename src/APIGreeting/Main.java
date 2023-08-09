package APIGreeting;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    System.out.println(JAPIGreeting("french"));
  }
  
  public static String JAPIGreeting(String language) {
    // your code
    Map<String, String> dict = new HashMap<>();
    dict.put("english", "Welcome");
    dict.put("czech", "Vitejte");
    dict.put("danish", "Velkomst");
    dict.put("dutch", "Welkom");
    dict.put("estonian", "Tere tulemast");
    
    dict.put("finnish", "Tervetuloa");
    dict.put("flemish", "Welgekomen");
    dict.put("french", "Bienvenue");
    dict.put("german", "Willkommen");
    dict.put("irish", "Failte");
    
    dict.put("italian", "Benvenuto");
    dict.put("latvian", "Gaidits");
    dict.put("lithuanian", "Laukiamas");
    dict.put("polish", "Witamy");
    dict.put("spanish", "Bienvenido");
    
    dict.put("swedish", "Valkommen");
    dict.put("welsh", "Croeso");
    
    String checkRes = dict.get(language);
    System.out.println(checkRes);
    if (checkRes != null) {
      return checkRes;
    } else {
      return "english";
    }
  }
  
}
