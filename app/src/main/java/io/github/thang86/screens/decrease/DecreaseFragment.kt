package io.github.thang86.screens.decrease

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import io.github.thang86.MainActivity
import io.github.thang86.R
import io.github.thang86.databinding.FragmentDecreaseBinding
import io.github.thang86.databinding.FragmentIncreaseBinding
import io.github.thang86.screens.increase.IncreaseViewModel

/**
 *
 *    DecreaseFragment.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class DecreaseFragment : Fragment() {

    private lateinit var binding: FragmentDecreaseBinding
    private val viewModel: DecreaseViewModel by viewModels {
        ScoreViewModelFactory(DecreaseFragmentArgs.fromBundle(requireArguments()).score)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate view and obtain an instance of the binding class.
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_decrease,
            container,
            false
        )

        binding.apply {
            view = this@DecreaseFragment
            decreaseViewModel = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    fun onDecrease() {
        (context as MainActivity).onDecrease()
        viewModel.onDecrease((context as MainActivity).scope)
    }

    fun onBackPress() {
        NavHostFragment.findNavController(this).popBackStack()
    }

}