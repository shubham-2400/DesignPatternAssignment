package net.media.training.designpattern.composite;

public interface FileSystemComponent {
    public void delete();
    public Directory getParent();
    public void setParent(Directory directory);
    public String getName();
    public int getSize();
}
