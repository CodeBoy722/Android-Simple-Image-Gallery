package com.androidcodeman.simpleimagegallery.utils;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.androidcodeman.simpleimagegallery.R;

public class indicatorHolder extends RecyclerView.ViewHolder{

    public ImageView image;
    public CardView card;
    public View positionController;

    public indicatorHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imageIndicator);
        card = itemView.findViewById(R.id.indicatorCard);
        positionController = itemView.findViewById(R.id.activeImage);
    }
}
