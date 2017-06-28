package com.batchmates.android.animezoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AnimeSelection extends AppCompatActivity {

    private static final String TAG = "The Derp";
    List<Anime> thisList=new ArrayList<>();
    private static final String PASSED = "PASS_THIS";
    private static final String KEY_SELECTION = "SELECTION";
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.ItemAnimator itemAnimator;
    private ListAdapter listAdapter;
    RecyclerView listView;
    String animeName;
    String[] animeRomance={"Toradora" , "Kaichou wa Maidsama" , "Hataraku Maousama" , "Sakurasou no Pet na Kanojo", "Gekkan Shoujo Nozakikun"};
    String[] animeAction={"Mahouka Koukou no Rettousei", "Higashi no Eden", "Sankarea" , "Ore Monogatari" , "Ore no Nounai Sentakushi ga Gakuen Love Comedy wo Zenryoku de Jama Shiteiru"};
    String[] animeComedy={"Mayo Chiki", "Baka to Test to Shoukanjuu", "Toki wo Kakeru Shoujo" , "Accel World", "Tonari no Kaibutsukun"};
    String[] animeFantasy={"Zero no Tsukaima" , "Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka", "Bakemonogatari", "Sword Art Online","Elfen Lied"};
    String[] animeMagic={"Clannad", "Shigatsu wa Kimi no Uso", "Chuunibyou demo Koi ga Shitai", "Fate stay night","Kimi no Na wa"};
    String[] currentList;
    String animeGenre;
    byte[] image;
    String discription;
    byte[] sound;
    Anime anime;
    private int whichList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_selection);

        Intent intent=getIntent();
        whichList=intent.getIntExtra(KEY_SELECTION,0);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);

        SQLightHandler data =new SQLightHandler(this);




        animeName="Murder";
        switch(whichList)
        {
            case 0:
                currentList=animeRomance;
                anime=data.getAnime("Toradora");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Kaichou wa Maidsama");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Hataraku Maousama");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Sakurasou no Pet na Kanojo");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Gekkan Shoujo Nozakikun");
                //animeName="I Hate This";
                thisList.add(anime);
                break;
            case 1:

                anime=data.getAnime("Mahouka Koukou no Rettousei");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Higashi no Eden");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Sankarea");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Ore Monogatari");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Ore no Nounai Sentakushi ga Gakuen Love Comedy wo Zenryoku de Jama Shiteiru");
                //animeName="I Hate This";
                thisList.add(anime);
                currentList=animeAction;
                break;
            case 2:

                anime=data.getAnime("Mayo Chiki");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Baka to Test to Shoukanjuu");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Toki wo Kakeru Shoujo");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Accel World");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Tonari no Kaibutsukun");
                //animeName="I Hate This";
                thisList.add(anime);
                currentList=animeComedy;
                break;
            case 3:

                anime=data.getAnime("Zero no Tsukaima");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Bakemonogatari");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Sword Art Online");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Elfen Lied");
                //animeName="I Hate This";
                thisList.add(anime);
                currentList=animeFantasy;
                break;
            case 4:

                anime=data.getAnime("Clannad");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Shigatsu wa Kimi no Uso");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Chuunibyou demo Koi ga Shitai");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Fate stay night");
                //animeName="I Hate This";
                thisList.add(anime);

                anime=data.getAnime("Kimi no Na wa");
                //animeName="I Hate This";
                thisList.add(anime);
                currentList=animeMagic;
                break;
        }

//        animeName="Toradora";
//        for (int i = 0; i <5 ; i++)
//        {
//            //animeName=String.valueOf(currentList[i]);
//            //animeName="Toradora";
//            Log.d(TAG, "onCreate: "+currentList[i]);
//            anime=data.getAnime(animeName);
//            //animeName="I Hate This";
//            thisList.add(anime);
//        }
        listView=(RecyclerView)findViewById(R.id.rcContacts);

        layoutManager= new LinearLayoutManager(this);

        itemAnimator=new DefaultItemAnimator();
        //anime.add(new Anime(animeName,image,animeGenre,discription,sound));
        listAdapter=new ListAdapter(thisList);
        listView.setLayoutManager(layoutManager);
        listView.setItemAnimator(itemAnimator);
        listView.setAdapter(listAdapter);


        //Retarded on click listener that works



//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView text= view.findViewById(R.id.tvtNameAnime);
//                startClass(text);
//            }
//        });
//        listView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
//            @Override
//            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//
//                View Child=rv.findChildViewUnder(e.getX(),e.getY());
//
//                if(Child != null) {
//                    TextView text=Child.findViewById(R.id.tvtNameAnime);
//                    startClass(text);
//                    Log.d(TAG, "onInterceptTouchEvent: "+text.getText());
//                }
//                return false;
//            }
//
//            @Override
//            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
//
//            }
//
//            @Override
//            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//            }
//        });


    }

    public void startClass(TextView textView)
    {
        Intent intent1=new Intent(this,SelectedAnime.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent1.putExtra(PASSED,String.valueOf(textView.getText()));
        startActivity(intent1);
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
