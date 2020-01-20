package alexrnov.androidsamples.espresso

import alexrnov.androidsamples.R
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import alexrnov.androidsamples.Initialization.TAG
import android.widget.EditText
import android.widget.TextView

class EspressoActivity: AppCompatActivity() {
  private var editText: EditText? = null
  private var textView: TextView? = null

  override fun onCreate(saveInstanceState: Bundle?) {
    super.onCreate(saveInstanceState)
    setContentView(R.layout.activity_espresso)
    editText = findViewById(R.id.espresso_edit_text)
    textView = findViewById(R.id.espresso_text_view)
  }

  fun espressoChangeTextButton(view: View) {
    Log.i(TAG, "espresso")
    val inputText = editText?.text.toString()
    textView?.text = inputText
  }
}