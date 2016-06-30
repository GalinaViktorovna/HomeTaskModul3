package com.HomeTaskModule3.Files;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public File editFile(File file) {
        return file;
    }

    public void deleteFile(File file) {
        System.out.println("F");
        file = null;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
