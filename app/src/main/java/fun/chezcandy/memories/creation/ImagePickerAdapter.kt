package `fun`.chezcandy.memories.creation

import `fun`.chezcandy.memories.R
import `fun`.chezcandy.memories.models.BoardSize
import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class ImagePickerAdapter(
    private val context: Context,
    private val imageUris: List<Uri>,
    private val boardSize: BoardSize,
    private val imageClickListener: ImageClickListener
) : RecyclerView.Adapter<ImagePickerAdapter.ViewHolder>() {

    companion object {
        private const val TAG = "ImagePickerAdapter"
    }

    interface ImageClickListener {
        fun onPlaceholderClicker()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        Log.i(TAG, "onCreateViewHolder")
        val view = LayoutInflater.from(context).inflate(R.layout.card_image, parent, false)
        val cardWidth = parent.width / boardSize.getWidth()
        val cardHeight = parent.height / boardSize.getHeight()
        val cardSideLength = min(cardWidth, cardHeight)
        Log.i(TAG, "onCreateViewHolder $cardSideLength, $cardWidth, $cardHeight")
        val layoutParams = view.findViewById<ImageView>(R.id.ivCustomImage).layoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}