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

    @SerializedName("base")
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

    public static Coord parseJSON(String response){
        Gson gson=new Gson();
        Coord coordObject=gson.fromJson(response,Coord.class);
        return coordObject;
    }

   public static List<Weather> getList(){
       final String empleado1JSON = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
       final String empleado2JSON = "{\"id\":76,\"nombre\":\"CR7\",\"empresa\":\"Real Madrid C.F\"}";
       final String empleadosJSON = "[" + empleado1JSON + "," + empleado2JSON + "]";
       final Gson gson = new Gson();
       final Type tipoListaEmpleados = new TypeToken<List<Weather>>(){}.getType();
       final List<Weather> empleados = gson.fromJson(empleadosJSON, tipoListaEmpleados);

       final Weather empleado1 = empleados.get(0);
       final Weather empleado2 = empleados.get(1);
       return empleados;
    }

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




