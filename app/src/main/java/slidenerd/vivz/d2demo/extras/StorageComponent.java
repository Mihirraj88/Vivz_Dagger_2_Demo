package slidenerd.vivz.d2demo.extras;

import javax.inject.Singleton;

import dagger.Component;
import slidenerd.vivz.d2demo.FragmentA;
import slidenerd.vivz.d2demo.FragmentB;

@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {
    void inject(FragmentA fragmentA);
    void inject (FragmentB fragmentB);
}
