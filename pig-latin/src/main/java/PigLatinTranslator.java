import java.util.regex.*;

public class PigLatinTranslator {
    String translate(String text_in) {

      Pattern p = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(text_in.substring(0, 1));
      boolean checkFirst = m.matches();
      
      if (checkFirst) {
        return text_in + "ay";
      } else {
        String letter1 = text_in.substring(0, 1);
        return text_in.substring(1) + letter1 + "ay" ;
      }
    }

}