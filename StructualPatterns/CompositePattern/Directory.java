package StructualPatterns.CompositePattern;

import java.util.*;

public class Directory implements FileSystem{

    private String name;
    private List<FileSystem> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystem component) {
        components.add(component);
    }

    public void removeComponent(FileSystem component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystem component : components) {
            component.showDetails();
        }
    }
}
