package com.goit.filedepository;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class FileDepository {

    public String Content="Displaying RAR Content:";
    public String Txt="AboutMe.doc";
    public String Jpg="Yaremche.jpg";
    public String Mp3="SpanishSahara.mp3";

    private List Files = Arrays.asList(Txt, Jpg, Mp3);

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    Iterator itr=Files.iterator();

    public void Content(){
        System.out.println(Content);
        while(itr.hasNext())

            System.out.println(itr.next());

    }


}
