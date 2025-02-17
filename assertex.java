import static org.junit.Assert.*;
import org.junit.Test;
public class assertex {
        public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
        public static boolean isBlank(final CharSequence cs) {
        int strlen;
        if (cs == null || (strlen = cs.length()) == 0) {
            return true; 
        }
        for (int i = 0; i < strlen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false; 
            }
        }
        return true; 
    }
    @Test
    public void isEmptytest() {
        assertTrue(isEmpty(""));      
        assertFalse(isEmpty(" "));     
        assertFalse(isEmpty("aiml-b"));
        assertFalse(isEmpty(" aiml-b "));
    }
    @Test
    public void isBlankTest() {
        assertTrue(isBlank(null));        
        assertTrue(isBlank(""));          
        assertFalse(isBlank("aiml-b"));  
        assertTrue(isBlank(" "));         
        assertFalse(isBlank(" aiml-b ")); 
    }
}
