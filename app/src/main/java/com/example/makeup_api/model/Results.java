package com.example.makeup_api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    @SerializedName("brand")
    @Expose
    private String brand;
}
