package br.unip.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
        EditText EditTextNome;
        EditText EditTextIdade;
        Switch SwitchSexo;
        Button BotaoSalvar;
        ListView Listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}