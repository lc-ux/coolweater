package com.coolweather.android.gson;

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public  String max;
        public String min;
    }
    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
