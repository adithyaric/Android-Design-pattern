package com.tokoretro.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tokoretro.app.R
import com.tokoretro.app.data.model.AuthUser
import com.tokoretro.app.databinding.ActivityAuthBinding
import com.tokoretro.app.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var bindings : ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser?){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}