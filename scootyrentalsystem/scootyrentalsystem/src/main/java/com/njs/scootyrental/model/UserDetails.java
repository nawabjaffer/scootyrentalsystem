package com.njs.scootyrental.model;


import com.njs.scootyrental.exceptions.InvalidUserException;

import java.util.Objects;

enum SubmitProof{
    ADHAAR,
    LICENSE,
    PANCARD
}
public class UserDetails {
    private String name;
    private String Address;
    private String phoneNumber;
    private SubmitProof proof;
    private boolean isValidDriver;
    private String licenseId;


    public boolean checkValidUserDetails() throws InvalidUserException {
        if(!Objects.nonNull(name) || name.equals("") )
        {
            throw new InvalidUserException("Give an Proper Naming convention");
        }
        if(!Objects.nonNull(proof)  )
        {
            throw new InvalidUserException("Kindly submit any of you valid address proof to take an ride");
        }
        if(!Objects.nonNull(phoneNumber) || phoneNumber.equals("") )
        {
            throw new InvalidUserException("Phone Number was not valid");
        }
        if(!Objects.nonNull(phoneNumber) || phoneNumber.equals("") ) {
            throw new InvalidUserException("Phone Number was not valid");
        }
        if(licenseId.equals("") || Objects.nonNull(licenseId))
        {
            //logic to check for license validity Strategy
            throw new InvalidUserException("License Id was not valid");
        }

        return true;
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SubmitProof getProof() {
        return proof;
    }

    public void setProof(SubmitProof proof) {
        this.proof = proof;
    }

    public boolean isValidDriver() {
        return isValidDriver;
    }

    public void setValidDriver(boolean validDriver) {
        isValidDriver = validDriver;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }




}
