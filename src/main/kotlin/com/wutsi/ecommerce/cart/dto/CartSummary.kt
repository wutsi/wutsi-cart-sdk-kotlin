package com.wutsi.ecommerce.cart.dto

import java.time.OffsetDateTime
import kotlin.Long

public data class CartSummary(
  public val merchantId: Long = 0,
  public val accountId: Long = 0,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
