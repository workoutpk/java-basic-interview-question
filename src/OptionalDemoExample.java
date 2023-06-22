import java.util.Optional;

public class OptionalDemoExample {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        words[0]=null;
        words[1]="p";
        words[2]="k";
        words[3]="p";
        words[4]="r";
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
