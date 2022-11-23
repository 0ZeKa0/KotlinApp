package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.Fragment2Binding

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class Fragment2 : Fragment() {
    private lateinit var listeAdapter: RecycleAdapter
    private val hideHandler = Handler(Looper.myLooper()!!)
    val calisma_suresi= ArrayList<String>()
    val Is = ArrayList<String>()

    @Suppress("InlinedApi")
    private val hidePart2Runnable = Runnable {

    }
    private val showPart2Runnable = Runnable {

    }


    private var _binding: Fragment2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        listeAdapter = RecycleAdapter(calisma_suresi,Is)
        super.onViewCreated(view, savedInstanceState)

    }
}

