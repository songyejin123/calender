package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    public List<String> list;
    public ListView listView;
    public EditText editSearch;
    public SearchAdapter adapter;
    public ArrayList<String> arraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editSearch=(EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<String>();

        settingList();

        arraylist = new ArrayList<String>();
        arraylist.addAll(list);

        adapter=new SearchAdapter(list,this);
        listView.setAdapter(adapter);

        editSearch.addTextChangedListener(new TextWatcher(){
            public void beforeTextChanged(CharSequence charSequence,int i,int i1, int i2){
            }
            @Override
            public void onTextChanged(CharSequence charSequence,int i, int i1, int i2){

            }
            @Override
            public void afterTextChanged(Editable editable){
                String text = editSearch.getText().toString();
                search(text);
            }
        });
    }
    public void search(String charText){
        list.clear();;
        if(charText.length()==0){
            list.addAll(arraylist);
        }else{
            for(int i =0;i<arraylist.size();i++)
            {
                if(arraylist.get(i).toLowerCase().contains(charText))
                {
                    list.add(arraylist.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
    }
    public void settingList(){
        list.add("한화플러스스팩2호 - 2021.07.26~2021.07.27");
        list.add("카카오뱅크(유가) - 2021.07.26~2021.07.27");
        list.add("에이치케이이노엔 - 2021.07.29~2021.07.30");
        list.add("원티드랩 - 2021.08.02~2021.08.03");
        list.add("크래프톤 - 2021.08.02~2021.08.03");
        list.add("엠로 - 2021.08.04~2021.08.05");
        list.add("플래티어 - 2021.08.04~2021.08.05");
        list.add("디앤디플랫폼리츠 - 2021.08.05~2021.08.09");
        list.add("한컴라이프케어(유가) - 2021.08.05~2021.08.06");
        list.add("딥노이드 - 2021.08.05~2021.08.06");
        list.add("에스앤디 - 2021.08.09~2021.08.10");
        list.add("롯데렌탈(유가) - 2021.08.09~2021.08.10");
        list.add("아주스틸(유가) - 2021.08.09~2021.08.10");
        list.add("브레인즈컴퍼니 - 2021.08.09~2021.08.10");
        list.add("에이비온 - 2021.08.11~2021.08.12");
        list.add("일진하이솔루스(유가) - 2021.08.11~2021.08.12");
        list.add("바이젠셀 - 2021.08.12~2021.08.13");
        list.add("IBKS스팩 16호 - 2021.08.23~2021.08.24");
        list.add("asdf");

    }
}
