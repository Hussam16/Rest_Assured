package com.restassured.examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import static io.restassured.RestAssured.*;

public class TestWithJackson {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // Create a sample object
        MyPojo myPojo = new MyPojo("Test", 123);

        // Serialize object to JSON
        String json = objectMapper.writeValueAsString(myPojo);
        System.out.println("Serialized JSON: " + json);

        // Send the JSON in a POST request
        given()
                .header("Content-Type", "application/json")
                .body(json)
                .when()
                .post("https://example.com/api/test")
                .then()
                .statusCode(405);
    }
}

 class MyPojo {
    private String name;
    private int id;

    // Default constructor (required for deserialization)
    public MyPojo() {
    }

    // Parameterized constructor
    public MyPojo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'id'
    public int getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }
}

