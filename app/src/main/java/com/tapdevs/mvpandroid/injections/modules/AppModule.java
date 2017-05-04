package com.tapdevs.mvpandroid.injections.modules;

import android.app.Application;

import com.tapdevs.mvpandroid.injections.scope.PerDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by  Jan Shair on 31/01/2017.
 */

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }


}
