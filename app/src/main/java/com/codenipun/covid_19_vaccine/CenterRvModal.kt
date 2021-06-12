package com.codenipun.covid_19_vaccine

//We have to store the data in a modal class
data class CenterRvModal(

    // string variable for center name.
    val centerName: String,

    // string variable for center address.
    val centerAddress: String,

    // string variable for center opening time.
    val centerFromTime: String,

    // string variable for center closing time.
    val centerToTime: String,

    // string variable for center fee type
    var fee_type: String,

    // int variable for age limit.
    var ageLimit: Int,

    // string variable for vaccination name.
    var vaccineName: String,

    // int variable for vaccine availability.
    var availableCapacity: Int
)