package com.example.bus_management_system;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
public class page1 extends AppCompatActivity{
    private Spinner obs1,obs2;
    private TextView obtv;
    private String ob1,ob2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        obs1=findViewById(R.id.s1);
        obs2=findViewById(R.id.s2);
        obtv=findViewById(R.id.tvro);
        //Spinner1
        ArrayList <String> flist=new ArrayList<>();
        flist.add("Select bus stop");flist.add("Ahmedabad Domestic Airport");
        flist.add("Bhadaj Circle");flist.add("Chhipa Society");flist.add("CTM Cross Road");
        flist.add("DCIS Circle");flist.add("Ghuma Gam");
        flist.add("Gota Vasant Nagar Township");flist.add("Hanspura Ring Road");
        flist.add("Iskcon Cross Road");flist.add("Jaimangal");
        flist.add("Kashiram Textiles");flist.add("LD Engg Collage");
        flist.add("Maninagar");flist.add("Naroda Gam");
        flist.add("Naroda S.T. Workshop");flist.add("Narol");flist.add("Nehrunagar");
        flist.add("Rameshwar Park");flist.add("RTO Circle");flist.add("Sanand Circle");
        flist.add("South Bopal");flist.add("S.P. Ring Road");flist.add("Vasna");
        obs1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,flist));
        obs1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ob1=adapterView.getItemAtPosition(i).toString();
            }public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        //Spinner2
        ArrayList <String> slist=new ArrayList<>();
        slist.add("Select bus stop");slist.add("Ahmedabad Domestic Airport");
        slist.add("Bhadaj Circle");slist.add("Chhipa Society");slist.add("CTM Cross Road");
        slist.add("DCIS Circle");slist.add("Ghuma Gam");
        slist.add("Gota Vasant Nagar Township");slist.add("Hanspura Ring Road");
        slist.add("Iskcon Cross Road");slist.add("Jaimangal");
        slist.add("Kashiram Textiles");slist.add("LD Engg Collage");
        slist.add("Maninagar");slist.add("Naroda Gam");
        slist.add("Naroda S.T. Workshop");slist.add("Narol");slist.add("Nehrunagar");
        slist.add("Rameshwar Park");slist.add("RTO Circle");slist.add("Sanand Circle");
        slist.add("South Bopal");slist.add("S.P. Ring Road");slist.add("Vasna");

        obs2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,slist));
        obs2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ob2=adapterView.getItemAtPosition(i).toString();
            }public void onNothingSelected(AdapterView<?> adapterView) {}
        });
    }
    //onclick button
    public void ShowRoute(View view){
        if(ob1.equals("Select bus stop") && ob2.equals("Select bus stop")) obtv.setText("Select Source and Destination stops");
        else if(ob1==ob2) Toast.makeText(this,"You have Selected the Same Stops", Toast.LENGTH_SHORT).show();
        else if(ob1.equals("Select bus stop")) Toast.makeText(this, "Select the Destination Location", Toast.LENGTH_SHORT).show();
        else if(ob2.equals("Select bus stop")) Toast.makeText(this, "Select the Source Location", Toast.LENGTH_SHORT).show();

        else if(ob1.equals("Maninagar") && ob2.equals("Ghuma Gam")) {
            obtv.setText("(1D) Maninagar Railway - Ghuma Gam\n"+"Maninagar → Maninagar Char Rasta → Rambaug → Kankariya Lake → " +
                    "Kankariya Telephone Exchange → Swaminarayan College → Danilimda Char Rasta → Khodiyarnagar → Chandranagar → " +
                    "Anjali → Dharnidhar Derasar → Manekbaug → Nehrunagar → Jhansi Ki Rani → Shivranjani → "+
                    "Jodhpur Char Rasta → Star Bazaar → ISRO → Ramdevnagar → Iskcon Cross Road → Iskcon Mandir → "+
                    "Antari+ksh Colony → Ashok Vatika → Jayantilal Park → Swagat Bungalow → Ambli Gam → "+
                    "Bopal Approach → Samarpan Bungalows → Bhavya Park → Sterling City → Bopal Gam → "+
                    "Little Wings → Ghuma Gam");
        } else if (ob1.equals("Ghuma Gam") && ob2.equals("Jaimangal")) {
            obtv.setText("(1E) Ghuma Gam - Jaimangal\n"+"Ghuma Gam → Little Wings → Bopal Gam → Sterling City → Bhavya Park → " +
                    "Samarpan Bungalows → Bopal Approach → Ambli Gam → Swagat Bungalow → Jayantilal Park → Ashok Vatika → "+
                    "Antariksh Colony → Jeutaram No Kuvo →  ISRO Colony → Iskcon Mandir → Big Bazar → "+
                    "Iskcon Cross Road → Ramdevnagar → Ramdev Nagar → ISRO → Star Bazaar → Jodhpur Char Rasta → "+
                    "Himmatlal Park → Andhjan Mandal → University → Memnagar → Shree Valinath Chowk → "+
                    "Sola Cross Road → Jaimangal");
        } else if (ob1.equals("Maninagar") && ob2.equals("Kashiram Textiles")) {
            obtv.setText("(1E) Maninagar Railway- Kashiram Textiles\n"+"Maninagar → Maninagar Char Rasta → Rambaug → Kankariya Lake → "+
                    "Kankariya Telephone Exchange → Swaminarayan College → Danilimda Road → "+
                    "Chhipa Society → Chandola Lake → BRTS Workshop → Kashiram Textiles");
        } else if (ob1.equals("Chhipa Society") && ob2.equals("Ghuma gam")) {
            obtv.setText("(1S) Chhipa Society -  Ghuma Gam\n"+"Chhipa Society → Danilimda Road → Danilimda Char Rasta → "+
                    "Khodiyarnagar → Chandranagar → Anjali → "+
                    "Dharnidhar Derasar → Manekbaug → Nehrunagar → Jhansi Ki Rani → "+
                    "Shivranjani → Jodhpur Char Rasta → Star Bazaar → ISRO → "+
                    "Ramdevnagar → Iskcon Cross Road → Iskcon Mandir → Antariksh Colony → "+
                    "Ashok Vatika → Jayantilal Park → Swagat Bungalow → Ambli Gam → "+
                    "Bopal Approach → Samarpan Bungalows → Bhavya Park → Sterling City → "+
                    "Bopal Gam → Little Wings → Ghuma Gam");
        } else if (ob1.equals("Chhipa Society") && ob2.equals("Maninagar")) {
            obtv.setText("(1S) Chhipa Society - Maninagar Railway\n"+"Chhipa Society → Danilimda Road → Vaikunth Dham Mandir → "+
                    "Swaminarayan College → Kankariya Telephone Exchange → Kankariya Lake → "+
                    "Rambaug → Maninagar Char Rasta → Maninagar");
        } else if (ob1.equals("Jaimangal") && ob2.equals("Ghuma Gam")) {
            obtv.setText("(1S) Jaimangal - Ghuma Gam\n"+"Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → "+
                    "University → Andhjan Mandal → Himmatlal Park → Jodhpur Char Rasta → "+
                    "Star Bazaar → ISRO → Ramdevnagar → Iskcon Cross Road → "+
                    "Iskcon Mandir → Antariksh Colony → Ashok Vatika → "+
                    "Jayantilal Park → Swagat Bungalow → Ambli Gam → Bopal Approach → "+
                    "Samarpan Bungalows → Bhavya Park → Sterling City → Bopal Gam → "+
                    "Little Wings → Ghuma Gam");
        }else if (ob1.equals("Ghuma Gam") && ob2.equals("Maninagar")) {
            obtv.setText("(1U) Ghuma Gam - Maninagar Railway\n"+"Ghuma Gam → Little Wings → Bopal Gam → Sterling City → "+
                    "Bhavya Park → Samarpan Bungalows → Bopal Approach → Ambli Gam → "+
                    "Swagat Bungalow → Jayantilal Park → Ashok Vatika → "+
                    "Antariksh Colony → Iskcon Mandir → Iskcon Cross Road → "+
                    "Ramdevnagar → ISRO → Star Bazaar → Jodhpur Char Rasta → "+
                    "Shivranjani → Jhansi Ki Rani → Nehrunagar → Manekbaug → "+
                    "Dharnidhar Derasar → Anjali → Chandranagar → Khodiyarnagar → "+
                    "Danilimda Char Rasta → Swaminarayan College → Kankariya Telephone Exchange → "+
                    "Kankariya Lake → Rambaug → Maninagar Char Rasta → Maninagar");
        }

        else if(ob1.equals("S.P. Ring Road") && ob2.equals("Bhadaj Circle")) {
            obtv.setText("(2D)S.P. Ring Road - Bhadaj Circle\n"+ "S.P.Ring Road Approach → Odhav Talav → Morlidhar Society → "+
                    "Chhotalal Ni Chali → Vallabh Nagar → Odhav Fire Station → Grid Station → Soni Ni Chali → Ajit Mill Char Rasta → "+
                    "Soma Textiles → Narayana Hospital → Rakhiyal Char Rasta → Patel Mills → Kalupur → Prem Darwaja → Delhi Darwaja → "+
                    "Sarkari Litho Press Cabin → Sarkari Litho Press → Hanumanpura → Gurudwara → Juna Vadaj → Ramapir No Tekaro → "+
                    "N R Patel Park → Bhavsar Hostel →  Akhbarnagar → Pragatinagar → Shastrinagar → Jaimangal → Parasnagar → "+
                    "Parshwanath Jain Mandir → Bhuyangdev  → Sattadhar Char Rasta → Sola Bridge → Science City Approach → Shukan Mall → "+
                    "Hetarth Party Plot → Science City → Bhadaj Circle\n"+ "~ 38 stops\t|\t~ 57 mins");
        } else if(ob1.equals("Bhadaj Circle") && ob2.equals("S.P. Ring Road")) {
            obtv.setText("(2U) Bhadaj Circle - S.P. Ring Road\n"+ "Bhadaj Circle → Science City → Hetarth Party Plot → Shukan Mall → "+
                    "Science City Approach → Sola Bridge → Sattadhar Char Rasta → Bhuyangdev → Parshwanath Jain Mandir → Parasnagar → "+
                    "Jaimangal → Shastrinagar → Pragatinagar → Akhbarnagar → Bhavsar Hostel → N R Patel Park → Ramapir No Tekaro → "+
                    "Juna Vadaj → Gurudwara → Hanumanpura → Sarkari Litho Press → Sarkari Litho Press Cabin → Delhi Darwaja → "+
                    "Prem Darwaja → Kalupur Ghee Bazar → Kalupur → Patel Mills → Rakhiyal Char Rasta → Narayana Hospital → "+
                    "Soma Textiles → Ajit Mill Char Rasta → Soni Ni Chali → Grid Station → Odhav Fire Station → Vallabh Nagar → "+
                    "Chhotalal Ni Chali → Morlidhar Society → Odhav Talav → S.P.Ring Road Approach\n"+ "~ 39 stops\t|\t~ 58 mins");
        } else if (ob1.equals("Jaimangal") && ob2.equals("Bhadaj Circle")) {
            obtv.setText("(2S) Jaimangal - Bhadaj Circle\n"+"Jaimangal → Parasnagar → Parshwanath Jain Mandir → Bhuyangdev → " +
                    "Sattadhar Char Rasta → Sola Bridge → Science City Approach → Shukan Mall → Hetarth Party Plot → "+
                    "Science City → Bhadaj Circle");
        } else if (ob1.equals("Bhadaj Circle") && ob2.equals("Jaimangal")) {
            obtv.setText("(2U) Bhadaj Circle - S.P. Ring Road\n"+"Bhadaj Circle → Science City → Hetarth Party Plot → " +
                    "Shukan Mall → Science City Approach → Sola Bridge → Sattadhar Char Rasta → Bhuyangdev → " +
                    "Parshwanath Jain Mandir → Parasnagar → Jaimangal");
        }

        else if (ob1.equals("Maninagar") && ob2.equals("RTO Circle")) {
            obtv.setText("(3D) Maninagar Railway - RTO Circle\n"+"Maninagar → Swaminarayan Mandir → Jawahar Chowk → " +
                    "Bhairavnath Road → Mira Cinema Char Rasta → Kankariya Telephone Exchange → Swaminarayan College → "+
                    "Danilimda Char Rasta → Khodiyarnagar → Chandranagar → Anjali → "+
                    "Dharnidhar Derasar → Manekbaug → Nehrunagar → Jhansi Ki Rani → Shivranjani → "+
                    "Himmatlal Park → Andhjan Mandal → University → Memnagar → "+
                    "Shree Valinath Chowk → Sola Cross Road → Jaimangal → Shastrinagar → Pragatinagar → "+
                    "Akhbarnagar → Bhavsar Hostel → Ranip Cross Road → R.T.O.Circle");
        } else if (ob1.equals("RTO Circle") && ob2.equals("Maninagar")) {
            obtv.setText("(3U) RTO Circle - Maninagar Railway\n"+"R.T.O.Circle → Ranip Cross Road → Bhavsar Hostel → Akhbarnagar → " +
                    "Pragatinagar → Shastrinagar → Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → "+
                    "University → Andhjan Mandal → Himmatlal Park → Shivranjani → Jhansi Ki Rani → "+
                    "Nehrunagar → Manekbaug → Dharnidhar Derasar → Anjali → Chandranagar → "+
                    "Khodiyarnagar → Danilimda Char Rasta → Swaminarayan College → Kankariya Telephone Ex. → "+
                    "Kankariya Lake → Rambaug → Maninagar Char Rasta → Maninagar");
        }

        else if(ob1.equals("LD Engg Collage") && ob2.equals("DCIS Circle") ){
            obtv.setText("(4D) LD Engg Collage - DCIS Circle\nLD Engg Collage → Gulbai Tekra Approach → "+
                    "Panjrapole Char Rasta → L Colony → Nehrunagar → Jhansi Ki Rani → Shivranjani → Himmatlal Park → "+
                    "Andhjan Mandal → University → Memnagar → Shree Valinath Chowk → Sola Cross Road → Jaimangal → "+
                    "Shastrinagar → Pragatinagar → Akhbarnagar → Bhavsar Hostel → Ranip Cross Road → R.T.O.Circle → "+
                    "Sabarmati Power House → Rathi Apartment → Sabarmati Municipal Swimming Pool → Sabarmati Police Station → "+
                    "Motera Cross Road → Visat Gandhinagar Junction → Ongc Avani Bhavan → Jantanagar → Shiv Shaktinagar → "+
                    "Chandkheda Gam → Sarthi Bungalows → DCIS Circle\n~ 32 stops\t|\t~ 48 mins");
        } else if(ob1.equals("DCIS Circle") && ob2.equals("LD Engg Collage")){
            obtv.setText("(4U) DCIS Circle - LD Engg Collage\n"+"DCIS Circle → Sarthi Bungalows → "+
                    "Chandkheda Gam → Shiv Shaktinagar → Jantanagar → Ongc Avani Bhavan → Visat Gandhinagar Junction → "+
                    "Motera Cross Road → Sabarmati Police Station → Sabarmati Municipal Swimming Pool → Rathi Apartment → "+
                    "Sabarmati Power House → R.T.O.Circle → Ranip Cross Road → Bhavsar Hostel → Akhbarnagar → Pragatinagar → "+
                    "Shastrinagar → Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → University → Andhjan Mandal → "+
                    "Himmatlal Park → Shivranjani → Jhansi Ki Rani → Nehrunagar → L Colony → Panjrapole Char Rasta → "+
                    "Gulbai Tekra Approach → LD Engg Collage\n~ 32 stops\t|\t~ 48 mins");
        }

        else if (ob1.equals("Hanspura Ring Road") && ob2.equals("Vasna")) {
            obtv.setText("(5D) Hanspura Ring Road - Vasna\n"+"Hanspura Ring Road → Sthapatya Eligance → Swaminarayan Park → " +
                    "Haridarshan Char Rasta → Muktidham Naroda → Naroda Gam → Bethak → Naroda → Naroda S.T. Workshop → " +
                    "Dhanush Dhari Mandir → Krishna nagar → Vijay Park Hirawadi → Thakkar Nagar Approach → Lilanagar → "+
                    "Bapu Nagar Approach → Viratnagar → Soni ni Chali → Geeta Gauri Cinema → Rameshwar Park → "+
                    "Ram Rajya Nagar → Rabari Colony → Jogeshwari Society → Purvdeep Society → CTM Cross Road → "+
                    "Express Highway Junction → Jabhodanagar Char Rasta → Ghodasar → Isanpur → Mukesh Industries → "+
                    "Narol → Kashiram Textiles → BRTS Workshop → Chandola Lake → Chhipa Society → DanilimdaRoad → "+
                    "Danilimda Char Rasta → Khodiyarnagar → Chandranagar → Anjali → Vasna");
        } else if (ob1.equals("Vasna") && ob2.equals("Hanspura Ring Road")) {
            obtv.setText("(5U) Vasna - Hanspura Ring Road\n"+"Vasna → Anjali → Chandranagar → Khodiyarnagar → Danilimda Char Rasta → " +
                    "Chhipa Society → Chandola Lake →   Workshop → Kashiram Textiles → Narol → Mukesh Industries → Isanpur → "+
                    "Ghodasar → Jashodanagar Char Rasta → Express Highway Junction → CTM Cross Road → "+
                    "Purvdeep Society → Jogeshwari Society → Rabari Colony → Ram Rajya Nagar → "+
                    "Rameshwar Park→ Geeta Gauri Cinema → Soni ni Chali → Viratnagar → Bapu Nagar Approach → "+
                    "Lilanagar → Thakkar Nagar Approach → Hirawadi → Vijay Park → Krishna nagar → "+
                    "Dhanush Dhari Mandir → Naroda S. T. Workshop → Bethak → Naroda Gam → Muktidham → Naroda → "+
                    "Haridarshan Char Rasta → Swaminarayan Park → Sthapatya Eligance → Hanspura Ring Road");
        }

        else if (ob1.equals("Naroda S.T. Workshop") && ob2.equals("Narol")) {
            obtv.setText("(6D) Naroda S. T. Workshop - Narol\n"+"Naroda S.T. Workshop → Dhanush Dhari Mandir → Krishna nagar → " +
                    "Vijay Park → Hirawadi → Thakkar Nagar Approach → lilanagar → bapu nagar approach → Viratnagar → soni ni Chali → "+
                    "Rameshwar Park → Ram Rajya Nagar → Rabari Colony → Jogeshwari Society → Purvdeep Society → "+
                    "CTM Cross Road → Express Highway Junction → Jashodanagar Char Rasta → Ghodasar → Isanpur → "+
                    "Mukesh Industries → Narol");
        } else if (ob1.equals("Narol") && ob2.equals("Naroda S.T. Workshop")) {
            obtv.setText("(6U) Narol - Naroda S. T. Workshop\n"+"Narol → Mukesh Industries → Isanpur → Ghodasar → " +
                    "Jashodanagar Char Rasta → Express Highway Junction → CTM Cross Road → Purvdeep Society → "+
                    "Jogeshwari Society → Rabari Colony → Ram Rajya Nagar → Rameshwar Park → "+
                    "Geeta Gauri Cinema → Soni Ni Chali → Viratnagar → Bapu Nagar Approach → "+
                    "Lilanagar → Thakkar Nagar Approach → Hirawadi → Vijay Park → "+
                    "Krishna Nagar → Dhanush Dhari Mandir → Naroda S.T. Workshop");
        }

        else if (ob1.equals("DCIS Circle") && ob2.equals("Narol")) {
            obtv.setText("(7U) DCIS Circle - Narol\n"+"DCIS Circle → Sarthi Bungalows → Chandkheda Gam → Shiv Shaktinagar → "+
                    "Jantanagar → Ongc Avani Bhavan → Vishvkarma Engineering College → "+
                    "Visat Gandhinagar Junction → Motera Cross Road → Sabarmati Police Station → "+
                    "Sabarmati Municipal Swimming Pool → Rathi Apartment → Sabarmati Power House → "+
                    "R.T.O.Circle → Ranip Cross Road → N R Patel Park → Ramapir No Tekaro → "+
                    "Juna Vadaj → Gurudwara → Hanumanpura → Sarkari Litho Press → "+
                    "Sarkari Litho Press Cabin → Delhi Darwaja → Prem Darwaja → "+
                    "Kalupur Ghee Bazar → Kalupur → Sarangpur Darwaja → Karnamukteshwar Mahadev → "+
                    "Raipur Darwaja → Astodiya Darwaja → Geeta Mandir → Bhulabhai Park → "+
                    "Mangal Park → Swaminarayan College → Vaikunth Dham Mandir → Danilimda Road → "+
                    "Chhipa Society → Chandola Lake → BRTS Workshop → Kashiram Textiles → Narol");
        } else if (ob1.equals("Narol") && ob2.equals("DCIS Circle")) {
            obtv.setText("(7D) Narol - DCIS Circle\n"+"Narol → Kashiram Textiles → BRTS Workshop → Chandola Lake → " +
                    "Chhipa Society → Danilimda Road → "+ "Vaikunth Dham Mandir → Swaminarayan College → Mangal Park → " +
                    "Bhulabhai Park → Geeta Mandir → Raipur Darwaja → Karnamukteshwar Mahadev → Sarangpur Darwaja Kalupur → " +
                    "Prem Darwaja → Delhi Darwaja → Sarkari Litho Press Cabin → Sarkari Litho Press → Hanumanpura → Gurudwara → "+
                    "Juna Vadaj → Ramapir No Tekaro → Patel Park → Ranip Cross Road → RTO Extension → "+
                    "Sabarmati power house → Rathi Apartment → Sabarmati Municipal Swimming pool → "+
                    "Sabarmati Police station → Motera Cross Road → Visat-Gandhinagar Junction → "+
                    "Vishvkarma Engineering → ONGC → Avani Bhavan → Jantanagar → Shiv Shaktinagar → "+
                    "Chandkheda Gam → Sarthi Bungalows → DCIS Circle");
        }

        else if (ob1.equals("Iskcon Cross Road") && ob2.equals("Naroda Gam")) {
            obtv.setText("(8U) Iskcon Cross Road - Naroda Gam\n"+"Iskcon Cross Road → Ramdevnagar → ISRO → Star Bazaar → " +
                    "Jodhpur Char Rasta → Shivranjani → Jhansi Ki Rani → Nehrunagar → L Colony → Panjrapole Char Rasta → "+
                    "Gulbai Tekra Approach → LD Engg. College → Vasundhara Society → Law Garden → "+
                    "M J Library → Lokamanya Tilak Bag → Raikhad Char Rasta → "+
                    "Municipal Corporation Oce → Astodiya Chakala → Astodiya Darwaja → Raipur Darwaja → "+
                    "Karnamukteshwar Mahadev → Sarangpur Darwaja → Kalupur → G.C.S. Hospital → "+
                    "Arvind Mill → Jeening Press → Ashok Mill → Naroda Fruit Market → "+
                    "Memco Cross Road → Municipal North Zone Oce → Saijpur Towers → "+
                    "Naroda S.T.Workshop → Bethak → Naroda Gam");
        } else if (ob1.equals("Naroda Gam") && ob2.equals("Iskcon Cross Road")) {
            obtv.setText("(8D) Naroda Gam - Iskcon Cross Road\n"+"Naroda Gam → Bethak → Naroda ST Workshop → Saijpur Towers → " +
                    "Municipal North Zone Office → "+ "Memco Cross Road → Naroda Fruit Market → Ashok Mill → Jeening Press → " +
                    "Arvind Mill → G.C.S. Hospital → "+ "Kalupur Ghee Bazar → Kalupur → Sarangpur Darwaja → " +
                    "Karnamukteshwar Mahadev → Raipur Darwaja → Astodiya Darwaja → Astodiya Chakala → " +
                    "Municipal Corporation Office → Raikhad Char Rasta → Lokamanya Tilak Bag → " +
                    "MJ Library → Law Garden → Vasundhara Society → LD Engg. College → Gulbai Tekra Approach → " +
                    "Panjrapole Char Rasta → L colony → Nehru nagar → jhansi ki rani → "+
                    "shivranjini → jodhpur char rasta → star bazaar → ISRO → Ramdevnagar → Iskcon Cross Road");
        }

        else if (ob1.equals("Gota Vasant Nagar Township") && ob2.equals("Maninagar")) {
            obtv.setText("(9U) Gota Vasant Nagar Township - Maninagar\n"+"Gota Vasant Nagar Township → Gota Cross Road → " +
                    "Sola Bhagwat → Gujarat High Court → Science City Approach → Sola Bridge → Sattadhar Char Rasta → Bhuyangdev → "+
                    "Parshwanath Jain Mandir → Parasnagar → Sola Cross Road → Shree Valinath Chowk → "+
                    "Memnagar → University → Andhjan Mandal → Himmatlal Park → Shivranjani → "+
                    "Jhansi Ki Rani → Nehrunagar → L Colony → Panjrapole Char Rasta → "+
                    "Gulbai Tekra Approach → LD Engg. College → Vasundhara Society → "+
                    "Law Garden → M J Library → Lokamanya Tilak Bag → Raikhad Char Rasta → "+
                    "Municipal Corporation Oce → Astodiya Chakala → Geeta Mandir → Bhulabhai Park → "+
                    "Mangal Park → Kankariya Telephone Exchange → Mira Cinema Char Rasta → "+
                    "Bhairavnath Road → Jawahar Chowk → Swaminarayan Mandir → Maninagar");
        } else if (ob1.equals("Maninagar") && ob2.equals("Gota Vasant Nagar Township")) {
            obtv.setText("(9D) Maninagar - Gota Vasant Nagar Township\n"+"Maninagar → Swaminarayan Mandir → Jawahar Chowk → " +
                    "Bhairavnath Road → Mira Cinema Char Rasta → Kankariya Telephone Exchange → Mangal Park → Bhulabhai Park → "+
                    "Geeta Mandir → Astodiya Darwaja → Astodiya Chakala → Municipal Corporation Oce → "+
                    "Raikhad Char Rasta → Lokamanya Tilak Bag → M J Library → Law Garden → "+
                    "Vasundhara Society → LD Engg. College → Gulbai Tekra Approach → "+
                    "Panjrapole Char Rasta → L Colony → Nehrunagar → Jhansi Ki Rani → "+
                    "Shivranjani → Himmatlal Park → Andhjan Mandal → University → "+
                    "Memnagar → Shree Valinath Chowk → Sola Cross Road → Parasnagar → "+
                    "Parshwanath Jain Mandir → Bhuyangdev → Sattadhar Char Rasta → "+
                    "Sola Bridge → Science City Approach → Gujarat High Court → Sola Bhagwat → "+
                    "Gota Cross Road → Gota Vasant Nagar Township");
        }

        else if (ob1.equals("LD Engg Collage") && ob2.equals("S.P. Ring Road")) {
            obtv.setText("(11U) LD Engg Collage - S.P. Ring Road \n"+"LD Engg. College → Vasundhara Society → Law Garden → " +
                    "M J Library → Lokamanya Tilak Bag → Raikhad Char Rasta → Municipal Corporation Oce → "+
                    "Astodiya Chakala → Astodiya Darwaja → Raipur Darwaja → "+
                    "Karnamukteshwar Mahadev → Sarangpur Darwaja → Patel Mills → Rakhiyal Char Rasta → "+
                    "Narayana Hospital → Soma Textiles → Ajit Mill Char Rasta → Soni Ni Chali → "+
                    "Grid Station → Odhav Fire Station → Vallabh Nagar → Chhotalal Ni Chali → "+
                    "Morlidhar Society → Odhav Talav → S.P.Ring Road Approach");
        } else if (ob1.equals("S.P. Ring Road") && ob2.equals("LD Engg Collage")) {
            obtv.setText("(11D) S.P. Ring Road - LD Engg. College\n"+"S.P.Ring Road Approach → Odhav Talav → Morlidhar Society → " +
                    "Chhotalal Ni Chali → Vallabh Nagar → Odhav Fire Station → Grid Station → Soni Ni Chali → "+
                    "Ajit Mill Char Rasta → Soma Textiles → Narayana Hospital → Rakhiyal Char Rasta → "+
                    "Patel Mills → Sarangpur Darwaja → Karnamukteshwar Mahadev → Raipur Darwaja → "+
                    "Astodiya Darwaja → Astodiya Chakala → Municipal Corporation Oce → "+
                    "Raikhad Char Rasta → Lokamanya Tilak Bag → M J Library → Law Garden → "+
                    "Vasundhara Society → LD Engg. College");
        }

        else if (ob1.equals("RTO Circle") && ob2.equals("CTM Cross Road")) {
            obtv.setText("(12U) RTO Circle - CTM Cross Road\n"+"R.T.O.Circle → Ranip Cross Road → Bhavsar Hostel → Akhbarnagar → " +
                    "Pragatinagar → Shastrinagar → Jaimangal → Sola Cross Road → Shree Valinath Chowk → "+
                    "Memnagar → University → Andhjan Mandal → Himmatlal Park → Shivranjani → "+
                    "Jhansi Ki Rani → Nehrunagar → Manekbaug → Dharnidhar Derasar → Anjali → "+
                    "Chandranagar → Khodiyarnagar → Danilimda Char Rasta → Danilimda Road → "+
                    "Chhipa Society → Chandola Lake → BRTS Workshop → Kashiram Textiles → Narol → "+
                    "Mukesh Industries → Isanpur → Ghodasar → Jashodanagar Char Rasta → "+
                    "Express Highway Junction → CTM Cross Road");
        } else if (ob1.equals("RTO Circle") && ob2.equals("Rameshwar Park")) {
            obtv.setText("(12U) R.T.O Circle - Rameshwar Park\n"+"R.T.O.Circle → Ranip Cross Road → Bhavsar Hostel → Akhbarnagar → " +
                    "Pragatinagar → Shastrinagar → Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → "+
                    "University → Andhjan Mandal → Himmatlal Park → Shivranjani → Jhansi Ki Rani → "+
                    "Nehrunagar → Manekbaug → Dharnidhar Derasar → Anjali → Chandranagar → "+
                    "Khodiyarnagar → Danilimda Char Rasta → Danilimda Road → Chhipa Society → "+
                    "Chandola Lake → BRTS Workshop → Kashiram Textiles → Narol → Mukesh Industries → "+
                    "Isanpur → Ghodasar → Jashodanagar Char Rasta → Express Highway Junction → "+
                    "CTM Cross Road → Purvdeep Society → Jogeshwari Society → Rabari Colony → "+
                    "Ram Rajya Nagar → Rameshwar Park");
        } else if (ob1.equals("CTM Cross Road") && ob2.equals("RTO Circle")) {
            obtv.setText("(12D) CTM Cross Road - RTO Circle\n"+"CTM Cross Road → Express Highway Junction → " +
                    "Jashodanagar Char Rasta → Ghodasar → Isanpur → Mukesh Industries → Narol → Kashiram Textiles → BRTS Workshop → "+
                    "Chandola Lake → Chhipa Society → Danilimda Road → Danilimda Char Rasta → "+
                    "Khodiyarnagar → Chandranagar → Anjali → Dharnidhar Derasar → Manekbaug → "+
                    "Nehrunagar → Jhansi Ki Rani → Shivranjani → Himmatlal Park → Andhjan Mandal → "+
                    "University → Memnagar → Shree Valinath Chowk → Sola Cross Road → "+
                    "Jaimangal → Shastrinagar → Pragatinagar → Akhbarnagar → Bhavsar Hostel → "+
                    "Ranip Cross Road → R.T.O.Circle");
        } else if (ob1.equals("Rameshwar Park") && ob2.equals("RTO Circle")) {
            obtv.setText("(12D) Rameshwar Park - R.T.O Circle\n"+"Rameshwar Park → Ram Rajya Nagar → Rabari Colony → " +
                    "Jogeshwari Society → Purvdeep Society → CTM Cross Road → Express Highway Junction → "+
                    "Jashodanagar Char Rasta → Ghodasar → Isanpur → Mukesh Industries → Narol → "+
                    "Kashiram Textiles → BRTS Workshop → Chandola Lake → Chhipa Society → "+
                    "Danilimda Road → Danilimda Char Rasta → Khodiyarnagar → Chandranagar → "+
                    "Anjali → Dharnidhar Derasar → Manekbaug → Nehrunagar → Jhansi Ki Rani → "+
                    "Shivranjani → Himmatlal Park → Andhjan Mandal → University → Memnagar → "+
                    "Shree Valinath Chowk → Sola Cross Road → Jaimangal → Shastrinagar → "+
                    "Pragatinagar → Akhbarnagar → Bhavsar Hostel → Ranip Cross Road → R.T.O.Circle");
        }

        else if (ob1.equals("Sanand Circle") && ob2.equals("Naroda Gam")) {
            obtv.setText("(14U) Sanand Circle - Naroda Gam\n"+"Sanand Circle → Sarkhej Circle → Ambar Tower → Khurshid Park → " +
                    "Juhapura Road → Maktampura Ward Oce → Pravinnagar → Vasna Terminus → Anjali → Chandranagar → "+
                    "Khodiyarnagar → Danilimda Char Rasta → Vaikunth Dham Mandir → Swaminarayan College → "+
                    "Mangal Park → Bhulabhai Park → Geeta Mandir → Raipur Darwaja → "+
                    "Karnamukteshwar Mahadev → Sarangpur Darwaja → Kalupur → G.C.S. Hospital → "+
                    "Arvind Mill → Jeening Press → Ashok Mill → Naroda Fruit Market → "+
                    "Memco Cross Road → Municipal North Zone Oce → Saijpur Towers → "+
                    "Naroda S.T.Workshop → Bethak → Naroda Gam");
        } else if (ob1.equals("Naroda Gam") && ob2.equals("Sanand Circle")) {
            obtv.setText("(14D) Naroda Gam - Sanand Circle\n"+"Naroda Gam → Bethak → Naroda S.T.Workshop → Saijpur Towers → " +
                    "Municipal North Zone Oce → Memco Cross Road → Naroda Fruit Market → Ashok Mill → Jeening Press → "+
                    "Arvind Mill → G.C.S. Hospital → Kalupur Ghee Bazar → Kalupur → Sarangpur Darwaja → "+
                    "Karnamukteshwar Mahadev → Raipur Darwaja → Astodiya Darwaja → Geeta Mandir → "+
                    "Bhulabhai Park → Mangal Park → Swaminarayan College → Vaikunth Dham Mandir → "+
                    "Danilimda Char Rasta → Khodiyarnagar → Chandranagar → Anjali → Vasna Terminus → "+
                    "Pravinnagar → Maktampura Ward Oce → Juhapura Road → Khurshid Park → "+
                    "Ambar Tower → Sarkhej Circle → Sanand Circle");
        }

        else if (ob1.equals("Iskcon Cross Road") && ob2.equals("RTO Circle")) {
            obtv.setText("(15D) Iskcon Cross Road - R.T.O Circle\n"+"Iskcon Cross Road → Ramdevnagar → ISRO → Star Bazaar → " +
                    "Jodhpur Char Rasta → Himmatlal Park → Andhjan Mandal → University → Memnagar → "+
                    "Shree Valinath Chowk → Sola Cross Road → Jaimangal → Shastrinagar → "+
                    "Pragatinagar → Akhbarnagar → Bhavsar Hostel → Ranip Cross Road → R.T.O.Circle");
        } else if (ob1.equals("RTO Circle") && ob2.equals("Iskcon Cross Road")) {
            obtv.setText("(15U) R.T.O Circle - Iskcon Cross Road\n"+"R.T.O.Circle → Ranip Cross Road → Bhavsar Hostel → " +
                    "Akhbarnagar → Pragatinagar → Shastrinagar → Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → "+
                    "University → Andhjan Mandal → Himmatlal Park → Jodhpur Char Rasta → Star Bazaar → "+
                    "ISRO → Ramdevnagar → Iskcon Cross Road");
        }

        else if (ob1.equals("Nehrunagar") && ob2.equals("Sanand Circle")) {
            obtv.setText("(16D) Nehrunagar - Sanand Circle\n"+"Nehrunagar → Jhansi Ki Rani → Shivranjani → Jodhpur Char Rasta → " +
                    "Star Bazaar → ISRO → Ramdevnagar → Iskcon Cross Road → Karnavati Club → Prahalad Nagar Cross Road → "+
                    "Makarba Road → Sanand Circle");
        } else if (ob1.equals("Sanand Circle") && ob2.equals("Nehrunagar")) {
            obtv.setText("(16U) Sanand Circle - Nehrunagar\n"+"Sanand Circle → Makarba Road → Prahalad Nagar Cross Road → " +
                    "Karnavati Club → Iskcon Cross Road → Ramdevnagar → ISRO → Star Bazaar → Jodhpur Char Rasta → "+
                    "Shivranjani → Jhansi Ki Rani → Nehrunagar");
        }

        else if (ob1.equals("Nehrunagar") && ob2.equals("South Bopal")) {
            obtv.setText("(17D) Nehrunagar - South Bopal\n"+"Nehrunagar → Jhansi Ki Rani → Shivranjani → "+
                    "Jodhpur Char Rasta → Star Bazaar → ISRO → "+
                    "Ramdevnagar → Iskcon Cross Road → Iskcon Mandir → "+
                    "Antariksh Colony → Ashok Vatika → Jayantilal Park → "+
                    "Swagat Bungalow → Ambli Gam → Bopal Approach → "+
                    "Sobo Center → Sukhasan Char Rasta → South Bopal");
        } else if (ob1.equals("South Bopal") && ob2.equals("Nehrunagar")) {
            obtv.setText("(17U) South Bopal - Nehrunagar\n"+"South Bopal → Sukhasan Char Rasta → Sobo Center → "+
                    "Bopal Approach → Ambli Gam → Swagat Bungalow → Jayantilal Park → "+
                    "Ashok Vatika → Antariksh Colony → Iskcon Mandir → Iskcon Cross Road → "+
                    "Ramdevnagar → ISRO → Star Bazaar → Jodhpur Char Rasta → "+
                    "Shivranjani → Jhansi Ki Rani → Nehrunagar");
        }

        else if (ob1.equals("Maninagar") && ob2.equals("Ahmedabad Domestic Airport")) {
            obtv.setText("(18D) Maninagar - Ahmedabad Domestic Airport\n"+"Maninagar → Maninagar Char Rasta → Rambaug → " +
                    "Kankariya Lake → Kankariya Telephone Exchange → Mangal Park → Bhulabhai Park → "+
                    "Geeta Mandir → Raipur Darwaja → Karnamukteshwar Mahadev → "+
                    "Sarangpur Darwaja → Kalupur → Civil Hospital Corner → "+
                    "Hanuman Camp → Airport Circle → Ahmedabad Domestic Airport");
        } else if (ob1.equals("Ahmedabad Domestic Airport") && ob2.equals("Maninagar")) {
            obtv.setText("(18U) Ahmedabad Domestic Airport - Maninagar\n"+"Ahmedabad Domestic Airport → Airport Circle → " +
                    "Hanuman Camp → Civil Hospital Corner → Kalupur Ghee Bazar → Sarangpur Darwaja → "+
                    "Karnamukteshwar Mahadev → Raipur Darwaja → Astodiya Darwaja → Geeta Mandir → "+
                    "Bhulabhai Park → Mangal Park → Kankariya Telephone Exchange → Kankariya Lake → "+
                    "Rambaug → Maninagar Char Rasta → Maninagar");
        }else if (ob1.equals("Jaimangal") && ob2.equals("Maninagar")) {
            obtv.setText("(18S) Jaimangal - Maninagar\n"+"Jaimangal → Sola Cross Road → Shree Valinath Chowk → Memnagar → " +
                    "University → Andhjan Mandal → Himmatlal Park → Shivranjani → Jhansi Ki Rani → "+
                    "Nehrunagar → Manekbaug → Dharnidhar Derasar → Anjali → Chandranagar → "+
                    "Khodiyarnagar → Danilimda Char Rasta → Vaikunth Dham Mandir → "+
                    "Swaminarayan College → Kankariya Telephone Exchange → Kankariya Lake → "+
                    "Rambaug → Maninagar Char Rasta → Maninagar");
        } else if (ob1.equals("Maninagar") && ob2.equals("Jaimangal")) {
            obtv.setText("(18E) Maninagar - Jaimangal\n"+"Maninagar → Maninagar Char Rasta → Rambaug → Kankariya Lake → "+
                    "Kankariya Telephone Exchange → Swaminarayan College → Vaikunth Dham Mandir → "+
                    "Danilimda Char Rasta → Khodiyarnagar → Chandranagar → Anjali → "+
                    "Dharnidhar Derasar → Manekbaug → Nehrunagar → Jhansi Ki Rani → "+
                    "Shivranjani → Himmatlal Park → Andhjan Mandal → University → "+
                    "Memnagar → Shree Valinath Chowk → Sola Cross Road → Jaimangal");
        }
    }
}
