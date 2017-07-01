package com.example.vladasverkelis.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vladasverkelis on 16/06/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}
     *
     * @param context     of the app
     * @param newses is the lits of news, which is the data source of the adapter
     */

    public NewsAdapter(Context context, List<News> newses){
        //Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        //the second argument is used when the ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for the two TextViews and an ImageView, the adapter is not
        //going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, newses);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){
        //Check if the existing view is being reused, overwise inflate the view
        View listItemView =  converView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the {@link NewsApp app} object located at this position in  the list
        News currentNews = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView section = (TextView) listItemView.findViewById(R.id.section);
        //Get the version name from the current AndroidFlavor object and
        //Set this text on the  name TextView
        section.setText(currentNews.getSectionName());

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        //Get the version name from the current AndroidFlavor object and
        //Set this text on the  name TextView
        title.setText(currentNews.getTitle());

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView time = (TextView) listItemView.findViewById(R.id.time);
        //Get the first 10 symbols of the time data
        String data = currentNews.getTime().substring(0, 10);

        //Format the date string (i.e. "03-03-84")
        String formattedDate = data.substring(8 , 10) + data.substring(4, 8) + data.substring(2, 4);
        //Set this date on the  name TextView
        time.setText(formattedDate);

        //Return the whole list item layout (containing 3 TextViews)
        //so that it can be shown in the ListView
        return listItemView;
    }
}
