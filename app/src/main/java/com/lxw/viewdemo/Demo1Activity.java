package com.lxw.viewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lxw.viewdemo.utils.MyUtils;
import com.lxw.viewdemo.widget.HorizontalScrollViewEx2;
import com.lxw.viewdemo.widget.ListViewEx;

import java.util.ArrayList;
import java.util.List;

public class Demo1Activity extends AppCompatActivity {
    private HorizontalScrollViewEx2 mHorizontalScrollViewEx;
    private int[] colorResIds = {R.color.colorAccent, R.color.colorPrimaryDark, R.color.colorGreen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        mHorizontalScrollViewEx = findViewById(R.id.scrollView);
        initView();

    }

    private void initView() {
        LayoutInflater inflater = getLayoutInflater();
        final int screenWidth = MyUtils.getScreenMetrics(this).widthPixels;
        final int screenHeight = MyUtils.getScreenMetrics(this).heightPixels;
        for (int i = 0; i < 3; i++) {
            ViewGroup layout = (ViewGroup) inflater.inflate(
                    R.layout.content_layout,
                    mHorizontalScrollViewEx,
                    false);
            layout.getLayoutParams().width = screenWidth;
            TextView tv = layout.findViewById(R.id.title);
            tv.setText("page " + (i + 1));
            layout.setBackgroundColor(Color.rgb(255 / (i + 1), 255 / (i + 1), 0));
            createList(layout);
            mHorizontalScrollViewEx.addView(layout);
            getWindow().getDecorView().requestLayout();
        }
    }

    private void createList(ViewGroup layout) {
        ListViewEx listView = layout.findViewById(R.id.list);
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            data.add("name " + i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.content_list_item,
                R.id.name,
                data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Demo1Activity.this, "click item",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void test2() {
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(500, 500));
            imageView.setBackgroundColor(getResources().getColor(colorResIds[i % colorResIds.length]));
            mHorizontalScrollViewEx.addView(imageView);
        }
    }

    private void test(boolean t1, boolean t2) {
        if (t1) {
            System.out.println("t1: " + t1);
        } else if (t2) {
            System.out.println("t2: " + t2);
        } else {
            System.out.println("t1: " + t1 + " t2: " + t2);
        }
    }
}
