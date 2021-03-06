package com.twistedequations.rxmvp.screens.home.mvp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.twistedequations.rxmvp.reddit.models.RedditItem;

public class PostViewViewHolder extends RecyclerView.ViewHolder {

    private final ListItemViewPost listItemViewPost;

    public PostViewViewHolder(ListItemViewPost listItemViewPost, PositionClickListener itemPositionClickListener,
                              PositionClickListener authorPositionClickListener) {
        super(listItemViewPost);
        listItemViewPost.setOnClickListener((view) -> itemPositionClickListener.onClick(view, getAdapterPosition()));
        this.listItemViewPost = listItemViewPost;
        listItemViewPost.setOnAuthorClickListener((view) -> authorPositionClickListener.onClick(view, getAdapterPosition()));
    }

    public void setRedditItem(RedditItem redditItem, Picasso picasso) {
        listItemViewPost.setRedditItem(redditItem, picasso);
    }

}
