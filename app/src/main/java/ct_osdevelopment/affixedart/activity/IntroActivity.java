package ct_osdevelopment.affixedart.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.paolorotolo.appintro.AppIntro;
import com.google.android.gms.common.api.GoogleApiClient;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

import ct_osdevelopment.affixedart.R;


/**
 * Created by SIDHeart on 12-02-2017.
 */

public class IntroActivity extends AppIntro {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                addSlide(SampleSlide.newInstance(R.layout.s1));
        setFlowAnimation();
        addSlide(SampleSlide.newInstance(R.layout.s2));
        setZoomAnimation();
        addSlide(SampleSlide.newInstance(R.layout.s41));
        setDepthAnimation();
        addSlide(SampleSlide.newInstance(R.layout.s5));
        setFadeAnimation();
        showSkipButton(false);








        final Button DONE=(Button) findViewById(R.id.done);
        Dexter.withActivity(this)
                .withPermissions(
                        Manifest.permission.CAMERA,
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.READ_SMS,
                        Manifest.permission.ACCESS_FINE_LOCATION

                ).withListener(new MultiplePermissionsListener() {
            @Override public void onPermissionsChecked(MultiplePermissionsReport report) {/* ... */}
            @Override public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {/* ... */}
        }).check();

        DONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent=new Intent(IntroActivity.this,LoginActivity.class);
                startActivity(intent);

            }

        });



    }



}
