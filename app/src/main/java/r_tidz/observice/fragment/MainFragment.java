package r_tidz.observice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import r_tidz.observice.R;

/**
 * Created by User on 28/10/2560.
 */

public class MainFragment extends Fragment {

//    create MAin Method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        RegisterController
        registerController();


    }   //Main method






    private void registerController() {
        TextView textView=getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Move to registerFragment
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentFragmentMain,new RegisterFragment())
                        .addToBackStack(null).commit();


            }
        });
    }






    //    Create View Group
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        return view;
    }
}   //Mainclass
