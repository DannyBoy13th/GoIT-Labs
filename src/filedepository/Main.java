package filedepository;

/**
 * Created by Daniel Solo on 08.03.2016.
 */
public class Main {

    public static void main(String [] args){
       FileDepository Rar=new FileDepository();
        Picture Yaremche=new Picture();
        AudioFile SpanishSahara=new AudioFile();
        TextFile AboutMe=new TextFile();

        System.out.println("MyFiles.rar\n");
        Rar.Content();

        System.out.println("\nYaremche.jpg");
        Yaremche.Open();

        System.out.println("\nPlay Music");
        SpanishSahara.Open();

        System.out.println("\nRead Text");
        AboutMe.Open();
    }
}
