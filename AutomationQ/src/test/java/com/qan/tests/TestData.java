/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qan.tests;

import java.util.HashMap;

/**
 *
 * @author dmiller
 */
public class TestData {
    public static class LatLonInputs {
        public HashMap<String, LonLatData> data;
        public LatLonInputs() {
            this.data = new HashMap<String, LonLatData>();
            this.data.put("checkAvailability", new LonLatData("51.5072", "-0.1276"));
        }
    }
    public static class LonLatData {
        public String lon;
        public String lat;
        public LonLatData(String inLon, String inLat) {
            this.lon = inLon;
            this.lat = inLat;
        }
    }
}
