package sg.edu.rp.c346.id19002765.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        gender = findViewById(R.id.imageViewGender);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);
        alContactList.add(new Contact("Ken", 65, 98883738, 'M'));

        caContact = new CustomAdapter(this,R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}
