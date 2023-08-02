public class Solution3 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean rsl = false;
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        for (char elementNote : ransomNoteArray) {
            rsl = false;
            for (int i = 0; i < magazineArray.length; i++) {
                if (elementNote == magazineArray[i]) {
                    rsl = true;
                    magazineArray[i] = '\u0000';
                    break;
                }
            }
            if (!rsl) {
                return rsl;
            }
        }
        return rsl;
    }
}