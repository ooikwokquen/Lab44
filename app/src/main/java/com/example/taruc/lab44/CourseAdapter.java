package com.example.taruc.lab44;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.taruc.lab44.Course;
import com.example.taruc.lab44.R;

import java.util.List;

/**
 * Created by TARC on 8/6/2015.
 */
public class CourseAdapter extends ArrayAdapter<Course> {

    /**@param context : the host activity
     * @param resource : the layout in the host activity
     * @param list : a list of course records */
    public CourseAdapter(Activity context, int resource, List<Course> list) {
        super(context, resource, list);
    }

    /**@param position : index of a record
     * @param convertView : layout for each record
     * @param parent : layout hosting the records*/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Course course = getItem(position);

        LayoutInflater inflater  = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.course_record, parent, false);

        TextView textViewCode, textViewTitle, textViewCredit;

        textViewCode = rowView.findViewById(R.id.textViewCode);
        textViewTitle = rowView.findViewById(R.id.textViewTitle);
        textViewCredit = rowView.findViewById(R.id.textViewCredit);

        textViewCode.setText(String.format("%s : %s", getContext().getString(R.string.code), course.getCode()));
        textViewTitle.setText(String.format("%s : %s", getContext().getString(R.string.title), course.getTitle()));
        textViewCredit.setText(String.format("%s : %s", getContext().getString(R.string.credit), course.getCredit()));
        return rowView;
    }
}