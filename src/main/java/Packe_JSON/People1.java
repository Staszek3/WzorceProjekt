package Packe_JSON;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT
        , use= JsonTypeInfo.Id.NAME)
public class People1 {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "person1")
    private List<Person1> people1;

    public People1(List<Person1> people1) {
        this.people1 = people1;
    }

    public People1() {
    }

    public List<Person1> getPeople() {
        return people1;
    }

    public void setPeople(List<Person1> people1) {
        this.people1 = people1;
    }

    @Override
    public String toString() {
        return "People1{" +
                "people1=" + people1 +
                '}';
    }
}
