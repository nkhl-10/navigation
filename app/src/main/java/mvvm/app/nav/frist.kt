package mvvm.app.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class frist : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_frist, container, false)
        val frist = v.findViewById<TextView>(R.id.frist)
        frist.setOnClickListener {
            findNavController().navigate(R.id.action_frist_to_second)
        }
        return v
    }

}