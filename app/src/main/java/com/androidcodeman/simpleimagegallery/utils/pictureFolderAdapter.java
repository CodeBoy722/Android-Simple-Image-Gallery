package com.androidcodeman.simpleimagegallery.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.androidcodeman.simpleimagegallery.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.util.ArrayList;

public class pictureFolderAdapter extends RecyclerView.Adapter<pictureFolderAdapter.FolderHolder>{

    public ArrayList<imageFolder> folders;
    public Context foldaerContx;
    public transitListerner listenToClick;

    public pictureFolderAdapter(ArrayList<imageFolder> folders, Context foldaerContx, transitListerner listen) {
        this.folders = folders;
        this.foldaerContx = foldaerContx;
        this.listenToClick = listen;
    }

    @NonNull
    @Override
    public FolderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View cell = inflater.inflate(R.layout.picture_folder_item, parent, false);
        return new FolderHolder(cell);

    }

    @Override
    public void onBindViewHolder(@NonNull FolderHolder holder, int position) {
        final imageFolder folder = folders.get(position);

        Glide.with(foldaerContx)
                .load(folder.getFirstPic())
                .apply(new RequestOptions().centerCrop())
                .into(holder.folderPic);

        holder.folderName.setText("("+folder.getNumberOfPics()+") "+folder.getFolderName());

        holder.folderPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenToClick.onPicClicked(folder.getPath());
            }
        });

    }

    @Override
    public int getItemCount() {
        return folders.size();
    }


    public class FolderHolder extends RecyclerView.ViewHolder{
       ImageView folderPic;
       TextView folderName;
       CardView folderCard;

        public FolderHolder(@NonNull View itemView) {
            super(itemView);
           folderPic = itemView.findViewById(R.id.folderPic);
           folderName = itemView.findViewById(R.id.folderName);
           folderCard = itemView.findViewById(R.id.folderCard);
        }
    }

}
