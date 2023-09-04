package com.rpy.Alvin.p.constant;

public class UtilityConstant {

    public enum Floor {
        GROUND("GROUND"),FIRST("FIRST"),SECOND("SECOND"),THIRD("THIRD");

        private String value;

        Floor(String value) {
            this.value = value;
        }
    }

    public enum IDType {
        AADHAR("AADHAR"),DL("DL"),VOTERID("VOTERID"),PAN("PAN"),COLLAGEID("COLLAGEID");

        private String value;

        IDType(String value) {
            this.value = value;
        }
    }
}
