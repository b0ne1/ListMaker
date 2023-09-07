package com.raywenderlich.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.raywenderlich.listmaker.ui.main.MainFragment
import com.raywenderlich.listmaker.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        binding.fabButton.setOnClickListener{
            showCreateListDialog()
        }
    }

    private fun showCreateListDialog() {
        val dialogTitle = getString(R.string.name_of_list)
        val positiveButtonTitle = getString(R.string.create_list)

        val builder = AlertDialog.Builder(this)
        val listTitleEditText = EditText(this)

        builder.setTitle(dialogTitle)
        builder.setView(listTitleEditText)

        builder.setPositiveButton(positiveButtonTitle) { dialog, _ ->
            dialog.dismiss()
        }
    }
}