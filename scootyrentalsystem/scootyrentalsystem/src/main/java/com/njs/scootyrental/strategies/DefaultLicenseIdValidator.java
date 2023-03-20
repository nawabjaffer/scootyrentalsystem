package com.njs.scootyrental.strategies;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DefaultLicenseIdValidator implements LicenseValidityStartegy{
    @Override
    public boolean licenseIdValidator(String licenseId) {
        if(licenseId.substring(0,4).equals("IND"))
        {
            return true;
        }
        return false;
    }
}
