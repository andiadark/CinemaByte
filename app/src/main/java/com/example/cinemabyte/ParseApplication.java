package com.example.cinemabyte;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("glTprYVoj9OWuppmDxZCh4DZkkjCx6VSUxg7xW6G")
                .clientKey("CgFsrnhBQuZ8ExSRnXwBDdiNnYaahIQGlGLN4Vye")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
