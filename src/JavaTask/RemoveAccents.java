package JavaTask;

import java.text.Normalizer;

public class RemoveAccents {

    public static void main(String[] args){
        String input= "Čočka a autíčko jsou na střeše";
        String output= normalize(input).replaceAll("\\p{M}", "");
        System.out.println(output);
    }

    private static String normalize(String input) {
        return input == null ? null : Normalizer.normalize(input, Normalizer.Form.NFKD);
    }
}
