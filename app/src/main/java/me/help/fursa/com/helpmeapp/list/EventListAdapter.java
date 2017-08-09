package me.help.fursa.com.helpmeapp.list;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.help.fursa.com.helpmeapp.R;
import me.help.fursa.com.helpmeapp.pojo.Event;

public class EventListAdapter extends RecyclerView.Adapter<EventListViewHolder> {
    public static List<Event> mEventList;


    public EventListAdapter() {
        mEventList = new ArrayList<>();
        mEventList.add(new Event("Вызвать врача", "Ближайшая больница им.Калинина 10км", R.drawable.ic_local_hospital_24dp, "8(846)552-43-11"));
        mEventList.add(new Event("Вызвать пожарных", "Ближайшая станция им.Алексеева 1км", R.drawable.ic_flame_24dp, "8(846)552-40-21"));
        mEventList.add(new Event("Вызвать полицию", "Ближайший пункт 10км", R.drawable.ic_local_police_24dp, "8(846)222-43-14"));
        mEventList.add(new Event("Вызвать газовую службу", "Ближайший пункт им.Жукова  10км", R.drawable.ic_gas_24dp, "8(846)502-40-11"));
    }

    @Override
    public EventListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item, parent, false);
        return new EventListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventListViewHolder holder, int position) {
        Event e = mEventList.get(position);
        holder.mTextViewTitle.setText(e.getTitle());
        holder.mTextViewNearPlace.setText(e.getPlace());
        holder.mPhoneText.setText(e.getPhone());
        holder.mIcon.setImageResource(e.getIconId());
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }


}
