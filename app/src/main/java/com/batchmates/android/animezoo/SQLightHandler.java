package com.batchmates.android.animezoo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Android on 6/27/2017.
 */

public class SQLightHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "anime_database";
    private static final String TABLE_NAME = "anime_table";
    private static final String ANIME_NAME = "anime_name";
    private static final String ANIME_PICTURE = "anime_picture";
    private static final String ANIME_GENRE = "anime_genre";
    private static final String ANIME_DISCRIPTION = "anime_discription";
    private static final String ANIME_SOUND = "anime_sound";
    private static final String TAG = "Anime_Repository";

    public SQLightHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_TABLE ="CREATE TABLE "+TABLE_NAME + "(" +
                ANIME_NAME + " TEXT," +
                ANIME_PICTURE + " INTEGER," +
                ANIME_GENRE + " TEXT," +
                ANIME_DISCRIPTION + " TEXT," +
                ANIME_SOUND+ " INTEGER" +")";

        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


        sqLiteDatabase.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);

        onCreate(sqLiteDatabase);

    }

    public void saveAnime(Anime anime)
    {
        SQLiteDatabase database =getWritableDatabase();

        ContentValues content =new ContentValues();

        content.put(ANIME_NAME,anime.getAnimeName());
        content.put(ANIME_PICTURE,anime.getAnimePicture());
        content.put(ANIME_GENRE,anime.getAnimeGenre());
        content.put(ANIME_DISCRIPTION,anime.getAnimeDiscription());
        content.put(ANIME_SOUND,anime.getSound());

        database.insert(TABLE_NAME,null,content);
        database.close();
        Log.d(TAG, "saveAnime: Anime saved" +content.get(ANIME_NAME));

    }

    public Anime getAnime(String anime)
    {

//        String query="Select * From "+TABLE_NAME;
        String query="Select * From "+TABLE_NAME+ " WHERE "+ANIME_NAME +"= '"+anime +"'";
        SQLiteDatabase database =getWritableDatabase();


        Cursor cursor=database.rawQuery(query,null);

        cursor.moveToFirst();
//        Log.d(TAG, "getAnime: "+cursor.getString(0));
//        Log.d(TAG, "getAnime: "+cursor.getInt(1));
//        Log.d(TAG, "getAnime: "+cursor.getString(2));
//        Log.d(TAG, "getAnime: "+cursor.getString(3));
//        Log.d(TAG, "getAnime: "+cursor.getInt(4));
        Anime theAnime=new Anime(cursor.getString(0),cursor.getInt(1),cursor.getString(2),cursor.getString(3),cursor.getInt(4));
        return theAnime;
    }


    public boolean haveData()
    {
        SQLiteDatabase database=getWritableDatabase();
        if(database.getMaximumSize()!=0)
        {
            return true;
        }
        return false;
    }


}
