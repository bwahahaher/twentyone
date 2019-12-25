package com.example.twentyone;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Phone> phones = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        DataAdapter adapter = new DataAdapter(this, phones);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }


    private void setInitialData(){

        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));
        phones.add(new Phone ("Аватар", "9", R.drawable.avatar, getString(R.string.des) ));
        phones.add(new Phone ("Однажды в… Голливуде", "8", R.drawable.f2, getString(R.string.des2)));
        phones.add(new Phone ("Назад в будущее 2", "9", R.drawable.f3, getString(R.string.des3)));
        phones.add(new Phone ("Что гложет Гилберта Грейпа?", "7", R.drawable.f4, getString(R.string.des4)));

    }
}