package com.example.myapplicationprueba.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GeneralClass {

    @SerializedName("coord")
    Coord coord;



    @SerializedName("weather")
    ArrayList<Weather> weather = new ArrayList<Weather>();

    @SerializedName("base")
    private String base;

    @SerializedName("main")
    Main MainObject;

    @SerializedName("visibility")
    private float visibility;

    @SerializedName("wind")
    Wind WindObject;

    @SerializedName("clouds")
    Clouds CloudsObject;

    @SerializedName("dt")
    private float dt;
    @SerializedName("sys")
    Sys SysObject;

    @SerializedName("id")
    private float id;

    @SerializedName("name")
    private String name;
    @SerializedName("cod")
    private float cod;



    // Getter Methods



    public String getBase() {
        return base;
    }

    public Main getMain() {
        return MainObject;
    }

    public float getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return SysObject;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }

    // Setter Methods



    public void setBase( String base ) {
        this.base = base;
    }

    public void setMain( Main mainObject ) {
        this.MainObject = mainObject;
    }

    public void setVisibility( float visibility ) {
        this.visibility = visibility;
    }

    public void setWind( Wind windObject ) {
        this.WindObject = windObject;
    }

    public void setClouds( Clouds cloudsObject ) {
        this.CloudsObject = cloudsObject;
    }

    public void setDt( float dt ) {
        this.dt = dt;
    }

    public void setSys( Sys sysObject ) {
        this.SysObject = sysObject;
    }


    public void setId( float id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setCod( float cod ) {
        this.cod = cod;
    }
}




