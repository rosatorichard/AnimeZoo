package com.batchmates.android.animezoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String[] animeName={"Toradora" , "Kaichou wa Maid-sama" , "Hataraku Maousama" , "Sakurasou no Pet na Kanojo", "Gekkan Shoujo Nozakikun"
    ,"Mahouka Koukou no Rettousei", "Higashi no Eden", "Sankarea" , "Ore Monogatari!!" , "Ore no Nounai Sentakushi ga, Gakuen Love Comedy wo Zenryoku de Jama Shiteiru"
    ,"Mayo Chiki!", "Baka to Test to Shoukanjuu", "Toki wo Kakeru Shoujo" , "Accel World", "Tonari no Kaibutsukun"
    ,"Zero no Tsukaima" , "Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka", "Bakemonogatari", "Sword Art Online","Elfen Lied",
            "Clannad", "Shigatsu wa Kimi no Uso", "Chuunibyou demo Koi ga Shitai", "Fate stay night","Kimi no Na wa"};
    private String[] animeGenre={"Romance","Romance","Romance","Romance","Romance",
    "Action","Action","Action","Action","Action",
    "Comedy","Comedy","Comedy","Comedy","Comedy",
    "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
    "Magic","Magic","Magic","Magic","Magic"};
    private String[] animeDiscription={"HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP",
            "HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP",
            "HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP",
            "HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP",
            "HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP","HEEEEEEERP DEEEEEEERP"};
    private int[] picture={R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,
            R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,
            R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,
            R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,R.drawable.action,};
    private int[] sound={R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,
            R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,
            R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,
            R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,
            R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1,R.raw.beep1};
    private Anime anime;

    private String[] allAnimeNames;
    private String[] allAnimeGenre;
    private String[] allAnimeDiscription;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);


//       makeDatabase();
        SQLightHandler handler=new SQLightHandler(this);
        anime=new Anime("Toradora",R.drawable.heart,"Romance","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Kaichou wa Maidsama",R.drawable.heart,"Romance","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Hataraku Maousama",R.drawable.heart,"Romance","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Sakurasou no Pet na Kanojo",R.drawable.heart,"Romance","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Gekkan Shoujo Nozakikun",R.drawable.heart,"Romance","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);


        anime=new Anime("Mahouka Koukou no Rettousei",R.drawable.action,"Action","KILL THEM ALL",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Higashi no Eden",R.drawable.action,"Action","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime( "Sankarea",R.drawable.action,"Action","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Ore Monogatari",R.drawable.action,"Action","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Ore no Nounai Sentakushi ga Gakuen Love Comedy wo Zenryoku de Jama Shiteiru",R.drawable.action,"Action","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);


        anime=new Anime("Mayo Chiki",R.drawable.comedy,"Comedy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Baka to Test to Shoukanjuu",R.drawable.comedy,"Comedy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Toki wo Kakeru Shoujo",R.drawable.comedy,"Comedy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Accel World",R.drawable.comedy,"Comedy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Tonari no Kaibutsukun",R.drawable.comedy,"Comedy","KILL THEM ALL",R.raw.beep1);
        handler.saveAnime(anime);



        anime=new Anime("Zero no Tsukaima",R.drawable.fantasy,"Fantasy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka",R.drawable.fantasy,"Fantasy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Bakemonogatari",R.drawable.fantasy,"Fantasy","KILL THEM ALL",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Sword Art Online",R.drawable.fantasy,"Fantasy","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Elfen Lied",R.drawable.fantasy,"Fantasy","KILL THEM ALL",R.raw.beep1);
        handler.saveAnime(anime);



        anime=new Anime("Clannad",R.drawable.magic,"Magic","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Shigatsu wa Kimi no Uso",R.drawable.magic,"Magic","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Chuunibyou demo Koi ga Shitai",R.drawable.magic,"Magic","KILL THEM ALL",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Fate stay night",R.drawable.magic,"Magic","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Kimi no Na wa",R.drawable.magic,"Magic","KILL THEM ALL", R.raw.beep1);
        handler.saveAnime(anime);
    }

    public void toList(View view) {

        Intent intent= new Intent(this,Main2Activity.class);
        startActivity(intent);
    }


    public void makeDatabase()
    {

        Log.d("BOOM", "makeDatabase: "+"I made it");
        SQLightHandler handler=new SQLightHandler(this);

        if(handler.haveData()==false)
        {

            for (int i = 0; i <1 ; i++)
            {
                Log.d("This", "makeDatabase: "+animeName[i]);
                anime=new Anime(animeName[i],picture[i],animeGenre[i],animeDiscription[i], sound[i]);
                handler.saveAnime(anime);
            }
        }
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
