package com.jwl.atomicbomb.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jwl on 2015-11-17.
 */
public class LoginBean implements Parcelable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
    }

    public LoginBean() {
    }

    protected LoginBean(Parcel in) {
        this.id = in.readInt();
    }

    public static final Parcelable.Creator<LoginBean> CREATOR = new Parcelable.Creator<LoginBean>() {
        @Override
        public LoginBean createFromParcel(Parcel source) {
            return new LoginBean(source);
        }

        @Override
        public LoginBean[] newArray(int size) {
            return new LoginBean[size];
        }
    };
}
