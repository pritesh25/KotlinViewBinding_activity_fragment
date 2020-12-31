package com.vinrak.fragmentviewbinding

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vinrak.fragmentviewbinding.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val b get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        //return inflater.inflate(R.layout.fragment_home, container, false)
        return b.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.tvFragmentName.text = "Hi this is fragment from of view binding"

        val nameAdapter = NameAdapter(requireContext(), arrayListOf("Imran", "Pritesh", "Sarvesh"))
        b.nameRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = nameAdapter
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}