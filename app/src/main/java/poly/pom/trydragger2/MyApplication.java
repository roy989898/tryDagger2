package poly.pom.trydragger2;

import android.app.Application;

/**
 * Created by User on 26/8/2016.
 */
public class MyApplication extends Application {
    private ApplicationComponent component;

    public ApplicationComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();



    }
}
