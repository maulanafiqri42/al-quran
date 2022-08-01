package com.fiqri.alquran.model.nearby

import com.google.gson.annotations.SerializedName
import com.fiqri.alquran.model.nearby.ModelGeometry
import java.io.Serializable


class ModelResults : Serializable {
    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometry

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("vicinity")
    lateinit var vicinity: String

    @SerializedName("place_id")
    lateinit var placeId: String

    @SerializedName("rating")
    var rating = 0.0
}