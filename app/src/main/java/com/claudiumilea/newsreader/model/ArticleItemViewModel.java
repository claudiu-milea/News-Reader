package com.claudiumilea.newsreader.model;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class ArticleItemViewModel extends ViewModel {
    public final ObservableField<String> content, title;
    public final String photo;

    public ArticleItemViewModel() {
        this.title = new ObservableField<>();
        this.content = new ObservableField<>();
        this.photo = "https://i.ytimg.com/vi/xwL26O4dLE8/maxresdefault.jpg";
    }

    public ArticleItemViewModel(String title, String content) {
        this.title = new ObservableField<>();
        this.content = new ObservableField<>();
        this.photo = "https://i.ytimg.com/vi/xwL26O4dLE8/maxresdefault.jpg";
        this.title.set(title);
        this.content.set(content);
    }
}