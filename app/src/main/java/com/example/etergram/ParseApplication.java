package com.example.etergram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VpIYzMFHn4mVQ2Zl6BnOyzHgyqKLayuAvG76tDei")
                .clientKey("Wzn0nst1gwCLbY9v9ZoxWKAvGw131VpVl2G5EIko")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
