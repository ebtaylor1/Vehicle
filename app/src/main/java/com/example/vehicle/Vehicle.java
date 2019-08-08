package com.example.vehicle;
import android.os.Parcelable;
import android.os.Parcel;

public class Vehicle implements Parcelable{
    private String make;
    private String colour;
    private int doors;

    public Vehicle (String make, String colour, int doors) {
        this.make = make;
        this.colour = colour;
        this.doors = doors;

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    protected Vehicle(Parcel in) {
        make = in.readString();
        colour = in.readString();
        doors = in.readInt();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(make);
        parcel.writeString(colour);
        parcel.writeInt(doors);
    }
}
