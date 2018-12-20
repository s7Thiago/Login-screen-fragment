package br.thiagosousa.example.fragment;		

import android.app.*;
import android.os.*;
import android.widget.*;
import android.util.*;

public class HomeActivity extends Activity {
    
    TextView texto;

	@Override
	public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
		// TODO: Implement this method
		super.onCreate(savedInstanceState, persistentState);
		setContentView(R.layout.home_activity);
    
    //Initializing views
    initViews(true);
    
    //Ocultando a barra de acoes
    hideActionBar();
    
	}
  
  public void hideActionBar() {
      ActionBar actionBar = getActionBar();
      actionBar.hide();
      Toast.makeText(this, "Ocultando actionbar", Toast.LENGTH_SHORT);
  }

  @Override
  protected void onStart()
  {
      // TODO: Implement this method
      super.onStart();
      Toast.makeText(getBaseContext(), "Welcome, user!!!!", Toast.LENGTH_SHORT).show();
  }
  
  public void initViews(boolean init) {
      
      if(init) {
          Log.i("HOME_Activity", "The views has been initialized");
          Toast.makeText(getBaseContext(), "The views has been initialized", Toast.LENGTH_SHORT).show();
          texto = findViewById(R.id.home_activityTextView);
          
      }
  }
  
}
