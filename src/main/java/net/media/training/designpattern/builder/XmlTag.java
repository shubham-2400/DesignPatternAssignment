package net.media.training.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class XmlTag implements XmlNode{
    private String tag;
    private List<Pair<String,String>> attributes = new ArrayList<>();
    private List<XmlNode> children = new ArrayList<>();
    public XmlTag(String tag){
        this.tag = tag;
    }
    public void addChild(XmlNode child){
        children.add(child);
    }
    public XmlTag addAttribute(String Key, String Value){
        attributes.add(new Pair<String,String>(Key, Value));
        return this;
    }
    public String build(){
        StringBuilder output = new StringBuilder();
        output.append("<" + tag);
        for(Pair<String,String> attribute: attributes){
            output.append(" " + attribute.getKey()+"=\"" + attribute.getValue() + "\"");
        }
        output.append(">");
        for(XmlNode child: children){
            output.append(child.build());
        }
        output.append("</" + tag + ">");
        return output.toString();
    }


}
