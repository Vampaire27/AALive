package org.angzangy.aalive;

import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public void requestPermissionCompat(String permission, int requestCode){
        requestPermissionsCompat(new String[]{permission}, requestCode);
    }

    public void requestPermissionsCompat(String[] permissions, int requestCode){
        ActivityCompat.requestPermissions(this, permissions, requestCode);
    }

    protected void onRequestPermissionSuccess(int requestCode, String permission){

    }

    protected void onRequestPermissionFail(int requestCode, String permission){

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        int size = Math.min(permissions.length, grantResults.length);
        for(int i = 0; i < size; i++){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                onRequestPermissionSuccess(requestCode, permissions[i]);
            }else{
                onRequestPermissionFail(requestCode, permissions[i]);
            }
        }
    }
}
