package com.androidcodeman.simpleimagegallery.utils;

import java.util.ArrayList;

/**
 * Author CodeBoy722
 */
public interface transitListerner {

    /**
     * Called when a picture is clicked
     * @param holder The ViewHolder for the clicked picture
     * @param position The position in the grid of the picture that was clicked
     */
    void onPicClicked(PicHolder holder, int position, ArrayList<pictureFacer> pics);
    void onPicClicked(String pictureFolderPath);
}
