package me.vincent.story

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  val tvStory by lazy {
    findViewById<TextView>(R.id.tvStory)
  }

  val btnOptionOne by lazy {
    findViewById<Button>(R.id.btnOptionOne)
  }

  val btnOptionTwo by lazy {
    findViewById<Button>(R.id.btnOptionTwo)
  }

  //TODO: Declare your variables here

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  //region : Functions to control story flow

  //TODO: Declare loadStory function here

  //TODO: Declare nextStory function here

  //TODO: Declare endOfStory function here

  //TODO: Declare checkOption function here

  // endregion
}
