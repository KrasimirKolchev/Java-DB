package com.cardealer.persistance.models.dtos.customerDtos;

import com.google.gson.annotations.Expose;

public class CustomerCreateDTO {
    @Expose
    private String name;
    @Expose
    private String birthDate;
    @Expose
    private boolean isYoungDriver;

    public CustomerCreateDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isYoungDriver() {
        return isYoungDriver;
    }

    public void setYoungDriver(boolean isYoungDriver) {
        this.isYoungDriver = isYoungDriver;
    }
}
