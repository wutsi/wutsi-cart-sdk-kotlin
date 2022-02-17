package com.wutsi.platform.cart

import com.wutsi.platform.cart.dto.GetCartResponse
import com.wutsi.platform.cart.dto.SaveProductRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.Unit

public interface WutsiCartApi {
  @RequestLine("GET /v1/carts/{merchant-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCart(@Param("merchant-id") merchantId: Long): GetCartResponse

  @RequestLine("DELETE /v1/carts/{merchant-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun emptyCart(@Param("merchant-id") merchantId: Long): Unit

  @RequestLine("POST /v1/carts/{merchant-id}/products/{product-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun saveProduct(
    @Param("merchant-id") merchantId: Long,
    @Param("product-id") productId: Long,
    request: SaveProductRequest
  ): Unit

  @RequestLine("DELETE /v1/carts/{merchant-id}/products/{product-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun removeProduct(@Param("merchant-id") merchantId: Long, @Param("product-id")
      productId: Long): Unit
}
