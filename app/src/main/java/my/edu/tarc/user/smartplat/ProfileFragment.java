package my.edu.tarc.user.smartplat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {
    private View view;
    private TextView textViewUser, textViewName, textViewContact, textViewEmail, textViewAddress;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_fragment, container, false);
        textViewUser = (TextView)view.findViewById(R.id.tv_Username);
        textViewName = (TextView)view.findViewById(R.id.tv_Name);
        textViewContact = (TextView)view.findViewById(R.id.tv_Phone);
        textViewEmail = (TextView)view.findViewById(R.id.tv_Email);
        textViewAddress = (TextView)view.findViewById(R.id.tv_Address);

        textViewUser.setText(SharedPrefManager.getInstance(getContext()).getUsername());
        textViewEmail.setText(SharedPrefManager.getInstance(getContext()).getUserEmail());
        textViewName.setText(SharedPrefManager.getInstance(getContext()).getName());
        textViewContact.setText(SharedPrefManager.getInstance(getContext()).getUserContact());
        textViewAddress.setText(SharedPrefManager.getInstance(getContext()).getUserAddress());

        return view;
        //return inflater.inflate(R.layout.profile_fragment,container,false);
    }

}
