package com.sparker.model;


/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */

public class WebLink {

    private Long id;
    private String url;
    private String title;
    private Long sparkNo;
    //private Short NoOfUpdates;

    public WebLink(){}

    public WebLink(String url){
     this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
