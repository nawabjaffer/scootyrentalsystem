package com.njs.scootyrental.model;

import com.njs.scootyrental.exceptions.InvalidUserException;
import com.njs.scootyrental.exceptions.LicenseIsNotAvailableException;

import java.util.Optional;

public class User {
    private UserDetails userDetails;
    private String email;
    private String phoneNumber;
    private Location location;
    private boolean isLicensedUser;

    public User(String name, String email, String phoneNumber, Location location, UserDetails userDetails) throws LicenseIsNotAvailableException {
        boolean isLicense = false;
        this.isLicensedUser = Optional.of(userDetails.getLicenseId()).isPresent();
        if (!checkforvalidDriver()) {
            throw new LicenseIsNotAvailableException("User is not Submitted the License");
        } else {
            SubmitProof proof = SubmitProof.LICENSE;
            String licenseId = "";
            boolean isLicensedUser = true;
            //this.userDetails = new UserDetails(name, email, phoneNumber, proof,licenseId,isLicensedUser);
        }
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public boolean checkforvalidDriver() {

        if (isLicensedUser) {
            return true;
        } else {
            return false;
        }
    }
//    public String getName() {
//        return name;
//    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public boolean checkforValidUser() throws InvalidUserException, LicenseIsNotAvailableException {
        if (!this.userDetails.checkValidUserDetails()){
            throw new InvalidUserException("The important User Details was missing");}

        else if(!this.isLicensedUser) {
            throw new LicenseIsNotAvailableException("License was not submitted by the USer");
        }
        return false;


    }
}