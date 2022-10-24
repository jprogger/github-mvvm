plugins {
    id("plugins.common-library")
    id("org.jetbrains.kotlin.plugin.serialization") version Versions.kotlinVersion
}

dependencies {
    implementation("androidx.core:core-ktx:${ Versions.ktxVersion }")
    implementation("androidx.appcompat:appcompat:${ Versions.appCompatVersion }")
    implementation("com.google.android.material:material:${ Versions.materialVersion }")

    // Dagger 2
    kapt("com.google.dagger:dagger-compiler:${Versions.daggerVersion}")
    kapt("com.google.dagger:dagger-android-processor:${Versions.daggerVersion}")

    implementation("com.google.dagger:dagger-android:${Versions.daggerVersion}")
    implementation("com.google.dagger:dagger-android-support:${Versions.daggerVersion}")

    // Kotlin Json Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${ Versions.kotlinSerialJsonVersion }")

    //Retrofit2
    implementation("com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${ Versions.retrofitKotlinJsonVersion }")

    //OkHttp (Retrofit dependency)
    implementation("com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}")

    testImplementation("junit:junit:${ Versions.junitVersion }")
    androidTestImplementation("androidx.test.ext:junit:${ Versions.testExtJunitVersion }")
    androidTestImplementation("androidx.test.espresso:espresso-core:${ Versions.espressoVersion }")
}