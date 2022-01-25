package com.example.ecohub2;

import java.util.List;

public class AirList {

    private Main main;

    private Components components;

    private Long dt;

    public AirList(Main main, Long dt) {
        this.main = main;
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public List withComponents(Components components) {
        this.components = components;
        return (List) this;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public List withDt(Long dt) {
        this.dt = dt;
        return (List) this;
    }

    @Override
    public String toString() {
        return "AirList{" +
                "main=" + main +
                ", components=" + components +
                ", dt=" + dt +
                '}';
    }
}
