package Week_2.Day_1;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        ransomNote(ransomNote,magazine);}
        public  static boolean ransomNote(String ransomNote, String magazine) {
            int[] count = new int[26];

            for (int i = 0; i < magazine.length(); i++) {
                count[magazine.charAt(i) - 'a']++;
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                int index = ransomNote.charAt(i) - 'a';

                if (count[index] == 0) {
                    return false;
                }

                count[index]--;
            }

            return true;
        }
    }
