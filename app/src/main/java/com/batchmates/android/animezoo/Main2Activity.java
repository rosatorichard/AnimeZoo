package com.batchmates.android.animezoo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private static final String KEY_SELECTION = "SELECTION";
    private ListView lvContacts;
    private static final String[] values = new String[]{"Romance","Action","Comedy","Fantasy","Magic"};
    private static final int[] genre= new int[]{R.drawable.heart,R.drawable.action,R.drawable.comedy,R.drawable.fantasy,R.drawable.magic};
    private List<FirstList> newList;
//    private RecyclerView recyclerView;
//    private RecyclerView.LayoutManager layoutManager;
//    private DefaultItemAnimator itemAnimator;
//    private List<Contact> contactList=new ArrayList<>();
//    private ContactListAdapter contactListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);

        lvContacts=(ListView)findViewById(R.id.lvAllAnime);

        inflateTheThing();

        lvContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("Toast Reached", "onItemClick: "+i);
                switch (i)
                {
                    case 0:
                        goTo(i);
                        Log.d("Switch Success", "onItemClick: "+i);
                        break;

                    case 1:
                        goTo(i);
                        Log.d("Switch Success", "onItemClick: "+i);
                        break;

                    case 2:
                        goTo(i);
                        Log.d("Switch Success", "onItemClick: "+i);
                        break;

                    case 3:
                        goTo(i);
                        Log.d("Switch Success", "onItemClick: "+i);
                        break;

                    case 4:
                        goTo(i);
                        Log.d("Switch Success", "onItemClick: "+i);
                        break;
                }
            }
        });



//        String[] values = new String[]{"Romance","Action","Comedy","Fantasy","Magic"};
//        int[] genre= new int[]{R.drawable.heart,R.drawable.action,R.drawable.comedy,R.drawable.fantasy,R.drawable.magic};

//        List<FirstList> newList;
//        newList=new ArrayList<FirstList>();
//        for (int i = 0; i <genre.length ; i++) {
//
//            FirstList first=new FirstList(values[i],genre[i]);
//            newList.add(first);
//
//        }
//
//        CustomViewAdapter adapter=new CustomViewAdapter(this,R.layout.list_view_buttons,newList);
//        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);
//
//
//        lvContacts.setAdapter(adapter);
    }

    private void goTo(int i) {
        Intent intent= new Intent(this,AnimeSelection.class);
        intent.putExtra(KEY_SELECTION,i);
        startActivity(intent);
    }


    public void inflateTheThing()
    {
        //List<FirstList> newList;
        newList=new ArrayList<FirstList>();
        for (int i = 0; i <genre.length ; i++) {

            FirstList first=new FirstList(values[i],genre[i]);
            newList.add(first);

        }

        CustomViewAdapter adapter=new CustomViewAdapter(this,R.layout.list_view_buttons,newList);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);


        lvContacts.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
