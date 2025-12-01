package com.example.launcher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    PackageManager pm;
    List<ResolveInfo> apps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listaApps);

        pm = getPackageManager();

        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        apps = pm.queryIntentActivities(intent, 0);

        AppAdapter adapter = new AppAdapter(this, apps, pm);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            ResolveInfo info = apps.get(position);
            Intent launch = pm.getLaunchIntentForPackage(info.activityInfo.packageName);
            if (launch != null) startActivity(launch);
        });
    }
}
