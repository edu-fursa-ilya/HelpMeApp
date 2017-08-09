package me.help.fursa.com.helpmeapp.list;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.help.fursa.com.helpmeapp.InfoActivity;
import me.help.fursa.com.helpmeapp.MainActivity;
import me.help.fursa.com.helpmeapp.R;

class EventListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.cardEvent)
    CardView mEventCardView;
    @BindView(R.id.event_title)
    TextView mTextViewTitle;
    @BindView(R.id.event_near_place)
    TextView mTextViewNearPlace;
    @BindView(R.id.btnEventInfo)
    Button mInfoButton;
    @BindView(R.id.event_place_phone)
    TextView mPhoneText;
    @BindView(R.id.icon)
    ImageView mIcon;

    private Context context;

    public EventListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @OnClick(R.id.btnEventInfo)
    public void onBtnInfoClick(View v) {
        context = itemView.getContext();
        context.startActivity(new Intent(context, InfoActivity.class));
        ((MainActivity) context).finish();
    }

    @OnClick(R.id.cardEvent)
    public void onCardEventClick(View v) {

    }
}
