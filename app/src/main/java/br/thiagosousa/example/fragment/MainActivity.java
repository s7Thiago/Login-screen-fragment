package br.thiagosousa.example.fragment;																								

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity  {
	
	private FrameLayout fragmentContainer;
	private Button addFragment;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		fragmentContainer = findViewById(R.id.mainFrameLayoutContainer);
		addFragment = findViewById(R.id.mainButtonActivityFragment);
		
		addFragment.setOnClickListener(addFragment());
    }
	
	public OnClickListener addFragment() {
		
		return new View.OnClickListener() {

			@Override
			public void onClick(View p1){
				// TODO: Implement this method
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				ft.replace(R.id.mainFrameLayoutContainer, new FragmentLogin());
				ft.addToBackStack(null);
				ft.commit();
			}
			
			
		};
	}
	
}
