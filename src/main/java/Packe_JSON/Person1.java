package Packe_JSON;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT
       , use= JsonTypeInfo.Id.NAME)
public class Person1 {
    @JacksonXmlProperty(localName = "myFieldName")
    private String name;
    private String surName;
    private int pesel;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", pesel=" + pesel +
                '}';
    }

    public Person1() {
    }

    public Person1(String name, String surName, int pesel) {
        this.name = name;
        this.surName = surName;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
