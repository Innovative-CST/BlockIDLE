package android.location;

import android.os.Parcel;
import android.os.Bundle;
import java.util.Locale;
import android.os.Parcelable;

public class Address implements Parcelable
{
    @NonNull
    public static final Creator<Address> CREATOR;
    
    public Address(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxAddressLineIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public String getAddressLine(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAddressLine(final int index, final String line) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFeatureName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFeatureName(final String featureName) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAdminArea() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAdminArea(final String adminArea) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubAdminArea() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubAdminArea(final String subAdminArea) {
        throw new RuntimeException("Stub!");
    }
    
    public String getLocality() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocality(final String locality) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubLocality() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubLocality(final String sublocality) {
        throw new RuntimeException("Stub!");
    }
    
    public String getThoroughfare() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThoroughfare(final String thoroughfare) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubThoroughfare() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubThoroughfare(final String subthoroughfare) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPremises() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPremises(final String premises) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPostalCode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostalCode(final String postalCode) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCountryCode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCountryCode(final String countryCode) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCountryName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCountryName(final String countryName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasLatitude() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLatitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLatitude(final double latitude) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearLatitude() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasLongitude() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLongitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLongitude(final double longitude) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearLongitude() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPhone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPhone(final String phone) {
        throw new RuntimeException("Stub!");
    }
    
    public String getUrl() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUrl(final String Url) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtras(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
