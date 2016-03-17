package com.jwl.atomicbomb.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jwl on 2016-03-17.
 */
public class SplashBean extends BaseBean implements Parcelable {

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

    public SplashBean() {
    }

    protected SplashBean(Parcel in) {
        this.id = in.readInt();
    }

    public static final Creator<SplashBean> CREATOR = new Creator<SplashBean>() {
        @Override
        public SplashBean createFromParcel(Parcel source) {
            return new SplashBean(source);
        }

        @Override
        public SplashBean[] newArray(int size) {
            return new SplashBean[size];
        }
    };
}
