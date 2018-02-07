package com.lei.fragmenttofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yanle on 2018/2/7.
 */

public class RightFragment extends Fragment{
    private TextView tv_shoew;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frgment_right,null);
        tv_shoew = view.findViewById(R.id.tv_show);
        return view;
    }
    //定义函数给TextView控件赋值
    public void setTextView(String text) {
        tv_shoew.setText(text);
    }
}
