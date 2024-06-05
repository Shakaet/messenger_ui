package com.example.messenger_ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter_class extends RecyclerView.Adapter<Adapter_class.viewholder> {

    private ArrayList<String>name=new ArrayList<>();

    private ArrayList<String>img=new ArrayList<>();

    private Context context;

    public Adapter_class(ArrayList<String> name, ArrayList<String> img, Context context) {
        this.name = name;
        this.img = img;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, @SuppressLint("RecyclerView") int position) {

        Glide.with(context)
                .asBitmap()
                .load(img.get(position))
                .into(holder.image);

        holder.textView.setText(name.get(position));

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(TAG, "onClick: clicked on an image: " + mNames.get(position));
                Toast.makeText(context, name.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return name.size();
    }


    public class viewholder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView textView;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.text);
        }
    }
}
