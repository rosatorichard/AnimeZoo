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
        anime=new Anime("Toradora",R.drawable.toradora,"Romance","Despite Ryuji Takasu's gentle personality, his eyes make him look like an intimidating delinquent. Class rearrangements on his second high school year put him together with his best friend, Yusaku Kitamura, and his hidden crush, Minori Kushieda. Along with these two comes Kushieda's best friend, Taiga Aisaka. Her delicate appearance contrasts with her brutal personality. Secretly in love with Kitamura, Taiga agrees to help Ryuji with his love interest as long as he helps her get closer to hers.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Kaichou wa Maidsama",R.drawable.maidsama,"Romance","Misaki Ayuzawa is the first female student council president at a once all-boys school turned co-ed. She rules the school with strict discipline demeanor. But she has a secret—she works at a maid cafe due to her families circumstances. One day the popular A-student and notorious heart breaker Takumi Usui finds out her secret and makes a deal with her to keep it hush from the school in exchange for spending some time with him.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Hataraku Maousama",R.drawable.devil_parttimer,"Romance","In another dimension the Devil King Sadao is only one step away from conquering the world when he is beaten by Hero Emilia and forced to drift to the other world: modern-day Tokyo. As \"conquering the world\" are the only skills the Devil King possesses - and are obviously unnecessary in his new situation - he must work as a freeter to pay for his living expenses.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Sakurasou no Pet na Kanojo",R.drawable.pet,"Romance","Sorata is kicked out of his high-school dorms for keeping a cat, and moves into a small dorm called Sakurasō. It turns out that all the residents, in addition to being uncontrollable and weird, are outstanding in some way: a well-known animator, a scriptwriter, a programmer. Mashiro moves in who is an internationally known painter but is so devoted to art that she can't even dress herself, and Sorata is given the job of looking after her. Learns who he is and what he wants to do.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Gekkan Shoujo Nozakikun",R.drawable.monthly_girls,"Romance","Chiyo Sakura confesses her feelings to her schoolmate Nozaki. Due to a misunderstanding, Nozaki thinks Chiyo is just a fan. She then discovers Nozaki's other identity; a shōjo manga artist. As she gets closer to Nozaki, she befriends Nozaki's quirky acquaintances who assist him and serve as inspirations for his manga." , R.raw.beep1);
        handler.saveAnime(anime);


        anime=new Anime("Mahouka Koukou no Rettousei",R.drawable.irefular,"Action","In a world where magic is not a fairy tale but has existed for one hundred years siblings Tatsuya and Miyuki Shiba prepare to begin their studies at the elite Private Magic University Affiliated High School (Magic High School for short). Entering on different levels of the academic spectrum the two turn the once peaceful campus into a chaotic one.",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Higashi no Eden",R.drawable.eden,"Action","On November 22, 2010 missiles strike Japan. However later to be called as Careless Monday, does not result in any victims and is soon forgotten .3 months later Saki Morimi a woman currently in the United States for her graduation trip gets into trouble and only the unexpected intervention of a fellow countrymen saves her. This man is a complete mystery. He appears to have lost his memory. and he is stark naked except for a gun, and a mobile phone that's charged with 8,200,000,000 yen in digital cash.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime( "Sankarea",R.drawable.zombie,"Action","Chihiro Furuya, who loves zombies above all else, meets the sweet girl Rea Sanka by chance, and he ropes her into \"resurrecting\" his dead cat. But then Rea claims she actually has become a zombie, and asks him to take responsibility for it.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Ore Monogatari",R.drawable.loveanime,"Action","Gōda Takeo is a first year in high school who’s unlucky in love. All the girls he likes fall for his best friend Suna (your standard bishie), until one day when he saves a girl from a groper on the train.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Ore no Nounai Sentakushi ga Gakuen Love Comedy wo Zenryoku de Jama Shiteiru",R.drawable.life_choices,"Action","The story centers around Kanade Amakusa, a boy cursed with the mental power of \"absolute multiple-choice\" — a multiple-choice quiz will suddenly appear in his mind, and the choice he makes will become his reality. ", R.raw.beep1);
        handler.saveAnime(anime);


        anime=new Anime("Mayo Chiki",R.drawable.mayo_chiki,"Comedy","The story revolves around Kinjirō Sakamachi, a 17-year-old high school boy who suffers from gynophobia. The gynophobia sickness makes his nose bleed every time he has physical contact with a female. While using the bathroom he accidentally discovers that the popular and handsome butler Subaru Konoe is in fact a girl. Now that Kinjirō knows about Subaru's secret, he must work together with Subaru and her sadistic mistress, Kanade, to protect Subaru’s secret from being discovered.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Baka to Test to Shoukanjuu",R.drawable.baka_test,"Comedy","Advanced placement into a school of higher grade proof-reading is determined by the results of the Promotion Test strictly for class type. Ranging from A class with the best facilities anyone can offer all the way down to F Class which is composed of low dining tables and other worn out facilities. Students can change classes by competing using the Examination Summons Battle system. Students summon characters with their equivalent test mark scores and use them to compete with other classes.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Toki wo Kakeru Shoujo",R.drawable.lept,"Comedy","When 17-year-old Makoto Konno gains the ability to, quite literally, \"leap\" backwards through time, she immediately sets about improving her grades and preventing personal mishaps. However, she soon realises that changing the past isn't as simple as it seems, and eventually, will have to rely on her new powers to shape the future of herself and her friends.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Accel World",R.drawable.accel,"Comedy","In 2046, people can access a virtual network known as the Neurolinker via their cellphone terminals. A perpetual victim of bullying, middle school student Haruyuki spends his time absorbed in games in a corner of his local network. One day he is approached by the most famous girl in his school, Kuroyukihime (Black Snow Princess). She gives him a strange program called Brain Burst that has the power to \"accelerate the world.\"", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Tonari no Kaibutsukun",R.drawable.monster,"Comedy","Shizuku Mizutani has learned to deal with life's disappointments by repressing her emotions and trusting no one but herself. Haru Yoshida throws himself at life with every ounce of emotional power he has. He has seriously hurt several students and now everyone is afraid of him. Shizuku sees no point in engaging the world around her and Haru doesn't know how to engage the world around him. All that changes when the two first meet and find themselves almost immediately attracted to each other.",R.raw.beep1);
        handler.saveAnime(anime);



        anime=new Anime("Zero no Tsukaima",R.drawable.zero,"Fantasy","Meet Louise, a budding magician. The students at the Tristein Academy call her \"Zero Louise\", due to her current record of zero successes with magic. In fact, her magic tends to go wrong. Now, as an important test of her aptitude for magic, she must summon a familiar to be a servant. At this moment, she summons up her magic and wishes for a familiar that is \"devoted, beautiful and powerful\", and gets Hiraga Saito, an ordinary Japanese boy. It's difficult to say who is more surprised but the rules don't allow for second attempts.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka",R.drawable.dungeon,"Fantasy","As an adventurer living in Orario, Bell Cranel becomes the only member of Hestia Familia. Although he was very weak compared to veteran dungeon crawlers, he gained a special skill that enables him to become stronger quickly as long as his feelings towards Aiz, the Sword Princess whom he looks up to, does not change. With the help of his Goddess and others , he vows to be strong enough to stand with Aiz and protect everyone important to him.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Bakemonogatari",R.drawable.monogatari,"Fantasy","Although there are still traces of the brief period he became a vampire, third-year high school student Koyomi Araragi is human again. He happens upon others with their own supernatural problems and finds that he can empathize. Koyomi becomes involved in their lives, seeking to help them and occasionally asking for advice from Meme Oshino, the homeless man who helped him become human again.",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Sword Art Online",R.drawable.sword_art,"Fantasy","The players of a virtual reality MMORPG, Sword Art Online, are trapped and fighting for their very lives. After it is announced that the only way to leave the game is by beating it, Kirito—a very powerful swordsman—and his friends take on a quest to free all the minds trapped in Aincrad.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Elfen Lied",R.drawable.lied,"Fantasy","The Diclonius possesses two horns in their heads, and has a \"sixth sense\" which gives it telekinetic abilities. They have been captured and isolated in laboratories by the government. Lucy, a psychotic Diclonius, manages to break free of her confines and brutally murders the guards in the lab, only to get shot in the head as she makes her escape. She survives and drifts along to a beach, where two discovers her. Having lost her memories, she was named after the only thing that she can now say, \"Nyuu,\" and the two allow her to stay at Kouta's home.",R.raw.beep1);
        handler.saveAnime(anime);



        anime=new Anime("Clannad",R.drawable.clanned,"Magic","Tomoya Okazaki is a high school student resentful of his life. His mother passed away from a car accident when he was younger, causing his father to resort to alcohol and gambling. This results in fights between the two until Tomoya is injured in a fight. Since then, Tomoya has had distant relationships with his father, causing him to become a delinquent. While on a walk to school, he meets a strange girl who is a year older but is repeating due to illness. Due to this, she is often alone. The two begin hanging out and slowly Tomoya finds his life shifting.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Shigatsu wa Kimi no Uso",R.drawable.lie_in_april,"Magic","Kōsei Arima was a piano prodigy until his mother died when he was eleven years old. The shock of losing her made him lose any interest in piano, and his life has felt monotonous ever since. Then, when he's fourteen, his childhood friend Tsubaki introduces him to her classmate Kaori, a free-spirited violinist. Her enthusiasm reignites his interest in music and in life.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Chuunibyou demo Koi ga Shitai",R.drawable.chuujpg,"Magic","High school freshman Yūta Togashi was once a \"chūnibyō patient\" i.e. an overly self-conscious middle schooler. He wants to bury this embarrassing past and begins a new life in high school—unsuccessfully. His classmate Rikka Takanashi, a \"current\" chūnibyō patient, has found traces of residual symptoms on him and used the fact to force Togashi \"making a contract\" with her.",R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Fate stay night",R.drawable.fate,"Magic","Shirou Emiya lost his parents in a fire when he was young and was later adopted by a sorceror by the name of Kiritsugu Emiya. Although he was full of admiration for his adopted father and yearns to become an ally of justice, Shirou has limited powers and was unable to become strong. That is until one fateful day, he was drawn into the Holy Grail War and had to summon a female \"Servant\" known as Saber in order to protect himself. The story revolves around Shirou and his entanglement in the Holy Grail War.", R.raw.beep1);
        handler.saveAnime(anime);
        anime=new Anime("Kimi no Na wa",R.drawable.here_we_are,"Magic","Mitsuha Miyamizu is a high school student in the rural countryside of Japan. Taki Tachibana is a teenager living in Tokyo. As a comet approaches Earth, their dreams and lives start getting entangled. One day Mitsuha wakes up as Taki. Taki one day wakes up as Mitsuha. For a few days they sporadically switch bodies until one afternoon they lose complete contact.", R.raw.beep1);
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
