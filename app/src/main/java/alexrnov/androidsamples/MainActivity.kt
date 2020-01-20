package alexrnov.androidsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import alexrnov.androidsamples.espresso.EspressoActivityFirst
import alexrnov.androidsamples.parcelable.ParcelableFirstActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  /**
  * Parcelable is an Android only interface which is used to serialize a class so its properties
  * can be transferred from one activity to another.
  */
  fun parcelableButton(view: View) {
    val intent = Intent(this, ParcelableFirstActivity::class.java)
    startActivity(intent)
  }

  fun espessoButton(view: View) {
    val intent = Intent(this, EspressoActivityFirst::class.java)
    startActivity(intent)
  }
}
