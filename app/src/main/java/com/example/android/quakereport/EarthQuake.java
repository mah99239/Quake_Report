package com.example.android.quakereport;

public class EarthQuake
{

    /**
     * Magnitude of the EarthQuake
     */
    private double mMagnitude;

    /**
     * Location of the EarthQuake
     */
    private String mLocation;

    /**
     * Time of the EarthQuake
     */
    private long mTimeInMilliseconds;

    /**
     * Website URL of the EarthQuake
     */
    private String mUrl;


    /**
     * Constructs a new {@link EarthQuake} object.
     *
     * @param magnitude
     * @param location
     * @param timeInMilliseconds
     */
    public EarthQuake(double magnitude, String location, long timeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    /**
     * Return the magnitude of the EarthQuake.
     *
     * @return
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the location of the EarthQuake.
     *
     * @return
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * Return the date of the EarthQuake.
     *
     * @return
     */
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the EarthQuake.
     */
    public String getmUrl() {
        return mUrl;
    }
}
