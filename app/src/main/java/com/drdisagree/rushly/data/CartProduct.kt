package com.drdisagree.rushly.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartProduct(
    val product: Product,
    val quantity: Int,
) : Parcelable {
    constructor() : this(Product(), 1)
}
