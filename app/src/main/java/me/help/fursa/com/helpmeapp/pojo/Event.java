package me.help.fursa.com.helpmeapp.pojo;

/**
 * Created by fs-pc on 09.08.17.
 */

public class Event {
    private String title;
    private String place;
    private int iconId;
    private String phone;

    public Event(String title, String place, int iconId, String phone) {
        this.title = title;
        this.place = place;
        this.iconId = iconId;
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", place='" + place + '\'' +
                ", iconId=" + iconId +
                ", phone='" + phone + '\'' +
                '}';
    }
}
