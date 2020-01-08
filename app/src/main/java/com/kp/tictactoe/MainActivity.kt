package com.kp.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kp.tictactoe.databinding.ActivityMainBinding
import com.kp.tictactoe.viewmodel.GameViewModel

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var activityGameBinding: ActivityMainBinding
    private lateinit var gameViewModel: GameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityGameBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        gameViewModel = GameViewModel()
        gameViewModel.init("Player1", "Player2")
        activityGameBinding.setGameViewModel(gameViewModel)
    }
}
