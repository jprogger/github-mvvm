plugins {
    id("plugins.common-library")
}

dependencies {
    implementation("androidx.core:core-ktx:${ Versions.ktxVersion }")
    implementation("androidx.appcompat:appcompat:${ Versions.appCompatVersion }")
    implementation("com.google.android.material:material:${ Versions.materialVersion }")

    // Dagger 2
    kapt("com.google.dagger:dagger-compiler:${Versions.daggerVersion}")
    kapt("com.google.dagger:dagger-android-processor:${Versions.daggerVersion}")

    testImplementation("junit:junit:${ Versions.junitVersion }")
    androidTestImplementation("androidx.test.ext:junit:${ Versions.testExtJunitVersion }")
    androidTestImplementation("androidx.test.espresso:espresso-core:${ Versions.espressoVersion }")
}