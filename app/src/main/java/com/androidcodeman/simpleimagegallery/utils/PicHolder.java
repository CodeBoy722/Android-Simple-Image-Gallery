package com.androidcodeman.simpleimagegallery.utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.androidcodeman.simpleimagegallery.R;


/**
 *
 */

public class PicHolder extends RecyclerView.ViewHolder{

    public ImageView picture;

    public PicHolder(@NonNull View itemView) {
        super(itemView);

        picture = itemView.findViewById(R.id.image);
    }
}
