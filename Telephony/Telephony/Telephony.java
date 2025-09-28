/**
 * This Telephony class converts a phrase into phonetic words
 * using the Radiotelephony Spelling Alphabet
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Telephony
{
    private static String[] phonicAlphabet;

    /**
     * Translates a single letter into an RSP word
     * (unrecognized characters should return an empty string)
     * Precondition: letter.length() == 1
     */
    public static String convertLetter(String letter)
    {
        letter = letter.toUpperCase();
        /*String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = alphabet.indexOf(letter);

        if (index >= 0 && index < 26) {
            return phonicAlphabet[index];
        }

        return "";     // replace this line
        */
        
        
       
    }

    /**
     * Translates a phrase into an array of RSP words
     * (unrecognized characters are an empty string array element)
     */
    public static String[] convertPhrase(String phrase)
    {
        String[] result = new String[phrase.length()];

        for (int i = 0; i < phrase.length(); i++)
        {
            String currentChar = phrase.substring(i, i + 1);
            result[i] = convertLetter(currentChar);
        }

        return result;
    }

    // this code loads the words from the Phonic Alphabet file into the phonicAlphabet array
    static
    {
        try 
        {
            java.util.Scanner reader = new java.util.Scanner(new java.io.File("Phonic Alphabet.txt"));
            phonicAlphabet = new String[26];
            int i = 0;
            while(reader.hasNext())
            {
                String word = reader.nextLine();
                phonicAlphabet[i] = word;
                i++;
            }
        }
        catch (java.io.IOException e)
        {
            System.out.println("phonicAlphabet.txt file not found");
        }
    }

    // this code loads the words from the Phonic Alphabet file into the phonicAlphabet array
    static
    {
        try 
        {
            java.util.Scanner reader = new java.util.Scanner(new java.io.File("Phonic Alphabet.txt"));
            phonicAlphabet = new String[26];
            int i = 0;
            while(reader.hasNext())
            {
                String word = reader.nextLine();
                phonicAlphabet[i] = word;
                i++;
            }
        }
        catch (java.io.IOException e)
        {
            System.out.println("phonicAlphabet.txt file not found");
        }
    }
}
