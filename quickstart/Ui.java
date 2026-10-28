package com.example.quickstart;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

final class Ui {
    static final int PURPLE = Color.rgb(91,75,219), DARK = Color.rgb(32,32,51), GREY = Color.rgb(119,119,138), BG = Color.rgb(246,247,251);
    private Ui() {}
    static LinearLayout page(Activity a, String title, String subtitle) {
        ScrollView scroll = new ScrollView(a); scroll.setFillViewport(true);
        LinearLayout root = new LinearLayout(a); root.setOrientation(LinearLayout.VERTICAL); root.setPadding(dp(a,24),dp(a,28),dp(a,24),dp(a,24)); root.setBackgroundColor(BG);
        TextView heading = text(a,title,28,true,DARK); root.addView(heading, new LinearLayout.LayoutParams(-1,-2));
        TextView sub = text(a,subtitle,15,false,GREY); LinearLayout.LayoutParams sp = new LinearLayout.LayoutParams(-1,-2); sp.topMargin=dp(a,6); sp.bottomMargin=dp(a,24); root.addView(sub,sp);
        scroll.addView(root); a.setContentView(scroll); return root;
    }
    static TextView text(Context c,String value,int size,boolean bold,int color){ TextView t=new TextView(c); t.setText(value); t.setTextSize(size); t.setTextColor(color); if(bold)t.setTypeface(Typeface.DEFAULT,Typeface.BOLD); t.setGravity(Gravity.CENTER_VERTICAL); return t; }
    static EditText input(Activity a,String hint,int type){ EditText e=new EditText(a); e.setSingleLine(true); e.setHint(hint); e.setInputType(type); e.setTextSize(16); e.setPadding(dp(a,14),dp(a,8),dp(a,14),dp(a,8)); e.setBackground(round(Color.WHITE,dp(a,12),Color.rgb(224,224,236))); LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,dp(a,54)); p.bottomMargin=dp(a,12); e.setLayoutParams(p); return e; }
    static Button button(Activity a,String label,Runnable action){ Button b=new Button(a); b.setText(label); b.setAllCaps(false); b.setTextSize(16); b.setTextColor(Color.WHITE); b.setBackground(round(PURPLE,dp(a,12),PURPLE)); LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,dp(a,52)); p.topMargin=dp(a,8); p.bottomMargin=dp(a,8); b.setLayoutParams(p); b.setOnClickListener(v->action.run()); return b; }
    static TextView link(Activity a,String label,Runnable action){ TextView t=text(a,label,15,true,PURPLE); t.setGravity(Gravity.CENTER); t.setPadding(8,dp(a,14),8,dp(a,14)); t.setOnClickListener(v->action.run()); return t; }
    static GradientDrawable round(int color,int radius,int stroke){ GradientDrawable d=new GradientDrawable(); d.setColor(color); d.setCornerRadius(radius); d.setStroke(1,stroke); return d; }
    static int dp(Context c,int v){return (int)(v*c.getResources().getDisplayMetrics().density+0.5f);}
    static void toast(Context c,String msg){Toast.makeText(c,msg,Toast.LENGTH_SHORT).show();}
    static String value(EditText e){return e.getText().toString().trim();}
    static void addGap(LinearLayout l,Activity a,int h){ View v=new View(a); l.addView(v,new LinearLayout.LayoutParams(1,dp(a,h))); }
}
