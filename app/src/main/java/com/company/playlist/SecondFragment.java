package com.company.playlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.playlist.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick {
    private FragmentSecondBinding fragmentSecondBinding;
    private ArrayList<Music> musics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentSecondBinding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container,false );
        return fragmentSecondBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MusicAdapter musicAdapter = new MusicAdapter(musics, this);
        fragmentSecondBinding.recycler.setAdapter(musicAdapter);
    }

    private void loadData() {
        musics = new ArrayList<>();
        musics.add(new Music("Taylor Swift", "Blank Space", "3:22"));
        musics.add(new Music("Silento", "Watch Me", "5:36"));
        musics.add(new Music("The Weekend", "Earned It", "4:51"));
        musics.add(new Music("The Weekend", "The Hills", "3:41"));
        musics.add(new Music("Sam Smith", "Writing's On The Wall", "5:33"));
        musics.add(new Music("Мирбек Атабеков", "Жалынам", "3:54"));
        musics.add(new Music("Artik & Asti", "Грустный Дэнс", "3:37"));
        musics.add(new Music("Гулжигит Калыков", "Жамгыр Токту", "5:06"));
        musics.add(new Music("Dенис Клявер", "Когда ты станешь большим", "4:28"));
        musics.add(new Music("Artik & Asti", "Истеричка", "3:42"));

    }

    @Override
    public void onClick(Music music) {
        Intent playList = new Intent(requireActivity(),SecondActivity.class);
        playList.putExtra("text", music.getSinger());
        playList.putExtra("text_1", music.getMusic());
        startActivity(playList);

    }
}