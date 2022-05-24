/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qan.tests;

/**
 *
 * @author dmiller
 */
public class Helpers {
    
    public static String buildCurrentURLLatLon(String baseURL, String lat, String lon) {
        return baseURL.replace("--LAT-DATA--", lat).replace("--LON-DATA--", lon);
    }
}
