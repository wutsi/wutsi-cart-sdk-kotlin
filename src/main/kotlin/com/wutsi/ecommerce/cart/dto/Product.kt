package com.wutsi.ecommerce.cart.dto

import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long

public data class Product(
  public val productId: Long = 0,
  public val quantity: Int = 1,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
