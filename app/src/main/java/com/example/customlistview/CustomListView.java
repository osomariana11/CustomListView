package com.example.customlistview;

import android.view.View;
import android.view.ViewGroup;

public interface CustomListView {
    int  getCount();

    Object getItem(int i);

    long getItemId(int i);

    View getView(int i, View view, ViewGroup viewGroup);
}
