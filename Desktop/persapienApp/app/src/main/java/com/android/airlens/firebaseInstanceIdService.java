package com.android.airlens;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class firebaseInstanceIdService extends Service {
    public firebaseInstanceIdService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
