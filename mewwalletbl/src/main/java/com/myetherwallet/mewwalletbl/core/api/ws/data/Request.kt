package com.myetherwallet.mewwalletbl.core.api.ws.data

/**
 * Created by BArtWell on 02.09.2021.
 */

internal data class Request<T>(
    val data: RequestData<T>
) {

    val action = "default"
}
