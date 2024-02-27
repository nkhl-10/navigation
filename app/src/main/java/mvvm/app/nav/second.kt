package mvvm.app.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class second : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_second, container, false)
        val frist = v.findViewById<TextView>(R.id.second)
        frist.setOnClickListener {
            findNavController().navigate(R.id.action_second_to_three)
        }
        return v
    }
}