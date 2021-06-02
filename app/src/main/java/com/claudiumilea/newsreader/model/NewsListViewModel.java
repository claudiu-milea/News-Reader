package com.claudiumilea.newsreader.model;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

public class NewsListViewModel extends ViewModel implements LifecycleObserver {
    @NonNull
    public final ObservableList<ArticleItemViewModel> items;

    public NewsListViewModel() {
        super();
        items = new ObservableArrayList<>();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void refresh() {
        if (items.isEmpty()) {
            for (int i = 0; i < 10; i++)
                items.add(new ArticleItemViewModel(Integer.toString(i),
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
                                "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut " +
                                "enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                                "nisi ut aliquip ex ea commodo consequat."));
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
