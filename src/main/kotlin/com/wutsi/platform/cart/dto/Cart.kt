package com.wutsi.platform.cart.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.collections.List

public data class Cart(
  public val merchantId: Long = 0,
  public val accountId: Long = 0,
  public val products: List<Product> = emptyList(),
  public val created: OffsetDateTime = OffsetDateTime.now()
)
