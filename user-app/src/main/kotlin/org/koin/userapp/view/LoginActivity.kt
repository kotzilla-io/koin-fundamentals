package org.koin.userapp.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.userapp.R

class LoginActivity : AppCompatActivity() {

    // Inject dependency
    private val loginPresenter: LoginPresenter by inject()
    // Inject ViewModel
    private val loginViewModel: LoginViewModel by viewModel()
    // Pass parameter injection
//    private val loginViewModel: LoginViewModel by viewModel{ parametersOf("ID")}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        title = "PresenterLoginActivity"

        val loginField = findViewById<TextInputEditText>(R.id.login)
        val passwordField = findViewById<TextInputEditText>(R.id.password)
        val connectionButton = findViewById<Button>(R.id.button)
        val statusField = findViewById<TextView>(R.id.status)

        connectionButton.setOnClickListener { _ ->
            statusField.text = getString(R.string.authenticating)

            val login = loginField.text.toString()
            val password = passwordField.text.toString()
            val connectionString = loginViewModel.authenticate(login, password)

            statusField.text = connectionString
        }
    }
}
