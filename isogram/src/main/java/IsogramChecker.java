import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {

  public static boolean isIsogram(String phrase) {
    char[] charsArray = phrase.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
    Set mySet = new HashSet();
      for (int i = 0; i < charsArray.length; i++) {
        mySet.add(new Character(charsArray[i]));
      }

    if (mySet.size() == charsArray.length ) {
      return true;
    } else {
      return false;
    }
  }

}
