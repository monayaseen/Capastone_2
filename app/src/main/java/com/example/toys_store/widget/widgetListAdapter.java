package com.example.toys_store.widget;
import android.content.Intent;
import android.widget.RemoteViewsService;
public class widgetListAdapter extends RemoteViewsService {

    @Override
    public MyRemoteViewsFactory onGetViewFactory(Intent intent) {
        return new MyRemoteViewsFactory(this.getApplicationContext());
    }
}