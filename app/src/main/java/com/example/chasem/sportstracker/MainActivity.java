package com.example.chasem.sportstracker;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {













    public final static String COUNTER="com.example.chasem.sportstracker.COUNTER";
    public final static String FIRST_VALUE="com.example.chasem.sportstracker.FIRST_VALUE";
    public final static String FIRST_VALUE1="com.example.chasem.sportstracker.FIRST_VALUE1";
    public final static String FIRST_VALUE2="com.example.chasem.sportstracker.FIRST_VALUE2";
    public final static String FIRST_VALUE3="com.example.chasem.sportstracker.FIRST_VALUE3";
    public final static String FIRST_VALUE4="com.example.chasem.sportstracker.FIRST_VALUE4";
    public final static String FIRST_VALUE5="com.example.chasem.sportstracker.FIRST_VALUE5";
    public final static String FIRST_VALUE6="com.example.chasem.sportstracker.FIRST_VALUE6";
    public final static String FIRST_VALUE7="com.example.chasem.sportstracker.FIRST_VALUE7";
    public final static String FIRST_VALUE8="com.example.chasem.sportstracker.FIRST_VALUE8";
    public final static String SECOND_VALUE="com.example.chasem.sportstracker.SECOND_VALUE";
    public final static String SECOND_VALUE1="com.example.chasem.sportstracker.SECOND_VALUE1";
    public final static String SECOND_VALUE2="com.example.chasem.sportstracker.SECOND_VALUE2";
    public final static String SECOND_VALUE3="com.example.chasem.sportstracker.SECOND_VALUE3";
    public final static String SECOND_VALUE4="com.example.chasem.sportstracker.SECOND_VALUE4";
    public final static String SECOND_VALUE5="com.example.chasem.sportstracker.SECOND_VALUE5";
    public final static String SECOND_VALUE6="com.example.chasem.sportstracker.SECOND_VALUE6";
    public final static String SECOND_VALUE7="com.example.chasem.sportstracker.SECOND_VALUE7";
    public final static String SECOND_VALUE8="com.example.chasem.sportstracker.SECOND_VALUE8";
    public final static String THIRD_VALUE="com.example.chasem.sportstracker.THIRD_VALUE";
    public final static String THIRD_VALUE2="com.example.chasem.sportstracker.THIRD_VALUE2";
    public final static String THIRD_VALUE3="com.example.chasem.sportstracker.THIRD_VALUE3";
    public final static String THIRD_VALUE4="com.example.chasem.sportstracker.THIRD_VALUE4";
    public final static String THIRD_VALUE5="com.example.chasem.sportstracker.THIRD_VALUE5";
    public final static String THIRD_VALUE6="com.example.chasem.sportstracker.THIRD_VALUE6";
    public final static String THIRD_VALUE7="com.example.chasem.sportstracker.THIRD_VALUE7";
    public final static String THIRD_VALUE8="com.example.chasem.sportstracker.THIRD_VALUE8";
    public final static String THIRD_VALUE9="com.example.chasem.sportstracker.THIRD_VALUE9";
    public final static String FOURTH_VALUE="com.example.chasem.sportstracker.FOURTH_VALUE";
    public final static String FOURTH_VALUE1="com.example.chasem.sportstracker.FOURTH_VALUE1";
    public final static String FOURTH_VALUE2="com.example.chasem.sportstracker.FOURTH_VALUE2";
    public final static String FOURTH_VALUE3="com.example.chasem.sportstracker.FOURTH_VALUE3";
    public final static String FOURTH_VALUE4="com.example.chasem.sportstracker.FOURTH_VALUE4";
    public final static String FOURTH_VALUE5="com.example.chasem.sportstracker.FOURTH_VALUE5";
    public final static String FOURTH_VALUE6="com.example.chasem.sportstracker.FOURTH_VALUE6";
    public final static String FOURTH_VALUE7="com.example.chasem.sportstracker.FOURTH_VALUE7";
    public final static String FOURTH_VALUE8="com.example.chasem.sportstracker.FOURTH_VALUE8";
    public final static String FIFTH_VALUE="com.example.chasem.sportstracker.FIFTH_VALUE";
    public final static String FIFTH_VALUE1="com.example.chasem.sportstracker.FIFTH_VALUE1";
    public final static String FIFTH_VALUE2="com.example.chasem.sportstracker.FIFTH_VALUE2";
    public final static String FIFTH_VALUE3="com.example.chasem.sportstracker.FIFTH_VALUE3";
    public final static String FIFTH_VALUE4="com.example.chasem.sportstracker.FIFTH_VALUE4";
    public final static String FIFTH_VALUE5="com.example.chasem.sportstracker.FIFTH_VALUE5";
    public final static String FIFTH_VALUE6="com.example.chasem.sportstracker.FIFTH_VALUE6";
    public final static String FIFTH_VALUE7="com.example.chasem.sportstracker.FIFTH_VALUE7";
    public final static String FIFTH_VALUE8="com.example.chasem.sportstracker.FIFTH_VALUE8";
    public final static String SIX_VALUE="com.example.chasem.sportstracker.SIX_VALUE";
    public final static String SIX_VALUE1="com.example.chasem.sportstracker.SIX_VALUE1";
    public final static String SIX_VALUE2="com.example.chasem.sportstracker.SIX_VALUE2";
    public final static String SIX_VALUE3="com.example.chasem.sportstracker.SIX_VALUE3";
    public final static String SIX_VALUE4="com.example.chasem.sportstracker.SIX_VALUE4";
    public final static String SIX_VALUE5="com.example.chasem.sportstracker.SIX_VALUE5";
    public final static String SIX_VALUE6="com.example.chasem.sportstracker.SIX_VALUE6";
    public final static String SIX_VALUE7="com.example.chasem.sportstracker.SIX_VALUE7";
    public final static String SIX_VALUE8="com.example.chasem.sportstracker.SIX_VALUE8";

Button button1;
    Button weather;
    Button button11;
    CheckBox singleone;
    int counter=0;

    CheckBox tripleeone;
    CheckBox homeruneone;
    CheckBox strikeoutone;
    Button clear;

TextView playerone;
    EditText playerOneName;
    EditText playertwoName;
    EditText playerthreeName;
    EditText playerfourName;
    EditText playerfiveName;
    EditText playersixName;
    EditText playersevenName;
    EditText playereightName;
    EditText playernineName;

    int hits=0;
    int hits1=0;
    int hits2=0;
    int hits3=0;
    int hits4=0;
    int hits5=0;
    int hits6=0;
    int hits7=0;
    int hits8=0;

    int outs1=0;
    int outs2=0;
    int outs3=0;
    int outs4=0;
    int outs5=0;
    int outs6=0;
    int outs7=0;
    int outs8=0;
    int outs=0;

    double battingAverage=0.00;
    double battingAverage1=0.00;
    double battingAverage2=0.00;
    double battingAverage3=0.00;
    double battingAverage4=0.00;
    double battingAverage5=0.00;
    double battingAverage6=0.00;
    double battingAverage7=0.00;
    double battingAverage8=0.00;

    int atBats=0;
    int atBats1=0;
    int atBats2=0;
    int atBats3=0;
    int atBats4=0;
    int atBats5=0;
    int atBats6=0;
    int atBats7=0;
    int atBats8=0;

    int homerun;
    int homerun1;
    int homerun2;
    int homerun3;
    int homerun4;
    int homerun5;
    int homerun6;
    int homerun7;
    int homerun8;

    int strikeout;
    int strikeout1;
    int strikeout2;
    int strikeout3;
    int strikeout4;
    int strikeout5;
    int strikeout6;
    int strikeout7;
    int strikeout8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.save1);
        button11=(Button)findViewById(R.id.button1point) ;

        singleone = (CheckBox)findViewById(R.id.single1);
        tripleeone = (CheckBox)findViewById(R.id.Hit);
        homeruneone = (CheckBox)findViewById(R.id.homerun1);
        strikeoutone = (CheckBox) findViewById(R.id.strikeout1);

        playerOneName=(EditText)findViewById(R.id.Player1name);
        playertwoName=(EditText)findViewById(R.id.player2);
        playerthreeName=(EditText)findViewById(R.id.player3);
        playerfourName=(EditText)findViewById(R.id.player4);
        playerfiveName=(EditText)findViewById(R.id.player5);
        playersixName=(EditText)findViewById(R.id.player6);
        playersevenName=(EditText)findViewById(R.id.player7);
        playereightName=(EditText)findViewById(R.id.player8);
        playernineName=(EditText)findViewById(R.id.player9);



        final Intent intent = new Intent(MainActivity.this, TeamStats.class);
        final Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
        clear= (Button)findViewById(R.id.clear_stats);

        clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                hits=0;
                outs=0;
                battingAverage=0.00;
                atBats=0;
                homerun=0;
                strikeout=0;
            }
        });










        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat precision = new DecimalFormat("0.000");
                battingAverage = (float)hits/(float)atBats;
                battingAverage1 = (float)hits1/(float)atBats1;
                battingAverage2 = (float)hits2/(float)atBats2;
                battingAverage3 = (float)hits3/(float)atBats3;
                battingAverage4 = (float)hits4/(float)atBats4;
                battingAverage5 = (float)hits5/(float)atBats5;
                battingAverage6 = (float)hits6/(float)atBats6;
                battingAverage7 = (float)hits7/(float)atBats7;
                battingAverage8 = (float)hits8/(float)atBats8;
                String text = playerOneName.getText().toString();
                String text1 = playertwoName.getText().toString();
                String text2 = playerthreeName.getText().toString();
                String text3 = playerfourName.getText().toString();
                String text4 = playerfiveName.getText().toString();
                String text5 = playersixName.getText().toString();
                String text6 = playersevenName.getText().toString();
                String text7 = playereightName.getText().toString();
                String text8 = playernineName.getText().toString();
                intent.putExtra(COUNTER,String.valueOf(counter));
                intent.putExtra(FIRST_VALUE,text);
                intent.putExtra(FIRST_VALUE1,text1);
                intent.putExtra(FIRST_VALUE2,text2);
                intent.putExtra(FIRST_VALUE3,text3);
                intent.putExtra(FIRST_VALUE4,text4);
                intent.putExtra(FIRST_VALUE5,text5);
                intent.putExtra(FIRST_VALUE6,text6);
                intent.putExtra(FIRST_VALUE7,text7);
                intent.putExtra(FIRST_VALUE8,text8);
                intent.putExtra(SECOND_VALUE,String.valueOf(precision.format(battingAverage)));
                intent.putExtra(SECOND_VALUE1,String.valueOf(precision.format(battingAverage1)));
                intent.putExtra(SECOND_VALUE2,String.valueOf(precision.format(battingAverage2)));
                intent.putExtra(SECOND_VALUE3,String.valueOf(precision.format(battingAverage3)));
                intent.putExtra(SECOND_VALUE4,String.valueOf(precision.format(battingAverage4)));
                intent.putExtra(SECOND_VALUE5,String.valueOf(precision.format(battingAverage5)));
                intent.putExtra(SECOND_VALUE6,String.valueOf(precision.format(battingAverage6)));
                intent.putExtra(SECOND_VALUE7,String.valueOf(precision.format(battingAverage7)));
                intent.putExtra(SECOND_VALUE8,String.valueOf(precision.format(battingAverage8)));
                intent.putExtra(THIRD_VALUE,String.valueOf(atBats));
                intent.putExtra(THIRD_VALUE2,String.valueOf(atBats1));
                intent.putExtra(THIRD_VALUE3,String.valueOf(atBats2));
                intent.putExtra(THIRD_VALUE4,String.valueOf(atBats3));
                intent.putExtra(THIRD_VALUE5,String.valueOf(atBats4));
                intent.putExtra(THIRD_VALUE6,String.valueOf(atBats5));
                intent.putExtra(THIRD_VALUE7,String.valueOf(atBats6));
                intent.putExtra(THIRD_VALUE8,String.valueOf(atBats7));
                intent.putExtra(THIRD_VALUE9,String.valueOf(atBats8));
                intent.putExtra(FOURTH_VALUE,String.valueOf(hits));
                intent.putExtra(FOURTH_VALUE1,String.valueOf(hits1));
                intent.putExtra(FOURTH_VALUE2,String.valueOf(hits2));
                intent.putExtra(FOURTH_VALUE3,String.valueOf(hits3));
                intent.putExtra(FOURTH_VALUE4,String.valueOf(hits4));
                intent.putExtra(FOURTH_VALUE5,String.valueOf(hits5));
                intent.putExtra(FOURTH_VALUE6,String.valueOf(hits6));
                intent.putExtra(FOURTH_VALUE7,String.valueOf(hits7));
                intent.putExtra(FOURTH_VALUE8,String.valueOf(hits8));
                intent.putExtra(FIFTH_VALUE,String.valueOf(homerun));
                intent.putExtra(FIFTH_VALUE1,String.valueOf(homerun1));
                intent.putExtra(FIFTH_VALUE2,String.valueOf(homerun2));
                intent.putExtra(FIFTH_VALUE3,String.valueOf(homerun3));
                intent.putExtra(FIFTH_VALUE4,String.valueOf(homerun4));
                intent.putExtra(FIFTH_VALUE5,String.valueOf(homerun5));
                intent.putExtra(FIFTH_VALUE6,String.valueOf(homerun6));
                intent.putExtra(FIFTH_VALUE7,String.valueOf(homerun7));
                intent.putExtra(FIFTH_VALUE8,String.valueOf(homerun8));
                intent.putExtra(SIX_VALUE,String.valueOf(strikeout));
                intent.putExtra(SIX_VALUE1,String.valueOf(strikeout1));
                intent.putExtra(SIX_VALUE2,String.valueOf(strikeout2));
                intent.putExtra(SIX_VALUE3,String.valueOf(strikeout3));
                intent.putExtra(SIX_VALUE4,String.valueOf(strikeout4));
                intent.putExtra(SIX_VALUE5,String.valueOf(strikeout5));
                intent.putExtra(SIX_VALUE6,String.valueOf(strikeout6));
                intent.putExtra(SIX_VALUE7,String.valueOf(strikeout7));
                intent.putExtra(SIX_VALUE8,String.valueOf(strikeout8));


                startActivity(intent);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hits=0;
                hits1=0;
                hits2=0;
                 hits3=0;
                hits4=0;
                hits5=0;
                 hits6=0;
                hits7=0;
                 hits8=0;

                 outs1=0;
                outs2=0;
                 outs3=0;
                 outs4=0;
                 outs5=0;
                outs6=0;
                outs7=0;
                outs8=0;
                 outs=0;

                 battingAverage=0.00;
                 battingAverage1=0.00;
                 battingAverage2=0.00;
                 battingAverage3=0.00;
                 battingAverage4=0.00;
                 battingAverage5=0.00;
                 battingAverage6=0.00;
                 battingAverage7=0.00;
                 battingAverage8=0.00;

                 atBats=0;
                 atBats1=0;
                 atBats2=0;
                 atBats3=0;
                 atBats4=0;
                 atBats5=0;
                 atBats6=0;
                 atBats7=0;
                 atBats8=0;

                 homerun=0;
                 homerun1=0;
                 homerun2=0;
                 homerun3=0;
                 homerun4=0;
                 homerun5=0;
                 homerun6=0;
                 homerun7=0;
                 homerun8=0;

                 strikeout=0;
                 strikeout1=0;
                 strikeout2=0;
                 strikeout3=0;
                 strikeout4=0;
                 strikeout5=0;
                 strikeout6=0;
                 strikeout7=0;
                 strikeout8=0;
                counter=1;

            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                counter++;
                if(counter==10)
                    counter=1;

                if(counter==1) {
                    if (singleone.isChecked()) {
                        outs++;
                        atBats++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits++;
                        atBats++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits++;
                        atBats++;
                        homerun++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs++;
                        atBats++;
                        strikeout++;

                        strikeoutone.toggle();
                    }
                    if (counter > 9)
                        counter = 0;
                }
               else if(counter==2) {
                    if (singleone.isChecked()) {
                        outs1++;
                        atBats1++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits1++;
                        atBats1++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits1++;
                        atBats1++;
                        homerun1++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs1++;
                        atBats1++;
                        strikeout1++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==3) {
                    if (singleone.isChecked()) {
                        outs2++;
                        atBats2++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits2++;
                        atBats2++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits2++;
                        atBats2++;
                        homerun2++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs2++;
                        atBats2++;
                        strikeout2++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==4) {
                    if (singleone.isChecked()) {
                        outs3++;
                        atBats3++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits3++;
                        atBats3++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits3++;
                        atBats3++;
                        homerun3++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs3++;
                        atBats3++;
                        strikeout3++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==5) {
                    if (singleone.isChecked()) {
                        outs4++;
                        atBats4++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits4++;
                        atBats4++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits4++;
                        atBats4++;
                        homerun4++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs4++;
                        atBats4++;
                        strikeout4++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==6) {
                    if (singleone.isChecked()) {
                        outs5++;
                        atBats5++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits5++;
                        atBats5++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits5++;
                        atBats5++;
                        homerun5++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs5++;
                        atBats5++;
                        strikeout5++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==7) {
                    if (singleone.isChecked()) {
                        outs6++;
                        atBats6++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits6++;
                        atBats6++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits6++;
                        atBats6++;
                        homerun6++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs6++;
                        atBats6++;
                        strikeout6++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==8) {
                    if (singleone.isChecked()) {
                        outs7++;
                        atBats7++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits7++;
                        atBats7++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits7++;
                        atBats7++;
                        homerun7++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs7++;
                        atBats7++;
                        strikeout7++;

                        strikeoutone.toggle();
                    }

                }
                else if(counter==9) {
                    if (singleone.isChecked()) {
                        outs8++;
                        atBats8++;

                        singleone.toggle();

                    }

                    if (tripleeone.isChecked()) {
                        hits8++;
                        atBats8++;

                        tripleeone.toggle();
                    }
                    if (homeruneone.isChecked()) {
                        hits8++;
                        atBats8++;
                        homerun8++;

                        homeruneone.toggle();
                    }
                    if (strikeoutone.isChecked()) {
                        outs8++;
                        atBats8++;
                        strikeout8++;

                        strikeoutone.toggle();
                    }


                }










            }
        });


        ListView listView2;

        listView2 = (ListView) findViewById(R.id.listView);
        String[] values = new String[]
                { "Find The weather at your BallPark",

                };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(intent0);
                        break;



                }
            }
        });


    }



}
