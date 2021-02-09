package com.example.Files.models;

import java.util.ArrayList;
import java.util.List;

public class File {

    private String name;
    private String extension;
    private int size;
    private List<Folder> folder;
    private Long Id;

    public File(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = new ArrayList<>();
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Folder> getFolder() {
        return folder;
    }

    public void setFolder(List<Folder> folder) {
        this.folder = folder;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
