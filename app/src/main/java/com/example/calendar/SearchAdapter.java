package com.example.calendar;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SearchAdapter extends BaseAdapter {

    public Context context;
    public List<String> list;
    public LayoutInflater inflate;
    public ViewHolder viewHolder;
    
    public SearchAdapter(List<String> list,Context context){
        this.list=list;
        this.context=context;
        this.inflate=LayoutInflater.from(context);
    }
    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public Object getitem(int i){
        return null;
    }

    public long getitemid(int i){
        return 0;
    }
    @Override
    public View getView(int position,View convertView, ViewGroup viewGroup){

        if(convertView==null){
            convertView = inflate.inflate(R.layout.row_listview,null);
            viewHolder=new ViewHolder();
            viewHolder.label = (TextView) convertView.findViewById(R.id.label);


            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        viewHolder.label.setText(list.get(position));
        return convertView;
    }
    class ViewHolder{
        public TextView label;
    }
}
