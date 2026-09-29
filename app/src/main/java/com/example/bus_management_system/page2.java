package com.example.bus_management_system;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
public class page2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner obs1;
    private TextView obtv;
    private String a1="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        obs1=findViewById(R.id.sp1);
        obtv=findViewById(R.id.tvans);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.Route,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        obs1.setAdapter(adapter);
        obs1.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){
            a1="\nSelect the bus number";
            obtv.setText(a1);
        } else if(i==1){
            a1="Maninagar | Maninagar Char Rasta | Rambaug | Kankariya Lake | Kankariya Telephone Exchange | "+
                    "Swaminarayan College | Danilimda Char Rasta | Khodiyarnagar | Chandranagar | Anjali | "+
                    "Dharnidhar Derasar | Manekbaug | Nehrunagar | Jhansi Ki Rani | Shivranjani | "+
                    "Jodhpur Char Rasta | Star Bazaar | ISRO | Ramdevnagar | Iskcon Cross Road | Iskcon Mandir | "+
                    "Antari+ksh Colony | Ashok Vatika | Jayantilal Park | Swagat Bungalow | Ambli Gam | "+
                    "Bopal Approach | Samarpan Bungalows | Bhavya Park | Sterling City | Bopal Gam | "+
                    "Little Wings | Ghuma Gam";
            obtv.setText(a1);
        } else if(i==2){
            a1="Ghuma Gam | Little Wings | Bopal Gam | Sterling City | Bhavya Park | Samarpan Bungalows | "+
                    "Bopal Approach | Ambli Gam | Swagat Bungalow | Jayantilal Park | Ashok Vatika | "+
                    "Antariksh Colony | Jeutaram No Kuvo |  ISRO Colony | Iskcon Mandir | Big Bazar | "+
                    "Iskcon Cross Road | Ramdevnagar | Ramdev Nagar | ISRO | Star Bazaar | Jodhpur Char Rasta | "+
                    "Himmatlal Park | Andhjan Mandal | University | Memnagar | Shree Valinath Chowk | "+
                    "Sola Cross Road | Jaimangal";
            obtv.setText(a1);
        } else if(i==3){
            a1="Maninagar | "+"Maninagar Char Rasta | "+"Rambaug | "+"Kankariya Lake | "+
                    "Kankariya Telephone Exchange | "+"Swaminarayan College | "+"Danilimda Road | "+
                    "Chhipa Society | "+"Chandola Lake | "+"BRTS Workshop | "+"Kashiram Textiles";
            obtv.setText(a1);
        } else if(i==4){
            a1="Chhipa Society | "+"Danilimda Road | "+"Danilimda Char Rasta | "+
                    "Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+
                    "Dharnidhar Derasar | "+"Manekbaug | "+"Nehrunagar | "+"Jhansi Ki Rani | "+
                    "Shivranjani | "+"Jodhpur Char Rasta | "+"Star Bazaar | "+"ISRO | "+
                    "Ramdevnagar | "+"Iskcon Cross Road | "+"Iskcon Mandir | "+"Antariksh Colony | "+
                    "Ashok Vatika | "+"Jayantilal Park | "+"Swagat Bungalow | "+"Ambli Gam | "+
                    "Bopal Approach | "+"Samarpan Bungalows | "+"Bhavya Park | "+"Sterling City | "+
                    "Bopal Gam | "+"Little Wings | "+"Ghuma Gam";
            obtv.setText(a1);
        } else if(i==5){
            a1="Chhipa Society | "+"Danilimda Road | "+"Vaikunth Dham Mandir | "+
                    "Swaminarayan College | "+"Kankariya Telephone Exchange | "+"Kankariya Lake | "+
                    "Rambaug | "+"Maninagar Char Rasta | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==6){
            a1="Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+
                    "University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Jodhpur Char Rasta | "+
                    "Star Bazaar | "+"ISRO | "+"Ramdevnagar | "+"Iskcon Cross Road | "+
                    "Iskcon Mandir | "+"Antariksh Colony | "+"Ashok Vatika | "+
                    "Jayantilal Park | "+"Swagat Bungalow | "+"Ambli Gam | "+"Bopal Approach | "+
                    "Samarpan Bungalows | "+"Bhavya Park | "+"Sterling City | "+"Bopal Gam | "+
                    "Little Wings | "+"Ghuma Gam";
            obtv.setText(a1);
        } else if(i==7){
            a1="Ghuma Gam | "+"Little Wings | "+"Bopal Gam | "+"Sterling City | "+
                    "Bhavya Park | "+"Samarpan Bungalows | "+"Bopal Approach | "+"Ambli Gam | "+
                    "Swagat Bungalow | "+"Jayantilal Park | "+"Ashok Vatika | "+
                    "Antariksh Colony | "+"Iskcon Mandir | "+"Iskcon Cross Road | "+
                    "Ramdevnagar | "+"ISRO | "+"Star Bazaar | "+"Jodhpur Char Rasta | "+
                    "Shivranjani | "+"Jhansi Ki Rani | "+"Nehrunagar | "+"Manekbaug | "+
                    "Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+"Khodiyarnagar | "+
                    "Danilimda Char Rasta | "+"Swaminarayan College | "+"Kankariya Telephone Exchange | "+
                    "Kankariya Lake | "+"Rambaug | "+"Maninagar Char Rasta | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==8){
            a1="S.P.Ring Road Approach | Odhav Talav | Morlidhar Society | Chhotalal Ni Chali | "+
                    "Vallabh Nagar | Odhav Fire Station | Grid Station | Soni Ni Chali | Ajit Mill Char Rasta | "+
                    "Soma Textiles | Narayana Hospital | Rakhiyal Char Rasta | Patel Mills | Kalupur | "+
                    "Prem Darwaja | Delhi Darwaja | Sarkari Litho Press Cabin | Sarkari Litho Press | "+
                    "Hanumanpura | Gurudwara | Juna Vadaj | Ramapir No Tekaro | N R Patel Park | Bhavsar Hostel | "+
                    "Akhbarnagar | Pragatinagar | Shastrinagar | Jaimangal | Parasnagar | Parshwanath Jain Mandir | "+
                    "Bhuyangdev | Sattadhar Char Rasta | Sola Bridge | Science City Approach | Shukan Mall | "+
                    "Hetarth Party Plot | Science City | Bhadaj Circle";
            obtv.setText(a1);
        } else if(i==9){
            a1="Bhadaj Circle | Science City | Hetarth Party Plot | Shukan Mall | Science City Approach | "+
                    "Sola Bridge | Sattadhar Char Rasta | Bhuyangdev | Parshwanath Jain Mandir | Parasnagar | "+
                    "Jaimangal";
            obtv.setText(a1);
        } else if(i==10){
            a1="Jaimangal | Parasnagar | Parshwanath Jain Mandir | Bhuyangdev | Sattadhar Char Rasta | "+
                    "Sola Bridge | Science City Approach | Shukan Mall | Hetarth Party Plot | "+
                    "Science City | Bhadaj Circle";
            obtv.setText(a1);
        } else if(i==11){
            a1="Bhadaj Circle | Science City | Hetarth Party Plot | Shukan Mall | Science City Approach | "+
                    "Sola Bridge | Sattadhar Char Rasta | Bhuyangdev | Parshwanath Jain Mandir | "+
                    "Parasnagar | Jaimangal | Shastrinagar | Pragatinagar | Akhbarnagar | Bhavsar Hostel | "+
                    "N R Patel Park | Ramapir No Tekaro | Juna Vadaj | Gurudwara | Hanumanpura | "+
                    "Sarkari Litho Press | Sarkari Litho Press Cabin | Delhi Darwaja | Prem Darwaja | "+
                    "Kalupur Ghee Bazar | Kalupur | Patel Mills | Rakhiyal Char Rasta | Narayana Hospital | "+
                    "Soma Textiles | Ajit Mill Char Rasta | Soni Ni Chali | Grid Station | Odhav Fire Station | "+
                    "Vallabh Nagar | Chhotalal Ni Chali | Morlidhar Society | Odhav Talav | S.P.Ring Road Approach";
            obtv.setText(a1);
        } else if(i==12){
            a1="Maninagar | "+"Swaminarayan Mandir | "+"Jawahar Chowk | "+"Bhairavnath Road | "+
                    "Mira Cinema Char Rasta | "+"Kankariya Telephone Exchange | "+"Swaminarayan College | "+
                    "Danilimda Char Rasta | "+"Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+
                    "Dharnidhar Derasar | "+"Manekbaug | "+"Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+
                    "Himmatlal Park | "+"Andhjan Mandal | "+"University | "+"Memnagar | "+
                    "Shree Valinath Chowk | "+"Sola Cross Road | "+"Jaimangal | "+"Shastrinagar | "+"Pragatinagar | "+
                    "Akhbarnagar | "+"Bhavsar Hostel | "+"Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        } else if(i==13){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"Bhavsar Hostel | "+"Akhbarnagar | "+"Pragatinagar | "+
                    "Shastrinagar | "+"Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+
                    "University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+"Jhansi Ki Rani | "+
                    "Nehrunagar | "+"Manekbaug | "+"Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+
                    "Khodiyarnagar | "+"Danilimda Char Rasta | "+"Swaminarayan College | "+"Kankariya Telephone Ex. | "+
                    "Kankariya Lake | "+"Rambaug | "+"Maninagar Char Rasta | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==14){
            a1="LD Engg. College | Gulbai Tekra Approach | Panjrapole Char Rasta | L Colony | "+
                    "Nehrunagar | Jhansi Ki Rani | Shivranjani | Himmatlal Park | Andhjan Mandal | "+
                    "University | Memnagar | Shree Valinath Chowk | Sola Cross Road | Jaimangal | "+
                    "Shastrinagar | Pragatinagar | Akhbarnagar | Bhavsar Hostel | Ranip Cross Road | "+
                    "R.T.O.Circle | Sabarmati PowerHouse | Rathi Apartment | Sabarmati Municipal Swimming Pool | "+
                    "Sabarmati Police Station | Motera Cross Road | Visat Gandhinagar Junction | "+
                    "Ongc Avani Bhavan | Jantanagar | Shiv Shaktinagar | Chandkheda Gam | "+
                    "Sarthi Bungalows | DCIS Circle";
            obtv.setText(a1);
        } else if(i==15){
            a1="DCIS Circle | Sarthi Bungalows | Chandkheda Gam | Shiv Shaktinagar | Jantanagar | "+
                    "Ongc Avani Bhavan | Visat Gandhinagar Junction | Motera Cross Road | "+
                    "Sabarmati Police Station | Sabarmati Municipal Swimming Pool | Rathi Apartment | "+
                    "Sabarmati Power House | R.T.O.Circle | Ranip Cross Road | Bhavsar Hostel | Akhbarnagar | "+
                    "Pragatinagar | Shastrinagar | Jaimangal | Sola Cross Road | Shree ValinathChowk | Memnagar | "+
                    "University | Andhjan Mandal | Himmatlal Park | Shivranjani | Jhansi Ki Rani | Nehrunagar | "+
                    "L Colony | Panjrapole Char Rasta | Gulbai Tekra Approach | LD Engg.College";
            obtv.setText(a1);
        } else if(i==16){
            a1="Hanspura Ring Road | Sthapatya Eligance | Swaminarayan Park | Haridarshan Char Rasta | "+
                    "Muktidham Naroda | Naroda Gam | Bethak | Naroda | Naroda S.T. Workshop | Dhanush Dhari Mandir | "+
                    "Krishna nagar | Vijay Park Hirawadi | Thakkar Nagar Approach | Lilanagar | "+
                    "Bapu Nagar Approach | Viratnagar | Soni ni Chali | Geeta Gauri Cinema | Rameshwar Park | "+
                    "Ram Rajya Nagar | Rabari Colony | Jogeshwari Society | Purvdeep Society | CTM Cross Road | "+
                    "Express Highway Junction | Jabhodanagar Char Rasta | Ghodasar | Isanpur | Mukesh Industries | "+
                    "Narol | Kashiram Textiles | BRTS Workshop | Chandola Lake | Chhipa Society | DanilimdaRoad | "+
                    "Danilimda Char Rasta | Khodiyarnagar | Chandranagar | Anjali | Vasna";
            obtv.setText(a1);
        } else if(i==17){
            a1="Vasna | Anjali | Chandranagar | Khodiyarnagar | Danilimda Char Rasta | Chhipa Society | "+
                    "Chandola Lake |   Workshop | Kashiram Textiles | Narol | Mukesh Industries | Isanpur | "+
                    "Ghodasar | Jashodanagar Char Rasta | Express Highway Junction | CTM Cross Road | "+
                    "Purvdeep Society | Jogeshwari Society | Rabari Colony | Ram Rajya Nagar | "+
                    "Rameshwar Park→ Geeta Gauri Cinema | Soni ni Chali | Viratnagar | Bapu Nagar Approach | "+
                    "Lilanagar | Thakkar Nagar Approach | Hirawadi | Vijay Park | Krishna nagar | "+
                    "Dhanush Dhari Mandir | Naroda S. T. Workshop | Bethak | Naroda Gam | Muktidham | Naroda | "+
                    "Haridarshan Char Rasta | Swaminarayan Park | Sthapatya Eligance | Hanspura Ring Road";
            obtv.setText(a1);
        } else if(i==18){
            a1="Naroda S. T. Workshop | Dhanush Dhari Mandir | Krishna nagar | Vijay Park | Hirawadi | "+
                    "Thakkar Nagar Approach | lilanagar | bapu nagar approach | Viratnagar | soni ni Chali | "+
                    "Rameshwar Park | Ram Rajya Nagar | Rabari Colony | Jogeshwari Society | Purvdeep Society | "+
                    "CTM Cross Road | Express Highway Junction | Jashodanagar Char Rasta | Ghodasar | Isanpur | "+
                    "Mukesh Industries | Narol";
            obtv.setText(a1);
        } else if(i==19){
            a1="Narol | "+"Mukesh Industries | "+"Isanpur | "+"Ghodasar | "+"Jashodanagar Char Rasta | "+
                    "Express Highway Junction | "+"CTM Cross Road | "+"Purvdeep Society | "+
                    "Jogeshwari Society | "+"Rabari Colony | "+"Ram Rajya Nagar | "+"Rameshwar Park | "+
                    "Geeta Gauri Cinema | "+"Soni Ni Chali | "+"Viratnagar | "+"Bapu Nagar Approach | "+
                    "Lilanagar | "+"Thakkar Nagar Approach | "+"Hirawadi | "+"Vijay Park | "+
                    "Krishna Nagar | "+"Dhanush Dhari Mandir | "+"Naroda S.T. Workshop";
            obtv.setText(a1);
        } else if(i==20){
            a1="DCIS Circle | "+"Sarthi Bungalows | "+"Chandkheda Gam | "+"Shiv Shaktinagar | "+
                    "Jantanagar | "+"Ongc Avani Bhavan | "+"Vishvkarma Engineering College | "+
                    "Visat Gandhinagar Junction | "+"Motera Cross Road | "+"Sabarmati Police Station | "+
                    "Sabarmati Municipal Swimming Pool | "+"Rathi Apartment | "+"Sabarmati Power House | "+
                    "R.T.O.Circle | "+"Ranip Cross Road | "+"N R Patel Park | "+"Ramapir No Tekaro | "+
                    "Juna Vadaj | "+"Gurudwara | "+"Hanumanpura | "+"Sarkari Litho Press | "+
                    "Sarkari Litho Press Cabin | "+"Delhi Darwaja | "+"Prem Darwaja | "+
                    "Kalupur Ghee Bazar | "+"Kalupur | "+"Sarangpur Darwaja | "+"Karnamukteshwar Mahadev | "+
                    "Raipur Darwaja | "+"Astodiya Darwaja | "+"Geeta Mandir | "+"Bhulabhai Park | "+
                    "Mangal Park | "+"Swaminarayan College | "+"Vaikunth Dham Mandir | "+"Danilimda Road | "+
                    "Chhipa Society | "+"Chandola Lake | "+"BRTS Workshop | "+"Kashiram Textiles | "+"Narol";
            obtv.setText(a1);
        } else if(i==21){
            a1="Narol | Kashiram Textiles | BRTS Workshop | Chandola Lake | Chhipa Society | Danilimda Road | "+
                    "Vaikunth Dham Mandir | Swaminarayan College | Mangal Park | Bhulabhai Park | Geeta Mandir | "+
                    "Raipur Darwaja | Karnamukteshwar Mahadev | Sarangpur Darwaja Kalupur | Prem Darwaja | "+
                    "Delhi Darwaja | Sarkari Litho Press Cabin | Sarkari Litho Press | Hanumanpura | Gurudwara | "+
                    "Juna Vadaj | Ramapir No Tekaro | Patel Park | Ranip Cross Road | RTO Extension | "+
                    "Sabarmati power house | Rathi Apartment | Sabarmati Municipal Swimming pool | "+
                    "Sabarmati Police station | Motera Cross Road | Visat-Gandhinagar Junction | "+
                    "Vishvkarma Engineering | ONGC | Avani Bhavan | Jantanagar | Shiv Shaktinagar | "+
                    "Chandkheda Gam | Sarthi Bungalows | DCIS Circle";
            obtv.setText(a1);
        } else if(i==22){
            a1="Iskcon Cross Road | "+"Ramdevnagar | "+"ISRO | "+"Star Bazaar | "+"Jodhpur Char Rasta | "+
                    "Shivranjani | "+"Jhansi Ki Rani | "+"Nehrunagar | "+"L Colony | "+"Panjrapole Char Rasta | "+
                    "Gulbai Tekra Approach | "+"LD Engg. College | "+"Vasundhara Society | "+"Law Garden | "+"M J Library | "+"Lokamanya Tilak Bag | "+"Raikhad Char Rasta | "+
"Municipal Corporation Oce | "+"Astodiya Chakala | "+"Astodiya Darwaja | "+"Raipur Darwaja | "+"Karnamukteshwar Mahadev | "+"Sarangpur Darwaja | "+"Kalupur | "+"G.C.S. Hospital | "+"Arvind Mill | "+"Jeening Press | "+"Ashok Mill | "+"Naroda Fruit Market | "+"Memco Cross Road | "+"Municipal North Zone Oce | "+"Saijpur Towers | "+"Naroda S.T.Workshop | "+"Bethak | "+"Naroda Gam";
            obtv.setText(a1);
        } else if(i==23){
            a1="Naroda Gam | Bethak | Naroda ST Workshop | Saijpur Towers | Municipal North Zone Office | "+
                    "Memco Cross Road | Naroda Fruit Market | Ashok Mill | Jeening Press | Arvind Mill | G.C.S. Hospital | "+
                    "Kalupur Ghee Bazar | Kalupur | Sarangpur Darwaja | Karnamukteshwar Mahadev | Raipur Darwaja | "+
                    "Astodiya Darwaja | Astodiya Chakala | Municipal Corporation Office | Raikhad Char Rasta | "+
                    "Lokamanya Tilak Bag | MJ Library | Law Garden | Vasundhara Society | LD Engg. College | "+
                    "Gulbai Tekra Approach | Panjrapole Char Rasta | L colony | Nehru nagar | jhansi ki rani | "+
                    "shivranjini | "+"jodhpur char rasta | star bazaar | ISRO | Ramdevnagar | Iskcon Cross Road";
            obtv.setText(a1);
        } else if(i==24){
            a1="Gota Vasant Nagar Township | "+"Gota Cross Road | "+"Sola Bhagwat | "+"Gujarat High Court | "+
                    "Science City Approach | "+"Sola Bridge | "+"Sattadhar Char Rasta | "+"Bhuyangdev | "+
                    "Parshwanath Jain Mandir | "+"Parasnagar | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+
                    "Memnagar | "+"University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+
                    "Jhansi Ki Rani | "+"Nehrunagar | "+"L Colony | "+"Panjrapole Char Rasta | "+
                    "Gulbai Tekra Approach | "+"LD Engg. College | "+"Vasundhara Society | "+
                    "Law Garden | "+"M J Library | "+"Lokamanya Tilak Bag | "+"Raikhad Char Rasta | "+
                    "Municipal Corporation Oce | "+"Astodiya Chakala | "+"Geeta Mandir | "+"Bhulabhai Park | "+
                    "Mangal Park | "+"Kankariya Telephone Exchange | "+"Mira Cinema Char Rasta | "+
                    "Bhairavnath Road | "+"Jawahar Chowk | "+"Swaminarayan Mandir | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==25){
            a1="Maninagar | "+"Swaminarayan Mandir | "+"Jawahar Chowk | "+"Bhairavnath Road | "+
                    "Mira Cinema Char Rasta | "+"Kankariya Telephone Exchange | "+"Mangal Park | "+"Bhulabhai Park | "+
                    "Geeta Mandir | "+"Astodiya Darwaja | "+"Astodiya Chakala | "+"Municipal Corporation Oce | "+
                    "Raikhad Char Rasta | "+"Lokamanya Tilak Bag | "+"M J Library | "+"Law Garden | "+
                    "Vasundhara Society | "+"LD Engg. College | "+"Gulbai Tekra Approach | "+
                    "Panjrapole Char Rasta | "+"L Colony | "+"Nehrunagar | "+"Jhansi Ki Rani | "+
                    "Shivranjani | "+"Himmatlal Park | "+"Andhjan Mandal | "+"University | "+
                    "Memnagar | "+"Shree Valinath Chowk | "+"Sola Cross Road | "+"Parasnagar | "+
                    "Parshwanath Jain Mandir | "+"Bhuyangdev | "+"Sattadhar Char Rasta | "+
                    "Sola Bridge | "+"Science City Approach | "+"Gujarat High Court | "+"Sola Bhagwat | "+
                    "Gota Cross Road | "+"Gota Vasant Nagar Township";
            obtv.setText(a1);
        } else if(i==26){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"N R Patel Park | "+"Ramapir No Tekaro | "+
                    "Juna Vadaj | "+"Gurudwara | "+"Hanumanpura | "+"Sarkari Litho Press | "+
                    "Sarkari Litho Press Cabin | "+"Delhi Darwaja | "+"Prem Darwaja | "+
                    "Kalupur Ghee Bazar | "+"Kalupur | "+"Sarangpur Darwaja | "+"Karnamukteshwar Mahadev | "+
                    "Raipur Darwaja | "+"Astodiya Darwaja | "+"Geeta Mandir | "+"Bhulabhai Park | "+
                    "Mangal Park | "+"Swaminarayan College | "+"Vaikunth Dham Mandir | "+"Danilimda Char Rasta | "+
                    "Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+"Dharnidhar Derasar | "+"Manekbaug | "+
                    "Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+"Himmatlal Park | "+"Andhjan Mandal | "+
                    "University | "+"Memnagar | "+"Shree Valinath Chowk | "+"Sola Cross Road | "+"Jaimangal | "+
                    "Shastrinagar | "+"Pragatinagar | "+"Akhbarnagar | "+"Bhavsar Hostel | "+
                    "Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        } else if(i==27){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"Bhavsar Hostel | "+"Akhbarnagar | "+"Pragatinagar | "+
                    "Shastrinagar | "+"Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+
                    "University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+"Jhansi Ki Rani | "+
                    "Nehrunagar | "+"Manekbaug | "+"Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+
                    "Khodiyarnagar | "+"Danilimda Char Rasta | "+"Vaikunth Dham Mandir | "+"Swaminarayan College | "+
                    "Mangal Park | "+"Bhulabhai Park | "+"Geeta Mandir | "+"Raipur Darwaja | "+
                    "Karnamukteshwar Mahadev | "+"Sarangpur Darwaja | "+"Kalupur | "+"Prem Darwaja | "+
                    "Delhi Darwaja | "+"Sarkari Litho Press Cabin | "+"Sarkari Litho Press | "+"Hanumanpura | "+
                    "Gurudwara | "+"Juna Vadaj | "+"Ramapir No Tekaro | "+"N R Patel Park | "+
                    "Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        } else if(i==28){
            a1="LD Engg. College | "+"Vasundhara Society | "+"Law Garden | "+"M J Library | "+
                    "Lokamanya Tilak Bag | "+"Raikhad Char Rasta | "+"Municipal Corporation Oce | "+
                    "Astodiya Chakala | "+"Astodiya Darwaja | "+"Raipur Darwaja | "+
                    "Karnamukteshwar Mahadev | "+"Sarangpur Darwaja | "+"Patel Mills | "+"Rakhiyal Char Rasta | "+
                    "Narayana Hospital | "+"Soma Textiles | "+"Ajit Mill Char Rasta | "+"Soni Ni Chali | "+
                    "Grid Station | "+"Odhav Fire Station | "+"Vallabh Nagar | "+"Chhotalal Ni Chali | "+
                    "Morlidhar Society | "+"Odhav Talav | "+"S.P.Ring Road Approach";
            obtv.setText(a1);
        } else if(i==29){
            a1="S.P.Ring Road Approach | "+"Odhav Talav | "+"Morlidhar Society | "+"Chhotalal Ni Chali | "+
                    "Vallabh Nagar | "+"Odhav Fire Station | "+"Grid Station | "+"Soni Ni Chali | "+ "Ajit Mill Char Rasta | "+"Soma Textiles | "+"Narayana Hospital | "+"Rakhiyal Char Rasta | "+ "Patel Mills | "+"Sarangpur Darwaja | "+"Karnamukteshwar Mahadev | "+"Raipur Darwaja | "+"Astodiya Darwaja | "+"Astodiya Chakala | "+"Municipal Corporation Oce | "+"Raikhad Char Rasta | "+"Lokamanya Tilak Bag | "+"M J Library | "+"Law Garden | "+"Vasundhara Society | "+"LD Engg. College";
            obtv.setText(a1);
        }
        else if(i==30){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"Bhavsar Hostel | "+"Akhbarnagar | "+"Pragatinagar | "+"Shastrinagar | "+"Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+"University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+"Jhansi Ki Rani | "+"Nehrunagar | "+"Manekbaug | "+"Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+"Khodiyarnagar | "+"Danilimda Char Rasta | "+"Danilimda Road | "+"Chhipa Society | "+"Chandola Lake | "+"BRTS Workshop | "+"Kashiram Textiles | "+"Narol | "+"Mukesh Industries | "+"Isanpur | "+"Ghodasar | "+"Jashodanagar Char Rasta | "+"Express Highway Junction | "+"CTM Cross Road";
            obtv.setText(a1);
        }
        else if(i==31){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"Bhavsar Hostel | "+"Akhbarnagar | "+"Pragatinagar | "+
                    "Shastrinagar | "+"Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+
                    "University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+"Jhansi Ki Rani | "+
                    "Nehrunagar | "+"Manekbaug | "+"Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+
                    "Khodiyarnagar | "+"Danilimda Char Rasta | "+"Danilimda Road | "+"Chhipa Society | "+
                    "Chandola Lake | "+"BRTS Workshop | "+"Kashiram Textiles | "+"Narol | "+"Mukesh Industries | "+
                    "Isanpur | "+"Ghodasar | "+"Jashodanagar Char Rasta | "+"Express Highway Junction | "+
                    "CTM Cross Road | "+"Purvdeep Society | "+"Jogeshwari Society | "+"Rabari Colony | "+
                    "Ram Rajya Nagar | "+"Rameshwar Park";
            obtv.setText(a1);
        }
        else if(i==32){
            a1="CTM Cross Road | "+"Express Highway Junction | "+"Jashodanagar Char Rasta | "+"Ghodasar | "+
                    "Isanpur | "+"Mukesh Industries | "+"Narol | "+"Kashiram Textiles | "+"BRTS Workshop | "+
                    "Chandola Lake | "+"Chhipa Society | "+"Danilimda Road | "+"Danilimda Char Rasta | "+
                    "Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+"Dharnidhar Derasar | "+"Manekbaug | "+
                    "Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+"Himmatlal Park | "+"Andhjan Mandal | "+
                    "University | "+"Memnagar | "+"Shree Valinath Chowk | "+"Sola Cross Road | "+
                    "Jaimangal | "+"Shastrinagar | "+"Pragatinagar | "+"Akhbarnagar | "+"Bhavsar Hostel | "+
                    "Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        }
        else if(i==33){
            a1="Rameshwar Park | "+"Ram Rajya Nagar | "+"Rabari Colony | "+"Jogeshwari Society | "+
                    "Purvdeep Society | "+"CTM Cross Road | "+"Express Highway Junction | "+
                    "Jashodanagar Char Rasta | "+"Ghodasar | "+"Isanpur | "+"Mukesh Industries | "+"Narol | "+
                    "Kashiram Textiles | "+"BRTS Workshop | "+"Chandola Lake | "+"Chhipa Society | "+
                    "Danilimda Road | "+"Danilimda Char Rasta | "+"Khodiyarnagar | "+"Chandranagar | "+
                    "Anjali | "+"Dharnidhar Derasar | "+"Manekbaug | "+"Nehrunagar | "+"Jhansi Ki Rani | "+
                    "Shivranjani | "+"Himmatlal Park | "+"Andhjan Mandal | "+"University | "+"Memnagar | "+
                    "Shree Valinath Chowk | "+"Sola Cross Road | "+"Jaimangal | "+"Shastrinagar | "+
                    "Pragatinagar | "+"Akhbarnagar | "+"Bhavsar Hostel | "+"Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        }
        else if(i==34){
            a1="Sanand Circle | "+"Sarkhej Circle | "+"Ambar Tower | "+"Khurshid Park | "+"Juhapura Road | "+
                    "Maktampura Ward Oce | "+"Pravinnagar | "+"Vasna Terminus | "+"Anjali | "+"Chandranagar | "+
                    "Khodiyarnagar | "+"Danilimda Char Rasta | "+"Vaikunth Dham Mandir | "+"Swaminarayan College | "+
                    "Mangal Park | "+"Bhulabhai Park | "+"Geeta Mandir | "+"Raipur Darwaja | "+
                    "Karnamukteshwar Mahadev | "+"Sarangpur Darwaja | "+"Kalupur | "+"G.C.S. Hospital | "+
                    "Arvind Mill | "+"Jeening Press | "+"Ashok Mill | "+"Naroda Fruit Market | "+
                    "Memco Cross Road | "+"Municipal North Zone Oce | "+"Saijpur Towers | "+
                    "Naroda S.T.Workshop | "+"Bethak | "+"Naroda Gam";
            obtv.setText(a1);
        }
        else if(i==35){
            a1="Naroda Gam | "+"Bethak | "+"Naroda S.T.Workshop | "+"Saijpur Towers | "+"Municipal North Zone Oce | "+
                    "Memco Cross Road | "+"Naroda Fruit Market | "+"Ashok Mill | "+"Jeening Press | "+
                    "Arvind Mill | "+"G.C.S. Hospital | "+"Kalupur Ghee Bazar | "+"Kalupur | "+"Sarangpur Darwaja | "+
                    "Karnamukteshwar Mahadev | "+"Raipur Darwaja | "+"Astodiya Darwaja | "+"Geeta Mandir | "+
                    "Bhulabhai Park | "+"Mangal Park | "+"Swaminarayan College | "+"Vaikunth Dham Mandir | "+
                    "Danilimda Char Rasta | "+"Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+"Vasna Terminus | "+
                    "Pravinnagar | "+"Maktampura Ward Oce | "+"Juhapura Road | "+"Khurshid Park | "+
                    "Ambar Tower | "+"Sarkhej Circle | "+"Sanand Circle";
            obtv.setText(a1);
        }
        else if(i==36){
            a1="Iskcon Cross Road | "+"Ramdevnagar | "+"ISRO | "+"Star Bazaar | "+"Jodhpur Char Rasta | "+
                    "Himmatlal Park | "+"Andhjan Mandal | "+"University | "+"Memnagar | "+
                    "Shree Valinath Chowk | "+"Sola Cross Road | "+"Jaimangal | "+"Shastrinagar | "+
                    "Pragatinagar | "+"Akhbarnagar | "+"Bhavsar Hostel | "+"Ranip Cross Road | "+"R.T.O.Circle";
            obtv.setText(a1);
        }
        else if(i==37){
            a1="R.T.O.Circle | "+"Ranip Cross Road | "+"Bhavsar Hostel | "+"Akhbarnagar | "+"Pragatinagar | "+
                    "Shastrinagar | "+"Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+
                    "University | "+"Andhjan Mandal | "+"Himmatlal Park | "+"Jodhpur Char Rasta | "+"Star Bazaar | "+
                    "ISRO | "+"Ramdevnagar | "+"Iskcon Cross Road";
            obtv.setText(a1);
        }
        else if(i==38){
            a1="Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+"Jodhpur Char Rasta | "+"Star Bazaar | "+"ISRO | "+
                    "Ramdevnagar | "+"Iskcon Cross Road | "+"Karnavati Club | "+"Prahalad Nagar Cross Road | "+
                    "Makarba Road | "+"Sanand Circle";
            obtv.setText(a1);
        }
        else if(i==39){
            a1="Sanand Circle | "+"Makarba Road | "+"Prahalad Nagar Cross Road | "+"Karnavati Club | "+
                    "Iskcon Cross Road | "+"Ramdevnagar | "+"ISRO | "+"Star Bazaar | "+"Jodhpur Char Rasta | "+
                    "Shivranjani | "+"Jhansi Ki Rani | "+"Nehrunagar";
            obtv.setText(a1);
        } else if(i==40){
            a1="Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+
                    "Jodhpur Char Rasta | "+"Star Bazaar | "+"ISRO | "+
                    "Ramdevnagar | "+"Iskcon Cross Road | "+"Iskcon Mandir | "+
                    "Antariksh Colony | "+"Ashok Vatika | "+"Jayantilal Park | "+
                    "Swagat Bungalow | "+"Ambli Gam | "+"Bopal Approach | "+
                    "Sobo Center | "+"Sukhasan Char Rasta | "+"South Bopal";
            obtv.setText(a1);
        } else if(i==41){
            a1="South Bopal | "+"Sukhasan Char Rasta | "+"Sobo Center | "+
                    "Bopal Approach | "+"Ambli Gam | "+"Swagat Bungalow | "+"Jayantilal Park | "+
                    "Ashok Vatika | "+"Antariksh Colony | "+"Iskcon Mandir | "+"Iskcon Cross Road | "+
                    "Ramdevnagar | "+"ISRO | "+"Star Bazaar | "+"Jodhpur Char Rasta | "+
                    "Shivranjani | "+"Jhansi Ki Rani | "+"Nehrunagar";
            obtv.setText(a1);
        } else if(i==42){
            a1="Maninagar | "+"Maninagar Char Rasta | "+"Rambaug | "+"Kankariya Lake | "+
                    "Kankariya Telephone Exchange | "+"Mangal Park | "+"Bhulabhai Park | "+
                    "Geeta Mandir | "+"Raipur Darwaja | "+"Karnamukteshwar Mahadev | "+
                    "Sarangpur Darwaja | "+"Kalupur | "+"Civil Hospital Corner | "+
                    "Hanuman Camp | "+"Airport Circle | "+"Ahmedabad Domestic Airport";
            obtv.setText(a1);
        } else if(i==43){
            a1="Ahmedabad Domestic Airport | "+"Airport Circle | "+"Hanuman Camp | "+
                    "Civil Hospital Corner | "+"Kalupur Ghee Bazar | "+"Sarangpur Darwaja | "+
                    "Karnamukteshwar Mahadev | "+"Raipur Darwaja | "+"Astodiya Darwaja | "+"Geeta Mandir | "+
                    "Bhulabhai Park | "+"Mangal Park | "+"Kankariya Telephone Exchange | "+"Kankariya Lake | "+
                    "Rambaug | "+"Maninagar Char Rasta | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==44){
            a1="Jaimangal | "+"Sola Cross Road | "+"Shree Valinath Chowk | "+"Memnagar | "+"University | "+
                    "Andhjan Mandal | "+"Himmatlal Park | "+"Shivranjani | "+"Jhansi Ki Rani | "+
                    "Nehrunagar | "+"Manekbaug | "+"Dharnidhar Derasar | "+"Anjali | "+"Chandranagar | "+
                    "Khodiyarnagar | "+"Danilimda Char Rasta | "+"Vaikunth Dham Mandir | "+
                    "Swaminarayan College | "+"Kankariya Telephone Exchange | "+"Kankariya Lake | "+"Rambaug | "+"Maninagar Char Rasta | "+"Maninagar";
            obtv.setText(a1);
        } else if(i==45){
            a1="Maninagar | "+"Maninagar Char Rasta | "+"Rambaug | "+"Kankariya Lake | "+"Kankariya Telephone Exchange | "+"Swaminarayan College | "+"Vaikunth Dham Mandir | "+ "Danilimda Char Rasta | "+"Khodiyarnagar | "+"Chandranagar | "+"Anjali | "+"Dharnidhar Derasar | "+"Manekbaug | "+"Nehrunagar | "+"Jhansi Ki Rani | "+"Shivranjani | "+"Himmatlal Park | "+"Andhjan Mandal | "+"University | "+"Memnagar | "+"Shree Valinath Chowk | "+"Sola Cross Road | "+"Jaimangal";
            obtv.setText(a1);
        }
    }public void onNothingSelected(AdapterView<?> adapterView){}
}
