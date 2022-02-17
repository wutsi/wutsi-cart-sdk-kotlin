package com.wutsi.platform.cart

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-cart-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-cart-server-prod.herokuapp.com"),
  ;
}
