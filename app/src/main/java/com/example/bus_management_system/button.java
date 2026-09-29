package com.example.bus_management_system;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class button extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_button);}
    public void b1(View view){
        Intent i=new Intent(this,page1.class);startActivity(i); }
    public void b2(View view1){
        Intent in=new Intent(this,page2.class);startActivity(in);}
    public void b3(View view2){
        Intent i=new Intent(this,page3.class);startActivity(i);}
    public void b4(View view3){
        Intent i=new Intent(this,page4.class);startActivity(i);}
}
