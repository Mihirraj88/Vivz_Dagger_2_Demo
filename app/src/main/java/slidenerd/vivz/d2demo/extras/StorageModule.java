package slidenerd.vivz.d2demo.extras;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import slidenerd.vivz.d2demo.MyApplication;

@Module
public class StorageModule {
    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    SharedPreferences providedSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
