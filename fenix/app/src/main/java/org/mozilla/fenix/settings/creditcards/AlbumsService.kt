package org.mozilla.fenix.settings.creditcards

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * ...
 */
interface AlbumsService {

    /**
     * ...
     */
    @GET(value = "/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId: Int): Response<AlbumsItem>
}
