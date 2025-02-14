```groovy
def myMethod(String str) {
    if (str == null || str.isEmpty()) {
        return "Null or Empty String"
    } else {
        return "Non-empty String"
    }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```