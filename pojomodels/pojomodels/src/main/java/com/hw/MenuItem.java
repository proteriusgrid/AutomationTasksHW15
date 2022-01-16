package com.hw;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class MenuItem {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("onclick")
    @Expose
    private String onclick;

    public String getValue() {
        return value;
    }

    public void setValue( String value ) {
        this.value = value;
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick( String onclick ) {
        this.onclick = onclick;
    }
}
