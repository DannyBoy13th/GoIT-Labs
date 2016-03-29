package com.goit.filedepository;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class File {
    private String Name;
    private String Type;
    private String Size;

    public void Open(){
        System.out.println("Open");
    }
    public void Close(){
        System.out.println("Close");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
