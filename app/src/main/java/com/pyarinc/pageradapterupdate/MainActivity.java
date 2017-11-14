package com.pyarinc.pageradapterupdate;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements ImageLoadingFragment.OnFragmentInteractionListener, View.OnClickListener {

    private ViewPager mViewPager ;
    private String[] mUrls = null;
    private Button btUpdate;
    private ImageAdapter mImageAdapter;
    private EditText etEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.image_container);
        btUpdate = (Button) findViewById(R.id.update_bt);
        etEdit = (EditText) findViewById(R.id.edit_image_et);
        mUrls = new String[]{"http://photos2.insidercdn.com/iphone4scamera-111004-full.JPG",
        "https://farm8.staticflickr.com/7569/15578888220_cd9b3d37df_b.jpg",
        "http://www.fujifilmusa.com/products/digital_cameras/x/fujifilm_x20/sample_images/img/index/ff_x20_008.JPG"};

        Singleton.mUrls.addAll( new ArrayList<>(Arrays.asList(mUrls)));
        mImageAdapter = new ImageAdapter(getSupportFragmentManager());

        btUpdate.setOnClickListener(this);
        mViewPager.setAdapter(mImageAdapter);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.update_bt:
                if (etEdit.length() > 0) {
                    Singleton.mUrls.set(0, etEdit.getText().toString());
                }
                mImageAdapter.notifyDataSetChanged();
                break;
        }
    }
}
