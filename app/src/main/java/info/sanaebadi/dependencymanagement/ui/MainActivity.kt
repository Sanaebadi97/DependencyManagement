package info.sanaebadi.dependencymanagement.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.dependencymanagement.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.tvData.text = viewModel.getSomeData

    }
}