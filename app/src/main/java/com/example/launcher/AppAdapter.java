package com.example.launcher;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.*;
import java.util.List;

public class AppAdapter extends BaseAdapter {

    Context ctx;
    List<ResolveInfo> apps;
    PackageManager pm;

    public AppAdapter(Context ctx, List<ResolveInfo> apps, PackageManager pm) {
        this.ctx = ctx;
        this.apps = apps;
        this.pm = pm;
    }

    @Override
    public int getCount() { return apps.size(); }

    @Override
    public Object getItem(int i) { return apps.get(i); }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(ctx).inflate(R.layout.item_app, parent, false);

        ImageView icon = convertView.findViewById(R.id.icon);
        TextView name = convertView.findViewById(R.id.nomeApp);

        ResolveInfo info = apps.get(pos);

        icon.setImageDrawable(info.loadIcon(pm));
        name.setText(info.loadLabel(pm));

        return convertView;
    }
}
