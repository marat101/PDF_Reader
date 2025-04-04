package ru.marat.pdf_reader.utils.render

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ImageBitmap
import ru.marat.viewplayground.pdf_reader.reader.layout.items.ScaledPage

interface PageRenderer {

    suspend fun renderPage(
        index: Int,
        pageSize: Size,
    ): ImageBitmap
    suspend fun renderPageFragment(
        index: Int,
        pageSize: Rect,
        scaledFragment: Rect,
        scale: Float,
    ): ScaledPage
}