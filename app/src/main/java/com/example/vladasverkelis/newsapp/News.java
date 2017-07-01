package com.example.vladasverkelis.newsapp;

/**
 * Created by vladasverkelis on 16/06/2017.
 */

public class News {

    /**Section of the news article*/
    private String mSectionName;

    /**Title of the news article*/
    private String mTitle;

    /**Date of the news article*/
    private String mTime;

    /**URL of the news article*/
    private String mUrl;

    /**
     * * Constructs a new {@link News} object.
     *
     * @param sectionName is the title of the article
     * @param title is the title of the article
     * @param time is the date of the article
     * @param url is the website URL to find more details about the news
     */
    public News(String sectionName, String title, String time, String url) {
        mSectionName = sectionName;
        mTitle = title;
        mTime =  time;
        mUrl = url;
    }

    /**
     * Get the section anme of the news from the list
     */
    public String getSectionName(){
        return mSectionName;
    }

    /**
     * Get the date of the news from the list
     */
    public String getTime(){
        return mTime;
    }

    /**
     * Get the title of the news from the list
     */
    public String getTitle(){
        return mTitle;
    }

    /**
     * Get url of the news from the list
     */
    public String getUrl(){
        return mUrl;
    }
    /**
     * Return the image resource ID of the news
     */

}
