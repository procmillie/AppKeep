package ie.nuim.cs.appkeep;

import android.support.v7.app.ActionBarActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Database_Home extends Activity {

	//Defining buttons for the DATABASE HOMEPAGE
	
	Button create;
	Button edit;
	Button lastDate;
	Button dueDate;
	Toast t;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database__home);
        
        //setting up the connection between xml and java files
        create = (Button) findViewById(R.id.bn_db_input);
        edit = (Button) findViewById(R.id.bn_db_edit);
        lastDate = (Button) findViewById(R.id.bn_db_date_last_service);
        dueDate = (Button) findViewById(R.id.bn_db_date_due);
        
        //setting up an onClickListener for the create button
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				t.makeText(getApplicationContext(), "Updated", t.LENGTH_LONG).show();
			}
		});
      //setting up an onClickListener for the edit button
        edit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
      //setting up an onClickListener for the date-of-last-service button
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DatePickerDialog dpLast = new DatePickerDialog();
			}
		});
      //setting up an onClickListener for the due-date-for-service button
        edit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.database__home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
