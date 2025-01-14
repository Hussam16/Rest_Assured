package com.restassured.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

class Data{

@Getter
@Setter
    private int id;
    @JsonProperty("nationalId")
    private String nationalId;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birthGov")
    private String birthGov;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("step")
    private String step;
    @JsonProperty("appCreatedDate")
    private String appCreatedDate;
    @JsonProperty("appLastUpdatedDate")
    private String appLastUpdatedDate;
    @JsonProperty("submissionDate")
    private String submissionDate;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("englishFullName")
    private String englishFullName;
    @JsonProperty("governorateId")
    private int governorateId;
    @JsonProperty("cityId")
    private Integer cityId;
    @JsonProperty("correspondenceAddress")
    private String correspondenceAddress;
    @JsonProperty("homePhone")
    private String homePhone;
    @JsonProperty("educationalLevel")
    private String educationalLevel;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("sourceOfIncome")
    private List<String> sourceOfIncome;

}
