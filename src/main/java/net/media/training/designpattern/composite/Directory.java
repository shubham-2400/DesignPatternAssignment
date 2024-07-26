package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> fileSystemComponents;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystemComponent> fileSystemComponents) {
        this.name = name;
        this.fileSystemComponents = fileSystemComponents;
        for (FileSystemComponent fileSystemComponent: fileSystemComponents) {
            fileSystemComponent.setParent(this);
        }
    }

    public int getSize() {
        int size = 0;
        for(FileSystemComponent children: this.fileSystemComponents){
            size += children.getSize();
        }
        return size;
    }

    public int getSize(FileSystemComponent fileSystemComponent){
        return fileSystemComponent.getSize();
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete() {
        while (this.getFileSystemComponents().size() > 0) {
            FileSystemComponent fileSystemComponent = this.getFileSystemComponents().get(0);
            fileSystemComponent.getParent().removeEntry(fileSystemComponent);
        }
        
        this.getParent().removeEntry(this);
    }

    public void delete(FileSystemComponent fileSystemComponent) {
        fileSystemComponent.delete();
    }

    public void removeEntry(FileSystemComponent fileSystemComponent){
        fileSystemComponents.remove(fileSystemComponent);
    }

    public void add(FileSystemComponent fileSystemComponent) {
        fileSystemComponents.add(fileSystemComponent);
    }

    public List<FileSystemComponent> getFileSystemComponents() {
        return fileSystemComponents;
    }

    public Directory getParent() {
        return parent;
    }
}
