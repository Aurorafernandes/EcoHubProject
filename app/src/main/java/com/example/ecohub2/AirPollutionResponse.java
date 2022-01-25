package com.example.ecohub2;

import java.util.List;

public class AirPollutionResponse {

    private Coord coord;

    private List<AirList> list;

    public AirPollutionResponse(Coord coord, List<AirList> list) {
        this.coord = coord;
        this.list = list;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<AirList> getList() {
        return list;
    }

    public void setList(List<AirList> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AirPollution{" +
                "coord=" + coord +
                ", list=" + list +
                '}';
    }
}