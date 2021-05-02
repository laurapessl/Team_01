package at.tu.graz.coffee.ui.search

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.SyncStateContract
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import at.tu.graz.coffee.MainActivity
import at.tu.graz.coffee.R
import android.view.View.OnClickListener
import android.widget.*
import at.tu.graz.coffee.model.Coffee
import at.tu.graz.coffee.model.CoffeeType
import at.tu.graz.coffee.ui.Functions.CoffeeData
import at.tu.graz.coffee.ui.Functions.CustomerAdapter

public class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchViewModel =
            ViewModelProvider(this).get(SearchViewModel::class.java)

        var rootView : View
        rootView = inflater.inflate(R.layout.fragment_search, container, false)


        var user_input = rootView.findViewById<EditText>(R.id.input_field)
        var button : Button = rootView.findViewById<Button>(R.id.button_search)
        button.setOnClickListener{
            Toast.makeText(view?.context, user_input.text, Toast.LENGTH_LONG).show()
            val listView: ListView = rootView.findViewById<ListView>(R.id.home_listview)
            listView.adapter = CustomerAdapter(requireContext(), CoffeeData.coffeeList)
        }


        return rootView

    }

}


