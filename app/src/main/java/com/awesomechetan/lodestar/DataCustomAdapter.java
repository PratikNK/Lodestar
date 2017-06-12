package com.awesomechetan.lodestar;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pratik on 12-06-2017.
 */

public class DataCustomAdapter extends ArrayAdapter<DataItem>
{
    Context context;
    int layoutResourceId;
    List<DataItem> data=null;


    public DataCustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<DataItem> objects)
    {
        super(context, resource, objects);

        this.layoutResourceId=resource;
        this.context=context;
        this.data=objects;
    }

    static class DataHolder
    {
        de.hdodenhof.circleimageview.CircleImageView Ivdp;
        TextView tvName,tvDesig;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        DataHolder holder=null;
        if(convertView==null)
        {
            LayoutInflater inflater= ((Activity)context).getLayoutInflater();

            convertView=inflater.inflate(layoutResourceId,parent,false);

            holder=new DataHolder();

            holder.Ivdp=(de.hdodenhof.circleimageview.CircleImageView)convertView.findViewById(R.id.dpIv);
            holder.tvName=(TextView)convertView.findViewById(R.id.name);
            holder.tvDesig=(TextView)convertView.findViewById(R.id.desig);

            convertView.setTag(holder);
        }
        else
        {
            holder=(DataHolder)convertView.getTag();
        }

        DataItem dataItem=data.get(position);
        holder.tvName.setText(dataItem.Name);
        holder.tvDesig.setText(dataItem.Designation);
        holder.Ivdp.setImageResource(dataItem.img);

        return convertView;
    }
}
