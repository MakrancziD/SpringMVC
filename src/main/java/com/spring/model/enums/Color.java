package com.spring.model.enums;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public enum Color {
    RED("messages.color.RED"),GREEN("messages.color.GREEN"),BLUE("messages.color.BLUE"),BLACK("messages.color.BLACK");

    Color(String s) {label=s;}

    String label;

    public String getLabel()
    {
        return label;
    }
}
