package com.example.bibliogaitebeta.Fragmentos;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.bibliogaitebeta.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmento_Reserva_Sala#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento_Reserva_Sala extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText editTextHora;
    private Calendar calendar;
    private Calendar calendarFecha;
    private EditText editTextFecha;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmento_Reserva_Sala() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento_reserva_sala.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento_Reserva_Sala newInstance(String param1, String param2) {
        Fragmento_Reserva_Sala fragment = new Fragmento_Reserva_Sala();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragmento_reserva_sala, container, false);

        editTextHora = view.findViewById(R.id.editTextHora);
        calendar = Calendar.getInstance();

        editTextHora.setOnClickListener(v -> showTimePickerDialog());
        editTextFecha = view.findViewById(R.id.editTextFecha2);
        calendarFecha = Calendar.getInstance();

        editTextFecha.setOnClickListener(v -> showDatePickerDialog());

        return view;
    }

    private void showTimePickerDialog() {
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(),
                (view, hourOfDay, minute1) -> {
                    String selectedTime = hourOfDay + ":" + minute1;
                    editTextHora.setText(selectedTime);
                }, hour, minute, true);

        timePickerDialog.show();
    }

    private void showDatePickerDialog() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext(),
                (view, year1, monthOfYear, dayOfMonth1) -> {
                    String selectedDate = dayOfMonth1 + "/" + (monthOfYear + 1) + "/" + year1;
                    editTextFecha.setText(selectedDate);
                }, year, month, dayOfMonth);

        datePickerDialog.show();
    }
}