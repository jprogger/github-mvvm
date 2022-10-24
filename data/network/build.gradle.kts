plugins {
    id("plugins.common-library")
}

dependencies {
    implementation("androidx.core:core-ktx:${ Versions.ktxVersion }")
    implementation("androidx.appcompat:appcompat:${ Versions.appCompatVersion }")
    implementation("com.google.android.material:material:${ Versions.materialVersion }")

    // Kotlin Json Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${ Versions.kotlinSerialJsonVersion }")

    //Retrofit2
    implementation("com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}")

    //OkHttp (Retrofit dependency)
    implementation("com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}")

    testImplementation("junit:junit:${ Versions.junitVersion }")
    androidTestImplementation("androidx.test.ext:junit:${ Versions.testExtJunitVersion }")
    androidTestImplementation("androidx.test.espresso:espresso-core:${ Versions.espressoVersion }")
}