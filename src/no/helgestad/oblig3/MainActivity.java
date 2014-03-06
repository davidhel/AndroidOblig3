package no.helgestad.oblig3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView filmStuff;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		filmStuff = (TextView) findViewById(R.id.tvHttp);
		GetInfo test = new GetInfo();
		String returned;
		try {
			filmStuff.setText("Starter");
			returned = test.getTitle();
			filmStuff.setText(returned);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filmStuff.setText("Feil");
		}
		
	}

	

	public void btnActivity(View view) {
		Intent intent = new Intent(this, FlagActivity.class);
		startActivity(intent);
	}

}
