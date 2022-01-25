package com.example.ecohub2;

import java.util.List;

public class Main {
    private Long aqi;

    public Main(Long aqi) {
        this.aqi = aqi;
    }

    public Long getAqi() {
        return aqi;
    }

    public void setAqi(Long aqi) {
        this.aqi = aqi;
    }


    @Override
    public String toString() {
        return "Main{" +
                "aqi=" + aqi +
                '}';
    }
}
