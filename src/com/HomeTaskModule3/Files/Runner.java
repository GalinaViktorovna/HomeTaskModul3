package com.HomeTaskModule3.Files;

public class Runner {


    public static void main(String[] args) {
        Audio audio = new Audio("Marron 5 - Wake up call");
        Text text = new Text("Thinking in Java");
        Picture picture = new Picture("Diagram of dependency");
        Directory myDirectory = new Directory("MyDirectory");
        myDirectory.addFileToDirectory(audio);
        myDirectory.addFileToDirectory(text);
        myDirectory.addFileToDirectory(picture);
        myDirectory.printFilesOnDirectory(myDirectory.getDirectory());
        myDirectory.deleteDirectory();
        myDirectory.printFilesOnDirectory(myDirectory.getDirectory());


    }

}
