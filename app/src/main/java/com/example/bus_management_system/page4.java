package com.example.bus_management_system;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class page4 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_page4);}
    public void Showcontact(View view){
        Intent i=new Intent(this,contact.class);startActivity(i);}
    public void Showterms(View view){
        Intent i=new Intent(this,termsandconditions.class);startActivity(i);}
    public void showimg1(View view){
        Intent i=new Intent(this,contact.class);startActivity(i);}
    public void showimg2(View view){
        Intent i=new Intent(this,termsandconditions.class);startActivity(i);}
}
