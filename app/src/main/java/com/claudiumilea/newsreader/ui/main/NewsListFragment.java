package com.claudiumilea.newsreader.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.claudiumilea.newsreader.databinding.ArticleListFragmentBinding;
import com.claudiumilea.newsreader.model.NewsListViewModel;

public class NewsListFragment extends Fragment {
    private NewsListViewModel mViewModel;

    public static NewsListFragment newInstance() {
        return new NewsListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NewsListViewModel.class);
        getLifecycle().addObserver(mViewModel);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ArticleListFragmentBinding binding = ArticleListFragmentBinding.inflate(inflater, container, false);
        binding.setViewModel(mViewModel);

        return binding.getRoot();
    }
}
