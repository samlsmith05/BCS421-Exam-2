package com.example.bcs421exam2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder>{
    private List<Student> infoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mFirstTextView;
        public TextView mLastTextView;
        public TextView mMajorTextView;

        public MyViewHolder(View view) {
            super(view);
            mFirstTextView = (TextView) view.findViewById(R.id.RVItextViewFirst);
            mLastTextView = (TextView) view.findViewById(R.id.RVItextViewLast);
            mMajorTextView = (TextView) view.findViewById(R.id.RVItextViewMajor);


        }
    }

    public InfoAdapter(List<Student> infoList){
        this.infoList = infoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.info_recyclerview_item, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student s = infoList.get(position);

        String first = s.getFirst();
        String last = s.getLast();
        String major = s.getMajor();

        holder.mFirstTextView.setText(first);
        holder.mLastTextView.setText(last);
        holder.mMajorTextView.setText(major);

    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public void setData(List<Student> infoList) {
        this.infoList = infoList;
        notifyDataSetChanged();
    }

}
