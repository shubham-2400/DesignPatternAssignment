package net.media.training.designpattern.builder;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
public class XmlLeaf implements XmlNode{
    private String tag;
    private String content;
    private List<Pair<String,String>> attributes = new ArrayList<>();
    public XmlLeaf(String tag, String content){
        this.tag = tag;
        this.content = content;
    }
    public XmlNode addAttribute(String key, String value){
        attributes.add(new Pair<String,String>(key, value));   
        return this; 
    }
    public String build(){
        StringBuilder output = new StringBuilder();
        output.append("<" + tag);
        for(Pair<String,String> attribute: attributes){
            output.append(" " + attribute.getKey()+"=\"" + attribute.getKey() + "\"");
        }
        output.append(">");
        output.append(content);
        output.append("</" + tag + ">");
        return output.toString();
    }
}
