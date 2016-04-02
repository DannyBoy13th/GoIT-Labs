package filedepository;

/**
 * Created by Daniel Solo on 08.03.2016.
 */
public class Main {

    public static void main(String [] args){;
       FileDepository Rar=new FileDepository();
       File OrdinaryFile=new File();
        Picture Yaremche=new Picture();
        AudioFile SpanishSahara=new AudioFile();
        TextFile AboutMe=new TextFile();

        System.out.println("MyFiles.rar");
        System.out.println();
        Rar.Content();
        System.out.println();

        System.out.println("Yaremche.jpg");
        Yaremche.Open();
        System.out.println();

        System.out.println("Play Music");
        SpanishSahara.Open();
        System.out.println();

        System.out.println("Read Text");
        AboutMe.Open();
    }
}
