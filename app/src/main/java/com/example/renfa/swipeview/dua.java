package com.example.renfa.swipeview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link dua.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link dua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dua extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters
    private String title;
    private int imageMain;
    private int imageSecondary;

    private OnFragmentInteractionListener mListener;

    public dua() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param //param1 Parameter 1.
     * @param //param2 Parameter 2.
     * @return A new instance of fragment dua.
     */
    // TODO: Rename and change types and number of parameters
    public static dua newInstance(String title, int resMainImage, int resSecondaryImage) {
        dua fragment = new dua();
        Bundle args = new Bundle();
        args.putInt("imageMain", resMainImage);
        args.putInt("imageSecondary", resSecondaryImage);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            imageMain = getArguments().getInt("imageMain", 0);
            imageSecondary = getArguments().getInt("imageSecondary", 0);
            title = getArguments().getString("title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dua, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.txtMain);
        tvLabel.setText(title);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);
        imageView.setImageResource(imageMain);
        ImageView imageViewSecondary = (ImageView) view.findViewById(R.id.imgSecondary);
        imageViewSecondary.setImageResource(imageSecondary);
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
