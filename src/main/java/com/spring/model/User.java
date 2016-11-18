package com.spring.model;


import com.spring.model.enums.Color;
import com.spring.model.enums.Gender;
import com.spring.model.enums.School;

import java.util.List;
import java.util.StringJoiner;

@SuppressWarnings("Since15")
public class User
{
    private String name;
    private School school;
    private String gender;
    private List<Color> colors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" - ");
        sj.add(getName());
        sj.add(getGender());
        sj.add(getSchool().toString());
        sj.add(getColors().toString());

        return sj.toString();
    }
}
