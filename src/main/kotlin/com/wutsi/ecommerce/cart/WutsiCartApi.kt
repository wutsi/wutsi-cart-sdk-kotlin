package com.wutsi.ecommerce.cart

import com.wutsi.ecommerce.cart.dto.AddProductRequest
import com.wutsi.ecommerce.cart.dto.GetCartResponse
import com.wutsi.ecommerce.cart.dto.UpdateProductRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.Unit

public interface WutsiCartApi {
  @RequestLine("GET /v1/carts/{merchant-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCart(@Param("merchant-id") merchantId: Long): GetCartResponse

  @RequestLine("POST /v1/carts/{merchant-id}/products")
  @Headers(value=["Content-Type: application/json"])
  public fun addProduct(@Param("merchant-id") merchantId: Long, request: AddProductRequest): Unit

  @RequestLine("DELETE /v1/carts/{merchant-id}/products")
  @Headers(value=["Content-Type: application/json"])
  public fun emptyCart(@Param("merchant-id") merchantId: Long): Unit

  @RequestLine("POST /v1/carts/{merchant-id}/products/{product-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateProduct(
    @Param("merchant-id") merchantId: Long,
    @Param("product-id") productId: Long,
    request: UpdateProductRequest
  ): Unit

  @RequestLine("DELETE /v1/carts/{merchant-id}/products/{product-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun removeProduct(@Param("merchant-id") merchantId: Long, @Param("product-id")
      productId: Long): Unit
}
