package io.github.thang86.screens.increase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import io.github.thang86.MainActivity
import io.github.thang86.R
import io.github.thang86.databinding.FragmentIncreaseBinding

/**
 *
 *    IncreaseFragment.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class IncreaseFragment : Fragment() {

    private lateinit var binding: FragmentIncreaseBinding
    private val viewModel: IncreaseViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_increase,
            container,
            false
        )


        //Setting up livedata observation relationship
        binding.apply {
            view = this@IncreaseFragment
            increaseViewModel = viewModel
            lifecycleOwner = viewLifecycleOwner

        }

        viewModel.onInrease((context as MainActivity).scope)

        return binding.root
    }


    fun onIncrease() {
        (context as MainActivity).onIncrease()
        viewModel.onInrease((context as MainActivity).scope)

    }

    // This func use navigate screen
    fun onNavigateScreen() {
        val action = IncreaseFragmentDirections.actionNavigate()
        action.score = viewModel.score.value ?: 0
        NavHostFragment.findNavController(this).navigate(action)
    }

}