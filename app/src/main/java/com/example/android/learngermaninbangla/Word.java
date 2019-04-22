package com.example.android.learngermaninbangla;

/**
 * Created by alamin on 22,April,2019 at time - 15:15
 * Email : encrypt.h@gmail.com
 *
 * @project Learn-German-in-German-Android-App
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** German translation for the word */
    private String mGermanTranslation;

    /** German Image id for corresponding word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int  NO_IMAGE_PROVIDED = -1;



    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the German language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mGermanTranslation = miwokTranslation;
    }


    /**
     * Create a new Word object with an Image.
     *
     * @param mDefaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param mGermanTranslation is the word in the German language
     *
     * @param mImageResourceId is the int value for the Image Resource ID
     */
    public Word(String mDefaultTranslation, String mGermanTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mGermanTranslation = mGermanTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the German translation of the word.
     */
    public String getGermanTranslation() {
        return mGermanTranslation;
    }

    /**
     * Get the German Image Resource ID for corresponding of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

