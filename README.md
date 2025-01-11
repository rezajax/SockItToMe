
# App module
move app from scr to -> app (like android studio)

Sock


create app , sock

and run with tasks :app:run


# Fixes
fix multiple loaded kotlin gradle plugin
```kotlin
plugins {  
    kotlin("jvm") version "2.0.21" apply false 
}
```