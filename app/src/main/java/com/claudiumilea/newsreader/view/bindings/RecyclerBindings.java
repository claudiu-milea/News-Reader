package com.claudiumilea.newsreader.view.bindings;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.claudiumilea.newsreader.adapter.NewsListAdapter;
import com.claudiumilea.newsreader.model.ArticleItemViewModel;

import java.util.List;

public class RecyclerBindings {
    @BindingAdapter({"items"})
    public static void addFeedItems(RecyclerView recyclerView, List<ArticleItemViewModel> tasks) {
        NewsListAdapter adapter = (NewsListAdapter) recyclerView.getAdapter();

        if (adapter == null) {
            adapter = new NewsListAdapter();
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(adapter);
        }

        adapter.setItems(tasks);
    }
}