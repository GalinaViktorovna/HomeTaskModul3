package com.HomeTaskModule3.Files;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> directory;

    public Directory(String name) {
        this.name = name;
        this.directory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getDirectory() {
        return directory;
    }

    public void setDirectory(List<File> directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<File> addFileToDirectory(File file) {
        directory.add(file);
        System.out.println(file + " was added to " + name);
        return directory;
    }

    public void printFilesOnDirectory(List<File> directoryForPrint) {
        if (directoryForPrint.size() == 0) {
            System.out.println("Directory is empty!!! Add file please");
        } else {
            for (File file : directoryForPrint
                    ) {
                System.out.println(file);

            }
        }
    }

    public void deleteDirectory() {
        directory.removeAll(directory);
        System.out.println("Files were deleted");

    }

}

