/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.qan.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 *
 * @author dmiller
 */
public class APILatLonAvailabilityTests {
    //private String BaseUrl="http://api.weatherbit.io/v2.0/forecast/hourly?lat=--LAT-DATA--&lon=--LON-DATA--&key=19fca4ec9b474546aecca1d26e92cb2c";
    private String BaseUrl="http://api.weatherbit.io/v2.0/forecast/hourly?key=19fca4ec9b474546aecca1d26e92cb2c";
    public TestData.LatLonInputs testData;
    public int expectedStatusCode = 200;

    public APILatLonAvailabilityTests() {
        //Initialise test data
        this.testData = new TestData.LatLonInputs();
    }
    
    @Test
    public void checkAvailability() {
        given().
            pathParam("lat", testData.data.get("checkAvailability").lat).
            pathParam("lon", testData.data.get("checkAvailability").lon).
        when().
            get(BaseUrl + "&lat={lat}&lon={lon}").
        then().
            assertThat().
            statusCode(expectedStatusCode);
    }    
    
    @BeforeAll
    public static void setUpClass() {

    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
