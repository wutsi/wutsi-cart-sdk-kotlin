package com.wutsi.ecommerce.cart.dto

import kotlin.Int
import kotlin.Long

public data class AddProductRequest(
  public val productId: Long = 0,
  public val quantity: Int = 1
)
