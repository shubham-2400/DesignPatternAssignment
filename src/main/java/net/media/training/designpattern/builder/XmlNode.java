package net.media.training.designpattern.builder;

public interface XmlNode {
    public String build();
    public XmlNode addAttribute(String key, String Value);
}
