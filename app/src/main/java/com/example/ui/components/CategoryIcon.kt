package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocalAtm
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.Savings
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Work
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.HelveticaFontFamily

/**
 * Business Cute Doodly Theme Category Icon:
 * Combines high-profile professional fintech symbolism with charming,
 * playful doodles and pastel squircle backgrounds.
 */
@Composable
fun CategoryIcon(
    type: String,
    modifier: Modifier = Modifier,
    tint: Color = Color.White,
    size: Dp = 22.dp
) {
    val doodle = when (type.lowercase()) {
        "food" -> "🍱"
        "friends" -> "🤝"
        "essential" -> "🛒"
        "shopping" -> "🛍️"
        "health" -> "🌿"
        "bs" -> "💸"
        "travel" -> "🚕"
        "income" -> "💼"
        "invest" -> "📈"
        else -> "✨"
    }

    Text(
        text = doodle,
        fontSize = size.value.sp,
        modifier = modifier
    )
}
