package net.media.training.designpattern.builder;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        String finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        XmlNode xmlBuilder = new XmlTag("People");
        xmlBuilder.addAttribute("number", Integer.toString(persons.size()));
        for (Person person : persons) {
            XmlNode personNode = new XmlTag("Person");
            personNode.addAttribute("id", Integer.toString(person.getId())).addAttribute("name", person.getName());
            XmlNode address = new XmlTag("Address");
            XmlNode city = new XmlLeaf("City", person.getCity());
            XmlNode country = new XmlLeaf("Country", person.getCountry());
            ((XmlTag) address).addChild(city);
            ((XmlTag) address).addChild(country);
            ((XmlTag) personNode).addChild(address);
            ((XmlTag) xmlBuilder).addChild(personNode);
        }
        return finalXML + xmlBuilder.build();
    }
}