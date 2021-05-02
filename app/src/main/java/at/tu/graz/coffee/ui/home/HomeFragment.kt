package at.tu.graz.coffee.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import at.tu.graz.coffee.model.Coffee
import at.tu.graz.coffee.model.CoffeeType
import at.tu.graz.coffee.R
import at.tu.graz.coffee.ui.Functions.CustomerAdapter
import java.lang.NullPointerException

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var coffeeList = mutableListOf<Coffee>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)


        //create dummy data
        fillCoffeeliest()


        val listView:ListView = root.findViewById<ListView>(R.id.home_listview)
        listView.adapter = CustomerAdapter(requireContext(), coffeeList)
        return root
    }

    private fun fillCoffeeliest(){

        coffeeList.add(Coffee("Caffe Crema", 9.00, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.spar_premium_caffe_crema ))
        coffeeList.add(Coffee("Barista Espresso", 3.50, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_barista_espresso ))
        coffeeList.add(Coffee("Black and White", 5.0, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_black_and_white ))
        coffeeList.add(Coffee("Caffe Crema", 9.00, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.spar_premium_caffe_crema ))
        coffeeList.add(Coffee("Barista Espresso", 3.50, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_barista_espresso ))
        coffeeList.add(Coffee("Black and White", 5.0, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_black_and_white ))
        coffeeList.add(Coffee("Caffe Crema", 9.00, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.spar_premium_caffe_crema ))
        coffeeList.add(Coffee("Barista Espresso", 3.50, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_barista_espresso ))
        coffeeList.add(Coffee("Black and White", 5.0, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_black_and_white ))
        coffeeList.add(Coffee("Black and White", 5.0, "Supermarket",
                CoffeeType.NONE, 1.00,1," ",
                R.drawable.tchibo_black_and_white ))
    }





}

