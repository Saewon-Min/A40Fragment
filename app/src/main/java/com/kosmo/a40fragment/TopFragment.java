package com.kosmo.a40fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// 상단 영역에 포함된 프레그먼트로 XML 레이아웃 파일을 inflate한다.
public class TopFragment extends Fragment {

    // 일반적인 액티비티의 onCreate() 와 동일한 역할의 메소드이다.
    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.top_fragment, container);
    }
}
