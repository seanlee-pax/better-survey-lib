package com.example.bettersurveylib.api.requests;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Request authentication request and response keys for a successfully registered terminal
 */
public class GetTerminalKeysReq {
        @SerializedName("manufacturer")
        public String manufacturer;

        @SerializedName("model")
        public String model;

        @SerializedName("terminalSN")
        public String terminalSN;

        @SerializedName("certificate")
        public String certificate;

        @SerializedName("requestFeature")
        public List<String> requestFeatures;

        public GetTerminalKeysReq(String manufacturer, String model, String terminalSN, List<String> requestFeatures) {
                this.manufacturer = manufacturer;
                this.model = model;
                this.terminalSN = terminalSN;
                this.requestFeatures = requestFeatures;

                this.certificate = "dummy cert";
        }
}
