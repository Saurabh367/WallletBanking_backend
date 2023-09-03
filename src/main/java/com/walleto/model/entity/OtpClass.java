package com.walleto.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

@NoArgsConstructor
@Document(collection ="Otp-Class")

public class OtpClass {
    private Integer generatedOTP;

    public Integer getGeneratedOTP() {
        return generatedOTP;
    }

    public void setGeneratedOTP(Integer generatedOTP) {
        this.generatedOTP = generatedOTP;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserEnteredOTP() {
        return userEnteredOTP;
    }

    public void setUserEnteredOTP(Integer userEnteredOTP) {
        this.userEnteredOTP = userEnteredOTP;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Id
    private ObjectId id;

    private String email;
    private Integer userEnteredOTP;

    public OtpClass(Integer generatedOTP, String email ) {
        this.generatedOTP = generatedOTP;
        this.email = email;

    }
    public  Boolean verified;

}
