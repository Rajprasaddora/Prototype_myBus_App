package com.example.prototype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdaperClass extends RecyclerView.Adapter<MyAdaperClass.MyViewHolder> {
    String []dummyData;

    public MyAdaperClass(String[] dummyData) {
        this.dummyData = dummyData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.departTIme.setText(dummyData[position]);
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView departTIme;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            departTIme=itemView.findViewById(R.id.depart_time);
        }
    }
}
