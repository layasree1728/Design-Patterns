package StructualPatterns.CompositePattern;

public class Main {
    public static void main(String args[]){
        // Leaf objects
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Composite objects
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Building the hierarchy
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);
        dir2.addComponent(dir1); // dir1 is part of dir2

        // Display the hierarchy
        dir2.showDetails();
    }
}
