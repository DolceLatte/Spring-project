package me.Kim.Springmvcdemo.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class Data {
    private int number;

    @JsonCreator
    public Data(@JsonProperty("number") int number) {
        this.number = number;
    }
}
