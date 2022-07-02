package com.example.demo;

/*** this simple java class is used to get the 4 attributes of each item in the xml file **/

public class Item {

    String title;
    String description;
    String link;
    String pubDate;

    public Item(String title, String description, String link, String pubDate) {
        this.title=title;
        this.description=description;
        this.link=link;
        this.pubDate=pubDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}