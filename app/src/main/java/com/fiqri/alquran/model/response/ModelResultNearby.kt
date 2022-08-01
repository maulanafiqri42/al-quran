package com.fiqri.alquran.model.response

import com.google.gson.annotations.SerializedName
import com.fiqri.alquran.model.nearby.ModelResults


class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}