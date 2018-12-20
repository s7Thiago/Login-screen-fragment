package br.thiagosousa.example.fragment;																														
import android.app.*;
import android.view.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;
import android.util.*;

public class FragmentLogin extends Fragment {
	
	private Button signInButton;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO: Implement this method
		View view = inflater.inflate(R.layout.fragment_layout, container, false);
		
		//
		final EditText editEmail = view.findViewById(R.id.fragmentlayoutEditTextEmail);
		final EditText editPass = view.findViewById(R.id.fragmentlayoutEditTextPassword);
		signInButton = view.findViewById(R.id.fragmentlayoutButtonSignIn);
		
		signInButton.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					 //TODO: Implement this method
					
					Log.d("FragmentLogin test: ", "\nEntrando no if");
					Log.d("FragmentLogin test: ", "\n\n          Dados Recebidos\nEmail: " + editEmail.getText().toString() + "     Password: " +  editPass.getText().toString() + "\n\n");
					
					if((editEmail.getText().toString().length() != 0) && (editPass.getText().toString().length() != 0)) {
						
						Log.i("FragmentLogin test: ", "\nVerificado com sucesso");
            
            View v1 = view.findViewById(R.id.fragment_layoutRelativeLayout);
            
            Pair<View, String> pair1 = Pair.create(v1, "mainLayoutTransition");

						Toast.makeText(getActivity().getBaseContext(), "Fazendo login", Toast.LENGTH_SHORT).show();
            
            Intent intent = new Intent(getActivity().getApplicationContext(), HomeActivity.class);
            //ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), v1, "mainLayoutTransition");
            
						//startActivity(intent, options.toBundle());
            startActivity(intent);
						Log.w("FragmentLogin test: ", "\n\n Email: " + editEmail.getText().toString() + "     Password: " +  editPass.getText().toString() + "\n\n");
						
					} else {
						Log.e("FragmentLogin test: ", "\n\nFalha detectada....\n\n");
						
						if(editEmail.getText().toString().length() == 0) {
						Log.e("FragmentLogin test: ", "\nFaltou preencher o campo de email\n\n");
						editEmail.setError("Digite seu email");
						}
						
						if(editPass.getText().toString().length() == 0) {
						Log.e("FragmentLogin test: ", "\nFaltou preencher o campo de senha\n\n");
						editPass.setError("Digite sua senha");
						}
					}
				}
		});
    
		return view;
	}
}
