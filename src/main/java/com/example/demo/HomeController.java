package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;

/*** this class is used to read xml file from url link. using spring framework  ***/
@Controller
public class HomeController {

    @GetMapping("")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView(); // create ModelAndView then initialize it
        modelAndView.setViewName("home"); // name home refers to home.html file in "src/main/resources/templates/home.html"
        ArrayList<Item> items = new ArrayList<>(); // list of items. each item contains title,description,link,and the
        // publication date from the xml file
        String url = "http://www.ynet.co.il/Integration/StoryRss2.xml"; // the url of xml file
        try {
            // these lines are to parse and read the xml
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(url).openStream());
            doc.getDocumentElement();
            NodeList studentNodes = doc.getElementsByTagName("item"); // iterate over each item in the xml file
            for (int i = 0; i < studentNodes.getLength(); i++) {
                Node studentNode = studentNodes.item(i);
                if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) studentNode;
                    // getting the 4 attributes of each item
                    String title = studentElement.getElementsByTagName("title").item(0).getTextContent();
                    String description = studentElement.getElementsByTagName("description").item(0).getTextContent();
                    String link = studentElement.getElementsByTagName("link").item(0).getTextContent();
                    String pubDate = studentElement.getElementsByTagName("pubDate").item(0).getTextContent();
                    Item item = new Item(title,description,link,pubDate);
                    items.add(item); // adding each item to the items list
                }
            }
            modelAndView.addObject("items",items); // giving the model and view the name "items"
            // with data of items list.
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView; // return the model and view. we can access the data of it in home.html
    }
}
