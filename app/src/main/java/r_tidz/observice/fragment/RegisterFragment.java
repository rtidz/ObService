package r_tidz.observice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import r_tidz.observice.MainActivity;
import r_tidz.observice.R;

/**
 * Created by User on 28/10/2560.
 */

public class RegisterFragment extends Fragment{


//    Explicit
    private String nameString, userString, passwordString;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        create Toolbar
        createToolbar();


//        Savecontroler
        savecontroler();



    }   // Main method


    private void savecontroler() {
        ImageView imageView = getView().findViewById(R.id.imvsave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // GetValueFromEdtitText
                EditText nameEditText = getView().findViewById(R.id.edtname);
                EditText userEditText = getView().findViewById(R.id.edtuser);
                EditText passwprdEditText = getView().findViewById(R.id.edtpassword);



                // Change Type Value tostring

                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwprdEditText.getText().toString();

                // Checkspace  if it have null space in namestring or uesrsting

                if (nameString.equals("")|| userString.equals("") || passwordString.equals("")) {
                } else {

                }


            }       // Onclick
        });
    }








    private void createToolbar() {
        Toolbar toolbar= getView().findViewById(R.id.toolbarregister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).setTitle(getResources().getString(R.string.new_register));

        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager().popBackStack();


            }
        });




    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_register, container, false);
        return view;


    }












}   //MainClass
