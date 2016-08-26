package poly.pom.trydragger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by User on 26/8/2016.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MyApplication target);
    void inject(MainActivity target);
}
