package com.lei.fragmenttofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yanle on 2018/2/7.
 */

public class LeftFrgament extends Fragment{
    private EditText et_content;
    private Button btn_send;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left,null);
        et_content = view.findViewById(R.id.et_content);
        btn_send = view.findViewById(R.id.button);

        btn_send.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et_content.getText().toString();
                //方式一可以调用findFragmentById()方法根据Id获得fragment的对象
                // 调用fragment中的方法赋值
//                RightFragment rightFragment = (RightFragment)getFragmentManager().findFragmentById(R.id.fragment2);
//                rightFragment.setTextView(str);
                /*
                方式二：先调用getFragmentManager获得FragmentManager对象，然后调用findFragmentById方法
                获得右侧的fragment，在调用getView获得右侧fragment的view对象，最后调用view
                的findViewById获得赋值的控件
                 */
                TextView tv = getFragmentManager().findFragmentById(R.id.fragment2).getView().findViewById(R.id.tv_show);

                tv.setText(str);

            }
        });
        return view;
    }
}













