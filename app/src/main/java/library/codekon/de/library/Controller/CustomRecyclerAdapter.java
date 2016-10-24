package library.codekon.de.library.Controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import library.codekon.de.library.Activity.EssayActivity;
import library.codekon.de.library.Activity.NovelActivity;
import library.codekon.de.library.Activity.PoemActivity;
import library.codekon.de.library.Activity.StoryActivity;
import library.codekon.de.library.R;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private String[] mTitles;

    public CustomRecyclerAdapter(Context context, String[] titles) {
        this.mContext = context;
        this.mTitles = titles;
    }

    @Override
    public CustomRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomRecyclerAdapter.ViewHolder holder, int position) {
        holder.itemTitle.setText(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles.length;
    }





    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = (TextView) itemView.findViewById(R.id.item_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getLayoutPosition();
                    callActivities(position);

                }
            });
        }
    }

    private void callActivities(int position) {
        if (position == 0) {
            mContext.startActivity(new Intent(mContext, NovelActivity.class));
        } else if (position == 1) {
            mContext.startActivity(new Intent(mContext, StoryActivity.class));
        } else if (position == 2) {
            mContext.startActivity(new Intent(mContext, EssayActivity.class));
        } else if (position == 3) {
            mContext.startActivity(new Intent(mContext, PoemActivity.class));
        }
    }

}
