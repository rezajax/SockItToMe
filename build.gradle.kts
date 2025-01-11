plugins {
    kotlin("jvm") version "2.0.21" apply false //نکته: apply false به این معناست که پلاگین فقط تعریف می‌شود اما به پروژه والد اعمال نمی‌شود. زیرپروژه‌ها از این تعریف استفاده می‌کنند.
}


/*
plugins {
    application // برای پشتیبانی از برنامه‌های اجرایی
    kotlin("jvm") version "2.0.21" // یا هر نسخه‌ای که استفاده می‌کنی
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib")) // کتابخانه‌های استاندارد کاتلین
}

application {
    // مشخص کردن کلاس اصلی
    mainClass.set("ir.rezajax.MainKt")
}*/


