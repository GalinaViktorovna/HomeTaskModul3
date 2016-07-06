package com.HomeTaskModule3.Files;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<File> addFileToDirectory(File file) {
        files.add(file);
        System.out.println(file + " was added to " + name);
        return files;
    }

    public void printFilesOnDirectory(List<File> directoryForPrint) throws DirectoryIsEmptyException {
        if (directoryForPrint.size() == 0) {
            throw new DirectoryIsEmptyException("Directory is empty!!! Add file please");
        } else {
            for (File file : directoryForPrint
                    ) {
                System.out.println(file);

            }
        }
    }

    public void delete() {
        files.removeAll(files);
        System.out.println("Files were deleted");

    }

}

