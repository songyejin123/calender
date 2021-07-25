package com.example.calendar;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public final TextView dayOfMonth;
    public CalendarAdapter.OnItemListener onItemListener = null;

    public CalendarViewHolder(@NonNull View itemView)
    {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        onItemListener.onItemClick(getAdapterPosition(),(String) dayOfMonth.getText());

    }
}
