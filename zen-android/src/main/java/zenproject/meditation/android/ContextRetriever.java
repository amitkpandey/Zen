package zenproject.meditation.android;

import android.app.Activity;
import android.content.Context;

public enum ContextRetriever {
    INSTANCE;

    private Context context;
    private Activity activity;

    public void inject(Context context) {
        this.context = context;
    }

    public void inject(Activity activity) {
        this.activity = activity;
    }

    public Context getCurrentContext() {
        return activity == null ? context : activity;
    }

}